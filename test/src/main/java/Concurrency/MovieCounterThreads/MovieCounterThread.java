package Concurrency.MovieCounterThreads;

import java.util.concurrent.ThreadLocalRandom;

// Ticket counter ---> taking a ticket
// theaterMainDoor ---> cut ticket(some delay to show seat) and show seat
// task --> show the ticket
//       --> cut the ticket
//       --> show the seat
class TicketCounter extends Thread{
    private String personName;
    private long ticketNum;
    public TicketCounter(String personName) {
        this.personName = personName;
    }
    public long issueTicket () throws InterruptedException{

        ticketNum =(long) Math.abs((Math.random()*100)+1);

        Thread.sleep(300);
        return ticketNum;
    }
    public void cutTicket(long ticketNum) throws InterruptedException
    {
        Thread.sleep(200);
        System.out.println("Cutting ticket: "+this.ticketNum+" to "+this.personName);
    }
    public void showSeat(long ticketNum) throws InterruptedException
    {
        Thread.sleep(100);
        System.out.println("show seating to "+ personName+" with ticket: "+ticketNum);
    }

    public void run()
    {
        try {
            this.issueTicket();
            System.out.println("Ticket issued: "+this.ticketNum+" to "+this.personName);

            this.cutTicket(ticketNum);

            this.showSeat(ticketNum);

            System.out.println("\n------------------------\n");
        }catch (InterruptedException e)
        {
            System.out.println("Exception is: "+e.getMessage());
        }
    }

}


public class MovieCounterThread {
    public static void main(String[] args) throws InterruptedException{
        for(int i=1;i<=5;i++)
        {
            TicketCounter tic = new TicketCounter("Tamil"+i);
            tic.start();
            Thread.sleep(300);
        }
    }
}
