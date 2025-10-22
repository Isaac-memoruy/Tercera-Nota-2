package unidad2.ejercicio1;

public class Ejercice1 {
    String trackingCode;
    double weight;

    
    public Ejercice1(String trackingCode, double weight) {
        this.trackingCode = trackingCode;
        this.weight = weight;
    }

    
    public void showPackage() {
        System.out.println("Tracking Code: " + trackingCode);
        System.out.println("Weight: " + weight + " kg");
    }
}
