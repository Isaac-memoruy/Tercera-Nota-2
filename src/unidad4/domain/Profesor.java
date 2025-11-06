
package unidad4.domain;
import java.util.List;
import java.util.ArrayList;

public class Profesor extends Persona {
    private final String departamento;
    private final static List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String departamento) {
        super(nombre, id);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public List<Curso> getCursos() {
        return List.copyOf(cursos);
    }

    public static void dictar (Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    public void asesorar (Proyecto proyecto) {
        System.out.println(getNombre() + "ahora asesora el proyecto:" + proyecto.getTitulo());
    }
    
}
