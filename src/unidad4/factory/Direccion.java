package unidad4.factory;

public class Direccion {
    private String calle;
    private String ciudad;

    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public String getFullAddress() {
        return calle + ", " + ciudad;
    }
}
