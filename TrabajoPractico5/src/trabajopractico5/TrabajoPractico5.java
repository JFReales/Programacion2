/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico5;
import trabajopractico5.Ejercicio1.*;
import trabajopractico5.Ejercicio2.*;
import trabajopractico5.Ejercicio3.*;
import trabajopractico5.Ejercicio4.*;
import trabajopractico5.Ejercicio5.*;
import trabajopractico5.Ejercicio6.*;
import trabajopractico5.Ejercicio7.*;
import trabajopractico5.Ejercicio8.*;
import trabajopractico5.Ejercicio9.*;
import trabajopractico5.Ejercicio10.*;
import trabajopractico5.Ejercicio11.*;
import trabajopractico5.Ejercicio12.*;
import trabajopractico5.Ejercicio13.*;
import trabajopractico5.Ejercicio14.*;
import java.util.Date;

/**
 *
 * @author juanf
 */
public class TrabajoPractico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejecutarEjercicio1();
        ejecutarEjercicio2();
        ejecutarEjercicio3();
        ejecutarEjercicio4();
        ejecutarEjercicio5();
        ejecutarEjercicio6();
        ejecutarEjercicio7();
        ejecutarEjercicio8();
        ejecutarEjercicio9();
        ejecutarEjercicio10();
        ejecutarEjercicio11();
        ejecutarEjercicio12();
        ejecutarEjercicio13();
        ejecutarEjercicio14();
    }
    private static void separador() {
        System.out.println("\n--------------------------------------------------\n");
    }

    public static void ejecutarEjercicio1() {
        System.out.println("--- Ejecutando Ejercicio 1: Pasaporte ---");
   
        Titular tit1 = new Titular("Juan Perez", "30123456");
)
        Pasaporte pas1 = new Pasaporte("ABC123456", "2025-11-14", "img_juan.jpg", "JPG");

        tit1.setPasaporte(pas1);
        pas1.setTitular(tit1);
       
        System.out.println("El pasaporte " + pas1.getNumero() + " pertenece a " + pas1.getTitular().getNombre());
        System.out.println("El titular " + tit1.getNombre() + " tiene la foto: " + tit1.getPasaporte().getFoto().getImagen());
        
        separador();
    }

    public static void ejecutarEjercicio2() {
        System.out.println("--- Ejecutando Ejercicio 2: Celular ---");

        Bateria bat1 = new Bateria("Modelo-XYZ", 5000);
        )
        Celular cel1 = new Celular("1234567890", "Samsung", "S23", bat1);
        
        Usuario user1 = new Usuario("Maria Garcia", "32987654");
        
        user1.setCelular(cel1);
        cel1.setUsuario(user1);
        
        System.out.println("El celular " + cel1.getMarca() + " de " + cel1.getUsuario().getNombre());
        System.out.println("Tiene una bateria " + cel1.getBateria().getModelo() + " de " + cel1.getBateria().getCapacidad() + "mAh.");
        
        separador();
    }

    public static void ejecutarEjercicio3() {
        System.out.println("--- Ejecutando Ejercicio 3: Libro ---");
        
        Autor autor1 = new Autor("Jorge Luis Borges", "Argentina");
        Editorial ed1 = new Editorial("Sudamericana", "Av. Independencia 123");
        
        Libro libro1 = new Libro("Ficciones", "978-0307950923", autor1, ed1);

        System.out.println("Libro: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor().getNombre() + " (" + libro1.getAutor().getNacionalidad() + ")");
        System.out.println("Editorial: " + libro1.getEditorial().getNombre());
        
        separador();
    }

    public static void ejecutarEjercicio4() {
        System.out.println("--- Ejecutando Ejercicio 4: Tarjeta de Crédito ---");

        Banco banco1 = new Banco("Banco Galicia", "30-50000000-1");

        TarjetaDeCredito tdc1 = new TarjetaDeCredito("4500-1234-5678-9012", "12/28", banco1);

        Cliente cli1 = new Cliente("Ana Lopez", "28111222");

        tdc1.setCliente(cli1);
        cli1.setTarjeta(tdc1);
 
        System.out.println("Cliente: " + cli1.getNombre());
        System.out.println("Tarjeta: " + cli1.getTarjeta().getNumero() + " del " + cli1.getTarjeta().getBanco().getNombre());
        
        separador();
    }

    public static void ejecutarEjercicio5() {
        System.out.println("--- Ejecutando Ejercicio 5: Computadora ---");

        Propietario prop1 = new Propietario("Carlos Santana", "25123123");
        
        Computadora comp1 = new Computadora("HP", "HP123XYZ", "Asus ROG", "Z790");
        
        comp1.setPropietario(prop1);
        prop1.setComputadora(comp1);
 
        System.out.println("Propietario: " + prop1.getNombre());
        System.out.println("Computadora: " + prop1.getComputadora().getMarca() + " con Placa Madre: " + prop1.getComputadora().getPlacaMadre().getModelo());
        
        separador();
    }

    public static void ejecutarEjercicio6() {
        System.out.println("--- Ejecutando Ejercicio 6: Reserva ---");

        Cliente cliRes1 = new Cliente("Laura Pausini", "11-5555-4444");
        Mesa mesa1 = new Mesa(5, 4);

        Reserva res1 = new Reserva(new Date(), new Date(), cliRes1, mesa1);

        System.out.println("Reserva a nombre de: " + res1.getCliente().getNombre());
        System.out.println("Para la mesa nro: " + res1.getMesa().getNumero() + " (Capacidad: " + res1.getMesa().getCapacidad() + ")");
        
        separador();
    }

    public static void ejecutarEjercicio7() {
        System.out.println("--- Ejecutando Ejercicio 7: Vehículo ---");

        Motor motor1 = new Motor("V8", "MTR-987");
 
        Vehiculo auto1 = new Vehiculo("AA-123-BB", "Ford Mustang", motor1);

        Conductor cond1 = new Conductor("Pedro Pascal", "LIC-777");

        auto1.setConductor(cond1);
        cond1.setVehiculo(auto1);

        System.out.println("Conductor: " + cond1.getNombre());
        System.out.println("Vehiculo: " + cond1.getVehiculo().getModelo() + " con motor " + cond1.getVehiculo().getMotor().getTipo());
        
        separador();
    }

    public static void ejecutarEjercicio8() {
        System.out.println("--- Ejecutando Ejercicio 8: Documento ---");

        Usuario userFirma = new Usuario("Admin", "admin@sistema.com");

        Documento doc1 = new Documento("Contrato.pdf", "Contenido del contrato...", "0xABC123", new Date(), userFirma);

        System.out.println("Documento: " + doc1.getTitulo());
        System.out.println("Firma Hash: " + doc1.getFirmaDigital().getCodigoHash());
        System.out.println("Firmado por: " + doc1.getFirmaDigital().getUsuario().getNombre());
        
        separador();
    }

    public static void ejecutarEjercicio9() {
        System.out.println("--- Ejecutando Ejercicio 9: Cita Médica ---");

        Paciente pac1 = new Paciente("Ricardo Mollo", "OSDE");
        Profesional prof1 = new Profesional("Dr. House", "Diagnostico");

        CitaMedica cita1 = new CitaMedica(new Date(), new Date(), pac1, prof1);
      
        System.out.println("Cita programada.");
        System.out.println("Paciente: " + cita1.getPaciente().getNombre());
        System.out.println("Profesional: " + cita1.getProfesional().getNombre() + " (" + cita1.getProfesional().getEspecialidad() + ")");
        
        separador();
    }
    
    public static void ejecutarEjercicio10() {
        System.out.println("--- Ejecutando Ejercicio 10: Cuenta Bancaria ---");
        
        Titular titularCuenta = new Titular("Lionel Messi", "20123456");
        
        CuentaBancaria cuenta1 = new CuentaBancaria("0170...10", 1000000.0, "1234");
        
        cuenta1.setTitular(titularCuenta);
        titularCuenta.setCuentaBancaria(cuenta1);
        
        System.out.println("Titular: " + titularCuenta.getNombre());
        System.out.println("CBU: " + titularCuenta.getCuentaBancaria().getCbu());
        System.out.println("Clave (hash): " + titularCuenta.getCuentaBancaria().getClaveSeguridad().getCodigo());
        
        separador();
    }

    public static void ejecutarEjercicio11() {
        System.out.println("--- Ejecutando Ejercicio 11: Dependencia de Uso (Reproductor) ---");
        
        Artista art1 = new Artista("Gustavo Cerati", "Rock");
        Cancion can1 = new Cancion("Puente", art1);
        
        Reproductor repro1 = new Reproductor();
        
        repro1.reproducir(can1);
        separador();
    }

    public static void ejecutarEjercicio12() {
        System.out.println("--- Ejecutando Ejercicio 12: Dependencia de Uso (Calculadora) ---");
        
        Contribuyente cont1 = new Contribuyente("Elon Musk", "20-999999-9");
        Impuesto imp1 = new Impuesto(50000.0, cont1);
        
        Calculadora calc1 = new Calculadora();
        
        calc1.calcular(imp1);
        
        separador();
    }

    public static void ejecutarEjercicio13() {
        System.out.println("--- Ejecutando Ejercicio 13: Dependencia de Creación (GeneradorQR) ---");
 
        Usuario userQR = new Usuario("Walter White", "heisenberg@jp.com");
        
        GeneradorQR gen1 = new GeneradorQR();
        
        gen1.generar("http://www.lospolloshermanos.com", userQR);

        separador();
    }

    public static void ejecutarEjercicio14() {
        System.out.println("--- Ejecutando Ejercicio 14: Dependencia de Creación (EditorVideo) ---");
        
        Proyecto proy1 = new Proyecto("MiPelicula.pr", 120);
        
        EditorVideo editor1 = new EditorVideo();
        
        editor1.exportar("MP4", proy1);
        
        separador();
    }
}
