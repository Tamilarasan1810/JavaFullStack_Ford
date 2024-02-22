package Assignment_Day3.EcommerceProductCatelog;

import java.util.StringJoiner;

class Product{
    private String prodductName;
    private double price;
    private String description;

    public Product(String prodductName, double price, String description) {
        this.prodductName = prodductName;
        this.price = price;
        this.description = description;
    }


}

class Electronics extends Product{
    private String waranty;
    public Electronics(String prodductName, double price, String description,String waranty) {
        super(prodductName, price, description);
        this.waranty = waranty;
    }

    @Override
    public String toString() {
        return "Electronics{} " + super.toString();
    }
}

public class EcommerceProduceCatelog {
    public static void main(String[] args) {
    Electronics prod1 = new Electronics("heaphone",2342,"Wireless neckband","2 years");
        System.out.println(prod1);
    }
}
