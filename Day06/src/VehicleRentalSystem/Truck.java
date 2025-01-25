package VehicleRentalSystem;

// Subclass Truck
class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.08; // 8% of rental cost

    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Fixed surcharge of 500
    }

    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Rate: " + (INSURANCE_RATE * 100) + "% of daily rental rate";
    }
}