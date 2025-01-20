public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
    }

    // Getters and setters
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    @Override
    public String toString() {
        return "HotelBooking{guestName='" + guestName + "', roomType='" + roomType + "', nights=" + nights + "}";
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println(booking1);

        // Parameterized constructor
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        System.out.println(booking2);

        // Copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.setGuestName("Bob"); // Modifying booking3 to show independence
        System.out.println(booking3);

        // Original booking remains unchanged
        System.out.println(booking2);
    }
}
