package org.mineapi.empleados.core.domain.entities.Ejercicio5;

public abstract class Empleado {
    
    private static final double salariominimo=1350.0;
    private static final double salariomaximo=10000.0;

    private final String nombre;
    private final double salario;

    protected Empleado(String nombre, double salario) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (salario <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor que cero.");
        }
        if (salario <salariominimo || salario>salariomaximo) {
            throw new IllegalArgumentException("El salario debe ser estar entre" + salariominimo +"   y  " + salariomaximo + ".");
        }
        this.nombre = nombre.trim();
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    /** Método abstracto: cada tipo de empleado calcula su bono distinto. */
    public abstract double calcularBono();

    /** Nombre del cargo, para mostrarlo en la interfaz. */
    public abstract String getCargo();

    @Override
    public String toString() {
        return getCargo() + ": " + nombre;
    }
}
