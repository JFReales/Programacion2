/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.Ejercicio12;

/**
 *
 * @author juanf
 */
public class Calculadora {

    public void calcular(Impuesto impuesto) {

        double monto = impuesto.getMonto();
        String nombre = impuesto.getContribuyente().getNombre();
        System.out.println("Calculando impuesto de " + monto + 
                           " para " + nombre);

    }
}
