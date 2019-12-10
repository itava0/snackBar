package src.snackBar;

public class Main{

    public static void main(String[] args) {

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

        // Processing

        // START OF - 1st Processing Task
        System.out.println("");
        System.out.println("BEFORE 1st PROCESS");
        System.out.println(customer1.getName() + "'s cash on hand: " + customer1.getCash());
        System.out.println("Snack name: " + snack4Soda.getName() + " - Snack ID: " + snack4Soda.getId() +
                " - Inventory: " + snack4Soda.getQuantity() + "\n");


        customer1.payCash(snack4Soda.getTotalCost(3));
        snack4Soda.buySnack(3);

        System.out.println("AFTER 1st PROCESS");
        System.out.println(customer1.getName() + "'s cash on hand: " + customer1.getCash());
        System.out.println("Snack name: " + snack4Soda.getName() + " - Snack ID: " + snack4Soda.getId() +
                " - Inventory: " + snack4Soda.getQuantity() + "\n");
        // END OF - 1st Processing Task

        // START OF - 2nd Processing Task
        System.out.println("BEFORE 2nd PROCESS");
        System.out.println(customer1.getName() + "'s cash on hand: " + customer1.getCash());
        System.out.println("Snack name: " + snack3Pretzel.getName() + " - Snack ID: " + snack3Pretzel.getId() +
                " - Inventory: " + snack3Pretzel.getQuantity() + "\n");


        customer1.payCash(snack3Pretzel.getTotalCost(1));
        snack3Pretzel.buySnack(1);

        System.out.println("AFTER 2nd PROCESS");
        System.out.println(customer1.getName() + "'s cash on hand: " + customer1.getCash());
        System.out.println("Snack name: " + snack3Pretzel.getName() + " - Snack ID: " + snack3Pretzel.getId() +
                " - Inventory: " + snack3Pretzel.getQuantity() + "\n");
        // END OF - 2nd Processing Task


        // START OF - 3rd Processing Task
        System.out.println("BEFORE 3rd PROCESS");
        System.out.println(customer2.getName() + "'s cash on hand: " + customer2.getCash());
        System.out.println("Snack name: " + snack4Soda.getName() + " - Snack ID: " + snack4Soda.getId() +
                " - Inventory: " + snack4Soda.getQuantity() + "\n");


        customer2.payCash(snack4Soda.getTotalCost(2));
        snack4Soda.buySnack(2);

        System.out.println("AFTER 3rd PROCESS");
        System.out.println(customer2.getName() + "'s cash on hand: " + customer2.getCash());
        System.out.println("Snack name: " + snack4Soda.getName() + " - Snack ID: " + snack4Soda.getId() +
                " - Inventory: " + snack4Soda.getQuantity() + "\n");
        // END OF - 3rd Processing Task

        // START OF - 4th Processing Task
        System.out.println("BEFORE 4th PROCESS");
        System.out.println(customer1.getName() + "'s cash on hand: " + customer1.getCash() + "\n");

        customer1.addCash(10);

        System.out.println("AFTER 4th PROCESS");
        System.out.println(customer1.getName() + "'s cash on hand: " + customer1.getCash() + "\n");
        // END OF - 4th Processing Task

        // START OF - 5th Processing Task
        System.out.println("BEFORE 5th PROCESS");
        System.out.println(customer1.getName() + "'s cash on hand: " + customer1.getCash());
        System.out.println("Snack name: " + snack2ChocolateBar.getName() + " - Snack ID: " + snack2ChocolateBar.getId() +
                " - Inventory: " + snack2ChocolateBar.getQuantity() + "\n");


        customer1.payCash(snack2ChocolateBar.getTotalCost(1));
        snack2ChocolateBar.buySnack(1);

        System.out.println("AFTER 5th PROCESS");
        System.out.println(customer1.getName() + "'s cash on hand: " + customer1.getCash());
        System.out.println("Snack name: " + snack2ChocolateBar.getName() + " - Snack ID: " + snack2ChocolateBar.getId() +
                " - Inventory: " + snack2ChocolateBar.getQuantity() + "\n");
        // END OF - 5th Processing Task

        // START OF - 6th Processing Task
        System.out.println("BEFORE 6th PROCESS");
        System.out.println(snack3Pretzel.getName() + " Inventory: " + snack3Pretzel.getQuantity() + "\n");

        snack3Pretzel.addQuantity(12);

        System.out.println("AFTER 6th PROCESS");
        System.out.println(snack3Pretzel.getName() + " Inventory: " + snack3Pretzel.getQuantity() + "\n");
        // END OF - 6th Processing Task

        // START OF - 7th Processing Task
        System.out.println("BEFORE 7th PROCESS");
        System.out.println(customer2.getName() + "'s cash on hand: " + customer2.getCash());
        System.out.println("Snack name: " + snack3Pretzel.getName() + " - Snack ID: " + snack3Pretzel.getId() +
                " - Inventory: " + snack3Pretzel.getQuantity() + "\n");


        customer2.payCash(snack3Pretzel.getTotalCost(3));
        snack3Pretzel.buySnack(3);

        System.out.println("AFTER 7th PROCESS");
        System.out.println(customer2.getName() + "'s cash on hand: " + customer2.getCash());
        System.out.println("Snack name: " + snack3Pretzel.getName() + " - Snack ID: " + snack3Pretzel.getId() +
                " - Inventory: " + snack3Pretzel.getQuantity() + "\n");
    }
}
