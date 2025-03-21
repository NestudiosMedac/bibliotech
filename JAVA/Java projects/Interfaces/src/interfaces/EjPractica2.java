/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author nuria
 */
public class EjPractica2 extends javax.swing.JFrame {
private int valor;
private int contador;

    public EjPractica2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JLabel();
        LabelSubTitulo = new javax.swing.JLabel();
        TextApuesta = new javax.swing.JTextField();
        TextoIntentos = new javax.swing.JTextField();
        BotonRendirse = new javax.swing.JButton();
        BotonApostar = new javax.swing.JButton();
        TextoMSJ = new javax.swing.JTextField();
        LabelMsj = new javax.swing.JLabel();
        LabelApuesta = new javax.swing.JLabel();
        LabelIntento = new javax.swing.JLabel();
        BotonEmpezar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Advina el numero");

        LabelSubTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSubTitulo.setText("El objetivo es encontrar un numero entre el 1 y el 100");

        TextApuesta.setEnabled(false);

        TextoIntentos.setEditable(false);

        BotonRendirse.setText("Rendirse");
        BotonRendirse.setEnabled(false);
        BotonRendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRendirseActionPerformed(evt);
            }
        });

        BotonApostar.setText("Apostar");
        BotonApostar.setEnabled(false);
        BotonApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonApostarActionPerformed(evt);
            }
        });

        TextoMSJ.setEditable(false);
        TextoMSJ.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LabelMsj.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelMsj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMsj.setText("Mensajes:");

        LabelApuesta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelApuesta.setText("Tu apuesta:");

        LabelIntento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelIntento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIntento.setText("Intentos:");

        BotonEmpezar.setText("Empezar");
        BotonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmpezarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelSubTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelMsj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LabelApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelIntento, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TextApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(BotonApostar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TextoIntentos)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(BotonRendirse, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(TextoMSJ, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(BotonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSubTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonApostar)
                    .addComponent(LabelApuesta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRendirse)
                    .addComponent(LabelIntento))
                .addGap(18, 18, 18)
                .addComponent(LabelMsj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoMSJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonEmpezar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmpezarActionPerformed
        BotonEmpezar.setEnabled(false);
        BotonApostar.setEnabled(true);
        BotonRendirse.setEnabled(true);
        TextApuesta.setEnabled(true);
        int valor = (int) (Math.random() * (100) + 1);//int valor=(int)(Math.random()*(maximo-minimo+1)+minimo);
        int contador = 0;

    }//GEN-LAST:event_BotonEmpezarActionPerformed

    private void BotonApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonApostarActionPerformed
        try {
            int usuario = Integer.parseInt(TextApuesta.getText());
            System.out.println(valor);

            if (!(valor > 100 && valor < 0)) {
                if (usuario > valor) {
                    TextoMSJ.setText("Es MAYOR del numero en el que he pensado");
                    contador++;
                } else if (usuario < valor) {
                    TextoMSJ.setText("Es MENOR del numero en el que he pensado");
                    contador++;

                } else {
                    TextoMSJ.setText("Felicidades, has ganado! el numero era el " + valor);
                }

            } else {
                TextoMSJ.setText("El numero no esta entre 1 y 100");
            }
            String intentos = Integer.toString(contador);
            TextoIntentos.setText(intentos);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ERROR!! Has introducido una palabra", "Oh no!", JOptionPane.ERROR_MESSAGE);
            TextApuesta.setText("");
        }
    }//GEN-LAST:event_BotonApostarActionPerformed

    private void BotonRendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRendirseActionPerformed
        BotonEmpezar.setEnabled(true);
        BotonApostar.setEnabled(false);
        BotonRendirse.setEnabled(false);
        TextApuesta.setEnabled(false);
        TextoMSJ.setText("TE HAS RENDIDO!!! Era el " + valor);

    }//GEN-LAST:event_BotonRendirseActionPerformed

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
            java.util.logging.Logger.getLogger(EjPractica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjPractica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjPractica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjPractica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjPractica2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonApostar;
    private javax.swing.JButton BotonEmpezar;
    private javax.swing.JButton BotonRendirse;
    private javax.swing.JLabel LabelApuesta;
    private javax.swing.JLabel LabelIntento;
    private javax.swing.JLabel LabelMsj;
    private javax.swing.JLabel LabelSubTitulo;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField TextApuesta;
    private javax.swing.JTextField TextoIntentos;
    private javax.swing.JTextField TextoMSJ;
    // End of variables declaration//GEN-END:variables
}
