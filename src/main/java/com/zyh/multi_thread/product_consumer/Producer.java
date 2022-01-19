package com.zyh.multi_thread.product_consumer;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {

    private Queue<String> queue;

    private Object consumeLock;

    private final Object produceLock;

    private Object resourceLock;

    private String name;

    private Random random;

    private static int resourceId = 0;
    private String resourceName;


    public Producer(String name, Queue<String> queue, Object produceLock, Object consumeLock, Object resourceLock) {
        this.name = name;
        this.queue = queue;
        this.produceLock = produceLock;
        this.consumeLock = consumeLock;
        this.resourceLock = resourceLock;
        this.random = new Random(100);
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (queue.size() == 5) {
                    synchronized (produceLock) {
                        produceLock.wait();
                    }
                }
                Thread.sleep(500);
                resourceName = "资源" + ++resourceId;
                queue.offer(resourceName);
                System.out.println("生产者:" + name + "生产资源 = >\t\t " + resourceName);
                synchronized (consumeLock) {
                    consumeLock.notify();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
