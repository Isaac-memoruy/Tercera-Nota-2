package unidad1.semana2;
public class MallTore {
    
    public static void main(String[] args) {
        SmallStore product1 = new SmallStore("Laptop", 1200.00, 10);
        SmallStore product2 = new SmallStore("Headphones", 150.00, 25);

        product1.showProduct();
        product1.sell(3);
        product1.showProduct();
        product1.restock(5);
        product1.showProduct();
        product1.sell(20); 

        product2.showProduct();
        product2.sell(5);
        product2.restock(10);
        product2.showProduct();
    }
 
    
}