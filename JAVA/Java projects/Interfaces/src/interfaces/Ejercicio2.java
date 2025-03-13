package Graficas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class Ejercicio2 extends JFrame {
   private JButton botonActivar;
   private JCheckBox cbp1;
   private JCheckBox cbp2;
   private JCheckBox cbp3;
   private JComboBox<String> listaTitular;
   private JLabel titulo;

   public Ejercicio2() {
      this.initComponents();
   }

   private void initComponents() {
      this.titulo = new JLabel();
      this.listaTitular = new JComboBox();
      this.cbp1 = new JCheckBox();
      this.cbp2 = new JCheckBox();
      this.cbp3 = new JCheckBox();
      this.botonActivar = new JButton();
      this.setDefaultCloseOperation(3);
      this.titulo.setFont(new Font("Segoe UI", 0, 36));
      this.titulo.setHorizontalAlignment(0);
      this.titulo.setText("EJERCICIO 2");
      this.listaTitular.setFont(new Font("Segoe UI", 0, 14));
      this.listaTitular.setModel(new DefaultComboBoxModel(new String[]{"Selecciona un profesor..."}));
      this.cbp1.setFont(new Font("Segoe UI", 0, 18));
      this.cbp1.setText("Jaime");
      this.cbp2.setFont(new Font("Segoe UI", 0, 18));
      this.cbp2.setText("Dani");
      this.cbp3.setFont(new Font("Segoe UI", 0, 18));
      this.cbp3.setText("Jose");
      this.botonActivar.setFont(new Font("Segoe UI", 0, 24));
      this.botonActivar.setText("Eliminar");
      this.botonActivar.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Ejercicio2.this.botonActivarActionPerformed(evt);
         }
      });
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(29, 29, 29).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.titulo, -1, 230, 32767).addGap(29, 29, 29)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.botonActivar, Alignment.LEADING, -1, -1, 32767).addComponent(this.listaTitular, Alignment.LEADING, 0, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.cbp1).addGap(18, 18, 18).addComponent(this.cbp2).addGap(18, 18, 18).addComponent(this.cbp3))).addContainerGap(-1, 32767)))));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.titulo).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cbp1).addComponent(this.cbp2).addComponent(this.cbp3)).addGap(18, 18, 18).addComponent(this.listaTitular, -2, 32, -2).addGap(28, 28, 28).addComponent(this.botonActivar, -2, 55, -2).addContainerGap(50, 32767)));
      this.pack();
   }

   private void botonActivarActionPerformed(ActionEvent evt) {
      if (this.cbp1.isSelected()) {
         this.cbp2.setSelected(true);
         this.cbp3.setSelected(true);
         this.listaTitular.addItem(this.cbp1.getText());
      } else if (this.cbp2.isSelected()) {
         this.cbp1.setSelected(false);
         this.cbp3.setSelected(true);
         this.listaTitular.addItem(this.cbp2.getText());
      } else if (this.cbp3.isSelected()) {
         this.cbp1.setSelected(false);
         this.cbp2.setSelected(false);
         this.listaTitular.addItem(this.cbp3.getText());
      }

   }

   public static void main(String[] args) {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new Ejercicio2()).setVisible(true);
         }
      });
   }
}
