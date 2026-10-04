/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poodemo.ejercicio1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author frank
 */
public class VentanaPrincipal extends JFrame {

    private JButton btnRectangulo;
    private JButton btnCirculo;
    private JLabel lblTitulo;

    public VentanaPrincipal() {
        // Configuración básica de la ventana
        setTitle("Menú Principal - FigurasApp");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setLayout(null); // Usando diseño libre para ubicar componentes

        // Inicializar componentes
        lblTitulo = new JLabel("Seleccione una Figura Geométrica");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblTitulo.setBounds(50, 30, 300, 30);
        add(lblTitulo);

        btnRectangulo = new JButton("Calcular Rectángulo");
        btnRectangulo.setBounds(90, 80, 200, 35);
        btnRectangulo.addActionListener(e -> {
            new VentanaRectangulo().setVisible(true);
            this.dispose(); // Cierra el menú principal
        });
        add(btnRectangulo);

        btnCirculo = new JButton("Calcular Círculo");
        btnCirculo.setBounds(90, 130, 200, 35);
        btnCirculo.addActionListener(e -> {
            new VentanaCirculo().setVisible(true);
            this.dispose(); // Cierra el menú principal
        });
        add(btnCirculo);
    }

    public static void main(String[] args) {
        // Ejecutar la aplicación
        EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
}