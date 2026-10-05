/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poodemo.Ejercicio3.src.ejercicio3;

public class Televisor implements Electrodomestico {
    
        private boolean encendido = false;

    @Override
    public void encender() {
        if (encendido) {
            System.out.println("Ya puse Magaly Tv.");
        } else {
            encendido = true;
            System.out.println("Incendiando Televisor.-.");
        }
    }

    @Override
    public void apagar() {
        if (!encendido) {
            System.out.println("El televisor ya está durmiendo.");
        } else {
            encendido = false;
            System.out.println("Televisor dormido.");
        }
    }

    public boolean isEncendido() {
        return encendido;
    }
}
