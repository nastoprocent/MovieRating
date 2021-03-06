/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.AdminController;
import Models.User;
import javax.swing.JOptionPane;

/**
 *
 * @author x14321651
 */
public class AdminLogin extends javax.swing.JFrame {


    public AdminLogin() {
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

        AdminLogin = new javax.swing.JButton();
        UserLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminLogin.setBackground(new java.awt.Color(38, 166, 91));
        AdminLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogin.setText("Admin Login");
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });
        getContentPane().add(AdminLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 130, 30));

        UserLogin.setBackground(new java.awt.Color(142, 68, 173));
        UserLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserLogin.setForeground(new java.awt.Color(255, 255, 255));
        UserLogin.setText("Back to User");
        UserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginActionPerformed(evt);
            }
        });
        getContentPane().add(UserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 100, 30));

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 200, 29));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/administrator.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 260, 220));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 420, 30));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 420, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/adminBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
        // TODO add your handling code here:
           // TODO add your handling code here:
        String email = this.email.getText();
        String pass = new String(this.pass.getPassword());
        
        User a = new User();
        a.setEmail(email);
        a.setPassword(pass);
        
        AdminController ac = new AdminController();
        
        boolean res = ac.checkLogin(a);
        if (res) {
            JOptionPane.showMessageDialog(null, "Login as Administrator has been Successfull");
            AdminPanel obj = new AdminPanel();
            obj.setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Either email or password is wrong", "Incorrect details", JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_AdminLoginActionPerformed

    private void UserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginActionPerformed
        // TODO add your handling code here:
        new UserLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserLoginActionPerformed


    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin;
    private javax.swing.JButton UserLogin;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
