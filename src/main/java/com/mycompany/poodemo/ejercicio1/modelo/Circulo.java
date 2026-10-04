/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poodemo.ejercicio1.modelo;

/**
 * Clase que representa un Círculo con soporte para cálculo de área
 * y conversión de unidades de medida.
 * 
 * @author frank
 */
public class Circulo {
    private double radio;
    private String unidad;

    // Constructor por defecto
    public Circulo() {
        this.radio = 0.0;
        this.unidad = "Metros (m)";
    }

    // Constructor con parámetros
    public Circulo(double radio, String unidad) {
        this.radio = radio;
        this.unidad = unidad;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    /**
     * Calcula el área del círculo en la unidad actual.
     * Fórmula: A = π * r^2
     * @return El área calculada
     */
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    /**
     * Método auxiliar para obtener el factor de conversión respecto a los metros (unidad base).
     */
    private double obtenerFactor(String unidadMedida) {
        if (unidadMedida.contains("Milímetros")) return 0.001;
        if (unidadMedida.contains("Centímetros")) return 0.01;
        if (unidadMedida.contains("Decímetros")) return 0.1;
        if (unidadMedida.contains("Metros")) return 1.0;
        if (unidadMedida.contains("Kilómetros")) return 1000.0;
        return 1.0;
    }

    /**
     * Convierte el área calculada desde la unidad de ingreso actual 
     * hacia una unidad de destino especificada.
     */
    public double convertirAreaA(String unidadDestino) {
        double areaOriginal = calcularArea();
        
        if (this.unidad.equalsIgnoreCase(unidadDestino)) {
            return areaOriginal;
        }

        double factorIngreso = obtenerFactor(this.unidad);
        double factorDestino = obtenerFactor(unidadDestino);

        double radioEnMetros = this.radio * factorIngreso;
        double areaEnMetrosCuadrados = Math.PI * Math.pow(radioEnMetros, 2);
        
        return areaEnMetrosCuadrados / Math.pow(factorDestino, 2);
    }
}