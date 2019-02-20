package Assignments;

//Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
public class AssignSeven {
    static String firstName;
    static String lastName;
    static int age;
    static {
        System.out.println("The details of Employee is: ");

    }
    static void display(){
        System.out.println("Firstname = "+firstName);
        System.out.println("Lastname = "+lastName);
        System.out.println("Age = "+age);

    }

    public static void main(String[] args) {
        firstName="Anuja";
        lastName="Pandey";
        age=21;
        display();
    }
}
