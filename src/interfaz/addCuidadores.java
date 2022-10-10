package interfaz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import zoo.Cuidador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class addCuidadores extends javax.swing.JFrame {
    ArrayList <Cuidador> lista;
    /**
     * Creates new form addCuidadores
     */
    public addCuidadores() {
        initComponents();
        lista = new ArrayList<Cuidador>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        capa0 = new javax.swing.JPanel();
        addCuidador = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        jTFNombreCuidador = new javax.swing.JTextField();
        JLApellidos = new javax.swing.JLabel();
        jTFApe = new javax.swing.JTextField();
        JLEspecialidad = new javax.swing.JLabel();
        jTFNumCuidador = new javax.swing.JTextField();
        JLNum1 = new javax.swing.JLabel();
        jComboBoxEspecialidad = new javax.swing.JComboBox<>();
        jButtonAdd = new javax.swing.JButton();
        jButtonGuardarCuidadores = new javax.swing.JButton();
        jButtonCargarCuidadores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        capa0.setBackground(new java.awt.Color(255, 255, 255));
        capa0.setPreferredSize(new java.awt.Dimension(800, 600));
        java.awt.GridBagLayout capa0Layout = new java.awt.GridBagLayout();
        capa0Layout.columnWidths = new int[] {0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0, 35, 0};
        capa0Layout.rowHeights = new int[] {0, 32, 0, 32, 0, 32, 0, 32, 0, 32, 0, 32, 0, 32, 0};
        capa0.setLayout(capa0Layout);

        addCuidador.setBackground(new java.awt.Color(255, 255, 255));
        addCuidador.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        addCuidador.setForeground(new java.awt.Color(51, 51, 51));
        addCuidador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addCuidador.setText("Añadir cuidador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        capa0.add(addCuidador, gridBagConstraints);

        JLNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        JLNombre.setForeground(new java.awt.Color(51, 51, 51));
        JLNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLNombre.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        capa0.add(JLNombre, gridBagConstraints);

        jTFNombreCuidador.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        capa0.add(jTFNombreCuidador, gridBagConstraints);

        JLApellidos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        JLApellidos.setForeground(new java.awt.Color(51, 51, 51));
        JLApellidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLApellidos.setText("Apellidos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        capa0.add(JLApellidos, gridBagConstraints);

        jTFApe.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        capa0.add(jTFApe, gridBagConstraints);

        JLEspecialidad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        JLEspecialidad.setForeground(new java.awt.Color(51, 51, 51));
        JLEspecialidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLEspecialidad.setText("Especialidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        capa0.add(JLEspecialidad, gridBagConstraints);

        jTFNumCuidador.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        capa0.add(jTFNumCuidador, gridBagConstraints);

        JLNum1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        JLNum1.setForeground(new java.awt.Color(51, 51, 51));
        JLNum1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JLNum1.setText("Nº Cuidador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        capa0.add(JLNum1, gridBagConstraints);

        jComboBoxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxEspecialidad.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        capa0.add(jComboBoxEspecialidad, gridBagConstraints);

        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14_Add-512.png"))); // NOI18N
        jButtonAdd.setText("Añadir");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        capa0.add(jButtonAdd, gridBagConstraints);

        jButtonGuardarCuidadores.setText("Guardar");
        jButtonGuardarCuidadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCuidadoresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        capa0.add(jButtonGuardarCuidadores, gridBagConstraints);

        jButtonCargarCuidadores.setText("Cargar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        capa0.add(jButtonCargarCuidadores, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(capa0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(capa0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
    
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonGuardarCuidadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCuidadoresActionPerformed
        try{
            util.util.guardar(lista, "Cuidadores.dat");
        }catch (IOException ex){
                JOptionPane.showMessageDialog(null, "Archivo guardado correctamente");
        }
    }//GEN-LAST:event_jButtonGuardarCuidadoresActionPerformed

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
            java.util.logging.Logger.getLogger(addCuidadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCuidadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCuidadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCuidadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCuidadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLApellidos;
    private javax.swing.JLabel JLEspecialidad;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLNum1;
    private javax.swing.JLabel addCuidador;
    private javax.swing.JPanel capa0;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCargarCuidadores;
    private javax.swing.JButton jButtonGuardarCuidadores;
    private javax.swing.JComboBox<String> jComboBoxEspecialidad;
    private javax.swing.JTextField jTFApe;
    private javax.swing.JTextField jTFNombreCuidador;
    private javax.swing.JTextField jTFNumCuidador;
    // End of variables declaration//GEN-END:variables
}
