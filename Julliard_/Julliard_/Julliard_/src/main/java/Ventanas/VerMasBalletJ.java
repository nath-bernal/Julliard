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
public class VerMasBalletJ extends javax.swing.JFrame {

    /**
     * Creates new form VerMasBalletJ
     */
    public VerMasBalletJ() {
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

        entrarBaileC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inscribirmeBalletJ = new javax.swing.JButton();
        salir2 = new javax.swing.JButton();

        entrarBaileC.setFont(new java.awt.Font("Bodoni MT", 0, 14)); // NOI18N
        entrarBaileC.setText("Entrar");
        entrarBaileC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBaileCActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(230, 223, 229));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 644));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 42)); // NOI18N
        jLabel1.setText("Ballet Juvenil");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel2.setText("<html>El  ballet juvenil es una danza clásica donde sus movimientos están basados en el control total  y absoluto del cuerpo. El grupo de ballet juvenil es un programa orientado a proporcionar al bailarín el puente necesario entre su formación académica y el mundo profesional.<br><br>  Profesor(a): Marianela Nuñez Rodriguez<br><br>   Duración del curso: 32 horas<br><br>   Rango de edad: Entre 15 - 22 años<br><br>   Horario: Lunes, Miércoles y Viernes de 4:00pm a 7:00pm <br><br>   Aula: 1-05</html>");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        inscribirmeBalletJ.setBackground(new java.awt.Color(231, 185, 187));
        inscribirmeBalletJ.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        inscribirmeBalletJ.setText("Inscribirme");
        inscribirmeBalletJ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inscribirmeBalletJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscribirmeBalletJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirmeBalletJActionPerformed(evt);
            }
        });

        salir2.setBackground(new java.awt.Color(231, 185, 187));
        salir2.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        salir2.setText("Salir");
        salir2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(345, 345, 345))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(inscribirmeBalletJ, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inscribirmeBalletJ)
                    .addComponent(salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void entrarBaileCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBaileCActionPerformed
        // TODO add your handling code here:
        NuevoRegistro ventanaNuevoRegistro = new NuevoRegistro();
        this.setVisible(false);
        ventanaNuevoRegistro.setVisible(true);
    }//GEN-LAST:event_entrarBaileCActionPerformed

    private void inscribirmeBalletJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirmeBalletJActionPerformed
        // TODO add your handling code here:

        String csvFile = "RegistroUsuario.csv";
        String line;
        String csvSplitBy = ";";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (data.length > 7 && "Ballet Juvenil".equals(data[7])) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (count >= 14) {
            JOptionPane.showMessageDialog(null, "No hay más cupos disponibles");
        } else {
            Global.cursoActual = "Ballet Juvenil";
            Global.eventoActual = null;
            NuevoRegistro ventanaNuevoRegistro = new NuevoRegistro();
            this.setVisible(false);
            ventanaNuevoRegistro.setVisible(true);
        }
    }//GEN-LAST:event_inscribirmeBalletJActionPerformed

    private void salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir2ActionPerformed
        // TODO add your handling code here:
        Index ventanaIndex = new Index();
        this.setVisible(false);
        ventanaIndex.setVisible(true);
    }//GEN-LAST:event_salir2ActionPerformed

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
            java.util.logging.Logger.getLogger(VerMasBalletJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerMasBalletJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerMasBalletJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerMasBalletJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerMasBalletJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrarBaileC;
    private javax.swing.JButton inscribirmeBalletJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir2;
    // End of variables declaration//GEN-END:variables
}
