package EcommercePlateform;

public abstract class Product {
    private String name;
    private int productID;
    private double price;

    public Product(int productID, String name, double price) {
        this.name = name;
        this.productID = productID;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double calculateDiscount();

    // Method to calculate final price
    public double calculateFinalPrice(double tax) {
        return getPrice() + tax - calculateDiscount();
    }
}
