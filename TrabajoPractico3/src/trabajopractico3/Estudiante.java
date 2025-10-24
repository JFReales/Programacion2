/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author juanf
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void motrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
        if (calificacion > 10) calificacion = 10;
        System.out.println("A " + nombre + " se le subió la calificación a " + calificacion);
    }
    
    public void bajarCalificacion(double puntos){
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0;
        System.out.println("A " + nombre + " se le bajó la calificación a " + calificacion);
    }
}
