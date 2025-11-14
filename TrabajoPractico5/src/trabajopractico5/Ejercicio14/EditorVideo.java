/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.Ejercicio14;

/**
 *
 * @author juanf
 */
public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render nuevoRender = new Render(formato, proyecto);
        
        System.out.println("Exportando proyecto: " + proyecto.getNombre() + 
                           " en formato: " + nuevoRender.getFormato());
    }
}
