package Intro_to_Multi_Thread;

public class ThreadDemo extends Thread {
    public void Run(){
        System.out.println("Thread demo : ");
    }

    public static void main(String[] args) {
//            new Threaddemo().start();
        ThreadDemo th=new ThreadDemo();
        th.start();
    }
}
