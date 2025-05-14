package training.assingments.methods;

// Base Product class
class Productt {
    protected int id;
    protected String name;
    
    public Productt(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void displayBasicInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Subclass 1
class DetailedProduct extends Productt {
    protected String category;
    protected int count;
    
    public DetailedProduct(int id, String name, String category, int count) {
        super(id, name);
        this.category = category;
        this.count = count;
    }
    
    public void displayDetails() {
        displayBasicInfo();
        System.out.println("Category: " + category + ", Count: " + count);
    }
}

// Subclass 2
class PricedProduct extends DetailedProduct {
    private int price;
    
    public PricedProduct(int id, String name, String category, int count, int price) {
        super(id, name, category, count);
        this.price = price;
    }
    
    public void displayAll() {
        displayDetails();
        System.out.println("Price: " + price);
    }
    
    public void calculateTotalPrice() {
        int totalPrice = count * price;
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Product Info - ID: " + id + ", Name: " + name + 
                          ", Category: " + category);
    }
}

// Main class in the specified package
public class Product {
    public static void main(String[] args) {
        // First scenario
        PricedProduct product1 = new PricedProduct(78, "xmu1", "better", 50, 0);
        product1.displayAll();
        product1.calculateTotalPrice();
        
        /*// Second scenario
        PricedProduct product2 = new PricedProduct(78, "xmu1", "Will", 90, 10);
        product2.displayAll();
        product2.calculateTotalPrice();
        
        // Third scenario
        PricedProduct product3 = new PricedProduct(78, "xmu1", "choco", 56, 10);
        product3.displayAll();*/
    }
}