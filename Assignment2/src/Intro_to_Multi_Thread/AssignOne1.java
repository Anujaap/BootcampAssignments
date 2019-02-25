package Intro_to_Multi_Thread;

public class AssignOne1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 2 is running...");
    }
    public static void main(String[] args) {
        new AssignOne1().start();
    }
}