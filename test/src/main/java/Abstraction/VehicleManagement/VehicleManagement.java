package Abstraction.VehicleManagement;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
/*start move stop

bike, car, bus,

custoer, main-> vehicle agent to provide a vehicle*/

interface IVehicle{
    public void start();
    public void move();
    public void stop();

}

class AbstractVehicle implements IVehicle{

    String vehicleType;
    public void start() {
        System.out.println(vehicleType+" started");
    }

    @Override
    public void stop() {
        System.out.println(vehicleType+" stopped");
    }

    @Override
    public void move() {
        System.out.println(vehicleType+" moved");
    }
}
class Bike extends AbstractVehicle{
    public Bike(String name)
    {
        super.vehicleType = name;
    }
    public void move(String from, String to)
    {
        System.out.println("travelling on bike "+ from+" to "+to);
    }
}
class Car extends AbstractVehicle{
    public Car(String name)
    {
        super.vehicleType = name;
    }
    public void move(String from, String to) {
        System.out.println("travelling on Car "+ from+" to "+to);
    }
}
class Bus extends AbstractVehicle{

    public Bus(String name)
    {
        super.vehicleType = name;
    }
    public void move(String from, String to) {
        System.out.println("travelling on Bus "+ from+" to "+to);

    }
}

class VehicleAgent {

    public static IVehicle getVehicle(String vehicleName)
    {
        if(vehicleName.equals("Bike"))
        {
            return new Bike("R15");
        }
        else if(vehicleName.equals("Car"))
        {
            return new Car("Swift");
        }
        else if(vehicleName.equals("Bus"))
        {
            return new Bus("Volvo");
        }
        return null;
    }
}


public class VehicleManagement {
    public static void main(String[] args) {

        Bike bike = (Bike)VehicleAgent.getVehicle("Bike");
        bike.start();
        bike.move("Chennai","Namakkal");
        bike.stop();
        Car car = (Car)VehicleAgent.getVehicle("Car");
        car.start();
        car.move("Salem","Chennai");
        car.stop();
        Bus bus = (Bus)VehicleAgent.getVehicle("Bus");
        bus.start();
        bus.move("Namakkal","Shollinganallur");
        bus.stop();

        //^^^^ can also be implemented as below.

       /* IVehicle vehicle = VehicleAgent.getVehicle("Bike");
        vehicle.start();
        vehicle.move("Namakal","Bangalore");
        vehicle.stop();*/
    }
}
