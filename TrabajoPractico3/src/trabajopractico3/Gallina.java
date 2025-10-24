/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author juanf
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int idGallina, int edad){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }
    
    public void ponerHuevo(){
        huevosPuestos ++;
        System.out.println("La gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }
    
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " cumplió año más. Edad: " + edad);
    }
    
    public void mostrarEstado() {
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}
