package com.mycompany.poodemo.ejercicio8.modelo;

public abstract class Mascota {

    private int id;
    private String nombre;
    private int edad;
    private double precio;

    public Mascota(int id, String nombre, int edad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.precio = precio;
    }

    public abstract String emitirSonido();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}