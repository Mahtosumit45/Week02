package OnlineRetailOrderManagement;

public class OnlineRetailOrder {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order(1, "2025-01-20");
        System.out.println(order);
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println();

        // Create a shipped order
        ShippedOrder shippedOrder = new ShippedOrder(2, "2025-01-21", "TRK12345");
        System.out.println(shippedOrder);
        System.out.println("Status: " + shippedOrder.getOrderStatus());
        System.out.println();

        // Create a delivered order
        DeliveredOrder deliveredOrder = new DeliveredOrder(3, "2025-01-22", "TRK67890", "2025-01-24");
        System.out.println(deliveredOrder);
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
