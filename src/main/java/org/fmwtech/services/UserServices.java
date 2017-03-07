/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fmwtech.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.fmwtech.databseconnection.DataBaseConnection;
import org.fmwtech.guifroms.CreateAccountForm;
import org.fmwtech.guifroms.LoginForm;
import org.fmwtech.guifroms.MosqueSetting;
import org.fmwtech.model.Users;

/**
 *
 * @author ahmed
 */
public class UserServices {

    Connection conn = null;
    Statement state = null;
    ResultSet result = null;

    public Users login(String email, String password) {
        String select = "select id,email,password,mosque_name,mosque_location from users where email='" + email + "' and password='" + password + "'";
        Users user = new Users();
        try {
            conn = DataBaseConnection.getConnection();
            state = conn.createStatement();
            result = state.executeQuery(select);
            while (result.next()) {
                user.setId(result.getInt(1));
                user.setEmail(result.getString(2));
                user.setPassword(result.getString(3));
                user.setMosqueName(result.getString(4));
                user.setMosqueLocation(result.getString(5));
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public Users createUser(String email, String password) {
        Users user = new Users();
        String insert = "insert into users(email,password,mosque_name,mosque_location)values('" + email + "','" + password + "','اسم المسجد','')";
        String select = "select id,email,password from users where email='"+email + "' and password='" + password + "'";
        
        try {
            conn = DataBaseConnection.getConnection();
            state = conn.createStatement();            
            state.executeUpdate(insert);
            result = state.executeQuery(select);
            while (result.next()) {
                user.setId(result.getInt(1));
                user.setEmail(result.getString(2));
                user.setPassword(result.getString(3));
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public Users checkExistUser(String email){
         Users user = new Users();
    String select = "select email,id from users where email='"+email + "'";
     try {
            conn = DataBaseConnection.getConnection();
            state = conn.createStatement();
            result = state.executeQuery(select);
            while (result.next()) {
               
                user.setEmail(result.getString(1));
                user.setId(result.getInt(2));
               
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    public void updateNameLocation(int id,String mosqueLocation,String mosqueName){
    
    
    String update ="update users set mosque_name='"+mosqueName+"', mosque_location='"+mosqueLocation+"' where id="+id+"";
    try {
                conn = DataBaseConnection.getConnection();
                state = conn.createStatement();
                 state.executeUpdate(update);
            } catch (SQLException ex) {
                Logger.getLogger(PrayerTimesServices.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("update statement error");
            }    
    }
    
}
