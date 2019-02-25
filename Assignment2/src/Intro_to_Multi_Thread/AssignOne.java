package Intro_to_Multi_Thread;

//Create and Run a Thread using Runnable Interface and Thread class.
public class AssignOne implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread 1 is running...");
    }

    public static void main(String[] args) {
        new Thread(new AssignOne()).start();
    }
}
