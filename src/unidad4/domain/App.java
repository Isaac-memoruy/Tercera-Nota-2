package unidad4.domain;


public class App {
    public static void main(String[] args) {
        Curso curso = new Curso(101, "Programación I");

        curso.agregarUnidad("Introducción", 2);
        curso.agregarUnidad("Estructuras de datos", 4);

        
        System.out.println(curso);

        for (UnidadTematica u : curso.getUnidades()) {
            System.out.println(" - " + u);
        }

        for (Estudiante s : curso.getInscritos()) {
            System.out.println(" * " + s);
        }
    }
}
