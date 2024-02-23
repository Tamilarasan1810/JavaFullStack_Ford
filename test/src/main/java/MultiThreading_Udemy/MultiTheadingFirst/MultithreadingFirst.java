package MultiThreading_Udemy.MultiTheadingFirst;



public class MultithreadingFirst {
    public static void main(String[] args) {
        var currThread = Thread.currentThread();
        System.out.println(currThread.getClass().getName());

        System.out.println(currThread);
        printThreadState(currThread);

        currThread.setName("MainGuy");
        currThread.setPriority(Thread.MAX_PRIORITY);
        printThreadState(currThread);
    }

    public static void printThreadState(Thread thread)
    {
        System.out.println("-------------------------");
        System.out.println("Thread Id: "+thread.getId());
        System.out.println("Thread Name: "+thread.getName());
        System.out.println("Thread Priority: "+thread.getThreadGroup());
        System.out.println("Thread State: "+thread.getState());
        System.out.println("Thread Group: "+thread.getThreadGroup());
        System.out.println("Thread Is Alive: "+thread.isAlive());
        System.out.println("---------------------------");

    }
}
