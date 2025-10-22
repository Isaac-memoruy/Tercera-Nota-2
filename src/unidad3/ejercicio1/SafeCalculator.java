package unidad3.ejercicio1;


public class SafeCalculator {
    

    public double divide(int a, int b) throws InvalidInputException {
        try {
           
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Negative numbers are not allowed. a=" + a + ", b=" + b);
            }
            
            
            double result = (double) a / b;
            
            
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            
            System.out.println("Division successful: " + a + " / " + b + " = " + result);
            return result;
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());
            throw e; 
            
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;

        } finally {
            
            System.out.println("End of operation.");
        }
    }
    

    public int divideInteger(int a, int b) throws InvalidInputException {
        try {
            
            if (a < 0 || b < 0) {
                throw new InvalidInputException("Negative numbers are not allowed for integer division. a=" + a + ", b=" + b);
            }
            
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            
            int result = a / b;
            System.out.println("Integer division successful: " + a + " / " + b + " = " + result);
            return result;
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero! " + e.getMessage());
            throw e;
            
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
            
        } finally {
          
            System.out.println("End of operation.");
        }
    }
    
    
    public void safeDivision(int a, int b) {
        try {
            double result = divide(a, b);
            System.out.println("Result obtained: " + result);
            
        } catch (InvalidInputException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e.getMessage());
            
        }
    }
}