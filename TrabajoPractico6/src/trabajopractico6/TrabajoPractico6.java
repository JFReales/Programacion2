/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico6;
// Importaciones Ejercicio 1
import trabajopractico6.Ejercicio1.CategoriaProducto;
import trabajopractico6.Ejercicio1.Inventario;
import trabajopractico6.Ejercicio1.Producto;

// Importaciones Ejercicio 2
import trabajopractico6.Ejercicio2.Autor;
import trabajopractico6.Ejercicio2.Biblioteca;
import trabajopractico6.Ejercicio2.Libro;

// Importaciones Ejercicio 3
import trabajopractico6.Ejercicio3.Curso;
import trabajopractico6.Ejercicio3.Profesor;
import trabajopractico6.Ejercicio3.Universidad;

/**
 *
 * @author juanf
 */
public class TrabajoPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===== INICIO TRABAJO PRÁCTICO 6 =====");
        
        ejecutarEjercicio1();
        ejecutarEjercicio2();
        ejecutarEjercicio3();
        
        System.out.println("===== FIN TRABAJO PRÁCTICO 6 =====");
    }

    private static void separador(String titulo) {
        System.out.println("\n=========================================");
        System.out.println("   " + titulo);
        System.out.println("=========================================\n");
    }

    public static void ejecutarEjercicio1() {
        separador("Ejercicio 1: Sistema de Stock");
        
        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto("A001", "Leche", 1200.50, 50, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("A002", "Pan", 800.0, 30, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("E001", "Teclado Mecánico", 45000.0, 15, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("R001", "Camisa", 25000.0, 25, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("H001", "Sartén", 18000.0, 20, CategoriaProducto.HOGAR));

        inventario.listarProductos();

        System.out.println("\n--- Búsqueda de E001 ---");
        Producto pBuscado = inventario.buscarProductoPorId("E001");
        if (pBuscado != null) {
            pBuscado.mostrarInfo();
        }

        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        inventario.eliminarProducto("A002");
        System.out.println("\n--- Lista después de eliminar A002 ---");
        inventario.listarProductos();

        inventario.actualizarStock("A001", 60);

        System.out.println("\nTotal de stock en inventario: " + inventario.obtenerTotalStock());

        Producto pMayor = inventario.obtenerProductoConMayorStock();
        if (pMayor != null) {
            System.out.println("\n--- Producto con Mayor Stock ---");
            pMayor.mostrarInfo();
        }

        inventario.filtrarProductosPorPrecio(15000, 30000);

        inventario.mostrarCategoriasDisponibles();
    }

    public static void ejecutarEjercicio2() {
        separador("Ejercicio 2: Biblioteca y Libros");

        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        Autor borges = new Autor("AUT01", "Jorge Luis Borges", "Argentino");
        Autor garciaMarquez = new Autor("AUT02", "Gabriel García Márquez", "Colombiano");
        Autor asimov = new Autor("AUT03", "Isaac Asimov", "Ruso-Estadounidense");

        biblio.agregarLibro("978-0307", "Ficciones", 1944, borges);
        biblio.agregarLibro("978-0061", "Cien años de soledad", 1967, garciaMarquez);
        biblio.agregarLibro("978-0553", "Fundación", 1951, asimov);
        biblio.agregarLibro("978-8420", "El Aleph", 1949, borges);
        biblio.agregarLibro("978-0307", "El amor en los tiempos del cólera", 1985, garciaMarquez);

        biblio.listarLibros();

        System.out.println("\n--- Búsqueda de ISBN '978-0553' ---");
        Libro libroBuscado = biblio.buscarLibroPorIsbn("978-0553");
        if (libroBuscado != null) {
            libroBuscado.mostrarInfo();
        }

        biblio.filtrarLibrosPorAnio(1944);

        biblio.eliminarLibro("978-8420");
        System.out.println("\n--- Lista después de eliminar 'El Aleph' ---");
        biblio.listarLibros();
        
        biblio.obtenerCantidadLibros();

        biblio.mostrarAutoresDisponibles();
    }

    public static void ejecutarEjercicio3() {
        separador("Ejercicio 3: Universidad (Bidireccional)");
        
        Universidad utn = new Universidad("UTN - FRC");

        Profesor prof1 = new Profesor("P001", "Dr. Alan Turing", "Computación");
        Profesor prof2 = new Profesor("P002", "Lic. Ada Lovelace", "Algoritmos");
        Profesor prof3 = new Profesor("P003", "Ing. Grace Hopper", "Compiladores");
        
        Curso c1 = new Curso("C001", "Programación I");
        Curso c2 = new Curso("C002", "Programación II");
        Curso c3 = new Curso("C003", "Bases de Datos");
        Curso c4 = new Curso("C004", "Sistemas Operativos");
        Curso c5 = new Curso("C005", "Inteligencia Artificial");

        utn.agregarProfesor(prof1);
        utn.agregarProfesor(prof2);
        utn.agregarProfesor(prof3);
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        System.out.println("\n--- Asignando profesores... ---");
        utn.asignarProfesorACurso("C001", "P002"); 
        utn.asignarProfesorACurso("C002", "P002"); 
        utn.asignarProfesorACurso("C003", "P003"); 
        utn.asignarProfesorACurso("C005", "P001"); 
        
        utn.listarCursos();
        utn.listarProfesores();

        System.out.println("\n--- Cambiando profesor de 'Programación II' a 'Grace Hopper' ---");
        utn.asignarProfesorACurso("C002", "P003");
        
        System.out.println("\n--- Verificando estado de Ada Lovelace (P002) ---");
        utn.buscarProfesorPorId("P002").listarCursos(); 
        
        System.out.println("\n--- Verificando estado de Grace Hopper (P003) ---");
        utn.buscarProfesorPorId("P003").listarCursos(); 
        
        System.out.println("\n--- Eliminando curso 'Bases de Datos' (C003) ---");
        utn.eliminarCurso("C003");
        
        System.out.println("\n--- Verificando estado de Grace Hopper (P003) post-eliminación ---");
        utn.buscarProfesorPorId("P003").listarCursos();
        
        System.out.println("\n--- Eliminando profesor 'Alan Turing' (P001) ---");
        utn.eliminarProfesor("P001");
        
        System.out.println("\n--- Verificando estado del curso 'IA' (C005) ---");
        utn.buscarCursoPorCodigo("C005").mostrarInfo(); 
        
        System.out.println("\n--- Reporte final ---");
        utn.mostrarReporteCursosPorProfesor();
    }
}
