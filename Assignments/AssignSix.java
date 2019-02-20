package Assignments;

import java.util.Scanner;

//Q6. There is an array with every element repeated twice except one. Find that element
public class AssignSix{
    public static void main(String[] args) {
        System.out.println("Enter length of array");
        int len=new Scanner(System.in).nextInt();
        String arr[]=new String[len];
        System.out.println("Enter the values");
        for(int i=0;i<len;i++) arr[i]=new Scanner(System.in).next();
        System.out.println("The single element is: ");
        for(int i=0;i<len;i++){
            int count=1;
            for(int j=i+1;j<len;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j]="0";
                }
            }
            if((count==1)&&(arr[i]!="0"))
                System.out.println(arr[i]);
        }
    }
}
