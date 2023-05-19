public class Furniture {
    private String furnitureType;
    private String material;
    private double pricePerUnit;
    private int quantity;

    public Furniture() {
        this.furnitureType = "";
        this.material = "";
        this.pricePerUnit = 0.0;
        this.quantity = 0;
    }

    public Furniture(String furnitureType, String material, double pricePerUnit, int quantity) {
        this.furnitureType = furnitureType;
        this.material = material;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public Furniture(Furniture furniture) {
        this.furnitureType = furniture.furnitureType;
        this.material = furniture.material;
        this.pricePerUnit = furniture.pricePerUnit;
        this.quantity = furniture.quantity;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public String getMaterial() {
        return material;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: RM %.2f\n%-15s: %d", "Furniture Type", furnitureType,
                "Material", material, "Price Per Unit", pricePerUnit, "Quantity", quantity);
    }

    public double calcPriceFurniture() {
        double discountRate = 0.0;

        switch (material) {
            case "Wood":
                discountRate = 0.20;
                break;
            case "Rattan":
                discountRate = 0.15;
                break;
            case "Metal":
                discountRate = 0.10;
                break;
            case "Bamboo":
                discountRate = 0.05;
                break;
            default:
                discountRate = 0.0;
                break;
        }

        return (pricePerUnit * quantity) * (1 - discountRate);
    }
}