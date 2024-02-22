package Abstraction.AnimalInterface;

public interface Animal {
    public void eat();
    public void move();
    public void sleep();
}
abstract class AbstractAnimal implements Animal
{
    public void eat() {
        System.out.println("animal eats food");
    }

    public void sleep() {
        System.out.println("animal sleeps");
    }

}

class Bird extends AbstractAnimal
{
    public void move() {
        System.out.println("Bird flies on wings");
    }
    public void sing()
    {
        System.out.println("Bird sings");
    }
}

class Fish extends AbstractAnimal
{
    public void move() {
        System.out.println("Fish swims to move");
    }
}
class Snake extends AbstractAnimal
{
    public void move() {
        System.out.println("Snake crawl on ground");
    }
}

