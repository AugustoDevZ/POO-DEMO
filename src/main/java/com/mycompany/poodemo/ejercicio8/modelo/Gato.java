package com.mycompany.poodemo.ejercicio8.modelo;

public class Gato extends Mascota {

    private boolean esterilizado;

    public Gato(
            int id,
            String nombre,
            int edad,
            double precio,
            boolean esterilizado
    ) {

        super(id, nombre, edad, precio);

        this.esterilizado = esterilizado;
    }

    @Override
    public String emitirSonido() {
        return "Miau";
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
}