package StallType;

import ThemePark.Stall;

public class CandyFlossStall extends Stall {

    public CandyFlossStall(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public String getName() {
        return name;
    }

}
