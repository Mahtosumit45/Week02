package libraryManagementSystem;

// Subclass DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days loan duration for DVDs
    }

    @Override
    public boolean reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD reserved successfully.");
            return true;
        } else {
            System.out.println("DVD is already reserved.");
            return false;
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

