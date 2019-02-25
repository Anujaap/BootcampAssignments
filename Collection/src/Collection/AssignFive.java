package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Write a program to sort the Student objects based on Score , if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age
public class AssignFive {
    public static void main(String[] args) {
        ArrayList<Student> a=new ArrayList<>();
        a.add(new Student("Pallavi",90.0,22.0));
        a.add(new Student("Anuja",90.0,21.0));
        a.add(new Student("Sakshi",99.0,23.0));
        Collections.sort(a, new SortbyScore());
        for(Student s:a){
            System.out.println(s);
        }
    }
}
class Student{
    String name;
    Double score;
    Double age;

    Student(String name,Double score,Double age){
        this.name=name;
        this.score=score;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public String toString(){
        return this.name+" "+this.score+" "+this.age;
    }
}
class SortbyScore implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
       int i=(int) (o2.getScore()-o1.getScore());
       if(i==0) { i=(int)(o1.getName().compareTo(o2.getName()));}
       return i;
    }
}