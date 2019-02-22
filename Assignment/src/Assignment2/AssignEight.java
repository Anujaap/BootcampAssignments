package Assignment2;

//WAP to show object cloning in java using cloneable.
public class AssignEight implements Cloneable{
        int roll_no;
        String fname;
        AssignEight(int rollno,String name){
            this.roll_no=rollno;
            this.fname=name;
        }
        public Object clone()throws CloneNotSupportedException{
            return super.clone();
        }
        public static void main(String args[]){
            try{
                AssignEight c1=new AssignEight(001,"Anuja");
                AssignEight c2=(AssignEight) c1.clone();
                System.out.println(c1.roll_no+" "+c1.fname);
                System.out.println(c2.roll_no+" "+c2.fname);
            }catch(CloneNotSupportedException c){}
        }
    }
