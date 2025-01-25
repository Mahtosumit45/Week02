package SmartHomeDevice;

public class Main {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(88,"off", "hot" );
        thermostat.displayInfo();
    }
}
