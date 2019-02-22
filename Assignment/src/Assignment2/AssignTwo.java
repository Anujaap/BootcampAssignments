package Assignment2;

//WAP to produce ClassNotFoundException exception.
 public class AssignTwo {
    public void display(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
       try{
           Class.forName("MainClass");
       }catch (ClassNotFoundException e){
           System.out.println(e);
       }
    }
}