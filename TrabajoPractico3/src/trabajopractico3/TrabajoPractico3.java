/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author juanf
 */
public class TrabajoPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Pepe", "Hongo", "Programación", 7.5);
        
        estudiante1.motrarInfo();
        estudiante1.subirCalificacion(1.5);
        estudiante1.bajarCalificacion(2);
        estudiante1.motrarInfo();
        
        Mascotas mascota1 = new Mascotas("Pepe", "Dogo", 2);
        
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        
        Libro libro1 = new Libro("Los días del fuego", "Liliana Bodoc", 2000);
        
        libro1.mostrarInfo();
        libro1.setAñoPublicacion(2005);
        libro1.setAñoPublicacion(100);
        libro1.mostrarInfo();
        
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        g1.mostrarEstado();
        g2.mostrarEstado();

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        g1.mostrarEstado();
        g2.mostrarEstado();
        
        NaveEspacial nave1 = new NaveEspacial("Andrómeda", 50);

        nave1.mostrarEstado();
        nave1.despegar();
        nave1.avanzar(50);
        nave1.recargarCombustible(40);
        nave1.avanzar(60);
        nave1.mostrarEstado();
    }
    
}
