package Collection;

import java.util.*;

//Write a method that takes a string and returns the number of unique characters in the string.
public class AssignTwo {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter string");
        String s=(new Scanner(System.in).nextLine()).toLowerCase();
        s=s.replace(" ","");
        String[] str=s.split("");
        Set <String> list=new HashSet<>(Arrays.asList(str));
        for(String c:list){
            count++;
        }
        System.out.println("The number of unique characters are: "+count);
    }
}
