package src.snackBar;

public class Main {

    public static void Main(String[] args) {

        // Customers
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        // Vending machine
        VendingMachine foodVendingMachine = new VendingMachine("Food");
        VendingMachine drinkVendingMachine = new VendingMachine("Drink");
        VendingMachine officeVendingMachine = new VendingMachine("Office");

        // Snacks
        Snack snack1Chips = new Snack("Chips", 36, 1.75, foodVendingMachine.getId());
        Snack snack2ChocolateBar = new Snack("Chocolate Bar", 36, 1.00, foodVendingMachine.getId());
        Snack snack3Pretzel = new Snack("Pretzel", 30, 2.00, foodVendingMachine.getId());
        Snack snack4Soda = new Snack("Soda", 24, 2.50, drinkVendingMachine.getId());
        Snack snack5Water = new Snack("Water", 20, 2.75, drinkVendingMachine.getId());

    }
}
