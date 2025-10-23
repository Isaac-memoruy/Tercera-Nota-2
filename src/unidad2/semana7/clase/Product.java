package unidad2.semana7.clase;

public class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Producto: " + name + " | Precio: $" + price);
    }
}