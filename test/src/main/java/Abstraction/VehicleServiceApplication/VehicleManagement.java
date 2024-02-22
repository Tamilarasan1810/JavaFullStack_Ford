package Abstraction.VehicleServiceApplication;
/*start move stop

bike, car, bus,

custoer, main-> vehicle agent to provide a vehicle*/

import java.util.Arrays;

interface IVehicle{
    public void start();
    public void move();
    public void stop();
}

 class SpeedoMeter{
    private long noOfKilometersTravelled;
    public SpeedoMeter(long kilometers)
    {
        this.noOfKilometersTravelled = kilometers;
    }
    public long getNoOfKilometersTravelled()
    {
        return this.noOfKilometersTravelled;
    }
}
abstract class AbstractVehicle implements IVehicle {

    String vehicleType;

    int noOfSeats;
    boolean goneToServiceCenter;
    boolean isTestPassed=false;
    SpeedoMeter speedoMeter;
    public AbstractVehicle(String type,int seats,boolean goneToServiceCenter,SpeedoMeter speedoMeter)
    {
        this.speedoMeter = speedoMeter;
        this.vehicleType = type;
        this.noOfSeats = seats;
        this.goneToServiceCenter = goneToServiceCenter;
    }
    public void start() {
        System.out.println(vehicleType+" started");
    }

    public void stop() {
        System.out.println(vehicleType+" stopped");
    }

    public void move() {
        System.out.println(vehicleType+" moved");
    }

//    public long getSpeedometer()
//    {
//        return super.getNoOfKilometersTravelled();
//    }
    public String getVehicleType()
    {
        return this.vehicleType;
    }
}
class Bike extends AbstractVehicle{
    public Bike(String type,int seats,boolean goneToServiceCenter,SpeedoMeter speedoMeter)
    {
        super(type,seats,goneToServiceCenter,speedoMeter);

    }
    public void move(String from, String to)
    {
        System.out.println("travelling on bike "+ from+" to "+to);
    }
}
class Car extends AbstractVehicle{
    public Car(String type,int seats,boolean goneToServiceCenter,SpeedoMeter speedoMeter)
    {
        super(type,seats,goneToServiceCenter,speedoMeter);

    }
    public void move(String from, String to) {
        System.out.println("travelling on Car "+ from+" to "+to);
    }
}
class Bus extends AbstractVehicle{

    public Bus(String type,int seats,boolean goneToServiceCenter,SpeedoMeter speedoMeter)
    {
        super(type,seats,goneToServiceCenter,speedoMeter);
    }
    public void move(String from, String to) {
        System.out.println("travelling on Bus "+ from+" to "+to);

    }
}

class VehicleService{

    private int scrappedVehicleCount;
    private int servedVehicleCount;
    private int activeVehicleCount;

    private AbstractVehicle[] vehiclesTested = new AbstractVehicle[500];
    private int vehiclesTestedCount=0;

//    public VehicleService(){
//
//    }
    public void testVehicle(IVehicle vehicle)
    {
        if(vehicle instanceof Bike)
        {
            Bike bike = (Bike) vehicle;
            if(bike.speedoMeter.getNoOfKilometersTravelled()>150000)
            {
                bike.isTestPassed=false;
                bike.goneToServiceCenter=true;
                bike.isTestPassed = false;
                this.servedVehicleCount++;
                this.scrappedVehicleCount++;
                vehiclesTested[vehiclesTestedCount++] = bike;
            }
            else
            {
                bike.isTestPassed=true;
                bike.goneToServiceCenter=true;
                bike.isTestPassed = true;
                this.servedVehicleCount++;
                this.activeVehicleCount++;
                vehiclesTested[vehiclesTestedCount++] = bike;
            }
        }
        else if(vehicle instanceof Car)
        {
            Car car = (Car) vehicle;
            if(car.speedoMeter.getNoOfKilometersTravelled()>150000)
            {
                car.isTestPassed=false;
                car.goneToServiceCenter=true;
                car.isTestPassed = false;
                this.servedVehicleCount++;
                this.scrappedVehicleCount++;
                vehiclesTested[vehiclesTestedCount++] = car;
            }
            else
            {
                car.isTestPassed=true;
                car.goneToServiceCenter=true;
                car.isTestPassed = true;
                this.servedVehicleCount++;
                this.activeVehicleCount++;
                vehiclesTested[vehiclesTestedCount++] = car;
            }
        }
        else if(vehicle instanceof Bus)
        {
            Bus bus = (Bus) vehicle;
            if(bus.speedoMeter.getNoOfKilometersTravelled()>250000)
            {
                bus.isTestPassed=false;
                bus.goneToServiceCenter=true;
                bus.isTestPassed = false;
                this.servedVehicleCount++;
                this.scrappedVehicleCount++;
                vehiclesTested[vehiclesTestedCount++] = bus;
            }
            else
            {
                bus.isTestPassed=true;
                bus.goneToServiceCenter=true;
                bus.isTestPassed = true;
                this.servedVehicleCount++;
                this.activeVehicleCount++;
                vehiclesTested[vehiclesTestedCount++] = bus;
            }
        }
    }

    public void getActiveVehicleCount()
    {
        System.out.println("Currently Active Vehicle count: "+this.activeVehicleCount);
    }
    public void getScrappedVehicleCount()
    {
        System.out.println("Scrapped Vehicle count: "+this.scrappedVehicleCount);
    }
    public void getServicedVehicleCount()
    {
        System.out.println("Serviced Vehicle count: "+this.servedVehicleCount);
    }
    public void getTestedVehicle()
    {
        System.out.print("Tested Vehicles are: ");
        for(AbstractVehicle vehicle:this.vehiclesTested)
        {
            if(vehicle != null)
                System.out.print(vehicle.vehicleType+" ");
        }

    }
}
public class VehicleManagement {
    public static void main(String[] args) {

        SpeedoMeter speedoMeter1 = new SpeedoMeter(153450);
        VehicleService service = new VehicleService();
        Bike bike =  new Bike("R15",2,false,speedoMeter1);
        service.testVehicle(bike);
        SpeedoMeter speedoMeter2 = new SpeedoMeter(14320);
        Car car =  new Car("Swift",6,false,speedoMeter2);
        service.testVehicle(car);
        SpeedoMeter speedoMeter3 = new SpeedoMeter(1435);
        Bus bus =  new Bus("Volvo",21,false,speedoMeter3);
        service.testVehicle(bus);

        service.getActiveVehicleCount();
        service.getScrappedVehicleCount();
        service.getServicedVehicleCount();
        service.getTestedVehicle();

        //Bike bike = (Bike)VehicleService("Bike",2,false,13823);


//        Car car = (Car)VehicleAgent.getVehicle("Car");
//
//        Bus bus = (Bus)VehicleAgent.getVehicle("Bus");


        /*Bike bike = (Bike)VehicleAgent.getVehicle("Bike");
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
        bus.stop();*/

        //^^^^ can also be implemented as below.

       /* IVehicle vehicle = VehicleAgent.getVehicle("Bike");
        vehicle.start();
        vehicle.move("Namakal","Bangalore");
        vehicle.stop();*/
    }
}
