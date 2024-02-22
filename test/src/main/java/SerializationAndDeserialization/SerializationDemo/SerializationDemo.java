package SerializationAndDeserialization.SerializationDemo;

import java.io.*;

class Product implements Serializable {
    private int id;
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Product product = new Product(100,"Lappy",4234.00);
        FileOutputStream fos = null;
        ObjectOutputStream oos =null;
        try{
            fos = new FileOutputStream("/Users/tm10/IdeaProjects/test/src/main/java/SerializationAndDeserialization/SerializationDemo/products.ser");
             oos = new ObjectOutputStream(fos);

             oos.writeObject(product);

            System.out.println("Product object Serialized ");

        }catch (IOException e)
        {
            System.out.println("Exception is: "+e.getLocalizedMessage());
        }
        finally {
            try
            {
                fos.close();
                oos.close();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
