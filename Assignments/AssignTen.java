package Assignments;
/*Q10.Write a single program for following operation using overloading
        A) Adding 2 integer number
        B) Adding 2 double
        C) multiplying 2 float
        D) multiplying 2 int
        E) concate 2 string
        F) Concate 3 String*/
public class AssignTen {
    void add(int a, int b){
        System.out.println("The addition of integer numbers is:"+(a+b));
    }
    void add(double a,double b){
        System.out.println("The addition of double numbers is:"+(a+b));
    }
    void mult(float a,float b){
        System.out.println("The multiplication of float numbers is:"+(a*b));
    }
    void mult(int a,int b){
        System.out.println("The multiplication of integer numbers is:"+(a*b));
    }
    void concat(String a,String b){
        System.out.println("The concatination of two string is:"+(a+b));
    }
    void concat(String a,String b,String c){
        System.out.println("The concatination of three strings is:"+(a+b+c));
    }

    public static void main(String[] args) {
        AssignTen object=new AssignTen();
        object.add(2,3);
        object.add(2.5,3.5);
        object.mult(2,3);
        object.mult(2f,3f);
        object.concat("Assignment ","Java");
        object.concat("Assignment ","on ","Java");
    }
}
