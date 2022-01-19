package com.zyh.multi_thread.product_consumer;

import java.util.Queue;

public class Consumer extends Thread {

    private Queue<String> queue;

    private String name;
    private Object consumeLock;

    private final Object produceLock;

    private Object resourceLock;
    private String resourceName;

    public Consumer(String name, Queue<String> queue, Object consumeLock, Object produceLock, Object resourceLock) {
        this.name = name;
        this.queue = queue;
        this.consumeLock = consumeLock;
        this.produceLock = produceLock;
        this.resourceLock = resourceLock;
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (queue.isEmpty()) {
                    synchronized (consumeLock) {
                        consumeLock.wait();
                        System.out.println("等待生产");
                    }
                }
                Thread.sleep(500);
                resourceName = queue.poll();
                System.out.println("消费者:" + name + "\t消费资源 = >\t\t " + this.resourceName);
                synchronized (produceLock) {
                    produceLock.notify();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
