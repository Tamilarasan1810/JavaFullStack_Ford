package Concurrency.CustomThreadDemo;
// program to demostreate creation of our own thread by extending from Thread class

class MyThread extends Thread{
    public void run(){
        // logic to be run by the thead
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(Thread.currentThread()+" ---> Num is: "+i);
                Thread.sleep(700);
            }
        }catch (InterruptedException exception)
        {
            System.out.println("Exception is: "+exception.getMessage());
        }

    }
}
public class CustomThreadDemo {
    public static void main(String[] args) {
        MyThread threadObj = new MyThread();
        threadObj.setName("First");
        threadObj.setPriority(Thread.MIN_PRIORITY);
        threadObj.start();

        MyThread threadObj2 = new MyThread();
        threadObj2.setName("Second");
        threadObj2.setPriority(Thread.MAX_PRIORITY);
        threadObj2.start();

        MyThread threadObj3 = new MyThread();
        threadObj3.setName("Third");
        threadObj3.start();
    }
}
