package Assignments;

//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
public class Bank {
    double rate_of_interest;
    String location;
    String branch;

    public double getRate_of_interest() {
        return rate_of_interest;
    }

    public void setRate_of_interest(double rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    void getDetails(){
       System.out.println("The rate of interest is "+rate_of_interest);
        System.out.println("The location is "+location);
        System.out.println("The branch is "+branch);
   }
}
class SBI extends Bank{
    void getDetails(){
        System.out.println("The rate of interest is "+rate_of_interest);
        System.out.println("The location is "+location);
        System.out.println("The branch is "+branch);
    }
}
class ICICI extends Bank{
    @Override
    void getDetails() {
        System.out.println("The rate of interest is "+rate_of_interest);
        System.out.println("The location is "+location);
        System.out.println("The branch is "+branch);
    }
}
class BOI extends Bank{
    void getDetails(){
        System.out.println("The rate of interest is "+rate_of_interest);
        System.out.println("The location is "+location);
        System.out.println("The branch is "+branch);
    }
}
