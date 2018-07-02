package StallType;

import People.Visitor;
import ThemePark.ISecurity;
import ThemePark.Stall;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 18){return false;}
        return true;
    }


}
