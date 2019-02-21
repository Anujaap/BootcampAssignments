package Assignment2;

//WAP to create singleton class.
    class App{
        private static App app;
        public String str;
        private App(){
            str="Hello Newers!";
        }
        public static App getInstance(){
            if(app==null)
            {
                app=new App();
            }
            return app;
        }
    }
    public class AssignNine{
        public static void main(String[] ag){
            App app=App.getInstance();
            System.out.println(app.str);
            App app1=App.getInstance();
            System.out.println(app1.str);
            System.out.println(app);
            System.out.println(app1);
        }
    }

