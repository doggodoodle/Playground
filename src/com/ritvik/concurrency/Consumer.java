package com.ritvik.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by u6023478 on 11/30/2016.
 */
public class Consumer implements Runnable{

    private BlockingQueue<Object> queue = new ArrayBlockingQueue<>(100, true);

    public static void main(String[] args) {
        ExecutorService consumerService = Executors.newSingleThreadExecutor();
        Consumer consumer = new Consumer();
        consumerService.execute(consumer);
        int i = 0;
        for(;i<150;){
            try {
                consumer.add("Hello"+i++);
                //Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        System.out.println("Started consumer service. Listening...");
        while(true){
            if(!queue.isEmpty())
                System.out.println("Processing queue item "+queue.poll());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void add(Object o) throws Exception{
        if(queue.remainingCapacity()!=0){
            queue.add(o);
        }
        else{
            System.out.println("Consumer Queue Full! Item rejected: "+o);
            throw new Exception("Queue Full");
        }
    }
}
