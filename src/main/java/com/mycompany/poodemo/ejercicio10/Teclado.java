/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poodemo.ejercicio10;

/**
 *
 * @author USER
 */
public class Teclado implements DispositivoUSB {
   
    private String modelo;
    private boolean conectado;

    public Teclado(String modelo) {
        this.modelo = modelo;
        this.conectado = false;
    }

    @Override
    public void conectar() {
        conectado = true;
        System.out.println("Teclado " + modelo + " conectado.");
    }

    @Override
    public void desconectar() {
        conectado = false;
        System.out.println("Teclado " + modelo + " desconectado.");
    }

    public String getNombre() { return modelo; }
    public boolean isConectado() { return conectado; }
}