package unidad3.ejercicio3;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = args.length > 0 ? args[0] : "books.txt";
        BookFileHandler handler = new BookFileHandler(filename);

        List<Book> books = Arrays.asList(
            new Book("The Hobbit", "J.R.R. Tolkien", 12.99),
            new Book("1984", "George Orwell", 9.50),
            new Book("Clean Code", "Robert C. Martin", 33.00)
        );

        try {
            handler.saveBooks(books);
            System.out.println("Books saved to " + filename);
            System.out.println("Reading books:");
            handler.readBooks();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            System.out.println("Operation finished.");
        }
    }
}