/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class VerMasBalletB extends javax.swing.JFrame {

    /**
     * Creates new form VerMasBalletB
     */
    public VerMasBalletB() {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearCuentaBaileC12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inscribirmeBalletB = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();

        crearCuentaBaileC12.setBackground(new java.awt.Color(231, 185, 187));
        crearCuentaBaileC12.setFont(new java.awt.Font("Bodoni MT", 0, 12)); // NOI18N
        crearCuentaBaileC12.setText("Crear cuenta");
        crearCuentaBaileC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaBaileC12ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 223, 229));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 644));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 42)); // NOI18N
        jLabel1.setText("Ballet Básico");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel2.setText("<html>El  ballet es una danza clásica donde sus movimientos están basados en el control total y absoluto del cuerpo. En este grupo se aprende la terminología, pasos y tradiciones de esta danza, trabajando en el fortalecimiento de los músculos, aumentando la flexibilidad, desarrollando la coordinación, tus capacidades motrices y musicales. <br><br>  Profesor(a): Carlos Acosta Suarez<br><br>   Duración del curso: 32 horas<br><br>   Rango de edad: Entre 9 y 14 años<br><br>   Horario: Sabados de 10:00am a 12:00pm <br><br>   Aula: 1-02</html>");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        inscribirmeBalletB.setBackground(new java.awt.Color(231, 185, 187));
        inscribirmeBalletB.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        inscribirmeBalletB.setText("Inscribirme");
        inscribirmeBalletB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inscribirmeBalletB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscribirmeBalletB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirmeBalletBActionPerformed(evt);
            }
        });

        salir1.setBackground(new java.awt.Color(231, 185, 187));
        salir1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        salir1.setText("Salir");
        salir1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(inscribirmeBalletB, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(322, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscribirmeBalletB)
                    .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

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

    private void crearCuentaBaileC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaBaileC12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearCuentaBaileC12ActionPerformed

    private void inscribirmeBalletBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirmeBalletBActionPerformed
        
        String csvFile = "RegistroUsuario.csv";
        String line;
        String csvSplitBy = ";";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (data.length > 7 && "Ballet Básico".equals(data[7])) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (count >= 14) {
            JOptionPane.showMessageDialog(null, "No hay más cupos disponibles");
        } else {
            Global.cursoActual = "Ballet Básico";
            Global.eventoActual = null;
            NuevoRegistro ventanaNuevoRegistro = new NuevoRegistro();
            this.setVisible(false);
            ventanaNuevoRegistro.setVisible(true);
        }

    }//GEN-LAST:event_inscribirmeBalletBActionPerformed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        // TODO add your handling code here:
        Index ventanaIndex = new Index();
        this.setVisible(false);
        ventanaIndex.setVisible(true);
    }//GEN-LAST:event_salir1ActionPerformed

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
            java.util.logging.Logger.getLogger(VerMasBalletB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerMasBalletB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerMasBalletB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerMasBalletB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerMasBalletB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearCuentaBaileC12;
    private javax.swing.JButton inscribirmeBalletB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir1;
    // End of variables declaration//GEN-END:variables
}
