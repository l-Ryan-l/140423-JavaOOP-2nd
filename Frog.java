public class Frog extends Predator implements Swimable, Walkable{
    public Frog(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "ribbit-ribbit";
    }

    @Override
    public int speedOfSwim() {
        return 20;
    }

    @Override
    public int speedOfWalk() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("The Frog, %s", super.toString());
    }
}
