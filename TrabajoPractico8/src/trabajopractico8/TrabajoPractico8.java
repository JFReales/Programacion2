/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico8;
import trabajopractico8.Ejercicio1.*;
import trabajopractico8.Ejercicio2.EdadInvalidaException;
import trabajopractico8.Ejercicio2.GestorExcepciones;

/**
 *
 * @author juanf
 */
public class TrabajoPractico8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===== INICIO TRABAJO PRÁCTICO 8 =====");
        
        ejecutarParte1();
        ejecutarParte2();
        
        System.out.println("\n===== FIN TRABAJO PRÁCTICO 8 =====");
    }

    private static void separador(String titulo) {
        System.out.println("\n=========================================");
        System.out.println("   " + titulo);
        System.out.println("=========================================\n");
    }

    public static void ejecutarParte1() {
        separador("Parte 1: Interfaces E-commerce");

        Producto tv = new Producto("Smart TV 55\"", 850000.0);
        Producto teclado = new Producto("Teclado Mecánico", 120000.0);

        Cliente cliente1 = new Cliente("Ana Torres");

        Pedido pedido1 = new Pedido();
        pedido1.agregarProducto(tv);
        pedido1.agregarProducto(teclado);
        pedido1.setCliente(cliente1);

        System.out.println("--- Pruebas de Interfaz Pagable ---");
        System.out.printf("Total del Producto '%s': $%.2f\n", tv.getNombre(), tv.calcularTotal());
        System.out.printf("Total del Pedido: $%.2f\n", pedido1.calcularTotal());

        System.out.println("\n--- Pruebas de Interfaz Notificable ---");
        pedido1.setEstado("EN PREPARACIÓN");
        pedido1.setEstado("ENVIADO");

        System.out.println("\n--- Pruebas de Interfaces Pago ---");
        double totalAPagar = pedido1.calcularTotal();
        
        Pago metodoPayPal = new PayPal();
        metodoPayPal.procesarPago(totalAPagar);
        
        System.out.println("---");
        
        PagoConDescuento metodoTC = new TarjetaCredito();
        metodoTC.aplicarDescuento(10.0);
        metodoTC.procesarPago(totalAPagar);
    }
    
    public static void ejecutarParte2() {
        separador("Parte 2: Manejo de Excepciones");
        
        GestorExcepciones.lecturaArchivo();
        
        System.out.println("\n--- 4. Excepción Personalizada ---");
        try {
            GestorExcepciones.validarEdad(25);
            GestorExcepciones.validarEdad(150);
        } catch (EdadInvalidaException e) {
            System.err.println("Error de Negocio: " + e.getMessage());
        }
        GestorExcepciones.lecturaConTryWithResources();
    }
}
