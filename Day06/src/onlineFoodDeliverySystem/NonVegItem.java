package onlineFoodDeliverySystem;

// NonVegItem class extending FoodItem
class NonVegItem extends FoodItem {
    private static final double NON_VEG_TAX = 0.10; // 10% tax

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 + NON_VEG_TAX);
    }
}
