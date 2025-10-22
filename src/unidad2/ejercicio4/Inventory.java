package unidad2.ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    
    private ArrayList<Product> products;
    private HashMap<String, Product> catalog;
    
    
    public Inventory() {
        this.products = new ArrayList<>();
        this.catalog = new HashMap<>();
    }
    
    
    public void addProduct(Product p) {
        if (p == null) {
            System.out.println("Cannot add null product.");
            return;
        }
        
        if (catalog.containsKey(p.getCode())) {
            System.out.println("Product with code '" + p.getCode() + "' already exists. Cannot add duplicate.");
            return;
        }
        
        
        products.add(p);
        catalog.put(p.getCode(), p);
        
        System.out.println("Product added: " + p.getInfo());
    }
    
    
    public void showProducts() {
        System.out.println("\n=== INVENTORY - ALL PRODUCTS ===");
        
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            System.out.println("Total products: " + products.size());
            System.out.println("Products in inventory:");
            
            
            int counter = 1;
            for (Product product : products) {
                System.out.println(counter + ". " + product.getInfo());
                counter++;
            }
        }
        System.out.println("==============================");
    }
    
    
    public Product searchProduct(String code) {
        if (code == null || code.trim().isEmpty()) {
            System.out.println("Invalid code provided for search.");
            return null;
        }
        
        
        Product foundProduct = catalog.get(code);
        
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct.getInfo());
        } else {
            System.out.println("Product with code '" + code + "' not found.");
        }
        
        return foundProduct;
    }
    
    
    public int getProductCount() {
        return products.size();
    }
    
    public boolean hasProduct(String code) {
        return catalog.containsKey(code);
    }
    
    public void removeProduct(String code) {
        Product productToRemove = catalog.get(code);
        if (productToRemove != null) {
            products.remove(productToRemove);
            catalog.remove(code);
            System.out.println("Product removed: " + productToRemove.getInfo());
        } else {
            System.out.println("Cannot remove: Product with code '" + code + "' not found.");
        }
    }
    
    
    public void showProductCodes() {
        System.out.println("\nProduct codes in inventory: " + catalog.keySet());
    }
    
    
    public Product searchProductSafe(String code) {
        try {
            if (code == null) {
                throw new IllegalArgumentException("Product code cannot be null");
            }
            
            if (code.trim().isEmpty()) {
                throw new IllegalArgumentException("Product code cannot be empty");
            }

            if (!catalog.containsKey(code)) {
                throw new RuntimeException("Product with code '" + code + "' does not exist in catalog");
            }
            Product foundProduct = catalog.get(code);
            
            if (foundProduct == null) {
                throw new RuntimeException("Product with code '" + code + "' does not exist in catalog");
            }
            
            System.out.println("Product found safely: " + foundProduct.getInfo());
            return foundProduct;
            
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
            return null;
        } catch (RuntimeException e) {
            System.out.println("Search error: " + e.getMessage());
            return null;
        } catch (Exception e) {
            System.out.println("Unexpected error during search: " + e.getMessage());
            return null;
        }
    }
}