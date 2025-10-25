/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author juanf
 */
public class TrabajoPractico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Juan Reales", "Desarrollador", 250000);
        Empleado e2 = new Empleado("Ana López", "Diseñadora");
        Empleado e3 = new Empleado("Carlos Pérez", "Tester");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        e1.actualizarSalario(10);
        e2.actualizarSalario(15000);
        e3.actualizarSalario(5);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        Empleado.mostrarTotalEmpleados();
    }
    
}
