package com.mycompany.poodemo.ejercicio8.modelo;

public class Perro extends Mascota {

    private String raza;

    public Perro(
            int id,
            String nombre,
            int edad,
            double precio,
            String raza
    ) {

        super(id, nombre, edad, precio);

        this.raza = raza;
    }

    @Override
    public String emitirSonido() {
        return "Guau";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}