package SmartHomeDevice;

public class Thermostat extends Device{
    private String temperatureSetting;
    public Thermostat(int deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Temperature Setting is "+ temperatureSetting);

    }

}
