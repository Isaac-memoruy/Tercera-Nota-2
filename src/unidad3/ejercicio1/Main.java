package unidad3.ejercicio1;


public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== SAFE CALCULATOR EXCEPTION HANDLING DEMO ===\n");
        

        SafeCalculator calculator = new SafeCalculator();
        
      
        System.out.println("1. TESTING NORMAL DIVISIONS:");
        testDivision(calculator, 10, 2, "Normal division: 10 / 2");
        testDivision(calculator, 15, 3, "Normal division: 15 / 3");
        testDivision(calculator, 7, 2, "Division with decimal result: 7 / 2");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
        
       
        System.out.println("2. TESTING DIVISION BY ZERO (ArithmeticException):");
        testDivision(calculator, 10, 0, "Division by zero: 10 / 0");
        testDivision(calculator, 100, 0, "Division by zero: 100 / 0");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
        
       
        System.out.println("3. TESTING NEGATIVE NUMBERS (InvalidInputException):");
        testDivision(calculator, -10, 2, "Negative dividend: -10 / 2");
        testDivision(calculator, 10, -5, "Negative divisor: 10 / -5");
        testDivision(calculator, -8, -4, "Both negative: -8 / -4");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
        
       
        System.out.println("4. TESTING EDGE CASES:");
        testDivision(calculator, 0, 5, "Zero dividend: 0 / 5");
        testDivision(calculator, 1, 1, "Division by one: 1 / 1");
        
        System.out.println("\n" + "=".repeat(60) + "\n");
        
        
        System.out.println("5. DEMONSTRATING SAFE DIVISION METHOD:");
        System.out.println("Using safeDivision method that handles exceptions internally:\n");
        
        calculator.safeDivision(20, 4);
        System.out.println();
        calculator.safeDivision(15, 0);
        System.out.println();
        calculator.safeDivision(-6, 3);
        System.out.println();
        
        System.out.println("=".repeat(60) + "\n");
        
  
        System.out.println("6. TESTING INTEGER DIVISION METHOD:");
        testIntegerDivision(calculator, 20, 4, "Integer division: 20 / 4");
        testIntegerDivision(calculator, 17, 5, "Integer division with remainder: 17 / 5");
        testIntegerDivision(calculator, 10, 0, "Integer division by zero: 10 / 0");
        testIntegerDivision(calculator, -8, 2, "Negative integer division: -8 / 2");
        
        System.out.println("\n=== SAFE CALCULATOR DEMO COMPLETED ===");
    }
    

    private static void testDivision(SafeCalculator calc, int a, int b, String description) {
        System.out.println("Testing: " + description);
        try {
            double result = calc.divide(a, b);
            System.out.println("SUCCESS: Result = " + result);
        } catch (InvalidInputException e) {
            System.out.println("CUSTOM EXCEPTION: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ARITHMETIC EXCEPTION: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("UNEXPECTED EXCEPTION: " + e.getMessage());
        }
        System.out.println(); 
    }
    
    
    private static void testIntegerDivision(SafeCalculator calc, int a, int b, String description) {
        System.out.println("Testing: " + description);
        try {
            int result = calc.divideInteger(a, b);
            System.out.println("SUCCESS: Integer result = " + result);
        } catch (InvalidInputException e) {
            System.out.println("CUSTOM EXCEPTION: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ARITHMETIC EXCEPTION: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("UNEXPECTED EXCEPTION: " + e.getMessage());
        }
        System.out.println(); 
    }
}