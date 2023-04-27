public class Octopus extends Predator implements Swimable{

    public Octopus(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "*silence*";
    }

    @Override
    public int speedOfSwim() {
        return 35;
    }

    @Override
    public String toString() {
        return String.format("The Octopus, %s", super.toString());
    }
}
