import java.util.*;

class Vehicle {

    String engineType;
    int noOfSeats;
}

public class oopDemo {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.engineType = "Petrol";
        obj.noOfSeats = 6;
        System.out.println("Obj: " + obj);
        System.out.println("Engine Type: " + obj.engineType);
        System.out.println("No of Seats: " + obj.noOfSeats);
    }
}

