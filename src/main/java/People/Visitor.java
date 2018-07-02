package People;

public class Visitor {
    private String name;
    private int height;
    private double money;
    private int age;

    public Visitor(String name, int height, int money, int age){
        this.name = name;
        this.height = height;
        this.money =  money;
        this.age =  age;
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

    public int getAge() {
        return age;
    }
}
