public class FruitApp {

    public static void main(String[] args) {
        
        Fruit[] fruitList = new Fruit[5];

        fruitList[0] = new Fruit("Apple", "local", 1.5, 5.5);
        fruitList[1] = new Fruit("Orange", "imported", 2.5, 8.5);
        fruitList[2] = new Fruit("Banana", "local", 1.0, 4.5);
        fruitList[3] = new Fruit("Mango", "imported", 2.0, 10.5);
        fruitList[4] = new Fruit("Pineapple", "local", 1.5, 6.5);

        double highestPrice = 0.0;
        double totalSaleImportedFruit = 0.0;
        String highestPriceFruit = "";
        for (int i = 0; i < 5; i++) {
            if (fruitList[i].getType().equals("local")) { //local fruits
                if (fruitList[i].getPrice() > highestPrice) {
                    highestPrice = fruitList[i].getPrice();
                    highestPriceFruit = fruitList[i].getName(); //display the name of local fruit which has highest price
                }
            else //imported fruits
                totalSaleImportedFruit += fruitList[i].calcTotalPrice();
            }

        }
        System.out.println("Local fruit with highest price\nFruit name: "+highestPriceFruit+"\nPrice: RM"+highestPrice);
        System.out.println("Total sale of imported fruits: RM" + totalSaleImportedFruit);
    }
}