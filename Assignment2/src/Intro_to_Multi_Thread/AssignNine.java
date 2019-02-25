package Intro_to_Multi_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().
class Process implements Runnable{
    int id;

    public Process(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread name::"+Thread.currentThread().getName()+" Start :"+id);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name::"+Thread.currentThread().getName()+" End :"+id);
    }
}

public class AssignNine {

    public static void main(String[] args) {

        ExecutorService executorService= Executors.newCachedThreadPool();

        for (int i = 0; i <= 30; i++) {
            executorService.submit(new Process(i));
        }
        executorService.shutdown();
    }
}
