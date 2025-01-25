package RideHailingAppPackage;
// Main class for demonstration
public class RideHailingApp {
    public static void main(String[] args) {
        // Create instances of vehicles
        Vehicle car = new Car("C001", "Alice", 10.0);
        Vehicle bike = new Bike("B001", "Bob", 5.0);
        Vehicle auto = new Auto("A001", "Charlie", 7.0);

        // Create GPS modules
        GPS carGPS = new GPSModule();
        carGPS.updateLocation("Downtown");

        GPS bikeGPS = new GPSModule();
        bikeGPS.updateLocation("Uptown");

        GPS autoGPS = new GPSModule();
        autoGPS.updateLocation("Suburb");

        // Calculate fares dynamically
        double distance = 15.0; // Example distance in km
        System.out.println(car.getVehicleDetails());
        System.out.println("Fare for Car: $" + car.calculateFare(distance));
        System.out.println("Car Current Location: " + carGPS.getCurrentLocation());

        System.out.println("\n" + bike.getVehicleDetails());
        System.out.println("Fare for Bike: $" + bike.calculateFare(distance));
        System.out.println("Bike Current Location: " + bikeGPS.getCurrentLocation());

        System.out.println("\n" + auto.getVehicleDetails());
        System.out.println("Fare for Auto: $" + auto.calculateFare(distance));
        System.out.println("Auto Current Location: " + autoGPS.getCurrentLocation());
    }
}
