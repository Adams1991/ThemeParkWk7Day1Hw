package People;

public class Visitor {
    private String name;
    private int height;
    private double money;

    public Visitor(String name, int height, int money){
        this.name = name;
        this.height = height;
        this.money =  money;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }
}
