/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manana
 */
public class CrearFactura extends javax.swing.JDialog {

    /**
     * Creates new form ReALI
     */
    Controlador bd;
    ArrayList<String> NIF;
    ArrayList<String> Codigo;
    int contador = 0;

    public CrearFactura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        bd = new Controlador();

        añadirComboBoxNIF();
        generarDatosNIF();
        añadirComboBoxCodNeu();
        generarDatosNeumaticos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCBNif = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTNFactura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFechActual = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNEmisor = new javax.swing.JTextField();
        jTAño = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCBCodNeu = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTIVA = new javax.swing.JTextField();
        jTMarca = new javax.swing.JTextField();
        jTPrecioUd = new javax.swing.JTextField();
        jTUnidades = new javax.swing.JTextField();
        jBAñadirLinea = new javax.swing.JButton();
        jBEliminarLinea = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLSubTotal = new javax.swing.JLabel();
        jLIVA = new javax.swing.JLabel();
        jLTOTAL = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("NIF:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCBNif, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("CLIENTE");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.ABOVE_TOP));

        jLabel3.setText("Num-Factura:");

        jLabel4.setText("Fecha-Actual:");

        jLabel5.setText("NIF-Emisor:");

        jLabel6.setText("Año:");

        jLabel7.setText("Cód Neumatico:");

        jLabel8.setText("Marca:");

        jLabel9.setText("Precio Ud:");

        jLabel10.setText("UNIDADES:");

        jLabel11.setText("% IVA:");

        jBAñadirLinea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBAñadirLinea.setForeground(new java.awt.Color(0, 153, 0));
        jBAñadirLinea.setText("AÑADIR LINEA");
        jBAñadirLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAñadirLineaActionPerformed(evt);
            }
        });

        jBEliminarLinea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBEliminarLinea.setForeground(new java.awt.Color(204, 0, 0));
        jBEliminarLinea.setText("ELIMINAR LINEA");
        jBEliminarLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarLineaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addGap(226, 226, 226))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jCBCodNeu, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTNFactura)
                                    .addComponent(jTFechActual, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTNEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(49, 49, 49)
                                        .addComponent(jTAño))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTPrecioUd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jBAñadirLinea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jBEliminarLinea)
                .addGap(107, 107, 107))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTNEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFechActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCBCodNeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jTIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTPrecioUd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAñadirLinea)
                    .addComponent(jBEliminarLinea))
                .addGap(21, 21, 21))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod-Neumatico", "Concepto (Marca)", "Cantidad", "Precio Ud"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
        );

        jBGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(51, 153, 0));
        jBGuardar.setText("GUARDAR");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jBCancelar.setForeground(new java.awt.Color(204, 0, 0));
        jBCancelar.setText("CANCELAR");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 204));
        jLabel12.setText("DATOS FACTURA");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 204));
        jLabel13.setText("LINEAS FACTURA");

        jLSubTotal.setText("00.00");

        jLIVA.setText("00.00");

        jLTOTAL.setText("00.00");

        jLabel17.setText("SUBTOTAL");

        jLabel18.setText("IVA");

        jLabel19.setText("TOTAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(57, 57, 57)
                                .addComponent(jLSubTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBGuardar)
                                .addGap(264, 264, 264)
                                .addComponent(jBCancelar)
                                .addGap(194, 194, 194)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTOTAL)
                                    .addComponent(jLIVA))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLSubTotal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBGuardar)
                        .addComponent(jBCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLIVA)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTOTAL)
                            .addComponent(jLabel19))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBAñadirLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAñadirLineaActionPerformed

        if (!jTUnidades.getText().equalsIgnoreCase("")) {
            DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
            String codigo = (String) jCBCodNeu.getSelectedItem();
            String marca = jTMarca.getText();
            String precio = jTPrecioUd.getText();
            String cantidad = jTUnidades.getText();

            String[] Fila = {codigo, marca, cantidad, precio};
            modelo.addRow(Fila);
            calcularTotal(modelo);
            reiniciarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "RELLENA LOS CAMPOS PARA AÑADIR.");
        }


    }//GEN-LAST:event_jBAñadirLineaActionPerformed

    private void calcularTotal(DefaultTableModel modelo) throws NumberFormatException {
        double labelSubTotal = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String precio2 = (String) modelo.getValueAt(i, 3);
            String cantidad2 = (String) modelo.getValueAt(i, 2);

            double precio2d = Double.valueOf(precio2);
            double cantidadad2d = Double.valueOf(cantidad2);

            double subtotal = precio2d * cantidadad2d;

            labelSubTotal = labelSubTotal + subtotal;
        }

        String IVA = jTIVA.getText();
        double IVAd = Double.valueOf(IVA);

        jLSubTotal.setText(String.valueOf(labelSubTotal));
        double totalSub = labelSubTotal * (IVAd / 100);
        double total = totalSub + labelSubTotal;
        jLIVA.setText(String.valueOf(totalSub));
        jLTOTAL.setText(String.valueOf(total));
    }

    private void jBEliminarLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarLineaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        int filaSeleccionada = jTabla.getSelectedRow();
        modelo.removeRow(filaSeleccionada);
        calcularTotal(modelo);
    }//GEN-LAST:event_jBEliminarLineaActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        bd.conectar();
        if (modelo.getRowCount() != 0) {
            int numFactura = Integer.valueOf(jTNFactura.getText());
            String nifCliente = (String) jCBNif.getSelectedItem();
            String nifEmisor = jTNEmisor.getText();
            String fechaSistema = jTFechActual.getText();
            double base = Double.valueOf(jLSubTotal.getText());
            double iva = Double.valueOf(jLIVA.getText());
            double total = Double.valueOf(jLTOTAL.getText());
            int pagada = 1;
            String numCuenta = "4686456784120C";

            if (bd.insertarFactura(numFactura, nifCliente, nifEmisor, fechaSistema, base, iva, total, pagada, numCuenta)) {
                JOptionPane.showMessageDialog(this, "Se ha agregado correctamente la factura.");

            } else {
                JOptionPane.showMessageDialog(this, "No se ha agregado correctamente la factura.");
            }

            for (int i = 0; i < modelo.getRowCount(); i++) {
                String codNeumatico = String.valueOf(modelo.getValueAt(i, 0));
                String concepto = String.valueOf(modelo.getValueAt(i, 1));
                String cantidad = String.valueOf(modelo.getValueAt(i, 2));
                String precio = String.valueOf(modelo.getValueAt(i, 3));
                bd.insertarLineaFactura(numFactura, Integer.parseInt(codNeumatico), concepto, Integer.parseInt(cantidad), Double.parseDouble(precio));
            }

            modelo.setRowCount(0);
            reiniciarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "INSERTA NEUMATICOS EN LA TABLA PARA GUARDAR.");
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    public void calcularsubTotal(int cantidad, int precio) {
        double subtotal = 0;
        subtotal = (double) (cantidad * precio);

        String subTotalS = String.valueOf(subtotal);

        jLSubTotal.setText(subTotalS);
    }

    public void reiniciarCampos() {
        jCBCodNeu.setSelectedIndex(0);
        jTMarca.setText("");
        jTPrecioUd.setText("");
        jTUnidades.setText("");
        jTIVA.setText("");
        jCBNif.setSelectedIndex(0);

    }

    public void generarDatosNIF() {
        jCBNif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                LocalDate fechaActual = LocalDate.now();
                int año = fechaActual.getYear();
                int mes = fechaActual.getMonthValue();
                int dia = fechaActual.getDayOfMonth();
                String nEmisor = "9999999Z";
                String añoS = String.valueOf(año);
                String mesS = String.valueOf(mes);
                String dia2 = String.valueOf(dia);

                if (bd.conectar()) {
                    jTNFactura.setText(String.valueOf(bd.numeroFacturas()));
                    jTFechActual.setText(añoS + "/" + mesS + "/" + dia2);
                    jTAño.setText(añoS);
                    jTNEmisor.setText(nEmisor);
                }
            }
        });

        jTNFactura.setEditable(false);
        jTFechActual.setEditable(false);
        jTAño.setEditable(false);
    }

    public void generarDatosNeumaticos() {
        jCBCodNeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                bd.conectar();
                String codigo = (String) jCBCodNeu.getSelectedItem();
                String marca = bd.generarMarcaNeumaticos(codigo);
                jTMarca.setText(marca);
                double precio = bd.generarPrecioNeumatico(codigo);
                String precioS = String.valueOf(precio);
                jTPrecioUd.setText(precioS);
                jTIVA.setText("8");
            }
        });

        /*jTMarca.setEditable(false);
        jTPrecioUd.setEditable(false); */
    }

    public void añadirComboBoxNIF() {
        try {
            if (bd.conectar()) {
                NIF = bd.listarNIF();
                for (int i = 0; i < NIF.size(); i++) {

                    jCBNif.addItem(NIF.get(i));

                }
            } else {
                System.out.println("No se ha podido conectar con la base de datos.");
            }
        } catch (Exception e) {
        }
    }

    public void añadirComboBoxCodNeu() {
        try {
            if (bd.conectar()) {
                Codigo = bd.listarCodNeumaticos();
                for (int i = 0; i < Codigo.size(); i++) {

                    jCBCodNeu.addItem(Codigo.get(i));

                }
            } else {
                System.out.println("No se ha podido conectar con la base de datos.");
            }
        } catch (Exception e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearFactura dialog = new CrearFactura(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAñadirLinea;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEliminarLinea;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JComboBox<String> jCBCodNeu;
    private javax.swing.JComboBox<String> jCBNif;
    private javax.swing.JLabel jLIVA;
    private javax.swing.JLabel jLSubTotal;
    private javax.swing.JLabel jLTOTAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAño;
    private javax.swing.JTextField jTFechActual;
    private javax.swing.JTextField jTIVA;
    private javax.swing.JTextField jTMarca;
    private javax.swing.JTextField jTNEmisor;
    private javax.swing.JTextField jTNFactura;
    private javax.swing.JTextField jTPrecioUd;
    private javax.swing.JTextField jTUnidades;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
