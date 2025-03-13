/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

/**
 *
 * @author nuria
 */
public class EjPractica3 extends javax.swing.JFrame {

    private int numero1;
    private int numero2;

    public EjPractica3() {
        initComponents();
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

        Generar = new javax.swing.JButton();
        Comparar = new javax.swing.JButton();
        Random1 = new javax.swing.JTextField();
        Random2 = new javax.swing.JTextField();
        Mayor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Generar.setText("Generar");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        Comparar.setText("Comparar");
        Comparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompararActionPerformed(evt);
            }
        });

        Random1.setEditable(false);
        Random1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Random1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Random1.setToolTipText("");

        Random2.setEditable(false);
        Random2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Random2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Mayor.setEditable(false);
        Mayor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Mayor.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(Generar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Random1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(Random2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Comparar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Generar)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Random1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Random2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(Comparar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mayor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompararActionPerformed
        if (numero1 > numero2) {
            Mayor.setText(Integer.toString(numero1));

        } else {
            Mayor.setText(Integer.toString(numero2));
        }
        Comparar.setEnabled(false);
        Random1.setText("");
        Random2.setText("");
        Generar.setEnabled(true);

    }//GEN-LAST:event_CompararActionPerformed

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        Generar.setEnabled(false);
        do {
            numero1 = (int) (Math.random() * (100 - 1) + 1);
            // System.out.println(numero1);
            numero2 = (int) (Math.random() * (100 - 1) + 1);
            //System.out.println(numero2);
        } while (numero1 == numero2);
        Random1.setText(Integer.toString(numero1));
        Random2.setText(Integer.toString(numero2));
        Comparar.setEnabled(true);
        Mayor.setText("");
    }//GEN-LAST:event_GenerarActionPerformed

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
            java.util.logging.Logger.getLogger(EjPractica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjPractica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjPractica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjPractica3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjPractica3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comparar;
    private javax.swing.JButton Generar;
    private javax.swing.JTextField Mayor;
    private javax.swing.JTextField Random1;
    private javax.swing.JTextField Random2;
    // End of variables declaration//GEN-END:variables
}
