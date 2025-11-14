/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico5.Ejercicio8;
import java.util.Date;

/**
 *
 * @author juanf
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    public Documento(String titulo, String contenido, String codigoHash, Date fechaFirma, Usuario usuarioFirma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fechaFirma, usuarioFirma);
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
}
