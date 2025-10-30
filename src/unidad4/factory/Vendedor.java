package unidad4.factory;

public class Vendedor extends Empleado {
    private double comision;
    private double ventas;

    public Vendedor(String nombre, double salarioBase, double comision, double ventas, Direccion direccion) {
        super(nombre, salarioBase, direccion);
        this.comision = comision;
        this.ventas = ventas;
   
    }

    @Override
    public double calcularPago() {
        return salarioBase + (ventas * comision);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Vendedor: " + nombre + " | Dirección: " + direccion.getFullAddress() + " | Salario total: $" + calcularPago());
    }
}
