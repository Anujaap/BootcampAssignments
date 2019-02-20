package Assignments;

//Q9. Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
public enum AssignNine {
    oneBHK(10), twoBHK(18), threeBHK(32);
    int price;

    AssignNine(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String args[]) {
        System.out.println("All House prices:");
        for (AssignNine h : AssignNine.values()) {
            System.out.println(h + " " + "price " + h.getPrice() + " lakhs.");
        }
    }
}
