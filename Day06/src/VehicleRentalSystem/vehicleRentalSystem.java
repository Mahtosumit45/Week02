package VehicleRentalSystem;

import java.util.*;
// Main class to demonstrate functionality
public class vehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding vehicle instances
        Vehicle car = new Car("C123", "Car", 1000.0);
        Vehicle bike = new Bike("B456", "Bike", 500.0);
        Vehicle truck = new Truck("T789", "Truck", 2000.0);

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Displaying vehicle details, rental costs, and insurance costs
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails();
            int rentalDays = 5; // Example: Renting for 5 days
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof Insurable) {
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
                System.out.println("Insurance Cost: " + ((Insurable) vehicle).calculateInsurance());
            }
            System.out.println("---------------------------");
        }
    }
}

