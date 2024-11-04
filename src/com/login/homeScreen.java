package com.login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        barNavMov = new javax.swing.JPanel();
        logoDerecha = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        contentNOM2 = new javax.swing.JPanel();
        contentNOM4 = new javax.swing.JPanel();
        contentNOM1 = new javax.swing.JPanel();
        contentNom1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCargar = new javax.swing.JButton();
        btnEnviarDatos = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(750, 510));
        setResizable(false);

        bgHomeScreen.setBackground(new java.awt.Color(255, 255, 255));
        bgHomeScreen.setMinimumSize(new java.awt.Dimension(790, 510));
        bgHomeScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bgHomeScreen.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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

        logoDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/lgo.jpg"))); // NOI18N

        javax.swing.GroupLayout barNavMovLayout = new javax.swing.GroupLayout(barNavMov);
        barNavMov.setLayout(barNavMovLayout);
        barNavMovLayout.setHorizontalGroup(
            barNavMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barNavMovLayout.createSequentialGroup()
                .addContainerGap(654, Short.MAX_VALUE)
                .addComponent(logoDerecha)
                .addGap(18, 18, 18))
        );
        barNavMovLayout.setVerticalGroup(
            barNavMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barNavMovLayout.createSequentialGroup()
                .addComponent(logoDerecha, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        bgHomeScreen.add(barNavMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(610, 400));
        content.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout contentNOM2Layout = new javax.swing.GroupLayout(contentNOM2);
        contentNOM2.setLayout(contentNOM2Layout);
        contentNOM2Layout.setHorizontalGroup(
            contentNOM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        contentNOM2Layout.setVerticalGroup(
            contentNOM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        content.add(contentNOM2, "card2");

        javax.swing.GroupLayout contentNOM4Layout = new javax.swing.GroupLayout(contentNOM4);
        contentNOM4.setLayout(contentNOM4Layout);
        contentNOM4Layout.setHorizontalGroup(
            contentNOM4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        contentNOM4Layout.setVerticalGroup(
            contentNOM4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        content.add(contentNOM4, "card2");

        contentNOM1.setBackground(new java.awt.Color(255, 255, 255));
        contentNOM1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contentNom1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout contentNom1Layout = new javax.swing.GroupLayout(contentNom1);
        contentNom1.setLayout(contentNom1Layout);
        contentNom1Layout.setHorizontalGroup(
            contentNom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentNom1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        contentNom1Layout.setVerticalGroup(
            contentNom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentNom1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );

        contentNOM1.add(contentNom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 570, 310));

        btnCargar.setText("MOSTRAR");
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarMouseClicked(evt);
            }
        });
        contentNOM1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        btnEnviarDatos.setText("ENVIAR");
        btnEnviarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarDatosMouseClicked(evt);
            }
        });
        contentNOM1.add(btnEnviarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 390, 90, -1));

        content.add(contentNOM1, "card2");

        bgHomeScreen.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 610, 440));

        home.setText("INICIO");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        bgHomeScreen.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgHomeScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgHomeScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

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

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        // TODO add your handling code here:
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON --
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON --
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
        // Inicializamos la conexión a la base de datos
        java.sql.Connection con = null;

        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel(new Object[]{
            "ID", "ubicacion", "ultima fecha de recarga", "proxima recarga", "capacidad (kgs)",
            "tipo de agente extinguidor", "manguera", "manometro", "soporte", "presion",
            "cilindro", "limpieza", "señalizacion", "etiqueta", "seguro",
            "obstruccion", "observaciones"}, 0) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return (columnIndex >= 6 && columnIndex <= 15) ? Boolean.class : String.class;
            }
        };

        // Configuramos el modelo en jTable1
        jTable1.setModel(model);

        try {
            // Conexión y consulta a la base de datos
            con = DatabaseConnection.getConnection();
            String query = "SELECT * FROM seguridad";
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Iteramos sobre el ResultSet para extraer los datos
            while (rs.next()) {
                String id = rs.getString("id");
                String ubicacion = rs.getString("ubicacion");
                String uFecha = rs.getString("ultima_fecha_recarga");
                String pFecha = rs.getString("proxima_recarga");
                String capacidad = rs.getString("capacidad_kgs");
                String taExtinguidor = rs.getString("tipo_agente_extinguidor");
                boolean manguera = rs.getBoolean("manguera");
                boolean manometro = rs.getBoolean("manometro");
                boolean soporte = rs.getBoolean("soporte");
                boolean presion = rs.getBoolean("presion");
                boolean cilindro = rs.getBoolean("cilindro");
                boolean limpieza = rs.getBoolean("limpieza");
                boolean senalizacion = rs.getBoolean("senalizacion");
                boolean etiqueta = rs.getBoolean("etiqueta");
                boolean seguro = rs.getBoolean("seguro");
                boolean obstruccion = rs.getBoolean("obstruccion");
                String observaciones = rs.getString("observaciones");

                // Añadir fila al modelo
                model.addRow(new Object[]{
                    id, ubicacion, uFecha, pFecha, capacidad, taExtinguidor,
                    manguera, manometro, soporte, presion, cilindro,
                    limpieza, senalizacion, etiqueta, seguro, obstruccion, observaciones
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCargarMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        contentNOM1.setVisible(true);
        contentNOM2.setVisible(false);
        contentNOM4.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void btnEnviarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarDatosMouseClicked
        // TODO add your handling code here:
        java.sql.Connection con = null;
        try {
            // Conectar a la base de datos
            con = DatabaseConnection.getConnection();

            // Preparar la consulta de actualización SQL
            String updateQuery = "UPDATE public.seguridad SET herramienta1 = ?, herramienta2 = ? WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(updateQuery);

            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Iterar sobre todas las filas de la tabla
            for (int row = 0; row < model.getRowCount(); row++) {
                String id = model.getValueAt(row, 0).toString();  // Obtener el valor de la columna "ID"
                boolean herramienta1 = (Boolean) model.getValueAt(row, 1);  // Valor de "herramienta1"
                boolean herramienta2 = (Boolean) model.getValueAt(row, 2);  // Valor de "herramienta2"

                // Asignar los valores a los parámetros de la consulta
                pstmt.setBoolean(1, herramienta1);  // Set herramienta1
                pstmt.setBoolean(2, herramienta2);  // Set herramienta2
                pstmt.setString(3, id);  // Set ID

                // Ejecutar la consulta de actualización
                pstmt.executeUpdate();
            }

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Datos actualizados en la base de datos exitosamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar los datos: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();  // Cerrar la conexión a la base de datos
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEnviarDatosMouseClicked

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
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEnviarDatos;
    private javax.swing.JPanel content;
    private javax.swing.JPanel contentNOM1;
    private javax.swing.JPanel contentNOM2;
    private javax.swing.JPanel contentNOM4;
    private javax.swing.JPanel contentNom1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JButton home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoDerecha;
    // End of variables declaration//GEN-END:variables
}
