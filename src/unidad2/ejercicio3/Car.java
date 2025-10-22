package unidad2.ejercicio3;

public class Car {
    private String model;
    private double pricePerDay;
    private boolean available;
    
 
    public Car(String model, double pricePerDay, boolean available) {
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }
    
    
    public String getModel() {
        return model;
    }
    
    public double getPricePerDay() {
        return pricePerDay;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
   
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
    public void rentCar() {
        if (available) {
            available = false;
            System.out.println("Car " + model + " has been rented.");
        } else {
            System.out.println("Car " + model + " is not available for rent.");
        }
    }
    
   
    public void returnCar() {
        if (!available) {
            available = true;
            System.out.println("Car " + model + " has been returned and is now available.");
        } else {
            System.out.println("Car " + model + " was not rented.");
        }
    }
    
    
    public String getInfo() {
        String status = available ? "Available" : "Rented";
        return "Car: " + model + " - $" + pricePerDay + "/day - Status: " + status;
    }
    
    @Override
    public String toString() {
        return getInfo();
    }
}