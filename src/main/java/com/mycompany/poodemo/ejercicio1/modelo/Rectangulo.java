package com.mycompany.poodemo.ejercicio1.modelo;

public class Rectangulo extends Figura {
    private double base;
    private double altura;
    private String unidad;

    public Rectangulo(double base, double altura, String unidad) {
        this.base = base;
        this.altura = altura;
        this.unidad = unidad;
    }

    // Método auxiliar para obtener el factor de conversión respecto al metro (unidad base)
    private double obtenerFactorMetros(String unidadSeleccionada) {
        switch (unidadSeleccionada) {
            case "Milímetros (mm)":
                return 0.001;      // 1 mm = 0.001 m
            case "Centímetros (cm)":
                return 0.01;       // 1 cm = 0.01 m
            case "Decímetros (dm)":
                return 0.1;        // 1 dm = 0.1 m
            case "Metros (m)":
                return 1.0;        // Unidad base
            case "Kilómetros (km)":
                return 1000.0;     // 1 km = 1000 m
            default:
                return 1.0;
        }
    }

    @Override
    public double calcularArea() {
        // Cálculo directo en la unidad original de ingreso
        return base * altura;
    }

    // Método para convertir el área a otra unidad de destino seleccionada
    public double convertirAreaA(String unidadDestino) {
        double factorOrigen = obtenerFactorMetros(this.unidad);
        double factorDestino = obtenerFactorMetros(unidadDestino);
        
        // 1. Convertimos las dimensiones de la base y altura a metros estándar
        double baseEnMetros = base * factorOrigen;
        double alturaEnMetros = altura * factorOrigen;
        
        // 2. Calculamos el área en metros cuadrados
        double areaEnMetrosCuadrados = baseEnMetros * alturaEnMetros;
        
        // 3. Convertimos el área cuadrada de metros cuadrados a la unidad de destino deseada
        return areaEnMetrosCuadrados / (factorDestino * factorDestino);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getUnidad() {
        return unidad;
    }
}