package unidad4.factory;

public class Gerente extends Empleado {
    private double bono;
 

    public Gerente(String nombre, double salarioBase, double bono, Direccion direccion) {
        super(nombre, salarioBase, direccion);
        this.bono = bono;
        this.direccion = direccion;
   
    }

    @Override
    public double calcularPago() {
        return salarioBase + bono;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Gerente: " + nombre + " | Dirección: " + direccion.getFullAddress() + " | Salario base: $" + calcularPago());

    }
}
