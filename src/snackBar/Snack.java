package src.snackBar;

/*
Snack has fields (so knows)
id
name
quantity
cost
vending machine id
 */

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

   //Setters
     public void setId(int id) {
        this.id = id;
     }

     public void setName(String name) {
        this.name = name;
     }

     public void setQuantity(int quantity) {
        this.quantity = quantity;
     }

     public void setCost(double cost) {
        this.cost = cost;
     }

     public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
     }

     //Methods, behaviors
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void buySnack(int quantity) {
        this.quantity -= quantity;
    }

    public double getTotalCost(int quantity) {
        return quantity * this.cost;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                        "name: " + name + "\n" +
                        "quantity: " + quantity + "\n" +
                        "cost: "  + cost + "\n" +
                        "vending machine id: " + vendingMachineId +"\n";
    }
}
