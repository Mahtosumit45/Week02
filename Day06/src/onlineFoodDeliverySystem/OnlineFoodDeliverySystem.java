package onlineFoodDeliverySystem;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
// Main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating items
        FoodItem vegItem1 = new VegItem("Paneer Tikka", 150, 2);
        FoodItem nonVegItem1 = new NonVegItem("Chicken Biryani", 250, 1);

        // Creating order
        Order order = new Order();
        order.addItem(vegItem1);
        order.addItem(nonVegItem1);

        // Applying discount
        order.applyDiscount(10); // 10% discount

        // Processing order
        order.processOrder();
    }
}