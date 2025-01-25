package SmartHomeDevice;

public class Device {
    private int deviceId;
    private String status;
    public Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayInfo(){
        System.out.println("Device Id is "+ deviceId);
        System.out.println("Status is "+ status);
    }
}
