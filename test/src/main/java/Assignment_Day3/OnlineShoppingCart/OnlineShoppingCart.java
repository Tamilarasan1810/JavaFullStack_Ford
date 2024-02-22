package Assignment_Day3.OnlineShoppingCart;

import java.util.HashMap;
import java.util.Map;

class Cart{
   private Map<String,Integer> cartItems = new HashMap<>();


    public void addItem(String name,int price) {
        this.cartItems.put(name,price);
    }
    public void calculateTotal()
    {
        int sum =0;
        for(Map.Entry<String,Integer> item:cartItems.entrySet())
        {
            sum+=item.getValue();
        }
        System.out.println("Total amount is: "+sum);
    }
    public void displayCart()
    {
        System.out.println("Cart items are:");
        for(Map.Entry<String,Integer> item:cartItems.entrySet())
        {
            System.out.println(item);
        }
    }

}

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Cart cust = new Cart();
        cust.addItem("milk",20);
        cust.addItem("bread",40);
        cust.addItem("jam",20);
        cust.calculateTotal();
        cust.displayCart();
    }
}
