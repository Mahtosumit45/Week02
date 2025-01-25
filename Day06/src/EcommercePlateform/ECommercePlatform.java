package EcommercePlateform;

import java.util.*;
// Main class to demonstrate functionality
public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Adding product instances
        Product electronic = new Electronics(1, "Laptop", 1000.0, 0.1);
        Product clothing = new Clothing(2, "Jacket", 200.0, 20.0);
        Product grocery = new Groceries(3, "Apples", 50.0, 5.0);

        products.add(electronic);
        products.add(clothing);
        products.add(grocery);

        // Displaying product details and final price
        for (Product product : products) {
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
            System.out.println("Product: " + product.getName());
            System.out.println("Base Price: " + product.getPrice());
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("Discount: " + product.calculateDiscount());
            System.out.println("Final Price: " + product.calculateFinalPrice(tax));
            System.out.println("---------------------------");
        }
    }
}
