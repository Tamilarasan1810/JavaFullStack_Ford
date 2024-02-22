package SerializationAndDeserialization.SerializationDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("/Users/tm10/IdeaProjects/test/src/main/java/SerializationAndDeserialization/SerializationDemo/products.ser");
            ois = new ObjectInputStream(fis);

            Product product = (Product) ois.readObject();
            System.out.println(product);


            System.out.println("Product object De-Serialized ");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception is: " + e.getLocalizedMessage());
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
