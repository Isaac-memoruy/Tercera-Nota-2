package unidad2.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private String description;
    private List<Product> products;
    
    
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }
    
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public void addProduct(Product product) {
        if (product != null && !products.contains(product)) {
            products.add(product);
            System.out.println("Product '" + product.getName() + "' added to category '" + name + "'");
        }
    }
    
    
    public void removeProduct(Product product) {
        if (products.remove(product)) {
            System.out.println("Product '" + product.getName() + "' removed from category '" + name + "'");
        }
    }
    
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Category: ").append(name).append("\n");
        info.append("Description: ").append(description).append("\n");
        info.append("Products (").append(products.size()).append("):\n");
        for (Product product : products) {
            info.append("  - ").append(product.getInfo()).append("\n");
        }
        return info.toString();
    }
    
    @Override
    public String toString() {
        return "Category: " + name + " (" + products.size() + " products)";
    }
}