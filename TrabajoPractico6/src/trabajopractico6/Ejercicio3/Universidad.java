/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.Ejercicio3;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanf
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        System.out.println("Universidad '" + nombre + "' inicializada.");
    }

    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
        System.out.println("Profesor '" + p.getNombre() + "' agregado a " + this.nombre);
    }

    public void agregarCurso(Curso c) {
        this.cursos.add(c);
        System.out.println("Curso '" + c.getNombre() + "' agregado a " + this.nombre);
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            c.setProfesor(null);
            
            this.cursos.remove(c);
            System.out.println("Curso '" + c.getNombre() + "' eliminado.");
        } else {
            System.out.println("Error: No se encontró curso con código " + codigo);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            List<Curso> cursosDelProfesor = new ArrayList<>(p.getCursos());
            
            for (Curso c : cursosDelProfesor) {
                c.setProfesor(null); 
            }
            
            this.profesores.remove(p);
            System.out.println("Profesor '" + p.getNombre() + "' eliminado.");
        } else {
            System.out.println("Error: No se encontró profesor con ID " + id);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) { 
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);

        if (c == null) {
            System.out.println("Asignación fallida: No se encontró el curso " + codigoCurso);
            return;
        }
        if (p == null) {
            System.out.println("Asignación fallida: No se encontró el profesor " + idProfesor);
            return;
        }

        c.setProfesor(p);
        System.out.println("Profesor " + p.getNombre() + " asignado al curso " + c.getNombre());
    }

    public void listarProfesores() {
        System.out.println("--- Lista de Profesores (" + this.nombre + ") ---");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
            p.listarCursos();
            System.out.println("--------------------");
        }
    }

    public void listarCursos() { 
        System.out.println("--- Lista de Cursos (" + this.nombre + ") ---");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
            System.out.println("--------------------");
        }
    }

    public void mostrarReporteCursosPorProfesor() {
        System.out.println("--- Reporte: Cursos por Profesor ---");
        for (Profesor p : this.profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}
