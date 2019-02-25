package Intro_to_Multi_Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Try shutdown() and shutdownNow() and observe the difference.
public class AssignFour {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2");
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(3000L);
                        System.out.println("Thread 3");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });
        } finally {
            executorService.shutdownNow();
        }

        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
        System.out.println("End");
    }
}
