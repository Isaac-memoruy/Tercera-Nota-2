package unidad3.ejercicio1;


public class InvalidInputException extends Exception {
    
  
    public InvalidInputException() {
        super("Invalid input provided to the calculator.");
    }
    
    
    public InvalidInputException(String message) {
        super(message);
    }
    
    
    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }
    
   
    public InvalidInputException(Throwable cause) {
        super("Invalid input provided to the calculator.", cause);
    }
}