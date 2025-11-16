/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico8.Ejercicio2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class GestorExcepciones {
    
    public static void divisionSegura() {
        System.out.println("--- 1. División Segura ---");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Ingrese el divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir por cero.");
        } catch (NumberFormatException e) {
            System.err.println("Error: Debe ingresar números enteros.");
        }
    }

    public static void conversionCadena() {
        System.out.println("\n--- 2. Conversión de Cadena ---");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un texto para convertir a número: ");
            String texto = scanner.nextLine();
            int numero = Integer.parseInt(texto);
            System.out.println("El número ingresado es: " + numero);
            
        } catch (NumberFormatException e) {
            System.err.println("Error: El texto '" + e.getMessage() + "' no es un número entero válido.");
        }
    }

    public static void lecturaArchivo() {
        System.out.println("\n--- 3. Lectura de Archivo (Clásica) ---");
        String nombreArchivo = "test_E3.txt";
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(nombreArchivo));
            System.out.println("Contenido de " + nombreArchivo + ":");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            System.err.println("Error: El archivo '" + nombreArchivo + "' no fue encontrado.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el lector: " + e.getMessage());
            }
        }
    }
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " está fuera del rango (0-120).");
        }
        System.out.println("La edad " + edad + " es válida.");
    }
    
    /**
     * [cite_start]5. Uso de try-with-resources [cite: 40-41]
     * [cite_start]Maneja IOException. [cite: 41]
     * NOTA: Requiere crear un archivo "test_E5.txt" en la raíz del proyecto.
     */
    public static void lecturaConTryWithResources() {
        System.out.println("\n--- 5. Lectura con try-with-resources ---");
        String nombreArchivo = "test_E5.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            System.out.println("Contenido de " + nombreArchivo + ":");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo '" + nombreArchivo + "' no fue encontrado.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
