package Concurrency.MainThreadDemo;
// program to demonstreate main thread
public class MainThreadDemo {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Currently Main method running thread: "+currentThread.getName());
        System.out.println("Main Thread id is: "+currentThread.getId());
        System.out.println("Main Thread priority is: "+currentThread.getPriority());
        System.out.println("Main Thread belongs to group: "+currentThread.getThreadGroup().getName());
        System.out.println(currentThread);

        currentThread.setPriority(Thread.MAX_PRIORITY); // sets priority to main thread
        currentThread.setName("MyMainThread");  // sets new name to main thread
        System.out.println(currentThread);

        //
    }
}
