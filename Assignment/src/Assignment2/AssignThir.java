package Assignment2;

//1. Create Java classes having suitable attributes for Library management system.Use OOPs concepts in your design.Also try to use interfaces
public class AssignThir implements Library{
    String book_id;
    String student_id;
    public static void main(String[] args) {
        AssignThir assignThir=new AssignThir();
        assignThir.book_id="B1001";
        assignThir.student_id="S1001";
        assignThir.issue_book();
        assignThir.book_returned();
    }

    @Override
    public void issue_book() {
        System.out.println("The book: "+book_id+" is issued to "+student_id);
    }

    @Override
    public void book_returned() {
        System.out.println("The book: "+book_id+" is issued to "+student_id);
    }
}
 interface Library{
    void issue_book();
    void book_returned();
}
