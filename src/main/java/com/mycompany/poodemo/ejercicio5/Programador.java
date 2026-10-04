package org.mineapi.empleados.core.domain.entities.Ejercicio5;

public class Programador extends Empleado {

    private static final double PORCENTAJE_BONO = 0.10; // 10 % del salario

    public Programador(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        return getSalario() * PORCENTAJE_BONO;
    }

    @Override
    public String getCargo() {
        return "Programador";
    }
}
