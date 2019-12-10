package src.snackBar;

public class VendingMachine {
    //Fields, state of the class, attributes
    private static int maxId = 0;
    private int id;
    private String name;

    //constructor
    public VendingMachine(String name) {

        maxId++;
        id = maxId;
        this.name = name;
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
