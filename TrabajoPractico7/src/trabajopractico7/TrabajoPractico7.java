/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico7;
import java.util.ArrayList;
import java.util.List;

import trabajopractico7.Ejercicio1.*;
import trabajopractico7.Ejercicio2.*;
import trabajopractico7.Ejercicio3.*;
import trabajopractico7.Ejercicio4.*;

/**
 *
 * @author juanf
 */
public class TrabajoPractico7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===== INICIO TRABAJO PRÁCTICO 7 =====");
        
        ejecutarEjercicio1();
        ejecutarEjercicio2();
        ejecutarEjercicio3();
        ejecutarEjercicio4();
        
        System.out.println("===== FIN TRABAJO PRÁCTICO 7 =====");
    }

    private static void separador(String titulo) {
        System.out.println("\n=========================================");
        System.out.println("   " + titulo);
        System.out.println("=========================================\n");
    }

    public static void ejecutarEjercicio1() {
        separador("Ejercicio 1: Vehículos y Herencia");
        Auto miAuto = new Auto("Ford", "Focus", 5);
        miAuto.mostrarInfo();

        Vehiculo vehiculoGenerico = miAuto;
        System.out.print("Llamada desde Vehiculo (Upcast): ");
        vehiculoGenerico.mostrarInfo();
    }

    public static void ejecutarEjercicio2() {
        separador("Ejercicio 2: Figuras y Métodos Abstractos");
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Círculo 1", 10.0);
        figuras[1] = new Rectangulo("Rectángulo 1", 5.0, 10.0);
        figuras[2] = new Circulo("Círculo 2", 5.0);
        System.out.println("Cálculo de áreas (Polimorfismo):");
        for (Figura fig : figuras) {
            System.out.printf("Área de %s: %.2f\n", fig.getNombre(), fig.calcularArea());
        }
    }

    public static void ejecutarEjercicio3() {
        separador("Ejercicio 3: Empleados y Polimorfismo");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan Perez", 500000, 50000));
        empleados.add(new EmpleadoTemporal("Maria Garcia", 400000));
        empleados.add(new EmpleadoPlanta("Carlos Lopez", 700000, 100000));
        System.out.println("Cálculo de Sueldos (Polimorfismo):");
        for (Empleado emp : empleados) {
            System.out.printf("Sueldo de %s: $%.2f\n", emp.getNombre(), emp.calcularSueldo());
        }
        System.out.println("\nClasificación de Empleados (instanceof):");
        for (Empleado emp : empleados) {
            System.out.print(emp.getNombre() + " es un... ");
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("Empleado de Planta.");
                EmpleadoPlanta ep = (EmpleadoPlanta) emp;
                System.out.println(" -> Bono: $" + ep.getBonoAntiguedad());
                
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Empleado Temporal.");
            }
        }
    }
    
    public static void ejecutarEjercicio4() {
        separador("Ejercicio 4: Animales y Sobrescritura");
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro("Firulais"));
        granja.add(new Gato("Garfield"));
        granja.add(new Vaca("Lola"));
        granja.add(new Animal("Serpiente"));
        System.out.println("La granja hace sonidos:");
        for (Animal animal : granja) {
            animal.hacerSonido();
        }
    }
}
