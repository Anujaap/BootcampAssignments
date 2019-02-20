package Assignments;

import java.util.Scanner;

//Q5. Find common elements between two arrays.
public class AssignFive {
    public static void main(String[] args) {
        System.out.println("Enter length of first array");
        int l1=new Scanner(System.in).nextInt();
        String arrayOne[]=new String[l1];
        System.out.println("Enter the values");
        for (int i=0;i<l1;i++){
            arrayOne[i]=new Scanner(System.in).next();
        }

        System.out.println("Enter length of second array");
        int l2=new Scanner(System.in).nextInt();
        System.out.println("Enter the values");
        String arrayTwo[]=new String[l2];
        for (int i=0;i<l2;i++){
            arrayTwo[i]=new Scanner(System.in).next();
        }
        int l3=l1>l2?l1:l2;
        String output_arr[]=new String[l3];
        System.out.println("The common elements are:");
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(arrayOne[i].equals(arrayTwo[j]))
                {
                    output_arr[i]=arrayOne[i];
                }
            }
        }
        printDistinct(output_arr,l3);
    }
    static void printDistinct(String arr[],int length){
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i].equals(arr[j])) arr[j]="";
                else if(arr[i].equals("")) break;
            }
        }
        for(int i=0;i<length;i++)
            if(arr[i]!="")System.out.println(arr[i]);
    }
}
