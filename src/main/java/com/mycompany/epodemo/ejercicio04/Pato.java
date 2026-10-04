package com.mycompany.epodemo.ejercicio04;

public class Pato implements Volador, Nadador {
    public enum Estado { VOLANDO, NADANDO }
    private final String nombre;
    private Estado estado = Estado.NADANDO;

    public Pato(String nombre) { this.nombre = nombre; }

    @Override public String volar() {
        estado = Estado.VOLANDO;
        return nombre + " bate sus alas y vuela por el cielo.";
    }
    @Override public String nadar() {
        estado = Estado.NADANDO;
        return nombre + " se desliza nadando en el estanque.";
    }
    public Estado getEstado() { return estado; }
}
