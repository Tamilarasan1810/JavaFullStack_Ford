package Concurrency.InterThreadCommunication.ProducerConsumerProblemDemo;

class Shop{
    private int stock;
    private boolean isStockAvailable=false;

    public synchronized void produceStock(int stock)
    {
        try{

            if(isStockAvailable){
                wait();
            }else{
                notify();
            }
            this.stock = stock;
            System.out.println("Producer supplied stock: "+stock);
            isStockAvailable = true;
        }
        catch (InterruptedException e)
        {
            System.out.println("Exception is: "+e.getMessage());
        }
    }
    public synchronized void consumeStock()
    {
        try{
            if(isStockAvailable){
                notify();
            }else{
                wait();
            }
            System.out.println("Consumer consumed stock: "+this.stock);
            this.stock = 0;
            isStockAvailable = false;
        }
        catch (InterruptedException e)
        {
            System.out.println("Exception is: "+e.getMessage());
        }

    }
}

class Myshop{
    private static Shop shop ;
    public static Shop getShopObject()
    {
        if(shop == null)
        {
            shop = new Shop();
        }
        return shop;
    }

}

class Producer extends Thread{

    private Shop shop;

    public Producer(){
        shop = Myshop.getShopObject();
    }
    public void run()
    {
        try {
            for(int i=1;i<=5;i++)
            {
                shop.produceStock(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Exception is: "+e.getLocalizedMessage());
        }
    }
}

class Consumer extends Thread{
    private Shop shop;

    public Consumer(){
        shop = Myshop.getShopObject();
    }
    public void run()
    {
        try {
            for(int i=1;i<=5;i++)
            {
                shop.consumeStock();
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Exception is: "+e.getLocalizedMessage());
        }
    }
}

public class ProducerConsumerProblemDemo {
    public static void main(String[] args) {
        Producer p =new Producer();
        p.start();

        Consumer c = new Consumer();
        c.start();
    }
}
