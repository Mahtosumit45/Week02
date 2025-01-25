package OnlineRetailOrderManagement;

public class ShippedOrder extends Order{
    protected String trackingNumber;
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public String getOrderStatus() {
        return "Order shipped";
    }
    public String toString() {
        return super.toString() + ", Tracking Number: " + trackingNumber;
    }
}
