package Lesson5;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class MainFace extends javax.swing.JFrame {

    TestFace f;

    public MainFace() {
        initComponents();
        btnmove.setEnabled(false);
        btnresize.setEnabled(false);
        btncolor.setEnabled(false);
        btnmood.setEnabled(false);
        f = new TestFace(facePanel.getGraphics(), facePanel.getWidth() / 2 - 50, facePanel.getHeight() / 2 - 50, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmove = new javax.swing.JButton();
        btnresize = new javax.swing.JButton();
        btncolor = new javax.swing.JButton();
        btnmood = new javax.swing.JButton();
        setFace = new javax.swing.JButton();
        facePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 500));

        btnmove.setText("Move Face");
        btnmove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoveActionPerformed(evt);
            }
        });

        btnresize.setText("Resize Face");
        btnresize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresizeActionPerformed(evt);
            }
        });

        btncolor.setText("Change Color");
        btncolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncolorActionPerformed(evt);
            }
        });

        btnmood.setText("Toggle Mood");
        btnmood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoodActionPerformed(evt);
            }
        });

        setFace.setText("Set Initial Face");
        setFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setFaceActionPerformed(evt);
            }
        });

        facePanel.setBackground(new java.awt.Color(0, 0, 0));
        facePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout facePanelLayout = new javax.swing.GroupLayout(facePanel);
        facePanel.setLayout(facePanelLayout);
        facePanelLayout.setHorizontalGroup(
            facePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        facePanelLayout.setVerticalGroup(
            facePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmove, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnresize, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncolor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmood))
                    .addComponent(setFace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(facePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmove)
                    .addComponent(btnresize)
                    .addComponent(btncolor)
                    .addComponent(btnmood))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setFace)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoveActionPerformed
        int newx = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter new X"));
        int newy = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter new Y"));
    //    if (newx > facePanel.getWidth() - f.getWidth()) {
     //       JOptionPane.showMessageDialog(this, "Invalid X location.");
     //       return;
     //   }
      //  if (newy > facePanel.getWidth() - f.getWidth()) {
     //       JOptionPane.showMessageDialog(this, "Invalid Y location.");
     //       return;
     //   }
        f.erase();
        f.move(newx,newy);
        f.draw();

    }//GEN-LAST:event_btnmoveActionPerformed

    private void setFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFaceActionPerformed
        btnmove.setEnabled(true);
        btnresize.setEnabled(true);
        btncolor.setEnabled(true);
        btnmood.setEnabled(true);

        f.erase();
        f = new TestFace(facePanel.getGraphics(), facePanel.getWidth() / 2 - 50, facePanel.getHeight() / 2 - 50, 100);
        f.draw();
    }//GEN-LAST:event_setFaceActionPerformed

    private void btnmoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoodActionPerformed
        f.erase();
        f.togglemood();
        f.draw();
    }//GEN-LAST:event_btnmoodActionPerformed

    private void btnresizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresizeActionPerformed
        int d = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter a new diameter"));
        if (d > facePanel.getWidth()) {
            JOptionPane.showMessageDialog(this, "Invalid diameter");
            return;
        }
        f.erase();
        f.setWidth(d);
        f.draw();
    }//GEN-LAST:event_btnresizeActionPerformed

    private void btncolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncolorActionPerformed
        Color head = JColorChooser.showDialog(this, "Select Head Color", Color.red);
        Color eyes = JColorChooser.showDialog(this, "Select Eye Color", Color.yellow);
        f.erase();
        f.setColor(head, eyes);
        f.draw();

    }//GEN-LAST:event_btncolorActionPerformed

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
            java.util.logging.Logger.getLogger(MainFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncolor;
    private javax.swing.JButton btnmood;
    private javax.swing.JButton btnmove;
    private javax.swing.JButton btnresize;
    private javax.swing.JPanel facePanel;
    private javax.swing.JButton setFace;
    // End of variables declaration//GEN-END:variables
}
