package unidad2.ejercicio2;

import java.util.Arrays;

public class OnlineShopDemo {
    public static void main(String[] args) {
        System.out.println("=== ONLINE SHOP SYSTEM DEMO ===\n");
        
       
        System.out.println("1. Creating Products:");
        Product laptop = new Product("Gaming Laptop", 1299.99);
        Product mouse = new Product("Wireless Mouse", 25.50);
        Product keyboard = new Product("Mechanical Keyboard", 89.99);
        Product monitor = new Product("4K Monitor", 349.99);
        
        System.out.println(laptop.getInfo());
        System.out.println(mouse.getInfo());
        System.out.println(keyboard.getInfo());
        System.out.println(monitor.getInfo());
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        
        System.out.println("2. Creating Categories (Aggregation with Products):");
        Category electronics = new Category("Electronics", "Electronic devices and accessories");
        Category computers = new Category("Computers", "Computing devices and peripherals");
        
        electronics.addProduct(laptop);
        electronics.addProduct(mouse);
        computers.addProduct(laptop); 
        computers.addProduct(keyboard);
        computers.addProduct(monitor);
        
        System.out.println("\n" + electronics.getInfo());
        System.out.println(computers.getInfo());
        
        System.out.println("=".repeat(50) + "\n");
        
        
        System.out.println("3. Creating Customer:");
        Customer customer1 = new Customer("Alice Johnson", "alice@email.com");
        Customer customer2 = new Customer("Bob Smith", "bob@email.com");
        
        System.out.println(customer1.getInfo());
        System.out.println(customer2.getInfo());
        
        System.out.println("=".repeat(50) + "\n");
        
        
        System.out.println("4. Placing Orders (Composition with Products):");
        
        
        System.out.println("Customer 1 - First Order:");
        Order order1 = customer1.placeOrder(Arrays.asList(laptop, mouse));
        System.out.println(order1.getInfo());
        
        
        System.out.println("Customer 1 - Second Order:");
        Order order2 = customer1.placeOrder(Arrays.asList(keyboard, monitor));
        System.out.println(order2.getInfo());
        
        
        System.out.println("Customer 2 - First Order:");
        Order order3 = customer2.placeOrder(Arrays.asList(mouse, keyboard));
        System.out.println(order3.getInfo());
        
        System.out.println("=".repeat(50) + "\n");
        
        
        System.out.println("5. Final Summary:");
        System.out.println("Customer Information:");
        System.out.println(customer1.getInfo());
        System.out.println(customer2.getInfo());
        
        System.out.println("Category Information:");
        System.out.println(electronics);
        System.out.println(computers);
        
        System.out.println("\nTotal Revenue: $" + 
            (customer1.getTotalSpent() + customer2.getTotalSpent()));
        
        System.out.println("\n=== DEMO COMPLETED ===");
    }
}