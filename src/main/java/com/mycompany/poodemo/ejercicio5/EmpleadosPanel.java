package org.mineapi.empleados.presentation.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.mineapi.empleados.core.domain.entities.Ejercicio5.Empleado;
import org.mineapi.empleados.presentation.controller.EmpleadoController;


public class EmpleadosPanel extends JPanel {

    private final EmpleadoController controller = new EmpleadoController();

    private final JTextField txtNombre = new JTextField(15);
    private final JTextField txtSalario = new JTextField(10);
    private final JComboBox<String> cboCargo = new JComboBox<>(
            new String[]{EmpleadoController.GERENTE, EmpleadoController.PROGRAMADOR});
    private final DefaultTableModel modelo = new DefaultTableModel(
            new String[]{"Cargo", "Nombre", "Salario", "Bono"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    public EmpleadosPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel titulo = new JLabel("Clases abstractas y herencia: Empleado, Gerente y Programador");
        titulo.setFont(titulo.getFont().deriveFont(java.awt.Font.BOLD, 16f));
        add(titulo, BorderLayout.NORTH);

        JPanel formulario = new JPanel(new GridLayout(3, 2, 8, 8));
        formulario.add(new JLabel("Cargo:"));
        formulario.add(cboCargo);
        formulario.add(new JLabel("Nombre:"));
        formulario.add(txtNombre);
        formulario.add(new JLabel("Salario:"));
        formulario.add(txtSalario);

        JButton btnRegistrar = new JButton("Registrar y calcular bono");
        btnRegistrar.addActionListener(e -> registrar());

        JPanel arriba = new JPanel(new BorderLayout(8, 8));
        arriba.add(formulario, BorderLayout.CENTER);
        JPanel botonera = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botonera.add(btnRegistrar);
        arriba.add(botonera, BorderLayout.SOUTH);

        JPanel centro = new JPanel(new BorderLayout(8, 8));
        centro.add(arriba, BorderLayout.NORTH);
        centro.add(new JScrollPane(new JTable(modelo)), BorderLayout.CENTER);
        add(centro, BorderLayout.CENTER);
    }

    private void registrar() {
        try {
            Empleado emp = controller.registrar(
                    (String) cboCargo.getSelectedItem(), txtNombre.getText(), txtSalario.getText());
            modelo.addRow(new Object[]{
                emp.getCargo(), emp.getNombre(),
                String.format("S/ %.2f", emp.getSalario()),
                String.format("S/ %.2f", emp.calcularBono())});
            txtNombre.setText("");
            txtSalario.setText("");
            txtNombre.requestFocusInWindow();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Datos inválidos", JOptionPane.WARNING_MESSAGE);
        }
    }
}
