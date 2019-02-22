package Assignment2;

import java.util.Scanner;

//1. WAP to sorting string without using string Methods?
class AssignOne
{
public static void main(String args[])
{  System.out.println("Enter the String");
   String s = new Scanner(System.in).nextLine();
   char a[]=new char[s.length()];
   char temp;
   for(int i=0;i<s.length();i++)
       a[i]=s.charAt(i);
   for(int i=0;i<a.length;i++)
   {
       for(int j=0;j<a.length;j++)
       if((a[i]<a[j])) {
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
       }

   }
   for(int i=0;i<a.length;i++)
    System.out.print(a[i]);
}
}


