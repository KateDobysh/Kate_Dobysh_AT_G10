package homework.day5.playground.essence.creatures;

public class Potato extends Vegetable {
    protected String name;

    public Potato(int mass, String name, String name1, String name2) {
        super(mass, name, name1);
        this.name = name2;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}