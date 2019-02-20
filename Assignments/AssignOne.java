package Assignments;

//Q1. Write a program to replace a substring inside a string with other string ?

import java.util.Scanner;

public class AssignOne {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String str=new Scanner(System.in).nextLine();
        System.out.println("Enter the substring to be replaced");
        String sub_str=new Scanner(System.in).next();
        System.out.println("Enter the substring with which we want to replace");
        String rep_str=new Scanner(System.in).next();
        if(str.contains(sub_str)) System.out.println(str.replace(sub_str,rep_str));
        else System.out.println("The substring to be replaced is not found in the main string");
    }
}
