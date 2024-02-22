package Synchronization.JoinThreadDemo;
// program to demonstrate the join() method usage

class CustomThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("num is: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class JoinThreadDemo {
    public static void main(String[] args) throws InterruptedException{

       /* CustomThread ct = new CustomThread(); // it is runnable object
        Thread t = new Thread(ct);
        t.start();*/

        System.out.println("Current thread is: "+Thread.currentThread()+" started execution");
        Thread t = new Thread( () -> {
            System.out.println(Thread.currentThread()+" in run() started execution");
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("num is: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+" in run() ends execution");

        });
        t.start();
        t.join(); // wait untill thread t joins
        System.out.println("Current thread is: "+Thread.currentThread()+" ends execution");




    }
}
