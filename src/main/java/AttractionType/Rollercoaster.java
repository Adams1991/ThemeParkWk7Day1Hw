package AttractionType;

import People.Visitor;
import ThemePark.Attraction;
import ThemePark.ISecurity;

public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 12 || visitor.getHeight() < 145) {return false;}
        return true;
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
