// Main class to demonstrate polymorphism
public class VehicleTransportSystem {
    public static void main(String[] args) {
        // Create instances of subclasses
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10.5);
        Vehicle motorcycle = new Motorcycle(220, "Petrol", "Sport");

        // Store vehicles in an array of Vehicle type
        Vehicle[] vehicles = { car, truck, motorcycle };

        // Call displayInfo() on each vehicle object using polymorphism
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Info:");
            vehicle.displayInfo();
            System.out.println();
        }
    }
}

// Superclass: Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overridden method to display car details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Overridden method to display truck details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(int maxSpeed, String fuelType, String type) {
        super(maxSpeed, fuelType);
        this.type = type;
    }

    // Overridden method to display motorcycle details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle Type: " + type);
    }
}

