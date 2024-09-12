// CoffeeDrink object class

class CoffeeDrink {

    public int numberOfCups;
    public String flavor;
    public boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numberOfCups, String flavor, boolean hasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.numberOfCups = numberOfCups;
        this.flavor = flavor;
        this.hasWhippedCream = hasWhippedCream;

    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.println("Order Details:");
        System.out.println("Number of Cups: " + numberOfCups);
        System.out.println("Flavor: " + flavor);
        System.out.println("Whipped Cream: " + (hasWhippedCream ? "Yes" : "No"));
    }

    public void setFlavor(String newFlavor){
        flavor = newFlavor;
    }
    public String getFlavor(){
        return flavor;
    }
}
