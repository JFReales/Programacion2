/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico2;
import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class TrabajoPractico2 {

    public static double calcularPrecioFinal(double impuesto, double descuento, double precioBase){
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    };
    
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio = 0;
        if(zona.equalsIgnoreCase("Nacional")){
            costoEnvio = peso * 5;
        }else if(zona.equalsIgnoreCase("Internacional")){
            costoEnvio = peso * 10;
        }else{
            System.out.println("Zona inválida");
        }
        return costoEnvio;
    };
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;        
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
    
    public static final double DESCUENTO_ESPECIAL =0.1;
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Año bisiesto
        System.out.println("Ingrese un año: ");
        int año = Integer.parseInt(input.nextLine());
        if(año % 4 == 0){
            System.out.println("El año " + año + " es bisiesto" );
        }else{
            System.out.println("El año " + año + " no es bisiesto");
        }
        
        //Mayor de tres números
        int num1, num2, num3;
        System.out.println("Ingrese 3 números: ");
        num1 = Integer.parseInt(input.nextLine());
        num2 = Integer.parseInt(input.nextLine());
        num3 = Integer.parseInt(input.nextLine());
        if(num1 > num2 && num1 > num3){
            System.out.println("El mayor es: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("El mayor es: " + num2);
        }else{
            System.out.println("El mayor es: " + num3);
        }
        
        //Clasificación de edad
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        if(edad < 12){
            System.out.println("Eres un niño");
        }else if(edad >= 12 && edad <= 17 ){
            System.out.println("Eres un adolescente");
        }else if(edad >= 18 && edad <= 59){
            System.out.println("Eres un adulto");
        }else{
            System.out.println("Eres un adulto mayor");
        }
        
        //Calculadora de descuento
        double descA = 0.1, descB = 0.15, descC = 0.2, preciofinal; 
        System.out.println("Ingrese el precio del producto: ");
        int precio = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la categoria del producto(A, B o C): ");
        String cat = input.nextLine();
        switch(cat){
            case "A":
                preciofinal = precio - (precio * descA);
                System.out.println("El precio final es: " + preciofinal);
                break;
            case "B":
                preciofinal = precio - (precio * descB);
                System.out.println("El precio final es: " + preciofinal);
                break;
            case "C":
                preciofinal = precio - (precio * descC);
                System.out.println("El precio final es: " + preciofinal);
                break;
            default:
                System.out.println("La categoria ingresada no tiene descuento");
                System.out.println("El precio final es: " + precio);
                break;
        }

        //Suma de Números Pares(while)
        int sum = 0;
        System.out.println("Ingrese un numero(0 para terminar): ");
        int num = Integer.parseInt(input.nextLine());
        while(num != 0){
            if(num % 2 == 0){
            sum = sum + num;
            }
            System.out.println("Ingrese un numero(0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
        System.out.println("La suma de los números pares es: " + sum);
        
        //Contador de positivos, negativos y ceros(for)
        int neg = 0, pos = 0, cero = 0, numero = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero: ");
            numero = Integer.parseInt(input.nextLine());
            if(numero == 0){
                cero = cero + 1;
            }else if(numero > 0){
                pos = pos + 1;
            }else{
                neg = neg + 1;
            }
        }
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
        
        //Validación de nota entre 0 y 10(do-while)
        int nota;
        do {
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.nextLine());
        } while (nota < 0 || nota >10);
        System.out.println("Nota guardada correctamente");
        
        //Cálculo del precio final con impuesto y descuento
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();
        System.out.println("Ingrese el impuesto en porcentaje: ");
        double impuesto = input.nextDouble() / 100;
        System.out.println("Ingrese el descuento en porcentaje: ");
        double descuento = input.nextDouble() / 100;
        double precioFinal = calcularPrecioFinal(impuesto, descuento, precioBase);
        System.out.println("El precio final del producto es: " + precioFinal);

        //Composición de funciones para calcular costo de envio y total de compra
        double peso, precioProducto, costoEnvio, total;
        String zona;
        System.out.println("Ingrese el precio del producto: ");
        precioProducto = input.nextDouble();
        System.out.println("Ingrese el peso del paquete en kg: ");
        peso = input.nextDouble();
        System.out.println("Ingrese la zona de envío(Nacional/Internacional): ");
        zona = input.next();
        
        costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + costoEnvio);
        total = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " + total);
                
        //Actualizacion de stock a partir de venta y recepción de producto
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        System.out.println("Ingrese el stock actual: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese la cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        //Cálculo de descuento especial usando variable goblal
        double precios;
        System.out.println("Ingrese el precio del producto: ");
        precios = input.nextDouble();
        calcularDescuentoEspecial(precios);
        input.close();
    }
}
