package OnlineRetailOrderManagement;

public class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public String getOrderSatus(){
        return "Order delivered";
    }
    public String toString() {
        return super.toString() + ", Tracking Number: " + trackingNumber;
    }
}
