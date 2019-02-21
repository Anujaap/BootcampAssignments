package Assignment2;

import java.util.Scanner;

//WAP to convert seconds into days, hours, minutes and seconds.
public class AssignFour {
    public static void main(String[] args) {
        System.out.println("Enter time in seconds");
        int sec=new Scanner(System.in).nextInt();
        int min=0,hr=0,day=0;
        if(sec>60){
            min=sec/60;
            sec=sec%60;
            if(min>60){
                hr=min/60;
                min=min%60;
                if(hr>24){
                    day=hr/24;
                    hr=hr%24;
                }
            }
        }
        System.out.println(day+" days "+hr+" hours "+min+" minutes "+sec+" seconds");
    }
}
