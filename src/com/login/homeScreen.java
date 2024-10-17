package com.login;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class homeScreen extends javax.swing.JFrame {

    int xMouse, yMouse;

    public homeScreen() {
        initComponents();
        setSize(790, 500);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgHomeScreen = new javax.swing.JPanel();
        barNavMov = new javax.swing.JPanel();
        btnExportarPDF = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(750, 510));
        setResizable(false);

        bgHomeScreen.setBackground(new java.awt.Color(255, 255, 255));
        bgHomeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barNavMov.setBackground(new java.awt.Color(255, 255, 255));
        barNavMov.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barNavMovMouseDragged(evt);
            }
        });
        barNavMov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barNavMovMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barNavMovLayout = new javax.swing.GroupLayout(barNavMov);
        barNavMov.setLayout(barNavMovLayout);
        barNavMovLayout.setHorizontalGroup(
            barNavMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        barNavMovLayout.setVerticalGroup(
            barNavMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bgHomeScreen.add(barNavMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        btnExportarPDF.setText("Exportar PDF");
        btnExportarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarPDFMouseClicked(evt);
            }
        });
        bgHomeScreen.add(btnExportarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fabian\\Downloads\\cerrar-sesion (1).png")); // NOI18N
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });
        bgHomeScreen.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgHomeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgHomeScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barNavMovMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barNavMovMousePressed
        // TODO add your handling code here:
        // MOVER VENTANA --
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barNavMovMousePressed

    private void barNavMovMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barNavMovMouseDragged
        // TODO add your handling code here:
        // MOVER VENTANA --
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barNavMovMouseDragged

    private void btnExportarPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarPDFMouseClicked
        PDFExporter.exportDataToPDF();
    }//GEN-LAST:event_btnExportarPDFMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        // TODO add your handling code here:
        // Opciones personalizadas
        Object[] options = {"Cerrar sesión y salir del programa", "Cerrar sesión"};

        int option = JOptionPane.showOptionDialog(null,
                "¿Qué acción deseas realizar?",
                "Confirmar acción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);  // La opción predeterminada

        // Procesar la opción seleccionada
        if (option == 0) {
            System.out.println("Cerrando sesión y saliendo del programa...");
            System.exit(0);  // Cierra el programa
        } else if (option == 1) {
            this.setVisible(false);
            Login obj = new Login();
            obj.setSize(790, 500);
            obj.setVisible(true);
            obj.setLocationRelativeTo(null);
        }

    }//GEN-LAST:event_btnCerrarSesionMouseClicked

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
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barNavMov;
    private javax.swing.JPanel bgHomeScreen;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JButton btnExportarPDF;
    // End of variables declaration//GEN-END:variables
}
