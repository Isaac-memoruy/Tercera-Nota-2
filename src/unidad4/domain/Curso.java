package unidad4.domain;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Curso {

    private final double codigo;
    private final String nombre;
    private final List<UnidadTematica> unidades = new ArrayList<>();
    private final List<Estudiante> inscritos = new ArrayList<>();

    public Curso(double codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void agregarUnidad(String titulo, int semanas) {
        unidades.add(new UnidadTematica(titulo, semanas));
    }

    public void inscribir(Estudiante estudiante) {
        Objects.requireNonNull(estudiante);
        if (!inscritos.contains(estudiante)) {
            inscritos.add(estudiante);
        }
    }

    public void desinscribir(Estudiante estudiante) {
        inscritos.remove(estudiante);
    }

    public List<UnidadTematica> getUnidades() {
        return List.copyOf(unidades);
    }

    public List<Estudiante> getInscritos() {
        return  List.copyOf(inscritos);
    }

    @Override
    public String toString() {
        return "Cursos{" + codigo + " , " + nombre + ", unidades=" + unidades + ", inscritos = " + inscritos.size() + '}';
    }
}