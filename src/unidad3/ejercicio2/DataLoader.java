package unidad3.ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataLoader {
    // Usa FileReader y lanza IOException
    public static int[] loadFile(String filename) throws IOException, EmptyFileException {
        int total = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                try {
                    int v = Integer.parseInt(line);
                    total += v;
                    count++;
                } catch (NumberFormatException e) {
                    // ignorar líneas no numéricas
                }
            }
        }

        if (count == 0) {
            throw new EmptyFileException("El archivo está vacío o no contiene enteros válidos: " + filename);
        }

        return new int[] { total, count };
    }
}