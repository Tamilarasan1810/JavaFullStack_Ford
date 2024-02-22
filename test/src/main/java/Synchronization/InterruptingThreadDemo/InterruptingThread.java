package Synchronization.InterruptingThreadDemo;

public class InterruptingThread {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread( () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("num is: " + i);
                   Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
        System.out.println("isThread interrupted: "+t.isInterrupted());
        Thread.sleep(1500);
        t.interrupt();// calling to interrupt the thread
        System.out.println("isThread interrupted: "+t.isInterrupted());


    }
}
