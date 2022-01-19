package com.zyh.multi_thread;

import com.zyh.multi_thread.product_consumer.Consumer;
import com.zyh.multi_thread.product_consumer.Producer;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadMain {

    public static void main(String[] args) {
        Object producerLock = new Object();
        Object consumerLock = new Object();
        Object resourceLock = new Object();

        Queue<String> queue = new LinkedList<>();

        Producer p1 = new Producer("A", queue, producerLock, consumerLock, resourceLock);
        Producer p2 = new Producer("B", queue, producerLock, consumerLock, resourceLock);
        Producer p3 = new Producer("C", queue, producerLock, consumerLock, resourceLock);
        Producer p4 = new Producer("D", queue, producerLock, consumerLock, resourceLock);

        Consumer c1 = new Consumer("zyh1", queue, producerLock, consumerLock, resourceLock);
        Consumer c2 = new Consumer("zyh2", queue, producerLock, consumerLock, resourceLock);
        Consumer c3 = new Consumer("zyh3", queue, producerLock, consumerLock, resourceLock);


        p1.start();
//        p2.start();
//        p3.start();
//        p4.start();

        c1.start();
        c2.start();
        c3.start();

        while (true) {

        }

    }
}
