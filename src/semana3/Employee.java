
package semana3;

public class Employee {
    public String name;         
    private double salary;      
    protected String role;     

    
    public Employee() {}

    
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("El salario debe ser mayor a 0.");
        }
    }

    
    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        } else {
            System.out.println("El incremento debe ser un valor positivo.");
        }
    }

    
    public String getRole() {
        return role;
    }


    public void setRole(String role) {
        this.role = role;
    }
}
