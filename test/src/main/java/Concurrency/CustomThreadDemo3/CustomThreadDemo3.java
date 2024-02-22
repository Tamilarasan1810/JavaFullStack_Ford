package Concurrency.CustomThreadDemo3;
// program to demo multi-threading
// thread t1-  prints between 1 to 5
// thread t2- prints between 10 to 6

class Thread1 extends Thread{
    private String name;
    public  Thread1(String name)
    {
        this.name= name;
    }
    public void run(){
        try {
            for(int i=1;i<=5;i++)
            {
                System.out.println(this.name+", num is: "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Exception is: "+e.getMessage());
        }
    }
}
class Thread2 extends Thread{
    private String name;
    public  Thread2(String name)
    {
        this.name= name;
    }
    public void run(){
        try {
            for(int i=6;i<=10;i++)
            {
                System.out.println(this.name+", num is: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Exception is: "+e.getMessage());
        }
    }
}
public class CustomThreadDemo3 {
    public static void main(String[] args) {
        Thread1 t1= new Thread1("FirstThread");
        t1.start();;

        Thread2 t2 = new Thread2("SecondThread");
        t2.start();
    }
}
