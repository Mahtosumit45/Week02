package onlineFoodDeliverySystem;

// VegItem class extending FoodItem
class VegItem extends FoodItem {
    private static final double VEG_TAX = 0.05; // 5% tax

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 + VEG_TAX);
    }
}


