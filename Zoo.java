import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animalList = new ArrayList<>();

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public Zoo addList(Animal animal) {
        animalList.add(animal);
        return this;
    }

    private Radio radio;
    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public List<Sayable> getSayable() {
        List<Sayable> sayables = new ArrayList<>();
        for (var i : animalList) {
            sayables.add(i);
        }
        sayables.add(radio);
        return sayables;
    }

    public  List<Walkable> walkables() {
        List<Walkable> walkables = new ArrayList<>();
        for (var i : animalList) {
            if (i instanceof Walkable) {
                walkables.add((Walkable) i);
            }
        }
        return walkables;
    }

    public List<Flyable> flyables() {
        List<Flyable> flyables = new ArrayList<>();
        for (var i : animalList) {
            if (i instanceof Flyable) {
                flyables.add((Flyable) i);
            }
        }
        return flyables;
    }

    public Walkable theFastestWalkable() {
        int index = 0;
        for (int i = 0; i < walkables().size(); i++) {
            if (walkables().get(i).speedOfWalk() > walkables().get(index).speedOfWalk()) {
                index = i;
            }
        }
        return walkables().get(index);
    }

    public Flyable theFastestFlyable() {
        int index = 0;
        for (int i = 0; i < flyables().size(); i++) {
            if (flyables().get(i).speedOfFly() > flyables().get(index).speedOfFly()) {
                index = i;
            }
        }
        return flyables().get(index);
    }




}
