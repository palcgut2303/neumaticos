/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.Factura;
import Modelo.Linea_Factura;
import Modelo.Precio;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import com.itextpdf.text.pdf.PdfPCell;
//import com.itextpdf.text.pdf.PdfPTable;

/**
 *
 * @author manana
 */
public class GenerarPDF extends javax.swing.JDialog {

    /**
     * Creates new form GenerarPDF
     */
    
    Controlador bd = new Controlador();
    
    public GenerarPDF(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rellenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTNumFac = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTNifCl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTIVA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTNifEmisor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTSubTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTtotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTNCuenta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jBCerrar = new javax.swing.JButton();
        jBImprimir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Imprimir Facturas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setText("Num Factura:");

        jLabel4.setText("NIF-Cliente:");

        jLabel5.setText("IVA:");

        jLabel7.setText("Fecha:");

        jLabel8.setText("NIF-Emisor:");

        jLabel9.setText("SubTotal:");

        jLabel10.setText("Total:");

        jLabel11.setText("Numero-Cuenta:");

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Factura", "Fecha", "NIF-Cliente", "NIF-Emisor", "IVA", "Subtotal", "TOTAL"
            }
        ));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTNumFac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTNifCl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(213, 213, 213))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNifEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTSubTotal)
                                    .addComponent(jTtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNumFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNifCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTNifEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTNCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("FACTURAS");

        jBCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBCerrar.setForeground(new java.awt.Color(255, 0, 0));
        jBCerrar.setText("CERRAR");
        jBCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarActionPerformed(evt);
            }
        });

        jBImprimir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBImprimir.setForeground(new java.awt.Color(51, 51, 255));
        jBImprimir.setText("IMPRIMIR");
        jBImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImprimirActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jBImprimir))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(jBCerrar)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jBImprimir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addGap(29, 29, 29)
                .addComponent(jBCerrar)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBCerrarActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        bd.conectar();
        int numero = jTabla.rowAtPoint(evt.getPoint());
        
        jTNumFac.setText(String.valueOf(jTabla.getValueAt(numero, 0)));
        jTFecha.setText(String.valueOf(jTabla.getValueAt(numero, 1)));
        jTNifCl.setText(String.valueOf(jTabla.getValueAt(numero, 2)));
        jTNifEmisor.setText(String.valueOf(jTabla.getValueAt(numero, 3)));
        jTIVA.setText(String.valueOf(jTabla.getValueAt(numero, 4)));
        jTSubTotal.setText(String.valueOf(jTabla.getValueAt(numero, 5)));
        jTtotal.setText(String.valueOf(jTabla.getValueAt(numero, 6)));
        
        
        String numCuenta = bd.listarNumCuenta(jTNumFac.getText());
        
        jTNCuenta.setText(numCuenta);
    }//GEN-LAST:event_jTablaMouseClicked

    private void jBImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImprimirActionPerformed
        if(jTNumFac.getText().length() != 0){
            imprimir();
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona alguna fila para generar el pdf");
        }
        
    }//GEN-LAST:event_jBImprimirActionPerformed

    private void imprimir() {
        try {
            bd.conectar();
            String Imagen = "/imagenes/images.jpg";
            String numFactura = jTNumFac.getText();
            ArrayList<Linea_Factura> lista = bd.listarLinea(numFactura);
            ArrayList<Precio> listaPrecio = bd.listarPrecio(numFactura);
            String fecha = jTFecha.getText();
            LocalDate fechaActual = LocalDate.now();
            int año = fechaActual.getYear();
            String añoS = String.valueOf(año);
            String numCuenta = jTNCuenta.getText();
            String nameFile = "A"+numFactura+"-"+añoS+".pdf";
            PdfDocument pdf = new PdfDocument(new PdfWriter(nameFile));
            Document document = new Document(pdf);
            
            document.add(new Paragraph("FACTURA").setBold().setTextAlignment(TextAlignment.CENTER).setFontSize(20));
            
            Image cabecera = new Image(ImageDataFactory.create(getClass().getResource( Imagen )));
            
            cabecera.setHeight(100);
            cabecera.setWidth(200);
            
            document.add(cabecera);
            
            Table miTabla = new Table(new float[]{4,2});
            
            miTabla.setWidthPercent(100);
            miTabla.setMarginTop(20);
            
            
            miTabla.addHeaderCell(new Cell().add(new Paragraph( "Informacion del cliente").setBold().setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
            miTabla.addHeaderCell(new Cell().add(new Paragraph("")).setBorder(Border.NO_BORDER));
            miTabla.addCell(new Cell().add( new Paragraph("Núm-Factura: A"+numFactura+"-"+añoS).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
            miTabla.addCell(new Cell().add( new Paragraph( "Aluminios SUR").setTextAlignment(TextAlignment.RIGHT)).setBorder(Border.NO_BORDER));
            miTabla.addCell(new Cell().add( new Paragraph("FECHA: " + fecha).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
            miTabla.addCell(new Cell().add(new Paragraph("IMPRENTA").setTextAlignment(TextAlignment.RIGHT)).setBorder(Border.NO_BORDER));
            miTabla.addCell(new Cell ().add( new Paragraph ("").setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
            miTabla.addCell(new Cell().add(new Paragraph("14003 Cordoba").setTextAlignment(TextAlignment.RIGHT)).setBorder(Border.NO_BORDER));
            miTabla.addCell(new Cell ().add( new Paragraph ("").setTextAlignment(TextAlignment.LEFT)).setBorder(Border.NO_BORDER));
            miTabla.addCell(new Cell().add(new Paragraph("4567463").setTextAlignment(TextAlignment.RIGHT)).setBorder(Border.NO_BORDER));
            
            document.add(miTabla);
            
            Table miTabla2 = new Table(3);
            miTabla2.setWidthPercent(100);
            miTabla2.setMarginTop(20);
            
            miTabla2.addHeaderCell(new Cell().add(new Paragraph("Unidades").setBold().setTextAlignment(TextAlignment.CENTER)));
            miTabla2.addHeaderCell(new Cell().add(new Paragraph("Concepto").setBold().setTextAlignment(TextAlignment.CENTER)));
            miTabla2.addHeaderCell(new Cell().add(new Paragraph("Precio").setBold().setTextAlignment(TextAlignment.CENTER)));
            
            for (Linea_Factura factura: lista) {
                miTabla2.addCell(new Cell().add( new Paragraph( String.valueOf(factura.getNumNeumatico()))));
                miTabla2.addCell(new Cell().add(new Paragraph(String.valueOf(factura.getConcepto()))));
                miTabla2.addCell(new Cell().add(new Paragraph(String.valueOf(factura.getPrecio()))));
            }
            
            document.add(miTabla2);
            
            document.add(new Paragraph("Precio Base: "+String.valueOf(listaPrecio.get(0).getPrec_base())).setTextAlignment(TextAlignment.RIGHT).setMarginTop(20));
            document.add(new Paragraph("IVA: "+String.valueOf(listaPrecio.get(0).getIva())).setTextAlignment(TextAlignment.RIGHT));
            document.add(new Paragraph("Precio Total: "+String.valueOf(listaPrecio.get(0).getPrec_total())).setBold().setTextAlignment(TextAlignment.RIGHT));
            
            document.add(new Paragraph("Forma de pago: Nº Cuenta: " + numCuenta).setBold().setFontSize(15).setMarginTop(20));
            document.close();
            JOptionPane.showMessageDialog(null, "Se ha creado el fichero " + nameFile + " con la factura correspondiente");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerarPDF.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(GenerarPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GenerarPDF dialog = new GenerarPDF(new javax.swing.JFrame(), true);
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

    public void rellenarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) jTabla.getModel();
        bd.conectar();
        ArrayList<Factura> miLista = bd.listarFacturas();
        modelo = (DefaultTableModel) jTabla.getModel();
        jTabla.setModel(modelo);

        for (Factura fac : miLista) {
            String[] datos = {String.valueOf(fac.getNumFactura()), fac.getFechaSistema(), fac.getNifCliente(), fac.getNifEmisor(), String.valueOf(fac.getIva()), String.valueOf(fac.getPrec_base()), String.valueOf(fac.getPrec_total())};
            modelo.addRow(datos);
        }
        
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCerrar;
    private javax.swing.JButton jBImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFecha;
    private javax.swing.JTextField jTIVA;
    private javax.swing.JTextField jTNCuenta;
    private javax.swing.JTextField jTNifCl;
    private javax.swing.JTextField jTNifEmisor;
    private javax.swing.JTextField jTNumFac;
    private javax.swing.JTextField jTSubTotal;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTtotal;
    // End of variables declaration//GEN-END:variables
}