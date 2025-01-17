import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Display total cost");
            System.out.println("4. Display items in cart");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline character after the integer input

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item price: $");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();  // consume newline character after the integer input

                    CartItem newItem = new CartItem(itemName, price, quantity);
                    cart.addItem(newItem);
                    System.out.println(itemName + " has been added to your cart.");
                    break;

                case 2:
                    System.out.print("Enter the item name to remove: ");
                    String removeItemName = scanner.nextLine();
                    cart.removeItem(removeItemName);
                    break;

                case 3:
                    cart.displayTotalCost();
                    break;

                case 4:
                    cart.displayCartItems();
                    break;

                case 5:
                    System.out.println("Thank you for using the shopping cart system!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize the cart item
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate the total cost of the item (price * quantity)
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to update the quantity of an item
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cartItems;

    // Constructor to initialize the shopping cart
    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        cartItems.add(item);
    }

    // Method to remove an item from the cart by item name
    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println(itemName + " has been removed from the cart.");
                return;
            }
        }
        System.out.println("Item not found in the cart.");
    }

    // Method to display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total cost of the items in the cart: $" + String.format("%.2f", totalCost));
    }

    // Method to display the items in the cart
    public void displayCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("Items in your cart:");
        for (CartItem item : cartItems) {
            System.out.println(item.getItemName() + " - Quantity: " + item.getQuantity() + " - Price: $" + item.getPrice());
        }
    }
}

