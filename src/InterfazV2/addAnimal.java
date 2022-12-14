package InterfazV2;


import com.sun.jdi.connect.spi.Connection;
import interfazFicheros.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zoo.Animal;
import util.Lista;
import util.utilities;
import zoo.Animal;
import util.Conexion;
import zoo.Especie;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class addAnimal extends javax.swing.JFrame implements Serializable{
    ArrayList<Animal> animales;
    Conexion miConexion;
    DefaultTableModel modelo;
    
    /**
     * Creates new form addAnimañ
     */
    public addAnimal() {
        initComponents();
        animales = new ArrayList<Animal>();
        miConexion = new Conexion("localhost","3306","zoologico","zoo","pepe");
        //Rellenamos la tabla de animales con los animales de la base de datos
        modelo = (DefaultTableModel) jTable1.getModel();
        try {
            String consulta = "SELECT animal.NOMBRE,animal.PESO,especie.NOMBRE_ESPECIE FROM animal, especie WHERE animal.ESPECIE=especie.ID_ESPECIE";
            ResultSet rsTabla = miConexion.getSelect(consulta);
            while(rsTabla.next()){
                modelo.addRow(new Object[] {rsTabla.getString(1),rsTabla.getString(3),rsTabla.getFloat(2)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(tableAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Rellenamos la caja de especies
        try{
            String consultaEspecie = "SELECT * FROM especie";
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            ResultSet rsEspecie = miConexion.getSelect(consultaEspecie);
            while (rsEspecie.next()){
                Especie esp = new Especie(rsEspecie.getInt(1),rsEspecie.getString(2));
                model.addElement(esp);
                System.out.println(rsEspecie.getInt(1)+rsEspecie.getString(2));
            }
            jComboBoxEspecie.setModel(model);
        }
        catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        LnombreAnimal = new javax.swing.JLabel();
        LespecieAnimal = new javax.swing.JLabel();
        LpesoAnimal = new javax.swing.JLabel();
        TNombreAnimal = new javax.swing.JTextField();
        SPesoAnimal = new javax.swing.JSpinner();
        JButtonAddAnimal = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonCargar = new javax.swing.JButton();
        jComboBoxEspecie = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Especie", "Peso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0};
        jPanel2Layout.rowHeights = new int[] {0, 25, 0, 25, 0, 25, 0, 25, 0, 25, 0, 25, 0};
        jPanel2.setLayout(jPanel2Layout);

        LnombreAnimal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LnombreAnimal.setForeground(new java.awt.Color(0, 153, 51));
        LnombreAnimal.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(LnombreAnimal, gridBagConstraints);

        LespecieAnimal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LespecieAnimal.setForeground(new java.awt.Color(0, 153, 51));
        LespecieAnimal.setText("Especie");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel2.add(LespecieAnimal, gridBagConstraints);

        LpesoAnimal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LpesoAnimal.setForeground(new java.awt.Color(0, 153, 51));
        LpesoAnimal.setText("Peso");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        jPanel2.add(LpesoAnimal, gridBagConstraints);

        TNombreAnimal.setBackground(new java.awt.Color(255, 255, 255));
        TNombreAnimal.setForeground(new java.awt.Color(0, 0, 0));
        TNombreAnimal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 102, 51))); // NOI18N
        TNombreAnimal.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel2.add(TNombreAnimal, gridBagConstraints);

        SPesoAnimal.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        SPesoAnimal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 102, 51))); // NOI18N
        SPesoAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SPesoAnimal.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanel2.add(SPesoAnimal, gridBagConstraints);

        JButtonAddAnimal.setBackground(new java.awt.Color(51, 51, 51));
        JButtonAddAnimal.setForeground(new java.awt.Color(255, 255, 255));
        JButtonAddAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        JButtonAddAnimal.setText("Añadir");
        JButtonAddAnimal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JButtonAddAnimal.setPreferredSize(new java.awt.Dimension(70, 22));
        JButtonAddAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAddAnimalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        jPanel2.add(JButtonAddAnimal, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Añadir animal");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel2.add(jLabel1, gridBagConstraints);

        jButtonCargar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCargar.setText("Cargar");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        jPanel2.add(jButtonCargar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel2.add(jComboBoxEspecie, gridBagConstraints);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonAddAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAddAnimalActionPerformed
        String nombre = TNombreAnimal.getText();
        String especie = Integer.toString(jComboBoxEspecie.getSelectedIndex());
        float peso = (float) SPesoAnimal.getValue();
        //(String name, String especie, String subespecie, float peso)
        if(nombre.equals("")){
            JOptionPane.showMessageDialog(null, "Introduce el nombre del animal");
        }
        else if(especie.equals("")){
            JOptionPane.showMessageDialog(null, "Introduce la especie del animal");
        }
        else if(peso==0){
            JOptionPane.showMessageDialog(null, "El peso no puede ser 0");
        }
        else{
            Animal animal = new Animal(nombre,especie,peso);
            animales.add(animal);
            //System.out.println(animales);
            JOptionPane.showMessageDialog(null, "Animal añadido correctamente");
            TNombreAnimal.setText("");
            SPesoAnimal.setValue(0);
            /*
            try {
                String consulta = "SELECT animal.NOMBRE,animal.PESO,especie.NOMBRE_ESPECIE FROM animal, especie WHERE animal.ESPECIE=especie.ID_ESPECIE";
                ResultSet rs1 =miConexion.getSelect(consulta);
                System.out.println(rs1);
                if(rs1==null){
                    ResultSet rs = Conexion.getTablaRegistro(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE, "Select * from users");
                    //Irse a la ultima linea de la tabla
                    rs.moveToInsertRow();
                    //
                    rs.updateString("user",nombre);
                    rs.updateString("pass",passwd);
                    rs.insertRow();
                    //users.add(user);
                    JOptionPane.showMessageDialog(null, "Usuario añadido correctamente");
                    TNombreAnimal.setText("");
                    SPesoAnimal.setValue(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
        }
    }//GEN-LAST:event_JButtonAddAnimalActionPerformed

    @Deprecated
    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        try{
            utilities.cargar(animales,"Animales.dat");
            JOptionPane.showMessageDialog(null, "Archivo cargado correctamente");
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Erorr al cargar el fichero");
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        }
    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Object item = jComboBoxEspecie.getSelectedItem();
        JOptionPane.showMessageDialog(this, ((Especie)item).getId());
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(addAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JButtonAddAnimal;
    private javax.swing.JLabel LespecieAnimal;
    private javax.swing.JLabel LnombreAnimal;
    private javax.swing.JLabel LpesoAnimal;
    private javax.swing.JSpinner SPesoAnimal;
    private javax.swing.JTextField TNombreAnimal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JComboBox<String> jComboBoxEspecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
