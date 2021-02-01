/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ActividadGrand;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class frmActividadDosGrand extends javax.swing.JFrame {

    /**
     * Creates new form frmActividadDos
     */
    public frmActividadDosGrand() {
        initComponents();
        ImageIcon delfin = new ImageIcon("src/com/Recursos/House/1 Living room sala.png");
        Icon icono1 = new ImageIcon(delfin.getImage().getScaledInstance(jlblLivingroom.getWidth(), jlblLivingroom.getHeight(), Image.SCALE_SMOOTH));
        jlblLivingroom.setIcon(icono1);
        this.repaint();
        
        ImageIcon delfin6 = new ImageIcon("src/com/Recursos/House/6 Garden jardin.png");
        Icon icono6 = new ImageIcon(delfin6.getImage().getScaledInstance(jlblGarden.getWidth(), jlblGarden.getHeight(), Image.SCALE_SMOOTH));
        jlblGarden.setIcon(icono6);
        this.repaint();
        
        ImageIcon delfin7 = new ImageIcon("src/com/Recursos/House/7 attic atico.png");
        Icon icono7 = new ImageIcon(delfin7.getImage().getScaledInstance(jlblAttic.getWidth(), jlblAttic.getHeight(), Image.SCALE_SMOOTH));
        jlblAttic.setIcon(icono7);
        this.repaint();
        
        ImageIcon delfin3 = new ImageIcon("src/com/Recursos/House/3 Bathroom baño.png");
        Icon icono3 = new ImageIcon(delfin3.getImage().getScaledInstance(jlblBathroom.getWidth(), jlblBathroom.getHeight(), Image.SCALE_SMOOTH));
        jlblBathroom.setIcon(icono3);
        this.repaint();
        
        ImageIcon delfin5 = new ImageIcon("src/com/Recursos/House/5 Kitchen cocina.png");
        Icon icono5 = new ImageIcon(delfin5.getImage().getScaledInstance(jlblKitchen.getWidth(), jlblKitchen.getHeight(), Image.SCALE_SMOOTH));
        jlblKitchen.setIcon(icono5);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jlblAttic = new javax.swing.JLabel();
        jrbAttic2 = new javax.swing.JRadioButton();
        jrbGarden2 = new javax.swing.JRadioButton();
        jrbBathroom = new javax.swing.JRadioButton();
        jlblGarden = new javax.swing.JLabel();
        jrbKitchen = new javax.swing.JRadioButton();
        jrbAttic = new javax.swing.JRadioButton();
        jrbGarden = new javax.swing.JRadioButton();
        jlblLivingroom = new javax.swing.JLabel();
        jrbLivingroom = new javax.swing.JRadioButton();
        jrbBedroom = new javax.swing.JRadioButton();
        jlblOrden_actividad = new javax.swing.JLabel();
        jlblTitulo_actividad = new javax.swing.JLabel();
        jrbDiningroom = new javax.swing.JRadioButton();
        jlblOrden_actividad2 = new javax.swing.JLabel();
        jlblBathroom = new javax.swing.JLabel();
        jlblAudio_bathroom = new javax.swing.JLabel();
        jlblKitchen = new javax.swing.JLabel();
        jlblAudio_kitchen = new javax.swing.JLabel();
        jlblBedroom = new javax.swing.JLabel();
        jlblAudio_bedroom = new javax.swing.JLabel();
        jlblDiningroom = new javax.swing.JLabel();
        jlblAudio_diningroom = new javax.swing.JLabel();
        jtxfBathroom = new javax.swing.JTextField();
        jtxfKitchen = new javax.swing.JTextField();
        jtxfBedroom = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(850, 1500));

        jPanel1.setPreferredSize(new java.awt.Dimension(850, 1600));

        jlblAttic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup3.add(jrbAttic2);
        jrbAttic2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jrbAttic2.setText("Attic");

        buttonGroup3.add(jrbGarden2);
        jrbGarden2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jrbGarden2.setText("Garden");

        buttonGroup3.add(jrbBathroom);
        jrbBathroom.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jrbBathroom.setText("Bathroom");

        jlblGarden.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup2.add(jrbKitchen);
        jrbKitchen.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jrbKitchen.setText("Kitchen");

        buttonGroup2.add(jrbAttic);
        jrbAttic.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jrbAttic.setText("Attic");

        buttonGroup2.add(jrbGarden);
        jrbGarden.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jrbGarden.setText("Garden");

        jlblLivingroom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(jrbLivingroom);
        jrbLivingroom.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jrbLivingroom.setText("Living room");

        buttonGroup1.add(jrbBedroom);
        jrbBedroom.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jrbBedroom.setText("Bedroom");

        jlblOrden_actividad.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jlblOrden_actividad.setText("1) Select the correct name of the room");

        jlblTitulo_actividad.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        jlblTitulo_actividad.setText("Activity 2: Parts of the house");

        buttonGroup1.add(jrbDiningroom);
        jrbDiningroom.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jrbDiningroom.setText("Dining room");

        jlblOrden_actividad2.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jlblOrden_actividad2.setText("2) Pronounce correctly the parts of home");

        jlblBathroom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblAudio_bathroom.setText("Audio");

        jlblKitchen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblAudio_kitchen.setText("Audio");

        jlblBedroom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblAudio_bedroom.setText("Audio");

        jlblDiningroom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlblAudio_diningroom.setText("Audio");

        jtxfBathroom.setText("Can I go to the ________");

        jtxfKitchen.setText("My mom is cooking in the _______");

        jtxfBedroom.setText("I'm going to sleep in my _______");

        jTextField1.setText("My grandmother put some cookies in the __________");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTitulo_actividad)
                    .addComponent(jlblOrden_actividad)
                    .addComponent(jlblOrden_actividad2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jlblLivingroom, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlblGarden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblAttic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbKitchen)
                                .addGap(18, 18, 18)
                                .addComponent(jrbGarden)
                                .addGap(20, 20, 20)
                                .addComponent(jrbAttic))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbLivingroom)
                                .addGap(18, 18, 18)
                                .addComponent(jrbBedroom)
                                .addGap(10, 10, 10)
                                .addComponent(jrbDiningroom))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbAttic2)
                                .addGap(18, 18, 18)
                                .addComponent(jrbBathroom)
                                .addGap(18, 18, 18)
                                .addComponent(jrbGarden2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jlblBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlblKitchen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblBedroom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblDiningroom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlblAudio_bathroom)
                                .addGap(18, 18, 18)
                                .addComponent(jtxfBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlblAudio_diningroom)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlblAudio_kitchen)
                                .addGap(18, 18, 18)
                                .addComponent(jtxfKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlblAudio_bedroom)
                                .addGap(18, 18, 18)
                                .addComponent(jtxfBedroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblTitulo_actividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblOrden_actividad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbLivingroom)
                        .addComponent(jrbBedroom)
                        .addComponent(jrbDiningroom))
                    .addComponent(jlblLivingroom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblGarden, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbKitchen)
                        .addComponent(jrbGarden)
                        .addComponent(jrbAttic)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jrbAttic2)
                        .addComponent(jrbBathroom)
                        .addComponent(jrbGarden2))
                    .addComponent(jlblAttic, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlblOrden_actividad2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblAudio_bathroom)
                        .addComponent(jtxfBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlblBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblAudio_kitchen)
                        .addComponent(jtxfKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblBedroom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblAudio_bedroom)
                        .addComponent(jtxfBedroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblDiningroom, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblAudio_diningroom)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmActividadDosGrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmActividadDosGrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmActividadDosGrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmActividadDosGrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmActividadDosGrand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlblAttic;
    private javax.swing.JLabel jlblAudio_bathroom;
    private javax.swing.JLabel jlblAudio_bedroom;
    private javax.swing.JLabel jlblAudio_diningroom;
    private javax.swing.JLabel jlblAudio_kitchen;
    private javax.swing.JLabel jlblBathroom;
    private javax.swing.JLabel jlblBedroom;
    private javax.swing.JLabel jlblDiningroom;
    private javax.swing.JLabel jlblGarden;
    private javax.swing.JLabel jlblKitchen;
    private javax.swing.JLabel jlblLivingroom;
    private javax.swing.JLabel jlblOrden_actividad;
    private javax.swing.JLabel jlblOrden_actividad2;
    private javax.swing.JLabel jlblTitulo_actividad;
    private javax.swing.JRadioButton jrbAttic;
    private javax.swing.JRadioButton jrbAttic2;
    private javax.swing.JRadioButton jrbBathroom;
    private javax.swing.JRadioButton jrbBedroom;
    private javax.swing.JRadioButton jrbDiningroom;
    private javax.swing.JRadioButton jrbGarden;
    private javax.swing.JRadioButton jrbGarden2;
    private javax.swing.JRadioButton jrbKitchen;
    private javax.swing.JRadioButton jrbLivingroom;
    private javax.swing.JTextField jtxfBathroom;
    private javax.swing.JTextField jtxfBedroom;
    private javax.swing.JTextField jtxfKitchen;
    // End of variables declaration//GEN-END:variables
}
