package homework.day5.playground.essence.material;

public class Water implements Pourable{
    protected String name;

    public Water(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}