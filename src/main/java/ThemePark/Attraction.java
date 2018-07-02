package ThemePark;

public abstract class Attraction extends ThemePark {
        public String name;

        public Attraction(String name, int rating) {
            super(rating);
            this.name = name;
        }

    public String getName() {
        return name;
    }
}
