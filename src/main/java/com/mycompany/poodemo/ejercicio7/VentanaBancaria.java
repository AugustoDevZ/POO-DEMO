package com.mycompany.poodemo.ejercicio7;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaBancaria extends javax.swing.JFrame {

    // static: las cuentas, la tabla y el historial se conservan al volver al menú
    // (el tipo sigue siendo la interfaz CuentaBancaria, así que el polimorfismo no cambia)
    private static final CuentaBancaria cuentaCorriente = new CuentaCorriente(500.0);
    private static final CuentaBancaria cuentaAhorro = new CuentaAhorro(1000.0);

    // Modelo de la tabla de movimientos y texto con el cálculo de cada operación
    private static final DefaultTableModel modeloTabla = new DefaultTableModel(
            new Object[]{"Operación", "Monto ($)", "Saldo Final ($)"}, 0);
    private static final StringBuilder historial = new StringBuilder();

    public VentanaBancaria() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Sistema de Gestión Bancaria - UPN");
        
        // Mostramos la tabla y el resumen con lo que ya se haya registrado
        jTable1.setModel(modeloTabla);
        actualizarResumen();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cbTipoCuenta = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaResumen = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("BANCO DIGITAL - GESTIÓN DE CUENTAS");

        cbTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta Corriente", "Cuenta Ahorro" }));
        cbTipoCuenta.addActionListener(this::cbTipoCuentaActionPerformed);

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTipo.setText("Seleccione Cuenta:");

        lblMonto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMonto.setText("Monto ($):");

        txtMonto.addActionListener(this::txtMontoActionPerformed);

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(this::btnDepositarActionPerformed);

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(this::btnRetirarActionPerformed);

        btnConsultar.setText("Consultar Saldo");
        btnConsultar.addActionListener(this::btnConsultarActionPerformed);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        btnVolver.setText("Volver al Menú");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        txaResumen.setEditable(false);
        txaResumen.setColumns(20);
        txaResumen.setRows(5);
        jScrollPane3.setViewportView(txaResumen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnVolver))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(lblTipo)
                        .addGap(20, 20, 20)
                        .addComponent(cbTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDepositar)
                            .addComponent(btnRetirar))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultar)
                            .addComponent(btnLimpiar))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVolver)
                            .addComponent(btnSalir))))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// Agrega el movimiento a la tabla y al detalle del cálculo (saldo anterior ± monto = saldo nuevo)
    private void registrarMovimiento(String operacion, String tipoCuenta, double saldoAntes, double monto, double saldoDespues) {
        String signo = operacion.equals("Depósito") ? "+" : "-";
        modeloTabla.addRow(new Object[]{operacion + " (" + tipoCuenta + ")", signo + " $" + monto, "$ " + saldoDespues});
        historial.append(operacion).append(" (").append(tipoCuenta).append("): ")
                .append(saldoAntes).append(" ").append(signo).append(" ").append(monto)
                .append(" = ").append(saldoDespues).append("\n");
        actualizarResumen();
    }

    // Muestra juntas las dos cuentas y el cálculo de cada depósito y retiro
    private void actualizarResumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("SALDOS ACTUALES\n");
        sb.append("  Cuenta Corriente: $").append(cuentaCorriente.getSaldo()).append("\n");
        sb.append("  Cuenta Ahorro:    $").append(cuentaAhorro.getSaldo()).append("\n\n");
        sb.append("CÁLCULO DE LOS MOVIMIENTOS\n");
        sb.append(historial.length() == 0 ? "  (sin movimientos)\n" : historial.toString());
        txaResumen.setText(sb.toString());
        txaResumen.setCaretPosition(0);
    }

private CuentaBancaria obtenerCuentaSeleccionada() {
        String seleccion = cbTipoCuenta.getSelectedItem().toString();
        if (seleccion.equals("Cuenta Corriente")) {
            return cuentaCorriente;
        } else {
            return cuentaAhorro;
        }
    }
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
int confirm = JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicación?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        try {
            double monto = Double.parseDouble(txtMonto.getText());
            if (monto <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un monto mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            CuentaBancaria cuenta = obtenerCuentaSeleccionada();
            double saldoAntes = cuenta.getSaldo();
            if (saldoAntes >= monto) {
                cuenta.retirar(monto);
                registrarMovimiento("Retiro", cbTipoCuenta.getSelectedItem().toString(), saldoAntes, monto, cuenta.getSaldo());
                JOptionPane.showMessageDialog(this, "¡Retiro exitoso!\nNuevo saldo: $" + cuenta.getSaldo(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                txtMonto.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Fondos insuficientes en la cuenta.", "Atención", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido", "Formato incorrecto", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        CuentaBancaria cuenta = obtenerCuentaSeleccionada();
        String tipo = (String) cbTipoCuenta.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Saldo actual de la " + tipo + ": $" + cuenta.getSaldo(), "Consulta de Saldo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtMonto.setText("");
        modeloTabla.setRowCount(0);
        historial.setLength(0);
        actualizarResumen();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        try {
            double monto = Double.parseDouble(txtMonto.getText());
            if (monto <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un monto mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            CuentaBancaria cuenta = obtenerCuentaSeleccionada();
            double saldoAntes = cuenta.getSaldo();
            cuenta.depositar(monto);
            registrarMovimiento("Depósito", cbTipoCuenta.getSelectedItem().toString(), saldoAntes, monto, cuenta.getSaldo());
            JOptionPane.showMessageDialog(this, "¡Depósito exitoso!\nNuevo saldo: $" + cuenta.getSaldo(), "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            txtMonto.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido", "Formato incorrecto", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void cbTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoCuentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new VentanaBancaria().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbTipoCuenta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaResumen;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
