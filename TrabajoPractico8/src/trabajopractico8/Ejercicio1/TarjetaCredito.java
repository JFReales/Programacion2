/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.Ejercicio1;

/**
 *
 * @author juanf
 */
public class TarjetaCredito implements PagoConDescuento {
    private double descuentoAplicado = 0;

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuentoAplicado = porcentaje;
        System.out.println("Descuento del " + porcentaje + "% aplicado a la tarjeta.");
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto - (monto * descuentoAplicado / 100);
        System.out.printf("Procesando pago con Tarjeta de Crédito...\n");
        System.out.printf("Monto original: $%.2f\n", monto);
        System.out.printf("Descuento: %.0f%%\n", descuentoAplicado);
        System.out.printf("Monto final a pagar: $%.2f\n", montoFinal);
    }
}
