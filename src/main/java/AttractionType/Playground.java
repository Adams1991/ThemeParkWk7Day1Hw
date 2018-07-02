package AttractionType;

import People.Visitor;
import ThemePark.Attraction;
import ThemePark.ISecurity;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating){
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 15){return false;}
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
