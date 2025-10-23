package unidad2.semana7;
import unidad2.semana7.clase.Product;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", 2500.0),
            new Product("Mouse", 50.0),
            new Product("Teclado", 80.0),
            new Product("Monitor", 700.0),
            new Product("Impresora", 400.0)
        };

        for (Product p : products) {
            p.showInfo();
        }
    }
}