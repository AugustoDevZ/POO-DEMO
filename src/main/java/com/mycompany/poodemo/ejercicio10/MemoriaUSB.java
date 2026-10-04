/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poodemo.ejercicio10;

/**
 *
 * @author USER
 */
public class MemoriaUSB implements DispositivoUSB {
    private int capacidadGB;
    private boolean conectado;

    public MemoriaUSB(int capacidadGB) {
        this.capacidadGB = capacidadGB;
        this.conectado = false;
    }

    @Override
    public void conectar() {
        conectado = true;
        System.out.println("Memoria USB de " + capacidadGB + "GB conectada.");
    }

    @Override
    public void desconectar() {
        conectado = false;
        System.out.println("Memoria USB desconectada.");
    }

    public String getNombre() { return "Memoria " + capacidadGB + "GB"; }
    public boolean isConectado() { return conectado; }
}