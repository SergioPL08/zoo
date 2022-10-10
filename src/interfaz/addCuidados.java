package interfaz;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.transform.OutputKeys;
import zoo.*;
import util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sergio
 */
public class addCuidados extends javax.swing.JFrame {

    ArrayList<Animal> animal;

    
    /**
     * Creates new form addCuid
     */
    public addCuidados() {
        initComponents();
        animal = new ArrayList<Animal>();
        rellenaAnimales();
    }

    public void rellenaAnimales(){
        try {
                animal = util.cargar(animal, "Animales.dat");
                Iterator iter = animal.iterator();
                String [] listaAnimales = new String[animal.size()];
                int i = 0;
                while(iter.hasNext()){
                    Animal a = (Animal)iter.next();
                    listaAnimales[i]=a.getName();
                    //System.out.println(listaAnimales[i]);
                    i++;
                }
                //System.out.println(listaAnimales.length);
                jComboBoxjAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(listaAnimales));
                
            }
            catch(IOException f){
                JOptionPane.showMessageDialog(null,f.getMessage());
            }
            catch (ClassNotFoundException ex) {
                Logger.getLogger(addCuidados.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
        
    /*
        public void guardar(){
            try{
                FileOutputStream fis = new FileOutputStream ("animales.dat");
                ObjectOutputStream os = new ObjectOutputStream(fis);
                for(int i=0; i<animal.size();i++){
                    os.writeObject(animal.get(i));
                }
                os.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(addCuidados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(addCuidados.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    */
    
    
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
        LTipoComida = new javax.swing.JLabel();
        LHabitat = new javax.swing.JLabel();
        LsubespecieAnimal = new javax.swing.JLabel();
        LAnimal = new javax.swing.JLabel();
        TTipoComida = new javax.swing.JTextField();
        THabitat = new javax.swing.JTextField();
        SPrecioMedio = new javax.swing.JSpinner();
        addCuidado = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        SPeriodicidad = new javax.swing.JSpinner();
        LCantidadComida1 = new javax.swing.JLabel();
        SCantidadComida1 = new javax.swing.JSpinner();
        LPeridiocidad1 = new javax.swing.JLabel();
        jComboBoxjAnimal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 6, 0, 6, 0, 6, 0, 6, 0, 6, 0, 6, 0};
        jPanel1Layout.rowHeights = new int[] {0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0, 8, 0};
        jPanel1.setLayout(jPanel1Layout);

        LTipoComida.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LTipoComida.setForeground(new java.awt.Color(51, 51, 51));
        LTipoComida.setText("Tipo Comida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanel1.add(LTipoComida, gridBagConstraints);

        LHabitat.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LHabitat.setForeground(new java.awt.Color(51, 51, 51));
        LHabitat.setText("Habitat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        jPanel1.add(LHabitat, gridBagConstraints);

        LsubespecieAnimal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LsubespecieAnimal.setForeground(new java.awt.Color(51, 51, 51));
        LsubespecieAnimal.setText("Precio Medio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        jPanel1.add(LsubespecieAnimal, gridBagConstraints);

        LAnimal.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LAnimal.setForeground(new java.awt.Color(51, 51, 51));
        LAnimal.setText("Animal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 48;
        jPanel1.add(LAnimal, gridBagConstraints);

        TTipoComida.setPreferredSize(new java.awt.Dimension(100, 24));
        TTipoComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTipoComidaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 8;
        jPanel1.add(TTipoComida, gridBagConstraints);

        THabitat.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 16;
        jPanel1.add(THabitat, gridBagConstraints);

        SPrecioMedio.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        SPrecioMedio.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 24;
        jPanel1.add(SPrecioMedio, gridBagConstraints);

        addCuidado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/14_Add-512.png"))); // NOI18N
        addCuidado.setText("Añadir");
        addCuidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCuidadoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 52;
        gridBagConstraints.gridwidth = 9;
        jPanel1.add(addCuidado, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Añadir cuidado");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel1, gridBagConstraints);

        SPeriodicidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        SPeriodicidad.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 40;
        jPanel1.add(SPeriodicidad, gridBagConstraints);

        LCantidadComida1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LCantidadComida1.setForeground(new java.awt.Color(51, 51, 51));
        LCantidadComida1.setText("Cantidad Comida (kg)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        jPanel1.add(LCantidadComida1, gridBagConstraints);

        SCantidadComida1.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));
        SCantidadComida1.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 32;
        jPanel1.add(SCantidadComida1, gridBagConstraints);

        LPeridiocidad1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LPeridiocidad1.setForeground(new java.awt.Color(51, 51, 51));
        LPeridiocidad1.setText("Periodicidad Comida (veces al día)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 40;
        jPanel1.add(LPeridiocidad1, gridBagConstraints);

        jComboBoxjAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 48;
        jPanel1.add(jComboBoxjAnimal, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TTipoComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTipoComidaActionPerformed
        
    }//GEN-LAST:event_TTipoComidaActionPerformed

    private void addCuidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCuidadoActionPerformed
        String tipoComida = TTipoComida.getText();
        String habitat = THabitat.getText();
        float cantComida = (float) SCantidadComida1.getValue();
        float precioMedio = (float) SPrecioMedio.getValue();
        int periodicidad = (int) SPeriodicidad.getValue();
        //Animal an.get = jComboBoxjAnimal.getSelectedIndex();
        if(tipoComida.equals("")){
            JOptionPane.showInputDialog(null, "Los animales no viven del aire, ¿sabes?");
        }
        else if(habitat.equals("")){
            JOptionPane.showInputDialog(null,"Los animales viven no viven en el espacio");
        }
        else{
            //(String tipoComida, String habitat, float costePromedio, float cantidadComidaKG, int periodicidadComidaDias)
            Cuidados cuidado = new Cuidados(tipoComida, habitat, precioMedio, cantComida, periodicidad);
        }
            
        
    }//GEN-LAST:event_addCuidadoActionPerformed

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
            java.util.logging.Logger.getLogger(addCuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCuidados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCuidados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LAnimal;
    private javax.swing.JLabel LCantidadComida1;
    private javax.swing.JLabel LHabitat;
    private javax.swing.JLabel LPeridiocidad1;
    private javax.swing.JLabel LTipoComida;
    private javax.swing.JLabel LsubespecieAnimal;
    private javax.swing.JSpinner SCantidadComida1;
    private javax.swing.JSpinner SPeriodicidad;
    private javax.swing.JSpinner SPrecioMedio;
    private javax.swing.JTextField THabitat;
    private javax.swing.JTextField TTipoComida;
    private javax.swing.JToggleButton addCuidado;
    private javax.swing.JComboBox<String> jComboBoxjAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
