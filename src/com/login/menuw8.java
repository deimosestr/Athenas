/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Alan
 */
public class menuw8 extends javax.swing.JFrame {

     FondoPanel fondo = new FondoPanel();
    public menuw8() {
        
        
        
        //Aplicar transparencias
        setUndecorated(true);
        setBackground(new Color(255, 255, 255,255));
        
        initComponents();

        
this.setSize(800, 500);  // Solo si quieres cambiar el tamaño por código       
jPanel1.setOpaque(false);
        

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        buttons3 = new com.login.buttons();
        buttons4 = new com.login.buttons();
        buttons5 = new com.login.buttons();
        buttons7 = new com.login.buttons();
        buttons8 = new com.login.buttons();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 305));
        setMinimumSize(new java.awt.Dimension(550, 305));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/fond.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -140, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Inicio");

        buttons3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/seguridad.png"))); // NOI18N
        buttons3.setText("Seguridad");
        buttons3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        buttons3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttons3.setRadius(20);
        buttons3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttons3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttons3ActionPerformed(evt);
            }
        });

        buttons4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/salud.png"))); // NOI18N
        buttons4.setText("Salud");
        buttons4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        buttons4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttons4.setRadius(20);
        buttons4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttons4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttons4ActionPerformed(evt);
            }
        });

        buttons5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/acerca de.png"))); // NOI18N
        buttons5.setText("Acerca de");
        buttons5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        buttons5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttons5.setRadius(20);
        buttons5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttons5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttons5ActionPerformed(evt);
            }
        });

        buttons7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/capa.png"))); // NOI18N
        buttons7.setText("Capacitacion");
        buttons7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        buttons7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttons7.setRadius(20);
        buttons7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttons7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttons7ActionPerformed(evt);
            }
        });

        buttons8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/organizacion.png"))); // NOI18N
        buttons8.setText("Organizacion");
        buttons8.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        buttons8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttons8.setRadius(20);
        buttons8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttons8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttons8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttons8, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(buttons3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttons7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttons5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttons4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)))
                .addContainerGap(528, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttons3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttons4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttons5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttons8, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addComponent(buttons7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 652, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttons5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttons5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttons5ActionPerformed

    private void buttons3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttons3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttons3ActionPerformed

    private void buttons4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttons4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttons4ActionPerformed

    private void buttons7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttons7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttons7ActionPerformed

    private void buttons8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttons8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttons8ActionPerformed

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
            java.util.logging.Logger.getLogger(menuw8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuw8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuw8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuw8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuw8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.login.buttons buttons3;
    private com.login.buttons buttons4;
    private com.login.buttons buttons5;
    private com.login.buttons buttons7;
    private com.login.buttons buttons8;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel{
    private Image imagen;
    
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("/com/imagenes/fondo.jpeg")).getImage();
        g.drawImage(imagen,0,0,getWidth(), getHeight(),this);
        
        setOpaque (false);
        
        super.paint(g);
    }
    }


}
