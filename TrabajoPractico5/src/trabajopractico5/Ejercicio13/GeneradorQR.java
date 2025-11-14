/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.Ejercicio13;

/**
 *
 * @author juanf
 */
public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        CodigoQR nuevoQR = new CodigoQR(valor, usuario);
        
        System.out.println("Generando QR con valor: " + nuevoQR.getValor() + 
                           " para el usuario: " + usuario.getNombre());
    }
}
