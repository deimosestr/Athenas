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
import javax.swing.JTextField;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    private boolean isPasswordVisible = false;

    public Login() {
        initComponents();
        homeScreen p1 = new homeScreen();
        p1.setSize(800, 500);
        p1.setLocationRelativeTo(null);
    }

    private void togglePasswordVisibility() {
        if (isPasswordVisible) {
            passwordField1.setEchoChar('•');
            showPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ver.png"))); // Icono de ojo cerrado
        } else {
            passwordField1.setEchoChar((char) 0);
            showPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/esconder.png"))); // Icono de ojo abierto
        }
        isPasswordVisible = !isPasswordVisible;
    }

    private void forgotPassword() {
        javax.swing.JTextField emailField = new javax.swing.JTextField();

        Object[] message = {
            "Correo:", emailField
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Recuperar contraseña", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String email = emailField.getText();

            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese su correo.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try (Connection conn = DatabaseConnection.getConnection()) {
                    String query = "SELECT username, password FROM users WHERE email = ?";
                    try (PreparedStatement stmt = conn.prepareStatement(query)) {
                        stmt.setString(1, email);
                        try (ResultSet rs = stmt.executeQuery()) {
                            if (rs.next()) {
                                String username = rs.getString("username");
                                String password = rs.getString("password");
                                JOptionPane.showMessageDialog(this, "Usuario: " + username + "\nContraseña: " + password, "Información de cuenta", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(this, "Correo no registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al recuperar la contraseña: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        }
    }

    private void registerUser() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JTextField emailField = new JTextField();

        Object[] fields = {
            "Usuario:", usernameField,
            "Contraseña:", passwordField,
            "Correo:", emailField
        };

        int option = JOptionPane.showConfirmDialog(null, fields, "Registrar Usuario", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String email = emailField.getText();

            String errorMessage = validateUserInput(username, password, email);
            if (errorMessage != null) {
                JOptionPane.showMessageDialog(this, errorMessage);
                return;
            }

            try (Connection conn = DatabaseConnection.getConnection()) {
                String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                pstmt.setString(3, email);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente.");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos.");
            }
        }
    }

    private String validateUserInput(String username, String password, String email) {
        if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
            return "Todos los campos son obligatorios.";
        }

        if (!isUsernameValid(username)) {
            return "El usuario debe tener entre 5 y 15 caracteres.";
        }

        if (!isPasswordValid(password)) {
            return "La contraseña debe tener entre 8 y 20 caracteres, al menos una letra mayúscula, una letra minúscula, un número y un carácter especial.";
        }

        if (!isEmailValid(email)) {
            return "El correo electrónico no es válido.";
        }

        return null;
    }

    private boolean isUsernameValid(String username) {
        return username.length() >= 4 && username.length() <= 15;
    }

    private boolean isPasswordValid(String password) {
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*[a-z].*")) {
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            return false;
        }
        return true;
    }

    private boolean isEmailValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logoLeft = new javax.swing.JLabel();
        ciudadBg = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        barNaviMov = new javax.swing.JPanel();
        logoPrin = new javax.swing.JLabel();
        iniciarSesionTxt = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JLabel();
        usuarioField = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        enterBtn = new javax.swing.JPanel();
        enterTxt = new javax.swing.JLabel();
        registerBtn = new javax.swing.JPanel();
        registerTxt = new javax.swing.JLabel();
        forgotPass = new javax.swing.JLabel();
        showPasswordBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/logo_sinfondo.png"))); // NOI18N
        bg.add(logoLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 100, 80));

        ciudadBg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ciudadBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Designer.jpeg"))); // NOI18N
        bg.add(ciudadBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 340, 510));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        exitTxt.setBackground(new java.awt.Color(255, 255, 255));
        exitTxt.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(0, 0, 0));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        barNaviMov.setBackground(new java.awt.Color(255, 255, 255));
        barNaviMov.setForeground(new java.awt.Color(255, 255, 255));
        barNaviMov.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barNaviMovMouseDragged(evt);
            }
        });
        barNaviMov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barNaviMovMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barNaviMovLayout = new javax.swing.GroupLayout(barNaviMov);
        barNaviMov.setLayout(barNaviMovLayout);
        barNaviMovLayout.setHorizontalGroup(
            barNaviMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        barNaviMovLayout.setVerticalGroup(
            barNaviMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(barNaviMov, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        logoPrin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/logoMin.jpg"))); // NOI18N
        logoPrin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bg.add(logoPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 70));

        iniciarSesionTxt.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        iniciarSesionTxt.setForeground(new java.awt.Color(0, 0, 0));
        iniciarSesionTxt.setText("INICIAR SESIÓN");
        bg.add(iniciarSesionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        usuarioTxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        usuarioTxt.setForeground(new java.awt.Color(0, 0, 0));
        usuarioTxt.setText("USUARIO");
        bg.add(usuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, -1));

        usuarioField.setForeground(new java.awt.Color(153, 153, 153));
        usuarioField.setText("Ingrese su usuario");
        usuarioField.setBorder(null);
        usuarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioFieldMousePressed(evt);
            }
        });
        bg.add(usuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 350, 30));

        passwordTxt.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(0, 0, 0));
        passwordTxt.setText("CONTRASEÑA");
        bg.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 130, -1));

        passwordField1.setForeground(new java.awt.Color(153, 153, 153));
        passwordField1.setText("********");
        passwordField1.setBorder(null);
        passwordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordField1MousePressed(evt);
            }
        });
        bg.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 350, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 380, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 380, 10));

        enterBtn.setBackground(new java.awt.Color(197, 172, 204));
        enterBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        enterTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        enterTxt.setForeground(new java.awt.Color(0, 0, 0));
        enterTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterTxt.setText("ENTRAR");
        enterTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout enterBtnLayout = new javax.swing.GroupLayout(enterBtn);
        enterBtn.setLayout(enterBtnLayout);
        enterBtnLayout.setHorizontalGroup(
            enterBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enterBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        enterBtnLayout.setVerticalGroup(
            enterBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enterBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(enterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 110, 40));

        registerBtn.setBackground(new java.awt.Color(197, 172, 204));
        registerBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        registerTxt.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        registerTxt.setForeground(new java.awt.Color(0, 0, 0));
        registerTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerTxt.setText("REGISTRAR");
        registerTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout registerBtnLayout = new javax.swing.GroupLayout(registerBtn);
        registerBtn.setLayout(registerBtnLayout);
        registerBtnLayout.setHorizontalGroup(
            registerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        registerBtnLayout.setVerticalGroup(
            registerBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        bg.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 110, 40));

        forgotPass.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        forgotPass.setForeground(new java.awt.Color(0, 0, 0));
        forgotPass.setText("¿Olvidaste tu contraseña?");
        forgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassMouseClicked(evt);
            }
        });
        bg.add(forgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        showPasswordBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPasswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ver.png"))); // NOI18N
        showPasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordBtnMouseClicked(evt);
            }
        });
        bg.add(showPasswordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerTxtMouseExited
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON
        registerBtn.setBackground(new Color(197, 172, 204));
        registerTxt.setForeground(Color.black);
    }//GEN-LAST:event_registerTxtMouseExited

    private void registerTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerTxtMouseEntered
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON
        registerBtn.setBackground(new Color(96, 52, 105));
        registerTxt.setForeground(Color.white);
    }//GEN-LAST:event_registerTxtMouseEntered

    private void enterTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterTxtMouseExited
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON
        enterBtn.setBackground(new Color(197, 172, 204));
        enterTxt.setForeground(Color.black);
    }//GEN-LAST:event_enterTxtMouseExited

    private void enterTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterTxtMouseEntered
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON
        enterBtn.setBackground(new Color(96, 52, 105));
        enterTxt.setForeground(Color.white);
    }//GEN-LAST:event_enterTxtMouseEntered

    private void enterTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterTxtMouseClicked
        // AQUI VA EL METODO DONDE AL HACER CLICK VALIDA EL USUARIO
        String username = usuarioField.getText();
        String password = new String(passwordField1.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña no pueden estar vacíos.");
            return;
        }

        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login exitoso");
                // Abrir la nueva ventana después de un login exitoso
                menuw8 mainFrame = new menuw8();
                mainFrame.setVisible(true);
                this.dispose(); // Cerrar la ventana de login actual
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos.");
        }
    }//GEN-LAST:event_enterTxtMouseClicked


    private void passwordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordField1MousePressed
        if (String.valueOf(passwordField1.getPassword()).equals("********")) {
            passwordField1.setText("");
            passwordField1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_passwordField1MousePressed

    private void usuarioFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioFieldMousePressed
        if (usuarioField.getText().equals("Ingrese su usuario")) {
            usuarioField.setText("");
            usuarioField.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_usuarioFieldMousePressed

    private void barNaviMovMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barNaviMovMousePressed
        // MOVER VENTANA --
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barNaviMovMousePressed

    private void barNaviMovMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barNaviMovMouseDragged
        // MOVER VENTANA --
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barNaviMovMouseDragged

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON --
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        // EVENTO QUE CAMBIA EL COLOR DEL FONDO DEL BOTON --
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        // BOTON DE SALIDA --
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void registerTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerTxtMouseClicked
        // TODO add your handling code here:
        registerUser();
    }//GEN-LAST:event_registerTxtMouseClicked

    private void forgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassMouseClicked
        // TODO add your handling code here:
        forgotPassword();
    }//GEN-LAST:event_forgotPassMouseClicked

    private void showPasswordBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordBtnMouseClicked
        // TODO add your handling code here:
        togglePasswordVisibility();
    }//GEN-LAST:event_showPasswordBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barNaviMov;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel ciudadBg;
    private javax.swing.JPanel enterBtn;
    private javax.swing.JLabel enterTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel forgotPass;
    private javax.swing.JLabel iniciarSesionTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoLeft;
    private javax.swing.JLabel logoPrin;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JPanel registerBtn;
    private javax.swing.JLabel registerTxt;
    private javax.swing.JLabel showPasswordBtn;
    private javax.swing.JTextField usuarioField;
    private javax.swing.JLabel usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
