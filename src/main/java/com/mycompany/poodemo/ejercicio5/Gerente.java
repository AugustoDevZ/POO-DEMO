package org.mineapi.empleados.core.domain.entities.Ejercicio5;

public class Gerente extends Empleado {

    private static final double PORCENTAJE_BONO = 0.20; // 20 % del salario

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        return getSalario() * PORCENTAJE_BONO;
    }

    @Override
    public String getCargo() {
        return "Gerente";
    }
}
