package unidad2.ejercicio2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private double total;
    private List<Product> products; 
    
  
    public Order(Date date) {
        this.date = date;
        this.total = 0.0;
        this.products = new ArrayList<>();
    }
    
    
    public Date getDate() {
        return date;
    }
    
    public double getTotal() {
        return total;
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
   
    public void setDate(Date date) {
        this.date = date;
    }
    
    
    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
            calculateTotal();
            System.out.println("Product '" + product.getName() + "' added to order");
        }
    }
    
    public void removeProduct(Product product) {
        if (products.remove(product)) {
            calculateTotal();
            System.out.println("Product '" + product.getName() + "' removed from order");
        }
    }
    
    
    public void calculateTotal() {
        total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
    }
    
   
    public int getProductCount() {
        return products.size();
    }
    
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Order Date: ").append(date).append("\n");
        info.append("Products (").append(products.size()).append("):\n");
        for (Product product : products) {
            info.append("  - ").append(product.getInfo()).append("\n");
        }
        info.append("Total: $").append(total).append("\n");
        return info.toString();
    }
    
    @Override
    public String toString() {
        return "Order [" + date + "] - $" + total + " (" + products.size() + " items)";
    }
}