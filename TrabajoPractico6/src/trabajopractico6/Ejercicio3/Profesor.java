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
public class Profesor {
    private String id; 
    private String nombre; 
    private String especialidad; 
    private List<Curso> cursos; 

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>(); 
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (ID: " + id + ", Espec: " + especialidad + ")");
        System.out.println("Dicta " + cursos.size() + " cursos.");
    }

    public void listarCursos() {
        System.out.println("Cursos dictados por " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println(" (Ninguno)");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("- " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    protected void agregarCurso(Curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
        }
    }

    protected void eliminarCurso(Curso c) {
        this.cursos.remove(c);
    }
    
    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
