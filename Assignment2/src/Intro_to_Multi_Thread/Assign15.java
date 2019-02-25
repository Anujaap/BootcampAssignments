package Intro_to_Multi_Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().
public class Assign15 {
    Lock lock = new ReentrantLock(true);
    int count;

    void increment(){
        lock.lock();
        count++;
        lock.unlock();
    }

    public void worker1(){
        for (int i = 1; i <= 1000; i++) {
            increment();
        }
    }

    public void worker2(){
        for (int i = 1; i <= 1000; i++) {
            increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Assign15 demo = new Assign15();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(demo.count);
    }
}
