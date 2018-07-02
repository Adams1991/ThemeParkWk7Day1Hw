package AttractionType;

import People.Visitor;
import ThemePark.Attraction;
import ThemePark.ISecurity;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name){
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 12 || visitor.getHeight() < 145) {return false;}
        return true;
    }
}
