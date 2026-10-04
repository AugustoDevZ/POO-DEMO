package org.mineapi.empleados.presentation.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mineapi.empleados.core.domain.entities.Ejercicio5.Empleado;
import org.mineapi.empleados.core.domain.entities.Ejercicio5.Gerente;
import org.mineapi.empleados.core.domain.entities.Ejercicio5.Programador;


public class EmpleadoController {

    public static final String GERENTE = "Gerente";
    public static final String PROGRAMADOR = "Programador";

    private final List<Empleado> empleados = new ArrayList<>();

    
    public Empleado registrar(String cargo, String nombre, String salarioTexto) {
        double salario;
        try {
            salario = Double.parseDouble(salarioTexto.trim().replace(',', '.'));
        } catch (NumberFormatException | NullPointerException e) {
            throw new IllegalArgumentException("El salario debe ser un número válido.");
        }

        Empleado empleado = switch (cargo) {
            case GERENTE -> new Gerente(nombre, salario);
            case PROGRAMADOR -> new Programador(nombre, salario);
            default -> throw new IllegalArgumentException("Cargo no reconocido: " + cargo);
        };
        empleados.add(empleado);
        return empleado;
    }

    public List<Empleado> listar() {
        return Collections.unmodifiableList(empleados);
    }
}
