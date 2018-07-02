package ThemePark;

public abstract class Stall extends ThemePark {
    public String name;
    public String ownerName;
    public int parkingSpot;

    public Stall(String name, String ownerName, int parkingSpot, int rating) {
        super(rating);
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }
}
