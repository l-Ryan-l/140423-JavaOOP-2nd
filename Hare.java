public class Hare extends Herbivores implements Walkable {
    public Hare(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "tktktktk";
    }

    @Override
    public String toString() {
        return String.format("The Hare, %s", super.toString());
    }

    @Override
    public int speedOfWalk() {
        return 25;
    }
}
