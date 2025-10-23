package unidad3.ejercicio2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = args.length > 0 ? args[0] : "data.txt";

        try {
            int[] result = DataLoader.loadFile(filename);
            int total = result[0];
            int count = result[1];

            double avg = AverageCalculator.calculate(total, count);

            System.out.println("Total: " + total);
            System.out.println("Count: " + count);
            System.out.println("Average: " + avg);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("Empty file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error while reading file: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } finally {
            System.out.println("Operation finished.");
        }
    }
}