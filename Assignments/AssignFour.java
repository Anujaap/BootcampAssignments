package Assignments;

import java.util.Scanner;

//Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
public class AssignFour {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String str=new Scanner(System.in).nextLine();
        int len=str.length();
        int u_Case=0;
        int l_Case=0;
        int digits=0;
        int spec_char=0;
        for(int i=0;i<len;i++){
            if(((int) str.charAt(i)>64)&&((int) str.charAt(i)<91)) u_Case++;
            else if(((int) str.charAt(i)>96)&&((int) str.charAt(i)<123)) l_Case++;
            else if(((int) str.charAt(i)>47)&&((int) str.charAt(i)<58)) digits++;
            else spec_char++;
        }
        double u_per=(u_Case*100)/len;
        System.out.println("Upper Case occurence= "+u_Case+"    Percentage= "+u_per);
        double l_per=(l_Case*100)/len;
        System.out.println("Lower Case occurence= "+l_Case+"    Percentage= "+l_per);
        double d_per=(digits*100)/len;
        System.out.println("Digits occurence= "+digits+"    Percentage= "+d_per);
        double s_per=(spec_char*100)/len;
        System.out.println("Special Characters occurence= "+spec_char+"    Percentage= "+s_per);
    }
}
