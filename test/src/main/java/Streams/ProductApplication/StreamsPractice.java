package Streams.ProductApplication;

import java.util.ArrayList;
import java.util.*;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class Product{
    private int id;
    private String name;
    private double price;
    private int qty;
    private String dom;//date of manufacturing
    private String doe;//date of expiration
    private String manufacturer;

    public Product(int id, String name, double price, int qty, String dom, String doe, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.dom = dom;
        this.doe = doe;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", dom='" + dom + '\'' +
                ", doe='" + doe + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(price, product.price) == 0 && qty == product.qty && Objects.equals(name, product.name) && Objects.equals(dom, product.dom) && Objects.equals(doe, product.doe) && Objects.equals(manufacturer, product.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, qty, dom, doe, manufacturer);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }
}

class SortProductByPrice implements Comparator<Product>
{
    public int compare(Product product1,Product product2)
    {
        if(product1.getPrice() == product2.getPrice())
        {
            return 0;
        } else if (product1.getPrice() > product2.getPrice()) {
            return -1;
        }
        else {
            return 1;
        }
    }
}

class ProductFactory {
    private List<Product> productList;

    public ProductFactory() {
        this.productList =new ArrayList<Product>();
    }

    public void addProduct(Product product)
    {
        this.productList.add(product);
    }
    public void updatePrice(int id,double price)
    {
        List<Product> prod = this.productList.stream().filter(x -> x.getId()==id).collect(Collectors.toList());
        for (Product x : prod)
        {
            x.setPrice(price);
        }
        System.out.println("Price for updated successfully");
    }

    public void displayProductWithLength()
    {
        List<Product> products = this.productList.stream().filter(x->x.getName().length()>=5).toList();
        System.out.println("\nProducts with name greater than 5 characters are: ");
        for(Product prod : products)
        {
            System.out.println(prod);
        }
    }

    public void productsWithOddPrice()
    {
        List<Product> prod = this.productList.stream().filter(x->x.getPrice()%2==1).toList();
        System.out.println("\nProducts with odd Price are: ");
        for (Product x : prod)
        {
            System.out.println(x);
        }
    }
    public void productsOnManufacture()
    {
        Set<String> manufacturers = new HashSet<>();
        for(Product prod : this.productList)
        {
            manufacturers.add(prod.getManufacturer());
        }
        System.out.println("Manufacturer wise product count are: ");
        for(String x : manufacturers)
        {
            int count = (int) this.productList.stream().filter(prod -> prod.getManufacturer().equals(x)).count();
            System.out.println(x+" - "+count);
        }
    }
    public void sortProductByPrice()
    {
        System.out.println("\nSorted product list: ");
        Collections.sort(this.productList,new SortProductByPrice());
        System.out.println(this.productList);
    }

}
//delete, display by id,display all products

//use stream to perform below operations
// display products with name having 5 letters
// display products with price in odd numbers
// count the products based on manufacture wise
// display products based on product price(desc order)
// display products based on doe (asc order)
// count the products whose qty is in even numbers

public class StreamsPractice {
    public static void main(String[] args) {
        Product product1 = new Product(101,"Milk",15,5,"feb1","mar1","Avin");
        Product product2 = new Product(102,"Bread",32,34,"jan5","mar6","Bakers");
        Product product3 = new Product(103,"Butter",31,54,"mar5","apr6","Amul");
        Product product4 = new Product(104,"Paneer",53,12,"oct7","dec6","Amul");

        ProductFactory factory = new ProductFactory();

        factory.addProduct(product1);
        factory.addProduct(product2);
        factory.addProduct(product3);
        factory.addProduct(product4);

        factory.updatePrice(102,50);
        factory.displayProductWithLength();
        factory.productsWithOddPrice();
        factory.productsOnManufacture();

        factory.sortProductByPrice();

    }
}
