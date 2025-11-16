/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.Ejercicio1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juanf
 */
public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }
    
    public void setCliente(Cliente c) {
        this.cliente = c;
    }
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado del pedido cambió a: " + nuevoEstado);
        if (this.cliente != null) {
            this.cliente.notificar("Su pedido ha sido actualizado a: " + nuevoEstado);
        }
    }
}
