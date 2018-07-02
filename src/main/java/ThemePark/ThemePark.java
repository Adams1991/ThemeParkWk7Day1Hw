package ThemePark;

import People.Visitor;

public abstract class ThemePark implements IReviewed {
    public int rating;

    public ThemePark(int rating) {
        this.rating = rating;
    }



}
