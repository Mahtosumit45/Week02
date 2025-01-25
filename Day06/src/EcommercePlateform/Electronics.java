package EcommercePlateform;

// Concrete class Electronics
class Electronics extends Product implements Taxable {
    private static final double TAX_RATE = 0.18;
    private double discountRate;

    public Electronics(int productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}

