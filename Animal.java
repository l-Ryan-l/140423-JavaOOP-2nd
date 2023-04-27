public abstract class Animal implements Sayable {
    private String name;
//   public abstract String say();
   public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name: %s, says '%s', eats: %s", name, say(), feed());
    }

    public Animal(String name) {
        this.name = name;
    }

}
