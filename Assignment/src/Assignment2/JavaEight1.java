package Assignment2;
//WAP to show object cloning in java using copy constructor.
public class JavaEight1 {
        public int x;
        public int y;
        public JavaEight1(int x, int y)
        {
            super();
            this.x = x;
            this.y = y;
        }
        public JavaEight1(JavaEight1 p)
        {
            this.x = p.x;
            this.y = p.y;
        }
        public static void main(String[] args)
        {
            JavaEight1 p1 = new JavaEight1(1,2);
            JavaEight1 p2 =  new JavaEight1(p1);
            System.out.println(p1.x + " " + p1.y);
            System.out.println(p2.x + " " + p2.y);
            p2.x = 3;
            p2.y = 4;
            System.out.println(p1.x + " " + p1.y);
            System.out.println(p2.x + " " + p2.y);
        }

}
