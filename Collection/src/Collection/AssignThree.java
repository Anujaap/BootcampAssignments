package Collection;

import java.util.*;

//Write a method that takes a string and print the number of occurrence of each character characters in the string.
public class AssignThree {
    public static void main(String[] args) {
        String s = ("Anuja Pandey").toLowerCase();
        s = s.replace(" ", "");
        String[] str = s.split("");
        List<String> list = new ArrayList<>();
        for (String s1 : str) {
            list.add(s1);
        }
        for (String s1 : list) {
            if(s1!=""){System.out.println("The frequency of " + s1 + " is:" + Collections.frequency(list, s1));
            Collections.replaceAll(list,s1,"");}
        }
    }
}
