import java.util.Scanner;

public class FurnitureApp {
    public static void main(String[] args) {
        //ask user for array size
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter the amount of furniture: ");
        int size = in1.nextInt();
        Furniture[] furnitureList = new Furniture[size];
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the furniture type: ");
            String furnitureType = in.nextLine();
            System.out.print("1. Wood\n2. Rattan\n3. Metal\n4. Bamboo\nEnter the material (1-4): ");
            String material = in.nextLine();

            switch (material) {
                case "1":
                    material = "Wood";
                    break;
                case "2":
                    material = "Rattan";
                    break;
                case "3":
                    material = "Metal";
                    break;
                case "4":
                    material = "Bamboo";
                    break;
            }
            System.out.print("Enter the price per unit: ");
            double pricePerUnit = in1.nextDouble();
            System.out.print("Enter the quantity: ");
            int quantity = in1.nextInt();

            //store data
            furnitureList[i] = new Furniture(furnitureType, material, pricePerUnit, quantity);
            System.out.println();
        }

        double totalWood = 0.0;
        double totalRattan = 0.0;
        double totalMetal = 0.0;
        double totalBamboo = 0.0;
        double highestPriceOfWoodFurniture = 0;

        for (int i = 0; i < size; i++) {
            if (furnitureList[i].getMaterial().equals("Wood")) { //accumulate prices of all materials
                totalWood += furnitureList[i].calcPriceFurniture();
            }
            else if (furnitureList[i].getMaterial().equals("Rattan")) {
                totalRattan += furnitureList[i].calcPriceFurniture();
            }
            else if (furnitureList[i].getMaterial().equals("Metal")) {
                totalMetal += furnitureList[i].calcPriceFurniture();
            }
            else if (furnitureList[i].getMaterial().equals("Bamboo")) {
                totalBamboo += furnitureList[i].calcPriceFurniture();
            }
            
        }
        
        for (int i = 0; i < size; i++) {
            if (furnitureList[i].getMaterial().equals("Wood") //find highest price of wood furniture
            && furnitureList[i].calcPriceFurniture() > highestPriceOfWoodFurniture) {
                highestPriceOfWoodFurniture = furnitureList[i].calcPriceFurniture();
            }

            System.out.println("-----------------------------------------\n"); //input output separator
            System.out.println(furnitureList[i].toString());//print furniture info
            System.out.println();
        }
        //output
        System.out.println("Total Price of Wood Furniture: RM " + totalWood + 
                           "\nTotal Price of Rattan Furniture: RM " + totalRattan + 
                           "\nTotal Price of Metal Furniture: RM " + totalMetal + 
                           "\nTotal Price of Bamboo Furniture: RM " + totalBamboo + 
                           "\nHighest Price of Wood Furniture: RM " + highestPriceOfWoodFurniture);
        in.close(); //close scanner
        in1.close();
    }
}