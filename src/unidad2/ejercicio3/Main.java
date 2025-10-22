package unidad2.ejercicio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CAR RENTAL SYSTEM DEMO ===\n");
        

        CarRental rental = new CarRental();
        

        System.out.println("1. ADDING CARS TO THE SYSTEM:");
        Car car1 = new Car("Toyota Camry", 45.0, true);
        Car car2 = new Car("Honda Civic", 40.0, true);
        Car car3 = new Car("BMW X5", 85.0, false); // Not available
        Car car4 = new Car("Mercedes C-Class", 75.0, true);
        Car car5 = new Car("Ford Focus", 35.0, true);
        
        rental.addCar(car1);
        rental.addCar(car2);
        rental.addCar(car3);
        rental.addCar(car4);
        rental.addCar(car5);
        
        System.out.println("\nTotal cars in system: " + rental.getCarCount());
        System.out.println("Available cars: " + rental.getAvailableCarCount());
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
  
        System.out.println("2. ALL CARS IN SYSTEM:");
        rental.showAllCars();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
      
        System.out.println("3. AVAILABLE CARS FOR RENT:");
        rental.showAvailableCars();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
     
        System.out.println("4. RENTAL COST CALCULATIONS:");
        
        System.out.println("\nCalculating 5 days rental for Toyota Camry:");
        rental.calculateTotal(car1, 5);
        
        System.out.println("\nCalculating 3 days rental for BMW X5 (not available):");
        rental.calculateTotal(car3, 3);
        
        System.out.println("\nCalculating 7 days rental for Honda Civic:");
        rental.calculateTotal(car2, 7);
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
      
        System.out.println("5. SIMULATING CAR RENTALS:");
        
        System.out.println("\nRenting Toyota Camry:");
        car1.rentCar();
        
        System.out.println("\nRenting Honda Civic:");
        car2.rentCar();
        
        System.out.println("\nTrying to rent BMW X5 (already unavailable):");
        car3.rentCar();

        System.out.println("\nReturning BMW X5:");
        car3.returnCar();

        System.out.println("\nAvailable cars after rentals:");
        rental.showAvailableCars();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
   
        System.out.println("6. BONUS - CAR SEARCH FUNCTIONALITY:");
        
        System.out.println("\nSearching for 'Mercedes C-Class':");
        rental.searchCar("Mercedes C-Class");
        
        System.out.println("\nSearching for 'Tesla Model S' (doesn't exist):");
        rental.searchCar("Tesla Model S");
        
        System.out.println("\nSearching for 'ford focus' (case insensitive):");
        rental.searchCar("ford focus");
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
   
        System.out.println("7. RETURNING CARS:");
        
        System.out.println("\nReturning Toyota Camry:");
        car1.returnCar();
        
        System.out.println("\nReturning Honda Civic:");
        car2.returnCar();
        
    
        System.out.println("\nFINAL STATUS:");
        rental.showAllCars();
        
        System.out.println("\nSystem Summary:");
        System.out.println("Total cars: " + rental.getCarCount());
        System.out.println("Available cars: " + rental.getAvailableCarCount());
        System.out.println("Rented cars: " + (rental.getCarCount() - rental.getAvailableCarCount()));
        
        System.out.println("\n=== CAR RENTAL DEMO COMPLETED ===");
    }
}