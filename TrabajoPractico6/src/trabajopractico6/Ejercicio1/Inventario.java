/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico6.Ejercicio1;
import java.util.ArrayList;

/**
 *
 * @author juanf
 */
public class Inventario {
    
    // Relación 1 a N: Un Inventario tiene N Productos
    private ArrayList<Producto> productos; // [cite: 267]

    public Inventario() {
        this.productos = new ArrayList<>(); // Inicializamos la colección
    }

    /**
     * Agrega un nuevo producto a la lista. [cite: 268]
     */
    public void agregarProducto(Producto p) { // [cite: 268]
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado.");
    }

    /**
     * Recorre y muestra la información de todos los productos. [cite: 269]
     */
    public void listarProductos() { // [cite: 269]
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("--- Lista de Productos en Inventario ---");
        for (Producto p : this.productos) {
            p.mostrarInfo();
            System.out.println("--------------------");
        }
    }

    public Producto buscarProductoPorId(String id) { 
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            this.productos.remove(p);
            System.out.println("Producto '" + p.getNombre() + "' eliminado.");
        } else {
            System.out.println("No se pudo eliminar: Producto con ID " + id + " no encontrado.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock de '" + p.getNombre() + "' actualizado a " + nuevaCantidad + ".");
        } else {
            System.out.println("No se pudo actualizar: Producto con ID " + id + " no encontrado.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) { 
        System.out.println("--- Productos de la Categoría: " + categoria.name() + " ---");
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                System.out.println("--------------------");
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en esta categoría.");
        }
    }

    public int obtenerTotalStock() { 
        int total = 0;
        for (Producto p : this.productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto mayorStock = productos.get(0);
        for (Producto p : this.productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    public void filtrarProductosPorPrecio(double min, double max) { 
        System.out.println("--- Productos con Precio entre $" + min + " y $" + max + " ---");
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                System.out.println("--------------------");
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("--- Categorías Disponibles ---");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name() + ": " + cat.getDescripcion());
        }
    }
}
