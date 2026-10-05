/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poodemo.Ejercicio3.src.ejercicio3;

public class Refrigerador implements Electrodomestico {
    
        private boolean encendido = false;

    @Override
    public void encender() {
        if (encendido) {
            System.out.println("El refrigerador ya está congelando a Dori.");
        } else {
            encendido = true;
            System.out.println("Refrigerador encendido, enfriandolo...");
        }
    }

    @Override
    public void apagar() {
        if (!encendido) {
            System.out.println("El refrigerador ya está durmiendo.");
        } else {
            encendido = false;
            System.out.println("Refrigerador dormido.");
        }
    }

    public boolean isEncendido() {
        return encendido;
    }
}
