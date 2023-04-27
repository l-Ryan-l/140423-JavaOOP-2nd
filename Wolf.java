public class Wolf extends Predator implements Walkable {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "uUuUuuu";
    }

    @Override
    public String toString() {
        return String.format("The Wolf, %s", super.toString());
    }

    @Override
    public int speedOfWalk() {
        return 65;
    }
}
