import java.util.Scanner;

public class FruitApp {
    public static void main(String[] args) {

        //ask user for array size
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter the number of fruits: ");
        int size = in1.nextInt();
        Fruit[] fruitList = new Fruit[size];
        System.out.println();

        //input fruit information
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the fruit name: ");
            String name = in.nextLine();
            System.out.print("Enter the fruit type (1-2). 1-Imported 2-Local : ");
            String type = in.nextLine();
            if (type.equals("1"))
                type = "imported";
            else
                type = "local";
            System.out.print("Enter the fruit weight (kg): ");
            double weight = in1.nextDouble();
            System.out.print("Enter the fruit price-per-kg: RM");
            double price = in1.nextDouble();
            
            //store data
            fruitList[i] = new Fruit(name, type, weight, price);
            System.out.println();
        }
        System.out.println("--------------------------------------------------\n"); //input output separator

        String highestPriceLocalFruitName = "";
        double highestPriceLocalFruitPrice = 0.0;
        double totalSaleImportedFruits = 0.0;

        for(int i = 0; i < size; i++){
            if (fruitList[i].isLocal()) { //local 
                if (fruitList[i].getPrice() > highestPriceLocalFruitPrice) {  //find local fruit with highest price
                    highestPriceLocalFruitName = fruitList[i].getName();
                    highestPriceLocalFruitPrice = fruitList[i].getPrice();
                }
            }
            else { //imported 
                totalSaleImportedFruits += fruitList[i].calcTotalPrice(); //accumulate total sale of imported fruits
            }
            System.out.println(fruitList[i]);
        }
        System.out.printf("Local fruit with highest price: %s (RM%.2f)", highestPriceLocalFruitName, highestPriceLocalFruitPrice);
        System.out.printf("%nTotal sale of imported fruits: RM%.2f%n", totalSaleImportedFruits);
        in.close(); 
        in1.close();
    }
}