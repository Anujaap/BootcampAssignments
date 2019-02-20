package Assignments;

import java.util.Scanner;

//Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
public class AssignTwo{
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String str=new Scanner(System.in).nextLine();
        String[] str_arr=str.split("\\s+");
       for(int i=0;i<str_arr.length;i++){
            int count=1;
            for(int j=i+1;j<str_arr.length;j++){
                if(str_arr[i].equals(str_arr[j])){
                    count++;
                    str_arr[j]="0";
                }
            }
            if((str_arr[i]!="0")&&(count!=1))
            System.out.println(str_arr[i]+" frequency= "+count);
        }
    }
}
