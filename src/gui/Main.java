package gui;

import fileencanddec.Compress;
import fileencanddec.Decompress;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
//import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dell itachi law 1233
 */

public class Main extends javax.swing.JFrame
{
    public String original;
    public Main(boolean usedTheApplication)
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        initComponents();
         setSize(880,577);
        setResizable(false);
        setLocationRelativeTo(null);
      
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
 
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                JFrame frame = (JFrame)e.getSource();
                Toolkit.getDefaultToolkit().beep();
                int result = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit the application?", "Exit Application", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION)
                {
                    if(usedTheApplication)
                    {
                        new ThankYouDialog(new javax.swing.JFrame(),true).setVisible(rootPaneCheckingEnabled);
                    }
             
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                    
            }
        });
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
        jLabel1 = new javax.swing.JLabel();
        encryptButton = new javax.swing.JButton();
        decryptButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        heading.setFont(new java.awt.Font("Vrinda", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(0, 255, 0));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("WELCOME TO VIDEO ENCRYPTION AND DECRYPTION SOFTWARE");
        getContentPane().add(heading);
        heading.setBounds(18, 21, 750, 50);

        jLabel1.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 253, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("I want to");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 340, 133, 36);

        encryptButton.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        encryptButton.setForeground(new java.awt.Color(0, 16, 252));
        encryptButton.setText("ENCRYPT");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(encryptButton);
        encryptButton.setBounds(60, 400, 95, 29);

        decryptButton.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        decryptButton.setForeground(new java.awt.Color(102, 0, 255));
        decryptButton.setText("DECRYPT");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(decryptButton);
        decryptButton.setBounds(640, 400, 95, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1004, 454, 0, 0);

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("About");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 177, 664, 26);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(369, 421, 624, 0);

        jLabel18.setFont(new java.awt.Font("Vrinda", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 255, 0));
        jLabel18.setText("CREATED BY:-");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(100, 100, 110, 21);

        jLabel3.setFont(new java.awt.Font("Vrinda", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("SANTOSH,SAURAV AND SAUGAT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 130, 220, 21);

        jLabel5.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(53, 253, 253));
        jLabel5.setText("Do you want to change your video file to unplayable form then");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(97, 221, 577, 27);

        jLabel6.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(53, 252, 252));
        jLabel6.setText("a perfect software for you.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(97, 254, 201, 27);

        jLabel7.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(49, 249, 249));
        jLabel7.setText("You can use password for encryption and same password for decryption.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 300, 557, 27);

        jButton1.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 5, 255));
        jButton1.setText("COMPRESS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 400, 107, 29);

        jButton2.setFont(new java.awt.Font("Vrinda", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 255));
        jButton2.setText("DECOMPRESS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(450, 400, 125, 29);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\1-yZpctP0DnIfSEdUbwS5pig.jpeg")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 880, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_encryptButtonActionPerformed
    {//GEN-HEADEREND:event_encryptButtonActionPerformed
        FileChooser fileChooser = new FileChooser("ENCRYPT");
        fileChooser.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_decryptButtonActionPerformed
    {//GEN-HEADEREND:event_decryptButtonActionPerformed
        FileChooser fileChooser = new FileChooser("DECRYPT");
        fileChooser.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           JFileChooser chooser = new JFileChooser();
         
             
            UIManager.put("FileChooser.openButtonText", "Select");

        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());
        
            String s=chooser.getSelectedFile().getAbsolutePath();
               try {
                   FileWriter fw=new FileWriter("files.txt");
                   PrintWriter pw=new PrintWriter(fw);
                   pw.println(s);
                   pw.close();
               } catch (IOException ex) {
                   Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
               }
            original=s;
            String d=chooser.getSelectedFile().getAbsolutePath().concat(".zip");
               try {
                   Compress c= new Compress(s,d);
               } catch (IOException ex) {
                   System.out.println(ex);
               }
                        
         //  new compressordecompress("compress"); 
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String st=original; 
        JFileChooser chooser = new JFileChooser();
        try {
            FileReader fr=new FileReader("files.txt");
            BufferedReader br=new BufferedReader(fr);
         String str;
            while((str=br.readLine())!=null)
                    {
                        st=str;
                        System.out.println(str);
                    }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
     
            UIManager.put("FileChooser.openButtonText", "select");
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                    chooser.getSelectedFile().getName());
        
            String s=chooser.getSelectedFile().getAbsolutePath();
            
               try {
                   Decompress c= new Decompress(s,st);
               } catch (IOException ex) {
                   System.out.println(ex);
               }
                        
             // new compressordecompress("decompress");       
    } // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main(false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decryptButton;
    private javax.swing.JButton encryptButton;
    private javax.swing.JLabel heading;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
