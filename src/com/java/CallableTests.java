package com.java;

import java.util.concurrent.*;

/**
 * Created by u6023478 on 5/24/2017.
 */
public class CallableTests {
    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(2);
        ExecutorService executorService = new ThreadPoolExecutor(2,2,5L,TimeUnit.SECONDS,queue);
        Future future = executorService.submit(new ThreadObj(3));
        try {
            //future.cancel(true);
            while (!future.isDone());
            System.out.println("Returned future : "+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();



    }
}
