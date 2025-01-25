package RideHailingAppPackage;

// Class GPSModule implementing GPS
class GPSModule implements GPS {
    private String currentLocation;

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
