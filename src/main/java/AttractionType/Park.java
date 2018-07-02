package AttractionType;

import ThemePark.Attraction;

public class Park extends Attraction{

    public Park(String name, int rating){
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
