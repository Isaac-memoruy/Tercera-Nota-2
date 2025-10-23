package unidad3.ejercicio2;

public class AverageCalculator {
    public static double calculate(int total, int count) {
        if (count == 0) {
            throw new ArithmeticException("No se puede dividir por cero (count == 0).");
        }
        return (double) total / count;
    }
}
