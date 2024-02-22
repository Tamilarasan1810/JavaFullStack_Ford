package Assignment_Day9.SharedResourceAccess;

class SharedCounter{
    private  static int counter = 0;

    public synchronized void incrementCounter(){
        try {
            System.out.println(Thread.currentThread().getName()+" incrementing counter...");
            counter++;
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" completed incrementing counter...");
        }catch (InterruptedException e)
        {
            System.out.println("Exception is: "+e.getMessage());
        }
    }
    public synchronized void decrementCounter(){
        try {
            System.out.println(Thread.currentThread().getName()+" decrementing counter...");
            counter++;
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" completed incrementing counter...");
        }catch (InterruptedException e)
        {
            System.out.println("Exception is: "+e.getMessage());
        }
    }
    public void displayCounter()
    {
        System.out.println("Counter value: "+counter);
    }

}

class Thread1 extends Thread{
    private static SharedCounter counter;
    public Thread1(String name)
    {
        Thread.currentThread().setName(name);
        counter = new SharedCounter();
    }
    public void run()
    {
        counter.incrementCounter();
    }
}
class Thread2 extends Thread{
    private static SharedCounter counter;
    public Thread2(String name)
    {
        Thread.currentThread().setName(name);
        counter = new SharedCounter();
    }
    public void run()
    {
        counter.decrementCounter();
    }
}

public class SharedResourceAccess {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread1");
        Thread2 t2 = new Thread2("Thread2");
        Thread1 t3 = new Thread1("Thread3");
        Thread2 t4 = new Thread2("Thread4");
        /*Thread1 t5 = new Thread1("Thread5");
        Thread2 t8 = new Thread2("Thread8");
        Thread2 t6 = new Thread2("Thread6");
        Thread1 t7 = new Thread1("Thread7");*/
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        SharedCounter obj = new SharedCounter();
        obj.decrementCounter();
    }
}
