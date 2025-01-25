package EcommercePlateform;

// Concrete class Clothing
class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.12;
    private double discountAmount;

    public Clothing(int productId, String name, double price, double discountAmount) {
        super(productId, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}