package org.vova.dmdev.level2.block13.task1;

import java.util.LinkedList;
import java.util.Queue;

public class Task1Runner {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();
        Thread producerThread = new Thread(new ProducerThread(queue));
        Thread consumerThread = new Thread(new ConsumerThread(queue));

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
