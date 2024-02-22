package Abstraction.AnimalInterface;

public class Zoo {
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.eat();
        bird.move();
        bird.sleep();

        Fish fish = new Fish();
        fish.eat();
        fish.move();
        fish.sleep();

        System.out.println("----s--------Animal calling-------------\n");
        Animal animal; // reference variable for interface
        animal = fish;
        animal.eat();
        animal.move(); // here the interface (animal) can call both fish move and bird move; this is power of interface
        animal.sleep();

        animal = bird;
        animal.eat();
        animal.move();
        animal.sleep();
//        animal.sing();  // here the interface can't access the sleep bcz the parent animal can't all the behaviours of child to
        // access those methods use down castding.
        Bird animalBird = (Bird) animal; // this is downcasting the animal to bird class to access sing method;
        animalBird.sing();// now the animalBird interface reference access the child's method.
        // this is called dynamic method dispatching .

        AnimalTrainer animalTrainer = new AnimalTrainer();
        System.out.println("--------Trainer taining to----------");
        animalTrainer.train(bird);
        animalTrainer.train(fish); // this is called dynamic method dispatching .
    }
}
