package OnlineRetailOrderManagement;

public class Order {
    private int orderId;
    private String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String toString() {
        return "Order ID: " + orderId + ", Order Date: " + orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

}
