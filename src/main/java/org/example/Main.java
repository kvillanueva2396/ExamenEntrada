package org.example;

import org.example.classes.Desarrollador;
import org.example.classes.Empleado;
import org.example.classes.Gerente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        ArrayList<String> equipoGerenteA = new ArrayList<>();
        ArrayList<String> lenguajesDesarrolladorA = new ArrayList<>();
        ArrayList<String> lenguajesDesarrolladorB = new ArrayList<>();

        equipoGerenteA.add("Cesar");
        equipoGerenteA.add("Ricardo");
        equipoGerenteA.add("Maria");
        equipoGerenteA.add("Julio");

        lenguajesDesarrolladorA.add("JavaScript");
        lenguajesDesarrolladorA.add("Python");
        lenguajesDesarrolladorA.add("Java");

        lenguajesDesarrolladorB.add("Ruby");
        lenguajesDesarrolladorB.add("C#");
        lenguajesDesarrolladorB.add("PHP");
        lenguajesDesarrolladorB.add("Go");
        lenguajesDesarrolladorB.add("Dart");

        Gerente gerenteA = new Gerente("G1", "Juan Bautista", "A", 5000, equipoGerenteA);
        Desarrollador desarrolladorA = new Desarrollador("D1", "Kevin", "A", 3000, lenguajesDesarrolladorA);
        Desarrollador desarrolladorB = new Desarrollador("D2", "Arnold", "B", 3500, lenguajesDesarrolladorB);

        listaEmpleados.add(gerenteA);
        listaEmpleados.add(desarrolladorA);
        listaEmpleados.add(desarrolladorB);

        for (Empleado empleado : listaEmpleados) {
            empleado.mostrarDetalles();
            System.out.println("Bono: " + empleado.calcularBono());
        }

        System.out.println();
        System.out.println("---------------------------------------");
        //Demostrando el polimorfimos con evaluarDesempeno();
        System.out.println("Gerente A, su desempeno fue " + gerenteA.evaluarDesempeno());
        System.out.println("Desarrollador A, su desempeno fue " + desarrolladorA.evaluarDesempeno());
        System.out.println("Desarrollador B, su desempeno fue " + desarrolladorB.evaluarDesempeno());
    }
}