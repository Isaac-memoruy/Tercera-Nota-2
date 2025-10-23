package unidad1.semana3.company;

public class Employee {
    
    private String name;
    private String role;
    private double salary;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public void increaseSalary(double amount) {
        this.salary += amount;
    }
}