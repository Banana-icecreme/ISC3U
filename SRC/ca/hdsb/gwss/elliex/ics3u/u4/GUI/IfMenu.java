/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u4.GUI;

import ca.hdsb.gwss.elliex.ics3u.u4.GUI.OrderChecker;
import ca.hdsb.gwss.elliex.ics3u.u4.GUI.Y2kProblemDetector;
import ca.hdsb.gwss.elliex.ics3u.u4.GUI.TheCellSell;
import ca.hdsb.gwss.elliex.ics3u.u4.GUI.SlotMachine;
import ca.hdsb.gwss.elliex.ics3u.u4.GUI.whichAlien;

/**
 *
 * @author ellie
 */
public class IfMenu extends javax.swing.JFrame {

    /**
     * Creates new form IfFrame
     */
    public IfMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        DiscountGUI = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Y2K = new javax.swing.JButton();
        alien = new javax.swing.JButton();
        theCellSell = new javax.swing.JButton();
        OrderChecker = new javax.swing.JButton();
        SlotMachine = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        DiscountGUI.setText("Discount Prices");
        DiscountGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountGUIActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Vineta BT", 0, 24)); // NOI18N
        jLabel1.setText("MENU");

        Y2K.setText("Y2K Problem Detector");
        Y2K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y2KActionPerformed(evt);
            }
        });

        alien.setText("Which Alien?");
        alien.setToolTipText("");
        alien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienActionPerformed(evt);
            }
        });

        theCellSell.setText("The Cell Sell");
        theCellSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theCellSellActionPerformed(evt);
            }
        });

        OrderChecker.setText("Order Checker");
        OrderChecker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderCheckerActionPerformed(evt);
            }
        });

        SlotMachine.setText("Slot Machine");
        SlotMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlotMachineActionPerformed(evt);
            }
        });

        jButton1.setText("exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Y2K)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlotMachine)
                            .addComponent(OrderChecker)
                            .addComponent(theCellSell)
                            .addComponent(alien))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DiscountGUI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DiscountGUI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Y2K)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(theCellSell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrderChecker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SlotMachine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiscountGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiscountGUIActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        new DiscountGUI().setVisible(true);
        
    }//GEN-LAST:event_DiscountGUIActionPerformed

    private void Y2KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y2KActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Y2kProblemDetector().setVisible(true);
    }//GEN-LAST:event_Y2KActionPerformed

    private void alienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new whichAlien().setVisible(true);
    }//GEN-LAST:event_alienActionPerformed

    private void theCellSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theCellSellActionPerformed
        // TODO add your handling code here:
        this.dispose ();
        new TheCellSell().setVisible(true);
    }//GEN-LAST:event_theCellSellActionPerformed

    private void OrderCheckerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderCheckerActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new OrderChecker().setVisible(true);
    }//GEN-LAST:event_OrderCheckerActionPerformed

    private void SlotMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlotMachineActionPerformed
        this.dispose();
        new SlotMachine().setVisible(true);
    }//GEN-LAST:event_SlotMachineActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(IfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IfMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DiscountGUI;
    private javax.swing.JButton OrderChecker;
    private javax.swing.JButton SlotMachine;
    private javax.swing.JButton Y2K;
    private javax.swing.JButton alien;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton theCellSell;
    // End of variables declaration//GEN-END:variables
}