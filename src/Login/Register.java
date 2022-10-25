/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.Conexion;
import util.utilities;
import zoo.User;

/**
 *
 * @author Sergio
 */
public class Register extends javax.swing.JFrame {
    ArrayList users;
    Conexion miConexion = new Conexion("localhost","3306","zoo","zoologico","pepe");

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        users = new ArrayList();
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
        jButtonRegister = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelIniciarSesion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelPass = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jLabelNombre1 = new javax.swing.JLabel();
        jPasswordFieldConfirmar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegister.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabelIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelIniciarSesion.setForeground(new java.awt.Color(51, 51, 51));
        jLabelIniciarSesion.setText("Registrar");
        jPanel1.add(jLabelIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel2.setLayout(new java.awt.GridLayout(4, 1));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 153, 51));
        jLabelNombre.setText("Nombre:");
        jPanel2.add(jLabelNombre);

        jTextFieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombre.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 36), new java.awt.Color(0, 153, 51))); // NOI18N
        jTextFieldNombre.setMargin(new java.awt.Insets(0, 0, 1, 0));
        jPanel2.add(jTextFieldNombre);

        jLabelPass.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelPass.setForeground(new java.awt.Color(0, 153, 51));
        jLabelPass.setText("Contraseña");
        jPanel2.add(jLabelPass);

        jPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jPasswordField);

        jLabelNombre1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelNombre1.setForeground(new java.awt.Color(0, 153, 51));
        jLabelNombre1.setText("Confirmar");
        jPanel2.add(jLabelNombre1);

        jPasswordFieldConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldConfirmar.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jPasswordFieldConfirmar);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 370, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        String nombre = jTextFieldNombre.getText().trim();
        char[] pass = jPasswordField.getPassword();
        String passwd = new String (pass);
        char[] confirm = jPasswordFieldConfirmar.getPassword();
        String confirmar = new String (confirm);
        if(nombre.equals("")){
            JOptionPane.showMessageDialog(null, "Introduce el nombre");
        } 
        else if(pass.equals("")){
            JOptionPane.showMessageDialog(null, "La contraseña está vacía");
        }
        else if(!passwd.equals(confirmar)){
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }
        else{
            try {
                ResultSet rs1 =miConexion.getLogin("SELECT * FROM users WHERE USER = '"+nombre+"'");
                System.out.println(rs1);
                if(rs1==null){
                    String consulta = "Select * from users";
                    ResultSet rs = Conexion.getTablaRegistro(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, consulta);
                    //Irse a la ultima linea de la tabla
                    rs.moveToInsertRow();
                    //
                    rs.updateString("user",nombre);
                    rs.updateString("pass",passwd);
                    rs.insertRow();
                    //users.add(user);
                    JOptionPane.showMessageDialog(null, "Usuario añadido correctamente");
                    jTextFieldNombre.setText("");
                    jPasswordField.setText("");
                    jPasswordFieldConfirmar.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
    }//GEN-LAST:event_jButtonRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabelIniciarSesion;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordFieldConfirmar;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
