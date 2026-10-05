package com.mycompany.poodemo.ejercicio7;

public class CuentaAhorro implements CuentaBancaria {
    private double saldo;

    // Constructor
    public CuentaAhorro(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso en Cuenta de Ahorro. Saldo actual: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso de Cuenta de Ahorro. Saldo actual: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido en Cuenta de Ahorro.");
        }
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
