package unidad2.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Ejercice1 p1 = new Ejercice1("ABC123", 5.0);

        Ejercice1 p2 = p1;

        p2.weight = 10.0;

        System.out.println("Package info (using p1):");
        p1.showPackage();

        changeWeight(p1, 20.5);

        System.out.println("\nAfter changeWeight method:");
        p1.showPackage();
    }

    public static void changeWeight(Ejercice1 p, double newWeight) {
        p.weight = newWeight;
    }
}
