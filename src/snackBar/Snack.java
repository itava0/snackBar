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
    }
}
