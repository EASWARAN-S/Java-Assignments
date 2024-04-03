import java.util.ArrayList;
import java.util.List;

abstract class Product {
    String name;
    double price;
    String brand;
    int quantity;

    public Product(String productName, double productPrice, String brand, int quantity) {
        this.name = productName;
        this.price = productPrice;
        this.brand = brand;
        this.quantity = quantity;
    }

    abstract public double getPrice();

    abstract public void getDescription();

}

class ElectronicsProduct extends Product {
    public ElectronicsProduct(String productName, double productPrice, String brand, int quantity) {
        super(productName, productPrice, brand, quantity);
    }

    public void getDescription() {

        System.out.println("Product name is :" + name);
        System.out.println("Product belongs to  : " + brand + " brand");
        System.out.println("Available quantity is : " + quantity);
    }

    public double getPrice() {

        return price;
    }

}

class ClothingProduct extends Product {

    String color;

    public ClothingProduct(String productName, double productPrice, String brand, int quantity, String color) {
        super(productName, productPrice, brand, quantity);
        this.color = color;
    }

    public void getDescription() {

        System.out.println("Product name is :" + name);
        System.out.println("Product belongs to  : " + brand + " brand");
        System.out.println("Available quantity is : " + quantity);
        System.out.println("Color of the product is : " + color);

    }

    public double getPrice() {

        return price;
    }

}

class BookProduct extends Product {

    String type;

    public BookProduct(String productName, double productPrice, String brand, int quantity, String type) {
        super(productName, productPrice, brand, quantity);
        this.type = type;
    }

    public void getDescription() {
        System.out.println("Product name is :" + name);
        System.out.println("Product Publisher name : " + brand);
        System.out.println("Available quantity is : " + quantity);
        System.out.println("Book Type is : " + type);
    }

    public double getPrice() {

        return price;
    }

}

class ShoppingCart {
    List<Product> productList = new ArrayList<>();

    public void add(Product prod) {
        productList.add(prod);
    }

    public void displayItems() {
        for (Product p : productList) {
            p.getDescription();
        }
    }

}

public class ProductMainDemo {
    public static void main(String[] args) {
        ElectronicsProduct ep = new ElectronicsProduct("Laptop", 30000, "Acer", 5);
        ClothingProduct cp = new ClothingProduct("Shirt", 450, "Ramraj", 10, "Red");
        BookProduct bp = new BookProduct("Java A complete Reference", 800, "Pearson", 11, "Computer Science");
        ShoppingCart sp = new ShoppingCart();
        sp.add(ep);
        sp.add(cp);
        sp.add(bp);
        sp.displayItems();
        int total = 0;
        for (Product p : sp.productList) {
            total += p.getPrice();
        }
        System.out.println("Total cost for product  selected is.... " + total);
    }
}