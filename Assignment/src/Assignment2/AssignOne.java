package Assignment2;

import java.util.Scanner;

//1. WAP to sorting string without using string Methods?
class AssignOne
{
public static void main(String args[])
{  System.out.println("Enter the String");
   String s = new Scanner(System.in).nextLine();
   char a[]=new char[s.length()];
   char b[]=new char[s.length()];
   for(int i=0;i<s.length();i++)
       a[i]=s.charAt(i);
   int count;
   for(int i=0;i<a.length;i++)
   {   count=0;
       for(int j=0;j<a.length;j++)
       if(a[i]>a[j]) count++;
       b[count]=a[i];
   }
   for(int i=0;i<b.length;i++)
    System.out.print(b[i]);
}
}


