/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.Ejercicio2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author juanf
 */
public class Biblioteca {
    private String nombre; 
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        System.out.println("Biblioteca '" + nombre + "' creada.");
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca.");
    }

    public void listarLibros() {
        System.out.println("--- Libros en la Biblioteca: " + nombre + " ---");
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
            System.out.println("--------------------");
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) { 
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            this.libros.remove(libro);
            System.out.println("Libro '" + libro.getTitulo() + "' eliminado.");
        } else {
            System.out.println("No se pudo eliminar: Libro con ISBN " + isbn + " no encontrado.");
        }
    }

    public void obtenerCantidadLibros() {
        System.out.println("La biblioteca tiene " + this.libros.size() + " libros.");
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("--- Libros publicados en el año: " + anio + " ---");
        boolean encontrados = false;
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                System.out.println("--------------------");
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron libros publicados en ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("--- Autores Disponibles en la Biblioteca ---");
        Set<Autor> autoresUnicos = new HashSet<>();
        for (Libro libro : this.libros) {
            if (libro.getAutor() != null) {
                autoresUnicos.add(libro.getAutor());
            }
        }
        
        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores para mostrar.");
            return;
        }

        for (Autor autor : autoresUnicos) {
            System.out.println("- " + autor.getNombre() + " (" + autor.getNacionalidad() + ")");
        }
    }
}
