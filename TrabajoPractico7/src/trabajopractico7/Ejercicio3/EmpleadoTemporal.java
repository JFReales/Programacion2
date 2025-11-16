/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.Ejercicio3;

/**
 *
 * @author juanf
 */
public class EmpleadoTemporal extends Empleado {
    
    public EmpleadoTemporal(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSueldo() {
        return salarioBase;
    }
}
