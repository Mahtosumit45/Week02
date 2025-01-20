public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; // Example daily rental rate

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    @Override
    public String toString() {
        return "CarRental{customerName='" + customerName + "', carModel='" + carModel + "', rentalDays=" + rentalDays + ", totalCost=" + calculateTotalCost() + "}";
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Default constructor
        CarRental rental1 = new CarRental();
        System.out.println(rental1);

        // Parameterized constructor
        CarRental rental2 = new CarRental("Alice", "Toyota Camry", 5);
        System.out.println(rental2);

        // Calculate and print total cost for rental2
        System.out.println("Total cost for " + rental2.getCustomerName() + ": $" + rental2.calculateTotalCost());
    }
}
