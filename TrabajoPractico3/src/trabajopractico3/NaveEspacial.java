/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author juanf
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    
    public NaveEspacial(String nombre, double combustible){
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void despegar(){
        if(combustible >= 10){
            combustible -= 10;
            System.out.println("La nave espacial " + nombre + " despegó. Combustible restante: " + combustible);
        }else{
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }
    
    public void avanzar(double distancia){
        double consumo = distancia * 0.5;
        if (combustible >= consumo){
            combustible -=consumo;
            System.out.println("La nave espacial " + nombre + " avanzó " + distancia + "km. Combustible restante: " + combustible);
        }else{
            System.out.println("Combustible insuficiente para avanzar " + distancia + "km.");
        }
    }
    
    public void recargarCombustible(double cantidad){
        if (cantidad <= 0){
            System.out.println("La cantidad a recargar tiene que ser positiva");
            return;
        }
        if (combustible + cantidad > 200){
            System.out.println("La cantidad " + cantidad + " a recargar supera el máximo soportado por la nave espacial");
        }else{
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " de combustible. Combustible total: " + combustible);
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible actual: " + combustible);
    }
    
}
