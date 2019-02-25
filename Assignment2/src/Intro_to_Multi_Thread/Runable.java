package Intro_to_Multi_Thread;

public class Runable implements Runnable{
    public void run(){
        System.out.println("thread runnable demo ");
    }

    public static void main(String[] args) {
        Thread rn=new Thread(new Runable());
        rn.start();
    }

}
