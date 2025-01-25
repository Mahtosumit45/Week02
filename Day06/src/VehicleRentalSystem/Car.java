package VehicleRentalSystem;

// Subclass Car
class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05; // 5% of rental cost

    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Rate: " + (INSURANCE_RATE * 100) + "% of daily rental rate";
    }
}
