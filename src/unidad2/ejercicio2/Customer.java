package unidad2.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Customer {
    private String name;
    private String email;
    private List<Order> orders; 
    
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }
    
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public List<Order> getOrders() {
        return orders;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Order placeOrder(List<Product> products) {
        if (products == null || products.isEmpty()) {
            System.out.println("Cannot place an empty order!");
            return null;
        }
        
        Order newOrder = new Order(new Date());
        for (Product product : products) {
            newOrder.addProduct(product);
        }
        
        orders.add(newOrder);
        System.out.println("Order placed by " + name + " - Total: $" + newOrder.getTotal());
        return newOrder;
    }
    
    
    public double getTotalSpent() {
        double total = 0;
        for (Order order : orders) {
            total += order.getTotal();
        }
        return total;
    }
    
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Customer: ").append(name).append("\n");
        info.append("Email: ").append(email).append("\n");
        info.append("Total Orders: ").append(orders.size()).append("\n");
        info.append("Total Spent: $").append(getTotalSpent()).append("\n");
        return info.toString();
    }
    
    @Override
    public String toString() {
        return "Customer: " + name + " (" + orders.size() + " orders)";
    }
}