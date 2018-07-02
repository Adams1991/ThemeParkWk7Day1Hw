package AttractionType;

import ThemePark.Attraction;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating){
        super(name, rating);
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
