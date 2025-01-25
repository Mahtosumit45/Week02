package VehicleRentalSystem;

// Subclass Bike
class Bike extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.03; // 3% of rental cost

    public Bike(String vehicleNumber, String type, double rentalRate) {
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
        return "Bike Insurance Rate: " + (INSURANCE_RATE * 100) + "% of daily rental rate";
    }
}

