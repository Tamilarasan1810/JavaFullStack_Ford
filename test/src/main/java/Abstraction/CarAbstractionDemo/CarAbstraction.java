package Abstraction.CarAbstractionDemo;
import java.util.*;

 abstract class Car
{
    public abstract void drive();
    public  void playMusic()
    {
        System.out.println("Playing Music");
    }
}
class WagonR extends Car
{

    public void drive(){
        System.out.println("wagonR can drive");
    }
}


public class CarAbstraction {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
