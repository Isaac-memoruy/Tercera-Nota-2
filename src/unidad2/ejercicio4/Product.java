package unidad2.ejercicio4;

public class Product {
    private String code;
    private String name;
    private double price;
    
    
    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    
    
    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    
    public String getInfo() {
        return "Product [Code: " + code + ", Name: " + name + ", Price: $" + price + "]";
    }
    
    @Override
    public String toString() {
        return getInfo();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return code.equals(product.code);
    }
    
    @Override
    public int hashCode() {
        return code.hashCode();
    }
}