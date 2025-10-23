package unidad1.semana2;

public class SmallStore {
    String name;
    double price;
    int quantity;

    public SmallStore(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
            System.out.println("Sold " + amount + " units of " + name + ".");
        } else {
            System.out.println("Not enough stock to sell " + amount + " units of " + name + ".");
        }
    }

    public void restock(int amount) {
        quantity += amount;
        System.out.println("Added " + amount + " units to " + name + " stock.");
    }

    public void showProduct() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in stock: " + quantity);
        System.out.println("----------------------------");
    }

} 