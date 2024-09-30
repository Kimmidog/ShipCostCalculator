import java.util.Scanner;

public class Main {

    // Method to calculate shipping cost
    public static double calculateShippingCost(double price) {
        if (price >= 100) {
            return 0;
        } else {
            return price * 0.02;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create a Scanner in to read from the console
        double price = 0;
        System.out.print("Enter the price of the item: $");

        if (in.hasNextDouble()) {
            // OK safe to read in a double
            price = in.nextDouble();
            in.nextLine(); // clear the buffer
            double shippingCost = calculateShippingCost(price);
            System.out.println("\nThe shipping cost for an item priced at $" + price + " is $" + shippingCost);
        } else {
            System.out.println("Please enter a valid number for the price.");
        }

        in.close();
    }
}
