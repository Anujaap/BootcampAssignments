package Assignment2;

import java.util.Scanner;
/*WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a
a)do-while statement*/
public class AssignTen1 {
    public static void main(String[] args) {
        boolean key_entry = true;
        do {
            System.out.println("Enter a string and check whether first and last char is equal or not until the word 'done' is entered");
            String s1 = new Scanner(System.in).nextLine();
            if (s1.equalsIgnoreCase("done")) {
                key_entry = false;
            }
            else if (s1.charAt(0) == s1.charAt(s1.length() - 1)) {
                System.out.println(" char are equal");
            }
        }while (key_entry);
    }
}
