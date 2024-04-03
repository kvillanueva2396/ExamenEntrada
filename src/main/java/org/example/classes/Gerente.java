package org.example.classes;

import org.example.enums.Desempeno;
import org.example.interfaces.EvaluarDesempeno;

import java.util.ArrayList;

public class Gerente extends Empleado implements EvaluarDesempeno {
    private ArrayList<String> equipo;

    public Gerente(String id, String nombre, String departamento, double salario, ArrayList<String> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }

    @Override
    public double calcularBono() {
        Desempeno desempeno = Desempeno.valueOf(evaluarDesempeno());
        double bonoTotal = equipo.size() * 1000;

        if (desempeno == Desempeno.MALO) return 0;
        if (desempeno == Desempeno.REGULAR) return bonoTotal/2;
        return bonoTotal;
    }

    @Override
    public String evaluarDesempeno() {
        if (equipo.size() > 5) return Desempeno.BUENO.toString();
        if (equipo.size() > 1)  return Desempeno.REGULAR.toString();
        return Desempeno.MALO.toString();
    }
}
