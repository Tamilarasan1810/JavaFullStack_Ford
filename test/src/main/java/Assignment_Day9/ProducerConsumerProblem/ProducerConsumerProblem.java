package Assignment_Day9.ProducerConsumerProblem;

import java.io.IOException;
import java.util.*;

class SharedBuffer {
        private ArrayList<Integer> buffer = new ArrayList<>();
//    private int buffer = 0;
    private int MaxSize = 4;

    public synchronized void produce(int item) {
        try {
            if (this.isFull()) {
                System.out.println("wait");
                wait();
            } else {
                System.out.println("notify");
                notify();
            }
            /*if (buffer >= MaxSize) {
                wait();
            } else {
                notify();
            }*/
            buffer.add(item);
//            buffer += item;
            System.out.println(Thread.currentThread().getName() + " produced " + item + " items");

        } catch (InterruptedException e) {
            System.out.println("Exception is: " + e.getMessage());
        }
    }

    public synchronized void consume() {
        try {
            if (this.isEmpty()) {
                notify();
            } else {
                wait();
            }
            /*if (buffer <= 0) {
                wait();
            } else {
                notify();
            }*/
            int x = buffer.remove(buffer.size()-1);
//            int x = 2;
//            buffer -= 2;
            System.out.println(Thread.currentThread().getName() + " consumed " + x + " items");

        } catch (InterruptedException e) {
            System.out.println("Exception is: " + e.getMessage());
        }
    }

    private boolean isEmpty() {
        if (buffer.size() <= 0) {
            return false;
        }
        return true;
    }

    private boolean isFull() {
        if (buffer.size() >= MaxSize) {
            return true;
        }
        return false;
    }

    public void printBuffer() {
        System.out.println("Buffer value: " + buffer);
       /* for (int x : buffer) {
            System.out.println(x);
        }*/
    }
}

class MyBuffer {
    private static SharedBuffer buffer;

    public static SharedBuffer getBuffer() {
        if (buffer == null) {
            buffer = new SharedBuffer();
        }
        return buffer;
    }
}

class Producer extends Thread {
    private SharedBuffer buffer;
    private int capacity;

    public Producer(int capacity) {
        buffer = MyBuffer.getBuffer();
        this.capacity = capacity;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(100);
                buffer.produce(this.capacity);
                buffer.printBuffer();



            }
            System.out.print("Out of Producer: ");
            buffer.printBuffer();
        } catch (InterruptedException e) {
            System.out.println("Execption is: " + e.getMessage());
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer buffer;

    public Consumer() {
        buffer = MyBuffer.getBuffer();
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(100);
                buffer.consume();
                buffer.printBuffer();


            }
            System.out.print("Out of Consumer: ");
            buffer.printBuffer();

        } catch (InterruptedException e) {
            System.out.println("Exception is: " + e.getMessage());
        }


    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        SharedBuffer obj = MyBuffer.getBuffer();

        Producer producer1 = new Producer(2);
        producer1.setName("Producer1");

        Producer producer2 = new Producer(4);
        producer2.setName("Producer2");

        Consumer consumer1 = new Consumer();
        consumer1.setName("Consumer1");

        Consumer consumer2 = new Consumer();
        consumer2.setName("Consumer2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();


    }
}
