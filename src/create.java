import java.sql.*;
import Project.Data;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class create extends javax.swing.JFrame {

    /**
     * Creates new form create
     */
    public create() {
        initComponents();
        try
        {
            Connection con = Data.getCon();
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = stmt.executeQuery("select COUNT(id)from question");
            if(rs.first())
            {
                int id = rs.getInt(1);
                id = id +1;      
                String str = String.valueOf(id);
                jLabel10.setText(str);

                
            }
            else
            {
                jLabel10.setText("1");
            }
        }
        catch (SQLException e) {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "SQL Error: " + e.getMessage());
        }
        catch(Exception e)
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jButton3.setBackground(new java.awt.Color(189, 158, 189));
        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 571, 81));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("Question");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 90, 40));

        jLabel2.setBackground(new java.awt.Color(189, 134, 189));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("Question id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 40));

        jButton1.setBackground(new java.awt.Color(167, 146, 125));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 680, -1, 40));

        jButton2.setBackground(new java.awt.Color(174, 154, 134));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 680, -1, 40));

        jLabel4.setText("option 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 580, 40));

        jLabel5.setText("option 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        jLabel6.setText("option 3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, -1, -1));

        jLabel7.setText("option 4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, -1, -1));

        jButton4.setBackground(new java.awt.Color(171, 142, 113));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 20, -1, 60));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 51, 0));
        jLabel8.setText("Answer");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, -1, 30));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 580, 40));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 580, 40));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 580, 40));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 580, 40));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 60, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 100, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update (8).png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1640, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField7.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new createquestion().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String  id = jLabel10.getText();
        String name = jTextField1.getText();
        String opt1 = jTextField10.getText();
        String opt2 = jTextField11.getText();
        String opt3 = jTextField12.getText();
        String opt4 = jTextField7.getText();
        String answer = jTextField3.getText();
        try
        {
            Connection con = Data.getCon();
            PreparedStatement ps = con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
            ps.setString(1,id);
             ps.setString(2,name);
              ps.setString(3,opt1);
               ps.setString(4,opt2);
                ps.setString(5,opt3);
                 ps.setString(6,opt4);
                  ps.setString(7,answer);
                  ps.executeUpdate();
                  JFrame jf = new JFrame();
                  jf.setAlwaysOnTop(true);
                  JOptionPane.showMessageDialog(jf,"Succesfully Updated");
                  setVisible(false);
                  new create().setVisible(true);
                  
                  
             
        }
        catch(SQLException e)
        {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"SQLError"+e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new createquestion().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}