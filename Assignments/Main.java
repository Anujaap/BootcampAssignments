package Assignments;

//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
public class Main {
    public static void main(String[] args) {
        SBI s=new SBI();
        s.setRate_of_interest(10);
        s.setLocation("Ghaziabad");
        s.setBranch("Modinagar");
        s.getDetails();
        ICICI i=new ICICI();
        i.setLocation("Basti");
        i.setBranch("CivilLines");
        i.setRate_of_interest(8);
        i.getDetails();
        BOI b=new BOI();
        b.setLocation("Noida");
        b.setBranch("Sector 30");
        b.setRate_of_interest(9);
        b.getDetails();
    }
}
