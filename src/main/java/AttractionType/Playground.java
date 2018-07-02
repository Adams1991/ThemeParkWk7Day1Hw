package AttractionType;

import People.Visitor;
import ThemePark.Attraction;
import ThemePark.ISecurity;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name){
        super(name);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 15){return false;}
        return true;
    }
}
