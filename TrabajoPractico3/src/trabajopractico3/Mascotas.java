/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico3;

/**
 *
 * @author juanf
 */
public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascotas(String nombre, String especie, Integer edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    public void cumplirAnios(){
        edad ++;
        System.out.println(nombre + " cumplió un año más de vida. Ahora tiene " + edad + " años" );
    }
    
    
}
