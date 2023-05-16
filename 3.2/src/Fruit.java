public class Fruit {
    private String name; // fruit name
    private String type; // local or imported
    private double weight; //in kg
    private double price; // per kg

    public Fruit() {
        this.name = "";
        this.type = "";
        this.weight = 0.0;
        this.price = 0.0;
    }

    public Fruit(String name, String type, double weight, double price) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public Fruit(Fruit fruit) {
        this.name = fruit.name;
        this.type = fruit.type;
        this.weight = fruit.weight;
        this.price = fruit.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isLocal() {
        return this.equals("local");
    }

    public double calcTotalPrice() {

        


        return totalPrice;
    }

    public String toString() {

        return 
    }
}
