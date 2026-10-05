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
        // 1. Validar que el nombre no sea nulo ni vacío antes de buscar
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }

        String nombreLimpio = nombre.trim();

        // 2. Validar que no exista un empleado con el mismo nombre (sin importar mayúsculas)
        boolean existeDuplicado = empleados.stream()
                .anyMatch(e -> e.getNombre().equalsIgnoreCase(nombreLimpio));

        if (existeDuplicado) {
            throw new IllegalArgumentException("Ya existe un empleado registrado con el nombre: " + nombreLimpio);
        }

        // 3. Conversión de salario
        double salario;
        try {
            salario = Double.parseDouble(salarioTexto.trim().replace(',', '.'));
        } catch (NumberFormatException | NullPointerException e) {
            throw new IllegalArgumentException("El salario debe ser un número válido.");
        }

        // 4. Crear instancia según el cargo
        Empleado empleado = switch (cargo) {
            case GERENTE -> new Gerente(nombreLimpio, salario);
            case PROGRAMADOR -> new Programador(nombreLimpio, salario);
            default -> throw new IllegalArgumentException("Cargo no reconocido: " + cargo);
        };

        empleados.add(empleado);
        return empleado;
    }

    public List<Empleado> listar() {
        return Collections.unmodifiableList(empleados);
    }
}