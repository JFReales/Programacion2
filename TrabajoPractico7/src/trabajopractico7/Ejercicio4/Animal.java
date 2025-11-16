/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico7.Ejercicio4;

/**
 *
 * @author juanf
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(this.nombre + " hace un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.println("Este animal es un " + this.nombre);
    }
}
