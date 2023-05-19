import java.util.Scanner;

public class CupcakeApp {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cupcakes: ");
        int size = in.nextInt();
        in.nextLine();
        
        // Create an array of Cupcake objects
        Cupcake[] cupcake = new Cupcake[size];
        
        // Get data from user
        for (int i = 0; i < size; i++) {
            System.out.println("\nCupcake " + (i + 1));
            System.out.print("Enter name: ");
            String name = in.nextLine();
            System.out.print("Enter code: ");
            String code = in.next();
            in.nextLine();
            System.out.print("Enter price: RM");
            double price = in.nextDouble(); 
            in.nextLine();
            // Store data onto array
            cupcake[i] = new Cupcake(name, code, price);
        }
        in.close(); // Close   

        // Calculate and display price of cupcakes in dozens
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.printf("Price of %s in dozens: RM%.2f", cupcake[i].getName(), cupcake[i].priceInDozen(cupcake[i].getCode()));
            System.out.println("");
        }

        // Calculate and display price of all cupcakes
        double totalPrice = 0.0;
        for (int i = 0; i < size; i++) {
            totalPrice += cupcake[i].getPrice();
        }

        // Display total price
        System.out.printf("\nTotal price: RM%.2f\n", totalPrice);
    }
}
