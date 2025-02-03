class  {
    int id;
    double price;
    String name;
    int quantity;

    public Product(int id, double price, String name, int quantity) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
    }
}

public class ProductArray {
    public static void main(String[] args) {
        
        Product[] products = new Product[1];

        
        products[0] = new Product(1, 11, "Apple", 2);

        
        for (Product product : products) {
            product.display();
        }
    }
}
