package semana3.company.Main;

import semana3.company.Main.Employee;

public class Main {
    public static void main(String[] args) {
    
        Employee emp1 = new Employee();
        emp1.setName("Isaac");
        emp1.setRole("Developer");
        emp1.setSalary(5000);

        Employee emp2 = new Employee();
        emp2.setName("David");
        emp2.setRole("Manager");
        emp2.setSalary(7000);

        System.out.println("Employee 1: ");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Role: " + emp1.getRole());
        System.out.println("Salary: " + emp1.getSalary());

        System.out.println("\nEmployee 2: ");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Role: " + emp2.getRole());
        System.out.println("Salary: " + emp2.getSalary());

        emp1.increaseSalary(500);
        System.out.println("\nEmployee 1 salary after increase: " + emp1.getSalary());
    }
}

