package unidad2.ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TECH STORE INVENTORY SYSTEM ===\n");
        
        
        Inventory store = new Inventory();
        
        
        System.out.println("1. ADDING PRODUCTS TO INVENTORY:");
        Product laptop = new Product("LT001", "Gaming Laptop ASUS ROG", 1299.99);
        Product mouse = new Product("MS002", "Logitech MX Master 3", 99.99);
        Product keyboard = new Product("KB003", "Corsair K95 RGB", 179.99);
        Product monitor = new Product("MN004", "Samsung 27\" 4K Monitor", 349.99);
        Product headphones = new Product("HP005", "Sony WH-1000XM4", 249.99);
        
        store.addProduct(laptop);
        store.addProduct(mouse);
        store.addProduct(keyboard);
        store.addProduct(monitor);
        store.addProduct(headphones);
        
        System.out.println("\nTotal products added: " + store.getProductCount());
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        
        System.out.println("2. DISPLAYING ALL PRODUCTS:");
        store.showProducts();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        
        System.out.println("3. SEARCHING PRODUCTS BY CODE:");
        
        System.out.println("\nSearching for existing product (KB003):");
        store.searchProduct("KB003");
        
        System.out.println("\nSearching for existing product (LT001):");
        store.searchProduct("LT001");
        
        System.out.println("\nSearching for non-existing product (XX999):");
        store.searchProduct("XX999");
        
        System.out.println("\nSearching with empty code:");
        store.searchProduct("");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        
        System.out.println("4. BONUS - EXCEPTION HANDLING WITH TRY-CATCH:");
        
        System.out.println("\nSafe search for existing product (MN004):");
        store.searchProductSafe("MN004");
        
        System.out.println("\nSafe search for non-existing product (XYZ123):");
        store.searchProductSafe("XYZ123");
        
        System.out.println("\nSafe search with null code:");
        store.searchProductSafe(null);
        
        System.out.println("\nSafe search with empty code:");
        store.searchProductSafe("   ");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        
        System.out.println("5. ADDITIONAL SYSTEM FEATURES:");
        
        System.out.println("\nTrying to add duplicate product:");
        Product duplicateLaptop = new Product("LT001", "Another Gaming Laptop", 1599.99);
        store.addProduct(duplicateLaptop);
        
        System.out.println("\nShowing all product codes:");
        store.showProductCodes();
        
        System.out.println("\nChecking if specific codes exist:");
        System.out.println("Does KB003 exist? " + store.hasProduct("KB003"));
        System.out.println("Does XYZ999 exist? " + store.hasProduct("XYZ999"));
        
        System.out.println("\nRemoving a product (MS002):");
        store.removeProduct("MS002");
        
        System.out.println("\nInventory after removal:");
        store.showProducts();
        
        System.out.println("\nFinal inventory statistics:");
        System.out.println("Total products: " + store.getProductCount());
        store.showProductCodes();
        
        System.out.println("\n=== INVENTORY SYSTEM DEMO COMPLETED ===");
    }
}