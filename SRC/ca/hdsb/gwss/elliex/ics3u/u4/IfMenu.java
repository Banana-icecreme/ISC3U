/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.elliex.ics3u.u4;

/**
 *
 * @author elli
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

        DiscountGUI = new javax.swing.JButton();
        Y2K = new javax.swing.JButton();
        alien = new javax.swing.JButton();
        theCellSell = new javax.swing.JButton();
        OrderChecker = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DiscountGUI.setText("Discount Prices");
        DiscountGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiscountGUIActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrderChecker)
                    .addComponent(theCellSell)
                    .addComponent(alien)
                    .addComponent(Y2K)
                    .addComponent(DiscountGUI))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(DiscountGUI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Y2K)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(theCellSell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OrderChecker)
                .addContainerGap(79, Short.MAX_VALUE))
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
    private javax.swing.JButton Y2K;
    private javax.swing.JButton alien;
    private javax.swing.JButton theCellSell;
    // End of variables declaration//GEN-END:variables
}