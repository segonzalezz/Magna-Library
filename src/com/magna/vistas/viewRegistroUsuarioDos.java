/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.magna.vistas;


import com.magna.controlador.ControladorRegistroRol;
import com.magna.controlador.ControladorRegistroUsuario;
import com.magna.excepciones.UsuarioDuplicadoException;
import com.magna.modelo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Alzate
 */
public class viewRegistroUsuarioDos extends javax.swing.JFrame {

    ControladorRegistroUsuario controlador;
    ControladorRegistroRol controladorDos;
    public viewRegistroUsuarioDos() {
        initComponents();
        setLocationRelativeTo(this);
        controlador = new ControladorRegistroUsuario();
        controladorDos = new ControladorRegistroRol();
        controladorDos.cargarRolesComboBoxSinAdmi(jComboBoxR);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtNombreP7 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        txtEdadP7 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtCedulaP7 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        txtDireccionP7 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtUserU7 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txtPasswordU7 = new javax.swing.JPasswordField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel82 = new javax.swing.JLabel();
        jComboBoxR7 = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        txtEdadP = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        txtCedulaP = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txtDireccionP = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        txtUserU = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        txtPasswordU = new javax.swing.JPasswordField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel92 = new javax.swing.JLabel();
        jComboBoxR = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        btnRegistrarU = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N

        jLabel74.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel74.setText("Ingrese nombre, edad, cedula y dirección:");

        jLabel75.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel75.setText("Nombre:");

        jLabel76.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel76.setText("Edad:");

        jLabel77.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel77.setText("Cedula:");

        jLabel78.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel78.setText("Dirección:");

        jLabel79.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel79.setText("Ingrese usuario y contraseña:");

        jLabel80.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel80.setText("Usuario:");

        jLabel81.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel81.setText("Contraseña:");

        jLabel82.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel82.setText("Seleccione el rol:");

        jComboBoxR7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator15)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel76))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedulaP7)
                            .addComponent(txtEdadP7)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addGap(16, 16, 16)
                        .addComponent(txtNombreP7))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPasswordU7))
                    .addComponent(jSeparator16)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionP7))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel80)
                                .addGap(26, 26, 26)
                                .addComponent(txtUserU7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel73)
                            .addComponent(jLabel74)
                            .addComponent(jLabel79)
                            .addComponent(jLabel82))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBoxR7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(txtNombreP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(txtEdadP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txtCedulaP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(txtDireccionP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(txtUserU7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(txtPasswordU7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxR7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 51));
        btnRegistrar.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12))); // NOI18N

        jLabel84.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel84.setText("Ingrese nombre, edad, cedula y dirección:");

        jLabel85.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel85.setText("Nombre:");

        txtNombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePKeyTyped(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel86.setText("Edad:");

        txtEdadP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadPKeyTyped(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel87.setText("Cedula:");

        txtCedulaP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaPKeyTyped(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel88.setText("Dirección:");

        jLabel89.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel89.setText("Ingrese usuario y contraseña:");

        jLabel90.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel90.setText("Usuario:");

        jLabel91.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel91.setText("Contraseña:");

        jLabel92.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel92.setText("Seleccione el rol:");

        jComboBoxR.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jComboBoxR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator17)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel87)
                            .addComponent(jLabel86))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedulaP)
                            .addComponent(txtEdadP)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addGap(16, 16, 16)
                        .addComponent(txtNombreP))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPasswordU))
                    .addComponent(jSeparator18)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccionP))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel90)
                                .addGap(26, 26, 26)
                                .addComponent(txtUserU, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel83)
                            .addComponent(jLabel84)
                            .addComponent(jLabel89)
                            .addComponent(jLabel92))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBoxR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(txtEdadP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtCedulaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(txtDireccionP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(txtUserU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(txtPasswordU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 0, 0));

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Registrar Usuario");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnRegistrarU.setBackground(new java.awt.Color(0, 153, 51));
        btnRegistrarU.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnRegistrarU.setText("Registrar");
        btnRegistrarU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarU, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarU)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");

        jMenuItem1.setText("Atras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        viewInicio viewInicio = new viewInicio();
        viewInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnRegistrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUActionPerformed
        String nom_persona = txtNombreP.getText();
        int ed_persona = Integer.valueOf(txtEdadP.getText());
        String ced_persona = txtCedulaP.getText();
        String dir_persona = txtDireccionP.getText();
        String user_u = txtUserU.getText();
        String pass_u = txtPasswordU.getText();
        String selectedValue = jComboBoxR.getSelectedItem().toString();
        String[] partes = selectedValue.split(" - ");
        String cod_rol = partes[0];
        Usuario usuario = new Usuario(nom_persona, ed_persona, ced_persona, dir_persona, user_u, pass_u, cod_rol);
        try {
            if (controlador.registrarU(usuario)) {
                JOptionPane.showMessageDialog(null, "Se registró el usuario correctamente con cedula: " + ced_persona);
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "No se registró el usuario con cedula: " + ced_persona);
            }
        } catch (UsuarioDuplicadoException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarUActionPerformed

    private void jComboBoxRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRActionPerformed

    }//GEN-LAST:event_jComboBoxRActionPerformed

    private void txtNombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePKeyTyped
       if(!(Character.isLetter(evt.getKeyChar()))){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombrePKeyTyped

    private void txtEdadPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadPKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadPKeyTyped

    private void txtCedulaPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaPKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaPKeyTyped

    private void limpiarCampos(){
        txtNombreP.setText("");
        txtEdadP.setText("");
        txtCedulaP.setText("");
        txtDireccionP.setText("");
        txtUserU.setText("");
        txtPasswordU.setText("");
        jComboBoxR.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(viewRegistroUsuarioDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewRegistroUsuarioDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewRegistroUsuarioDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewRegistroUsuarioDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewRegistroUsuarioDos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarU;
    private javax.swing.JComboBox<String> jComboBoxR;
    private javax.swing.JComboBox<String> jComboBoxR7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JTextField txtCedulaP;
    private javax.swing.JTextField txtCedulaP7;
    private javax.swing.JTextField txtDireccionP;
    private javax.swing.JTextField txtDireccionP7;
    private javax.swing.JTextField txtEdadP;
    private javax.swing.JTextField txtEdadP7;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextField txtNombreP7;
    private javax.swing.JPasswordField txtPasswordU;
    private javax.swing.JPasswordField txtPasswordU7;
    private javax.swing.JTextField txtUserU;
    private javax.swing.JTextField txtUserU7;
    // End of variables declaration//GEN-END:variables
}
