/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legendaapp;
import java.sql.*;
import javax.swing.*;
import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {

    static Object main() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
      
    }
    private void Text(){
        String text = jloginusername.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jloginusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jlogin = new javax.swing.JButton();
        jloginasadmin = new javax.swing.JButton();
        jloginregister = new javax.swing.JButton();
        jloginpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jloginusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginusernameActionPerformed(evt);
            }
        });

        jlogin.setText("Login");
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });

        jloginasadmin.setText("Login As Admin");
        jloginasadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginasadminActionPerformed(evt);
            }
        });

        jloginregister.setText("Register ");
        jloginregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginregisterActionPerformed(evt);
            }
        });

        jloginpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginpasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jloginusername)
                            .addComponent(jloginpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jloginregister)
                .addGap(47, 47, 47)
                .addComponent(jloginasadmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jlogin)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jloginusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jloginpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlogin)
                    .addComponent(jloginasadmin)
                    .addComponent(jloginregister))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jloginusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jloginusernameActionPerformed

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
    try {
            String url = "jdbc:postgresql://localhost/Legenda?user=postgres&password=loader321";
            ResultSet rs;
            String sql = "SELECT * from login where id_username=? AND password=?";
            PreparedStatement st;
            try (Connection connection = DriverManager.getConnection(url)) {
            st = connection.prepareStatement(sql);
            st.setString(1, jloginusername.getText());
            st.setString(2, jloginpassword.getText());
            rs = st.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "username and password matched");
                String user = jloginusername.getText(); 
                
                Datadiri dt = new Datadiri();
                dt.setVisible(true);
                dt.pack();
                dt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "username and password unmatched");
                jloginpassword.setText("");
            }
        }
             }
            catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

            }
    }//GEN-LAST:event_jloginActionPerformed

    private void jloginasadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginasadminActionPerformed
    Loginasadmin Laa = new Loginasadmin();
    Laa.setVisible(true);
    Laa.pack();
    Laa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.dispose();
     

    }//GEN-LAST:event_jloginasadminActionPerformed

    private void jloginregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginregisterActionPerformed
         Register ree = new Register();
        ree.setVisible(true);
        ree.pack();
        ree.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jloginregisterActionPerformed

    private void jloginpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jloginpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jlogin;
    private javax.swing.JButton jloginasadmin;
    private javax.swing.JPasswordField jloginpassword;
    private javax.swing.JButton jloginregister;
    private javax.swing.JTextField jloginusername;
    // End of variables declaration//GEN-END:variables
}
