package Synchronization.ThreadSynchronizationBusBooking;

// select seat
// give some details
// pay for seat
// get confirmation

// show available seat
// seats are filled
// to book a seat -> select seat -> pay for seat -> get confirm for seat

import java.util.HashMap;
import java.util.Map;

class Seat {
    private int seatNo;
    private boolean isFilled;
    private double price;

    public Seat(int seatNo, boolean isFilled, double price) {
        this.seatNo = seatNo;
        this.isFilled = isFilled;
        this.price = price;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNo=" + seatNo +
                ", isFilled=" + isFilled +
                ", price=" + price +
                '}';
    }

    public String bookSeat(String name) {
        synchronized (this) {
            try {
                if (!this.isFilled()) {
                    System.out.println(name + " you got seatNo: " + this.getSeatNo());
                    Thread.sleep(1000);
                    this.isFilled = true;
                    return name;
                } else {
                    return null;
                }
            } catch (InterruptedException e) {
                System.out.println("Exception is: " + e.getMessage());
            }
            return null;
        }
    }

}

class Bus {
    private HashMap<String, Integer> passanger = new HashMap<>();
    private HashMap<Integer, Seat> seats = new HashMap<>();

    public Bus() {
        for (int i = 1; i <= 12; i++) {
            this.seats.put(i, new Seat(i, false, 500));
        }
    }

    public void bookTicket(String name, int seatNo) {
        Seat seat = this.seats.get(seatNo);
        String bookedPassanger = seat.bookSeat(name);
        if (bookedPassanger != null) {
            passanger.put(bookedPassanger, seatNo);

        } else {
            System.out.println("Sorry " + name + " seat " + seatNo + " is booked ");
        }
    }

    public HashMap<String, Integer> getPassanger() {
        return passanger;
    }
    public void showAvailableSeats()
    {
        System.out.print("\nAvailable Seats are: ");
        for(Map.Entry<Integer,Seat> seat: seats.entrySet())
        {
            if(!seat.getValue().isFilled())
            {
                System.out.print(seat.getKey()+", ");
            }
        }
    }
    public void showBookedSeats()
    {
        System.out.print("\nBooked Seats are: ");
        for(Map.Entry<Integer,Seat> seat: seats.entrySet())
        {
            if(seat.getValue().isFilled())
            {
                System.out.print(seat.getKey()+", ");
            }
        }
    }
    public HashMap<Integer, Seat> getSeats() {
        return seats;
    }
}


public class BusBooking {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.bookTicket("Tamil", 1);
        bus.bookTicket("Arasan", 12);
        bus.bookTicket("Sam", 2);
        bus.bookTicket("Ram", 1);
        bus.bookTicket("Tom", 12);
        bus.bookTicket("Hilfinger", 2);
        bus.bookTicket("Rooster", 12);
        bus.bookTicket("Maverick", 1);
        bus.bookTicket("Hanger", 6);
        bus.bookTicket("Hopper", 2);
        bus.bookTicket("Doppler", 12);
        bus.bookTicket("Newton", 1);



        System.out.println("Passangers: " + bus.getPassanger());
        bus.showAvailableSeats();
        bus.showBookedSeats();
    }
}
