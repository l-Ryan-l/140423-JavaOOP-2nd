public class Bat extends Predator implements Flyable{
    public Bat(String name) {
        super(name);
    }

    @Override
    public int speedOfFly() {
        return 80;
    }

    @Override
    public String say() {
        return "pipipipi";
    }

    @Override
    public String toString() {
        return String.format("The Bat, %s", super.toString());
    }
}
