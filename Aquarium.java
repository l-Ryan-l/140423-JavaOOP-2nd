import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    List<Animal> seaCreatures = new ArrayList<>();

    public List<Animal> getSeaCreatures() {
        return seaCreatures;
    }

    public Aquarium addToListOfSea(Animal animal) {
        seaCreatures.add(animal);
        return this;
    }

    public List<Swimable> swimables() {
        List<Swimable> swimables = new ArrayList<>();
        for (var i : seaCreatures) {
            if (i instanceof Swimable) {
                swimables.add((Swimable) i);
            }

        }
        return swimables;
    }

    public Swimable theFastestSwimable() {
        int index = 0;
        for (int i = 0; i < swimables().size() ; i++) {
            if (swimables().get(i).speedOfSwim() > swimables().get(index).speedOfSwim()) {
                index = i;
            }
        }
        return swimables().get(index);
    }
}
