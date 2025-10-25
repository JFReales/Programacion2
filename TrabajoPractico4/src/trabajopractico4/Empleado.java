/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico4;

/**
 *
 * @author juanf
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000;
    }

    public void actualizarSalario(double porcentaje) {
        double aumento = salario * (porcentaje / 100);
        salario += aumento;
        System.out.println(nombre + " recibió un aumento del " + porcentaje + "%.");
    }

    public void actualizarSalario(int montoFijo) {
        salario += montoFijo;
        System.out.println(nombre + " recibió un aumento fijo de $" + montoFijo + ".");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "ID=" + id +
                ", Nombre='" + nombre + '\'' +
                ", Puesto='" + puesto + '\'' +
                ", Salario=$" + salario +
                '}';
    }

    public static void mostrarTotalEmpleados() {
        System.out.println("👥 Total de empleados creados: " + totalEmpleados);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
