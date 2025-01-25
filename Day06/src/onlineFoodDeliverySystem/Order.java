package onlineFoodDeliverySystem;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
// Order class implementing Discountable
class Order implements Discountable {
    private List<FoodItem> items;
    private double totalAmount;
    private double discount;

    public Order() {
        items = new ArrayList<>();
        totalAmount = 0.0;
        discount = 0.0;
    }

    // Add item to the order
    public void addItem(FoodItem item) {
        items.add(item);
        totalAmount += item.calculateTotalPrice();
    }

    // Process order and display details
    public void processOrder() {
        System.out.println("Order Summary:");
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails() + ", Total Price: " + item.calculateTotalPrice());
        }
        System.out.println("Total Amount (before discount): " + totalAmount);
        if (discount > 0) {
            System.out.println("Discount Applied: " + discount);
            System.out.println("Total Amount (after discount): " + (totalAmount - discount));
        }
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = (percentage / 100) * totalAmount;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + " applied.";
    }
}