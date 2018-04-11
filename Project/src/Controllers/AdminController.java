/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.Database;
import Hash.PasswordUtils;
import Models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author x14321651
 */
public class AdminController extends User{
    
    Database db;
    Connection con;
    PreparedStatement pst;
    
    public AdminController() {
        super();
        db = new Database();
        con = db.getConnection();
    }      
    
    public boolean checkLogin(User a) {
        
        String sql = "";
        ResultSet rs = null;
        
        try {
            sql = "SELECT * FROM admin WHERE email = ? and password = ?";
            pst = con.prepareStatement(sql);
            
            pst.setString(1, a.getEmail());
            pst.setString(2, PasswordUtils.encryptPassword(a.getPassword()));
            
            rs = pst.executeQuery();
            
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
            
            
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return false;
    }
    
}
