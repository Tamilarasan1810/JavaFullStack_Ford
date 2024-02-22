package Abstraction.AnimalInterface;

public class AnimalTrainer {
    /*public void train(Bird bird)
    {
        System.out.println("trainer training a bird");
        bird.move();
        System.out.println("trainer trained a bird");
    }
    public void train(Fish fish)
    {
        System.out.println("trainer training a fish");
        fish.move();
        System.out.println("trainer trained a fish");
    }*/
    public void train(Animal animal)
    {
        animal.move();
        if(animal instanceof Bird) // downcating to access the specific behaviour of the bird sing method.
        {
            Bird bird = (Bird)animal;
            bird.sing();
        }
    }
}
