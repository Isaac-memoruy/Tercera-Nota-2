package semana6.clase;

public class Employee {
    public String name;
    public String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void showInfo() {
        System.out.println("Empleado: " + name + " | Cargo: " + role);
    }

    public void showResponsabilities() {
        switch (role.toLowerCase()) {
            case "gerente":
                System.out.println("Responsabilidad: Supervisar equipos y tomar decisiones estratégicas.");
                break;
            case "desarrollador":
                System.out.println("Responsabilidad: Escribir y mantener código.");
                break;
            case "analista":
                System.out.println("Responsabilidad: Analizar requerimientos y procesos.");
                break;
            case "soporte":
                System.out.println("Responsabilidad: Brindar asistencia técnica.");
                break;
            case "recursos humanos":
                System.out.println("Responsabilidad: Gestionar el talento humano.");
                break;
            default:
                System.out.println("Responsabilidad: General del empleado.");
                break;
        }
    }
}