package Assignment_Day9.PrintNumbersWithMultipleThreads;

class NumberPrinter {
    private  int currentNumber=1;
    private  int totalNumber;
    private int noOfThreads;



    public NumberPrinter(final int noOfThreads,final int totalNumber) {
            this.noOfThreads = noOfThreads;
            this.totalNumber = totalNumber;
    }

    public synchronized void printNumber(int start, int end)
    {
        int count = (totalNumber/noOfThreads);
        int x=0;
        while(x<count)
        {
            System.out.print(currentNumber+" ");
            currentNumber++;
            x++;
        }
    }
    public void divideRange(int totalThread,int n)
    {

    }
    public void waitForCompletion(){

    }
}

class PrinterFactory{
    private static NumberPrinter printer;

    public static NumberPrinter getPrinter()
    {
        if(printer==null)
        {
//            printer = new NumberPrinter();
        }
        return printer;
    }
}

class Thread1 extends Thread{

    private int start;
    public NumberPrinter printer;
    public Thread1(){
//        this.printer = new NumberPrinter();
    }
    public void run()
    {
        printer.waitForCompletion();
    }


}

public class PrintNumbersWithMultipleThreads {
    public static void main(String[] args) {

    }
}
