package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name
public class AssignFour {
    public static void main(String[] args) {
        ArrayList<Employee> a=new ArrayList<>();
        a.add(new Employee("Pallavi",22.0,10500.0));
        a.add(new Employee("Anuja",21.0,10000.0));
        a.add(new Employee("Sakshi",23.0,11000.0));

        Collections.sort(a, new SortbySalary());
        for(Employee e:a){
            System.out.println(e);
        }
    }
}
class Employee{
    String name;
    Double age;
    Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    Employee(String name, Double age, Double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String toString(){
        return this.name+" "+this.age+" "+this.salary;
    }
}
class SortbySalary implements Comparator<Employee> {

    public int compare(Employee a,Employee b) {
        return (int) (b.getSalary()-a.getSalary());
    }
}