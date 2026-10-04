package com.mycompany.poomodemo.ejercicio7;

public class AplicacionBancaria {

    public static void main(String[] args) {
        // Polimorfismo: Usamos la interfaz CuentaBancaria como tipo de dato
        CuentaBancaria cuentaC = new CuentaCorriente(500.0);
        CuentaBancaria cuentaA = new CuentaAhorro(1000.0);

        System.out.println("=== OPERACIONES EN CUENTA CORRIENTE ===");
        cuentaC.depositar(200.0);
        cuentaC.retirar(150.0);

        System.out.println("\n=== OPERACIONES EN CUENTA DE AHORRO ===");
        cuentaA.depositar(300.0);
        cuentaA.retirar(1500.0); // Debería mostrar fondos insuficientes
    }
}