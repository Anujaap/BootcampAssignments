package Collection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
//Write a program to format date as example "21-March-2016"
public class AssignEight {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date = new Date();
        System.out.println((dateFormat.format(date)));
    }
}
