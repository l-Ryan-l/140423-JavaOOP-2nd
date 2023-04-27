public class Shark extends Predator implements Swimable{

    public Shark(String name) {
        super(name);
    }

    @Override
    public int speedOfSwim() {
        return 55;
    }

    @Override
    public String say() {
        return "*silence*";
    }

    @Override
    public String toString() {
        return String.format("The Shark, %s", super.toString());
    }
}
