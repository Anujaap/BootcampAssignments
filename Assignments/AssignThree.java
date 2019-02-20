package Assignments;

import java.util.Scanner;

//Q3. Write a program to find the number of occurrences of a character in a string without using loop?
public class AssignThree {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        String str=new Scanner(System.in).nextLine();
        str=str.toLowerCase();
        System.out.println("Enter the character whose frequency is to be found");
        String c=new Scanner(System.in).next();
        c=c.toLowerCase();
        int l1=str.length();
        int length_WithoutChar=(str.replaceAll(c,"")).length();
        int freq=l1-length_WithoutChar;
        if(freq!=0) System.out.println("Frequency of "+c+" is "+freq);
        else System.out.println("The character "+c+" is not present in the string");
    }
}
