package Assignment2;

//WAP to produce NoClassDefFoundError exception.
public class AssignTwos {
    public static void main(String[] args) {
        try{Assign assign=new Assign();
        }catch(ExceptionInInitializerError e){
            System.out.println(e);
        }
        try {
            Assign assign1 = new Assign();
        }catch(NoClassDefFoundError n){
            System.out.println(n);
        }
    }
}
class Assign{
    static double i=1/0;
}
