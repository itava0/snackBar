package src.snackBar;

public class Customer {
    //Fields, state of the class, attributes

    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    //constructor

    public Customer(String name, double cashOnHand) {

        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    //Getters
    public String getName() {
        return name;
    }

    public double getCash() {
        return cashOnHand;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    //Methods
    public void addCash(double amount) {
        this.cashOnHand += amount;
    }

    public void payCash(double amount) {
        this.cashOnHand -= amount;
    }
}
