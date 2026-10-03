package org.mineapi.empleados.presentation;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import org.mineapi.empleados.presentation.view.EmpleadosPanel;

public class EmpleadosApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ejercicio 5 - Empleados");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new EmpleadosPanel());
            frame.setSize(620, 420);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
