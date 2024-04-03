package org.example.classes;

abstract public class Empleado {
    private String id;
    private String nombre;
    private String departamento;
    private double salario;

    public Empleado(String id, String nombre, String departamento, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        System.out.println("===========================================");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
    }

    public abstract double calcularBono();
}
