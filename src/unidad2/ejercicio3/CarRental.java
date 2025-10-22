package unidad2.ejercicio3;

import java.util.ArrayList;

public class CarRental {
    private ArrayList<Car> cars;
    
 
    public CarRental() {
        this.cars = new ArrayList<>();
    }
    

    public void addCar(Car c) {
        if (c != null) {
            cars.add(c);
            System.out.println("Car " + c.getModel() + " added to rental system.");
        }
    }
  
    public void showAvailableCars() {
        System.out.println("\n=== AVAILABLE CARS ===");
        boolean hasAvailableCars = false;
        
       
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car.getInfo());
                hasAvailableCars = true;
            }
        }
        
        if (!hasAvailableCars) {
            System.out.println("No cars available at the moment.");
        }
        System.out.println("=====================");
    }
    

    public double calculateTotal(Car c, int days) {
     
        if (c == null) {
            System.out.println("Invalid car provided.");
            return 0.0;
        }
        
        if (days <= 0) {
            System.out.println("Number of days must be positive.");
            return 0.0;
        }
        
        if (!c.isAvailable()) {
            System.out.println("Car " + c.getModel() + " is not available for rent.");
            return 0.0;
        }
        
        double total = c.getPricePerDay() * days;
        System.out.println("Rental calculation for " + c.getModel() + ":");
        System.out.println("Price per day: $" + c.getPricePerDay());
        System.out.println("Number of days: " + days);
        System.out.println("Total cost: $" + total);
        
        return total;
    }
    

    public void showAllCars() {
        System.out.println("\n=== ALL CARS IN SYSTEM ===");
        
        if (cars.isEmpty()) {
            System.out.println("No cars in the system.");
        } else {
    
            for (int i = 0; i < cars.size(); i++) {
                System.out.println((i + 1) + ". " + cars.get(i).getInfo());
            }
        }
        System.out.println("========================");
    }
    
   
    public int getCarCount() {
        return cars.size();
    }
    
 
    public int getAvailableCarCount() {
        int count = 0;
        for (Car car : cars) {
            if (car.isAvailable()) {
                count++;
            }
        }
        return count;
    }
    
   
    public Car searchCar(String model) {
      
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                System.out.println("Car found: " + car.getInfo());
                return car;
            }
        }
        
        System.out.println("Car not found.");
        return null;
    }
}