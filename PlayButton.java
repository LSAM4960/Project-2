/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package button;

//import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author 218331851
 */
public class PlayButton extends javax.swing.JFrame {

    /**
     * Creates new form PlayButton
     */
    public PlayButton() {
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

        Exit = new javax.swing.JButton();
        Pause = new javax.swing.JButton();
        PLAY = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Pause.setText("Pause");
        Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseActionPerformed(evt);
            }
        });

        PLAY.setText("PLAY");
        PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(PLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pause)
                            .addComponent(Exit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(PLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseActionPerformed
        try{
            
        }
        catch(Exception ex)
        {
            Logger.getLogger(PlayButton.class.getName()).log(Level.SEVERE, null, ex);   
        }
    }//GEN-LAST:event_PauseActionPerformed

    private void PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYActionPerformed
         try{
            
        }
        catch(Exception ex)
        {
            Logger.getLogger(MediaPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PLAYActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        JFrame frame = new JFrame("PLAY");
        if(JOptionPane.showConfirmDialog(frame ,"Do you want to Exit?", "EXIT",
                                        JOptionPane.YES_NO_OPTION)==JOptionPane
                                        .YES_NO_OPTION){
            
        }
        System.exit(0);                    
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(PlayButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PlayButton().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton PLAY;
    private javax.swing.JButton Pause;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
