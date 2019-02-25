package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
public class AssignOne {
    public static void main(String[] args) {
        List<Float> l=new ArrayList<>();
        l.add(2.0f);
        l.add(3.0f);
        l.add(2.1f);
        l.add(2.5f);
        l.add(3.5f);
        Float sum=0.0f;
        Iterator<Float> iterator= l.iterator() ;
        while(iterator.hasNext()){
            sum = sum + iterator.next();
        }
        System.out.println(sum);
    }
}
