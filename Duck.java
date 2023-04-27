public class Duck extends Herbivores implements Walkable, Flyable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Quack-quack";
    }

    @Override
    public int speedOfFly() {
        return 60;
    }

    @Override
    public int speedOfWalk() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("The Duck, %s", super.toString());
    }
}
