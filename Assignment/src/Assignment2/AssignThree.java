package Assignment2;

import java.util.Scanner;

//WAP showing try, multi-catch and finally blocks.
public class AssignThree {
    public static void main(String[] args) {
        int a=10,c;
        int b=new Scanner(System.in).nextInt();
        try{c=a/b;
            Class.forName("AssignThree");
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }finally{
            System.out.println("Finally block called");
        }
    }
}
