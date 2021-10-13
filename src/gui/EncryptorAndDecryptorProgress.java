
package gui;


import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author dell
 */

public class EncryptorAndDecryptorProgress extends javax.swing.JFrame
{
    private String encryptOrDecrypt;
    private boolean completedTask;

    public void setCompletedTask(boolean completedTask)
    {
        this.completedTask = completedTask;
    }
    
    public EncryptorAndDecryptorProgress(String encryptOrDecrypt)
    {
        this.encryptOrDecrypt=encryptOrDecrypt;
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(EncryptorAndDecryptorProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EncryptorAndDecryptorProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EncryptorAndDecryptorProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EncryptorAndDecryptorProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        initComponents();
           setSize(725,468);
        setResizable(false);
             
        progressOfFilesTextField.setEditable(false);
        oKButton.setVisible(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                JFrame frame = (JFrame)e.getSource();
                int result;
                if(completedTask)
                {
                    Toolkit.getDefaultToolkit().beep();
                    result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION)
                    {
                        
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                    
                }
                else if(encryptOrDecrypt.equals("encrypt"))
                {
                    Toolkit.getDefaultToolkit().beep();
                    result = JOptionPane.showConfirmDialog(frame, "Encryption is in progress. "+"Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION)
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                
                else if (encryptOrDecrypt.equals("decrypt"))
                {
                    Toolkit.getDefaultToolkit().beep();
                     result = JOptionPane.showConfirmDialog(frame, "Decryption is in progress. "+"Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);
                     if (result == JOptionPane.YES_OPTION)
                     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                
            }
        });
        if(encryptOrDecrypt.equalsIgnoreCase("encrypt"))
        {
            heading.setText("Encrypting:");
        }
        else if(encryptOrDecrypt.equalsIgnoreCase("decrypt"))
        {
            heading.setText("Decrypting:");
        }
        getRootPane().setDefaultButton(oKButton);
        this.setVisible(true);
        
        
    }

    public JButton getoKButton()
    {
        return oKButton;
    }

    public JProgressBar getProgressBar()
    {
        return progressBar;
    }

    public JTextArea getProgressOfFilesTextField()
    {
        return progressOfFilesTextField;
    }

    public JLabel getProgressPercentLabel()
    {
        return progressPercentLabel;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        progressOfFilesTextField = new javax.swing.JTextArea();
        progressBar = new javax.swing.JProgressBar();
        progressPercentLabel = new javax.swing.JLabel();
        oKButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        heading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(heading);
        heading.setBounds(10, 11, 0, 0);

        progressOfFilesTextField.setColumns(20);
        progressOfFilesTextField.setRows(5);
        progressOfFilesTextField.setToolTipText("OK");
        jScrollPane1.setViewportView(progressOfFilesTextField);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 17, 693, 347);
        getContentPane().add(progressBar);
        progressBar.setBounds(10, 370, 693, 26);

        progressPercentLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        progressPercentLabel.setForeground(new java.awt.Color(255, 255, 255));
        progressPercentLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        progressPercentLabel.setText("0%");
        getContentPane().add(progressPercentLabel);
        progressPercentLabel.setBounds(607, 402, 96, 17);

        oKButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        oKButton.setToolTipText("OK");
        oKButton.setEnabled(false);
        oKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oKButtonActionPerformed(evt);
            }
        });
        getContentPane().add(oKButton);
        oKButton.setBounds(315, 402, 88, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\maxresdefault.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 720, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oKButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_oKButtonActionPerformed
    {//GEN-HEADEREND:event_oKButtonActionPerformed
        new Main(true).setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_oKButtonActionPerformed
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton oKButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextArea progressOfFilesTextField;
    private javax.swing.JLabel progressPercentLabel;
    // End of variables declaration//GEN-END:variables

}
