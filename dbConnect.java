/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;
import javax.swing.JOptionPane;
public class dbConnect {
    public static Connection con;
    public static Statement s;
    
    static{
        
         try{
         con = DriverManager.getConnection(
         "jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false", "root", "saurav");
         s = con.createStatement();
         }
         catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
