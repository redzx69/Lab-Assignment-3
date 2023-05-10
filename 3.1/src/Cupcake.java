public class Cupcake {
    private String name;
    private String code;
    private double price;

    public Cupcake() {
        name = "";
        code = "";
        price = 0;
    }

    public Cupcake(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public Cupcake(Cupcake cupcake) {
        this.name = cupcake.name;
        this.code = cupcake.code;
        this.price = cupcake.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return "Name: " + this.name + "\nCode: " + this.code + "\nPrice: " + this.price;
    }

    public double priceInDozen(String code) {
        int rate = 0;
        switch (code.charAt(code.length() - 1)) {
            case '1':
                rate = 5;
                break;
            case '2':
                rate = 8;
                break;
            case '3':
                rate = 10;
                break;
            default:
                System.out.println("Invalid code");
                break;
        }
        price = 12 * price * (1 - rate/100.0);
        return price;
    }
}
