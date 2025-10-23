package unidad3.ejercicio3;

import java.io.*;
import java.util.*;

public class BookFileHandler {
    private final String filename;

    public BookFileHandler(String filename) {
        this.filename = filename;
    }


    public void saveBooks(List<Book> books) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Book b : books) {
                bw.write(b.getTitle() + ";" + b.getAuthor() + ";" + b.getPrice());
                bw.newLine();
            }
        }
    }

  
    public List<Book> readBooks() throws IOException {
        List<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";", 3);
                if (parts.length < 3) continue;
                double price;
                try {
                    price = Double.parseDouble(parts[2]);
                } catch (NumberFormatException ex) {
                    continue;
                }
                Book b = new Book(parts[0], parts[1], price);
                books.add(b);
                System.out.println(b);
            }
        }
        return books;
    }
}