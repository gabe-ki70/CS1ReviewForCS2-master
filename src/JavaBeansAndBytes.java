import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = false;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2000;
        System.out.println("We were founded in " + yearFounded + ".");
        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Milk");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink coffee1 = new CoffeeDrink(2, "Caramel", true);
        CoffeeDrink coffee2 = new CoffeeDrink(1, "Vanilla", false);

        coffee1.setFlavor("water");

        coffee2.setFlavor("Matcha");
        coffee2.setNumberOfCups(5);
        coffee2.setHasWhippedCream(true);
        // TODO
        // Print out the order details
        coffee1.printInfo();
        coffee2.printInfo();
        String newSpecial = coffee2.getFlavor();
        specialOfTheDay(newSpecial);
        int i = 0;
        while(i<10){
            CoffeeDrink randomdrink = new CoffeeDrink((int)(Math.random()*100), "Chai", true );
            if(randomdrink.getNumberOfCups()>75){
                System.out.println("Too many cups order somewhere else");
                break;
            }
            else{
                randomdrink.printInfo();
            }
            i++;
        }
        randomDiscount();
    }
    public void randomDiscount(){
        int x = (int)(Math.random()*31);
        System.out.println("You have received a " + x + "% discount today");
       while(x<20){
           System.out.println("discount too low, Trying again");
           x = (int)(Math.random()*31);
       }

    }

    // Method to generate a random discount


    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Today's special is " + special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:
        // Print 1 to 5
        for(int i = 1; i<=5; i++){
            System.out.print(i);
        }
        System.out.println("");
        // Print 2, 5, 8, 11
        for(int z = 2; z<=11; z = z + 3){
            System.out.print(z);
            if(z<11){
                System.out.print(", ");
            }
        }
        System.out.println("");
        // Print 8 to 0
        for(int f = 8; f>=0; f = f - 1){
            System.out.print(f);
        }
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        System.out.println();
        double bradford = Math.random();
        if(bradford < .25){
            System.out.println("water");
        }
        else if(bradford < .50){
            System.out.println("Chocolate Milk");
        }
        else if (bradford < .75){
            System.out.println("Apple Juice");
        }
        else{
            System.out.println("Lemonade");
        }
        // and print one of four drink recommendations based on its value.
    }
}

