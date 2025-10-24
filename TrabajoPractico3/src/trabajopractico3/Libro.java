/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author juanf
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public Libro(String titulo, String autor, int añoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion >= 1450 && añoPublicacion <= 2025){
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("El año de publicacion " + añoPublicacion + " no es valido. No se actualizó");
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }
    
    
}
