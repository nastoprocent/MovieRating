/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.*;
import Database.MyConnection;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
        
/**
 *
 * @author x14321651
 */
public class AdminPanel extends javax.swing.JFrame {
    
        
        Connection con;
        MyConnection mcon = new MyConnection();        
        String sqlquery = "SELECT * FROM movies";
        Statement stmt;
        ResultSet rts;
     
    public AdminPanel() {
        initComponents(); 
        con = mcon.returnConnection();
        try{
         stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
         rts = stmt.executeQuery(sqlquery);
         movieTable.setModel(DbUtils.resultSetToTableModel(rts));
         Admin_Panel();
        }
        catch(SQLException ex){
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);             
        }
    }   
    private void Admin_Panel() throws SQLException{
        rts=stmt.executeQuery(sqlquery);
        movieTable.setModel(DbUtils.resultSetToTableModel(rts));
    }
    
    String url = "jdbc:mysql://localhost:3306/secureprograming";
    String username = "root";
    String password = "";
                   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchField = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        length = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rating = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        movieTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        logout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 240, -1));

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        title.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                titleKeyTyped(evt);
            }
        });
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 230, -1));

        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                typeKeyTyped(evt);
            }
        });
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 230, -1));

        length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthActionPerformed(evt);
            }
        });
        length.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lengthKeyTyped(evt);
            }
        });
        getContentPane().add(length, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 230, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 20));

        rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingActionPerformed(evt);
            }
        });
        rating.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ratingKeyTyped(evt);
            }
        });
        getContentPane().add(rating, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 230, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Title of the movie");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type of the movie");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Length of the movie");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 170, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Movie Rating");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 170, -1));

        add.setBackground(new java.awt.Color(38, 166, 91));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 70, -1));

        update.setBackground(new java.awt.Color(25, 181, 254));
        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 90, -1));

        delete.setBackground(new java.awt.Color(207, 0, 15));
        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, -1, -1));

        movieTable.setBackground(new java.awt.Color(253, 227, 167));
        movieTable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        movieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Title", "Type", "Lenght min", "Rating 1-10"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        movieTable.setToolTipText("");
        movieTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        if (movieTable.getColumnModel().getColumnCount() > 0) {
            movieTable.getColumnModel().getColumn(0).setPreferredWidth(10);
        }
        String sql="SELECT * FROM movies";

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 420, 402));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 230, -1));

        logout.setBackground(new java.awt.Color(153, 51, 0));
        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 90, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("  Add   - Fill in all fields and press add.\n Update - Type in ID and type details on \n         other fields that you want to change.\n Delete - Type in ID and delete the row.\n Search - You can search using any \n          data id/title/length ext.");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 330, 110));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/movie.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
         try{
             Connection connect=DriverManager.getConnection(url, username, password);
             String sql="INSERT INTO movies (id, title, type, length, rating) VALUES(?, ?, ?, ?, ?)";
             PreparedStatement pst=connect.prepareStatement(sql);
             pst = connect.prepareStatement(sql);
             pst.setString(1, id.getText());
             pst.setString(2, title.getText());
             pst.setString(3, type.getText());
             pst.setString(4, length.getText());
             pst.setString(5, rating.getText());         
             pst.executeUpdate();
             JOptionPane.showMessageDialog(this, "Movie added successfully");  
             Admin_Panel();
           }
           catch(HeadlessException | SQLException e){
               JOptionPane.showMessageDialog(this, e.getMessage());
           }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      try{
         Connection connect=DriverManager.getConnection(url, username, password);
         String sql="UPDATE movies set title=?, type=?, length=?, rating=? WHERE id=?";
         PreparedStatement pst=connect.prepareStatement(sql);
         pst = connect.prepareStatement(sql);
         pst.setString(1, title.getText());
         pst.setString(2, type.getText());
         pst.setString(3, length.getText());
         pst.setString(4, rating.getText());
         pst.setString(5, id.getText());
         pst.executeUpdate();
         JOptionPane.showMessageDialog(this, "Movie updated successfully");
         Admin_Panel();
       }
       catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
         try{
         Connection connect=DriverManager.getConnection(url, username, password);
         String sql="DELETE from movies where id=?";
         PreparedStatement pst=connect.prepareStatement(sql);
         pst = connect.prepareStatement(sql);
         pst.setString(1, id.getText());
         pst.executeUpdate();
         JOptionPane.showMessageDialog(this, "Deleted successfully");
         Admin_Panel();
       }
       catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_deleteActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_titleActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:      
    }//GEN-LAST:event_typeActionPerformed

    private void lengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_lengthActionPerformed

    private void ratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingActionPerformed
        // TODO add your handling code here:        
    }//GEN-LAST:event_ratingActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        try{
        DefaultTableModel table = (DefaultTableModel)movieTable.getModel();        
        String search = searchField.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        movieTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
        Admin_Panel();
        }      
       catch(SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }        
        
    }//GEN-LAST:event_searchFieldKeyReleased

    private void lengthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lengthKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar))
            ||(vchar == KeyEvent.VK_BACK_SPACE)
                    ||(vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_lengthKeyTyped

    private void ratingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ratingKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar))
            ||(vchar == KeyEvent.VK_BACK_SPACE)
                    ||(vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_ratingKeyTyped

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar))
            ||(vchar == KeyEvent.VK_BACK_SPACE)
                    ||(vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_idKeyTyped

    private void titleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if(!(Character.isLetter(vchar))
            ||(vchar == KeyEvent.VK_BACK_SPACE)
                    ||(vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_titleKeyTyped

    private void typeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeKeyTyped
        // TODO add your handling code here:
        char vchar = evt.getKeyChar();
        if(!(Character.isLetter(vchar))
            ||(vchar == KeyEvent.VK_BACK_SPACE)
                    ||(vchar == KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_typeKeyTyped

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
            JOptionPane.showMessageDialog(null, "To edit use fields provided on the right of the application.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try{            
             Admin_Panel();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//GEN-LAST:event_movieTableMouseClicked

    private void movieTableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_movieTableKeyTyped
        // TODO add your handling code here:
        boolean a=movieTable.isEditing();
       if(a==false){
            JOptionPane.showMessageDialog(null, "To edit use fields provided on the right of the application.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try{            
             Admin_Panel();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//GEN-LAST:event_movieTableKeyTyped

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        AdminLogin s = new AdminLogin();
        s.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminPanel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel background;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField length;
    private javax.swing.JButton logout;
    private javax.swing.JTable movieTable;
    private javax.swing.JTextField rating;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField title;
    private javax.swing.JTextField type;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
