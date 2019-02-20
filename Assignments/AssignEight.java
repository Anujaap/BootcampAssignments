package Assignments;

//Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
import java.util.Scanner;
public class AssignEight {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String str=new Scanner(System.in).nextLine();
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        sb.reverse();
        if(str.length()<10) System.out.println("Length is short so characters cannot be removed");
        else{
            sb.replace(4,10,"");
            System.out.println("The modified String Buffer is "+sb);
        }
    }
}
