package unidad2.semana6;
import unidad2.semana6.clase.Employee;
public class Main {
    public static void main(String[] args) {
        Employee[] empleados = {
            new Employee("Ana", "Gerente"),
            new Employee("Luis", "Desarrollador"),
            new Employee("Marta", "Analista"),
            new Employee("Carlos", "Soporte"),
            new Employee("Sofia", "Recursos Humanos")
        };

        for (Employee e : empleados) {
            e.showInfo();
            e.showResponsabilities();
            System.out.println();
        }
    }
}