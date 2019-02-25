package Collection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

//Write a program to display times in different country format.
public class AssignNine {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss a");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(dateFormat.format(new Date()));
        dateFormat.setTimeZone(TimeZone.getTimeZone("EET"));
        System.out.println(dateFormat.format(new Date()));
    }
}
