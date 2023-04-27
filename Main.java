public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Aquarium aquarium = new Aquarium();
        zoo.setRadio(new Radio());

        zoo.addList(new Wolf("Wooly"))
                .addList(new Hare("Floof"))
                .addList(new Duck("Quackers"))
                .addList(new Bat("Batty"));

        aquarium.addToListOfSea(new Shark("C-Shark"))
                .addToListOfSea(new Octopus("Squidward"))
                .addToListOfSea(new Frog("Kermit"));


        System.out.println("\nThe Zoo contains: ");
        for (var i: zoo.getAnimalList()) {
            System.out.println(i);
        }

        System.out.println("\nThe Aquarium contains: ");
        for (var i : aquarium.getSeaCreatures()) {
            System.out.println(i);
        }

        System.out.println("\nRollcall of Zoo:");
        for (var i: zoo.getSayable()) {
            System.out.println(i.say());
        }

        System.out.println("\nWalkables of Zoo with speed metric: ");
        for (var i : zoo.walkables()) {
            System.out.printf("%s, speed: %d\n", i, i.speedOfWalk());
        }

        System.out.println("\nFlyables of Zoo with speed metric: ");
        for (var i : zoo.flyables()) {
            System.out.printf("%s, speed: %d\n", i.toString(), i.speedOfFly());
        }

        System.out.println("\nSwimables of Aquarium with speed metric: ");
        for (var i : aquarium.swimables()) {
            System.out.printf("%s, speed: %d\n", i.toString(), i.speedOfSwim());
        }
        System.out.println("-------");
        System.out.println("The fastest of walkables is - " + zoo.theFastestWalkable());
        System.out.println("The fastest of flyables is - " + zoo.theFastestFlyable());
        System.out.println(("The fastest of swimables is - " + aquarium.theFastestSwimable()));


    }
}
