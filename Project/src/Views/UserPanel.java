/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Database.MyConnection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author x14321651
 */
public class UserPanel extends javax.swing.JFrame {

       Connection con;
        MyConnection mcon = new MyConnection();        
        String sqlquery = "SELECT * FROM movies";
        Statement stmt;
        ResultSet rts;
     
    public UserPanel() {
        initComponents(); 
        con = mcon.returnConnection();
        try{
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         rts = stmt.executeQuery(sqlquery);
         movieTable.setModel(DbUtils.resultSetToTableModel(rts));
         User_Panel();
        }
        catch(SQLException ex){
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);             
        }
    }   
    private void User_Panel() throws SQLException{
        rts=stmt.executeQuery(sqlquery);
        movieTable.setModel(DbUtils.resultSetToTableModel(rts));
    }
    
    String url = "jdbc:mysql://localhost:3306/secureprograming";
    String username = "root";
    String password = "";


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        movieTable = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        searchlbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movieTable.setBackground(new java.awt.Color(253, 227, 167));
        movieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Type", "Length", "Rating"
            }
        ));
        movieTable.setGridColor(new java.awt.Color(0, 0, 0));
        movieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                movieTableMouseClicked(evt);
            }
        });
        movieTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                movieTableKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(movieTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 560, -1));

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 430, 20));

        searchlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchlbl.setForeground(new java.awt.Color(255, 255, 255));
        searchlbl.setText("Search:");
        getContentPane().add(searchlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, -1));

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 90, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/CinemaBackground.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        try{
            DefaultTableModel table = (DefaultTableModel)movieTable.getModel();        
            String search = searchField.getText().toLowerCase();
            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
            movieTable.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search));
            User_Panel();
        }      
       catch(SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }  
    }//GEN-LAST:event_searchFieldKeyReleased

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if(!((Character.isLetter(vchar))||(Character.isDigit(vchar)))    
                ||(vchar == KeyEvent.VK_BACK_SPACE)
                       ||(vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_searchFieldKeyTyped

    private void movieTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movieTableMouseClicked
        // TODO add your handling code here:
        boolean a=movieTable.isEditing();
       if(a==false){
            JOptionPane.showMessageDialog(null, "You cant edit the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try{            
             User_Panel();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//GEN-LAST:event_movieTableMouseClicked

    private void movieTableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_movieTableKeyTyped
        // TODO add your handling code here:
         boolean a=movieTable.isEditing();
       if(a==false){
            JOptionPane.showMessageDialog(null, "You cant edit the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try{            
             User_Panel();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//GEN-LAST:event_movieTableKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        UserLogin s = new UserLogin();
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable movieTable;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchlbl;
    // End of variables declaration//GEN-END:variables
}
