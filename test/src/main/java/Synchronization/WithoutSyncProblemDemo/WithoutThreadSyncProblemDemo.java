package Synchronization.WithoutSyncProblemDemo;
// program to demonstrate the situation without thread synchronization

import javax.swing.*;

class Printer{
    public  void print(String filename) throws InterruptedException
    {
        synchronized (this) {
            System.out.println("Printer printing started for from " + filename);
            Thread.sleep(700);
            System.out.println("Printer printing completed for from " + filename);
        }
    }
}

class PrinterFactory{
    private static Printer printer;
    public static Printer getPrinter(){
        if(printer==null) {
            printer = new Printer();
        }
            return printer;

    }
}
class FirstThread extends Thread{
    private String fileName;
    private Printer printer;
    public FirstThread(String file)
    {
        this.fileName = file;
        this.printer = PrinterFactory.getPrinter();
    }
    public void run()
    {
        try
        {
            printer.print(fileName);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class SecondThread extends Thread{
    private String fileName;
    private Printer printer;
    public SecondThread(String file)
    {
        this.fileName = file;
        this.printer = PrinterFactory.getPrinter();
    }
    public void run()
    {
        try
        {
            printer.print(fileName);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
public class WithoutThreadSyncProblemDemo {
    public static void main(String[] args) {
        FirstThread t1 = new FirstThread("ABCFile.txt");
        t1.start();

        SecondThread t2 = new SecondThread("BCCFile.txt");
        t2.start();

        SecondThread t3 = new SecondThread("CCBFile.txt");
        t3.start();
    }
}
