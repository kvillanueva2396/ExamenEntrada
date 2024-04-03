package org.example.classes;

import org.example.enums.Desempeno;
import org.example.interfaces.EvaluarDesempeno;

import java.util.ArrayList;

public class Desarrollador extends Empleado implements EvaluarDesempeno {
    private ArrayList<String> lenguajes;

    public Desarrollador(String id, String nombre, String departamento, double salario, ArrayList<String> lenguajes) {
        super(id, nombre, departamento, salario);
        this.lenguajes = lenguajes;
    }

    @Override
    public double calcularBono() {
        Desempeno desempeno = Desempeno.valueOf(evaluarDesempeno());
        double bonoTotal = lenguajes.size() * 100;

        if (desempeno == Desempeno.MALO) return 0;
        if (desempeno == Desempeno.REGULAR) return bonoTotal/2;
        return bonoTotal;
    }

    @Override
    public String evaluarDesempeno() {
        if (lenguajes.size() > 4) return Desempeno.BUENO.toString();
        if (lenguajes.size() > 1)  return Desempeno.REGULAR.toString();
        return Desempeno.MALO.toString();
    }
}
