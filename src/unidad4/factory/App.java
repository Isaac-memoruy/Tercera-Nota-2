package unidad4.factory;

public class App {
    public static void main(String[] args) throws Exception {
        Direccion d1 = new Direccion("Calle 45", "Bogota");
        Direccion d2 = new Direccion("Calle 10", "Ocaña");

        Gerente g1 = new Gerente("Carlos", 5000, 1000, d1);
        Vendedor v1 = new Vendedor("Luis", 3000, 0.1, 50000, d2);

        System.out.println("====EMPLEADOS====");
        g1.mostrarInfo();
        v1.mostrarInfo();

    }
}
