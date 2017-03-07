/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fmwtech.databseconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class DataBaseConnection {
    
    static Connection connection = null;
    static final String DB_URL = "jdbc:mysql://localhost:3306/timeprayer";

      
    public static Connection getConnection() {
      
      if(connection!=null){
          
          return connection;
      }else{
          try {
              Class.forName("com.mysql.jdbc.Driver");
              connection  = DriverManager.getConnection(DB_URL,"root","root");
          } catch (ClassNotFoundException ex) {
        	  JOptionPane.showMessageDialog(null, "drivermissing");

              Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
          }
          
          return connection;
      }
    }
    
   

    
}
