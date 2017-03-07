package org.fmwtech.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

import org.fmwtech.databseconnection.DataBaseConnection;
import org.fmwtech.guifroms.LoginForm;
import org.fmwtech.model.PrayersTime;
import org.fmwtech.model.Users;

public class PrayerTimesServices {
	Connection conn = null;
    Statement state = null;
    ResultSet result = null;
    public PrayersTime selectPrayerTimes(int mosqueID){
    	
    	String select="";
    	PrayersTime pt=new PrayersTime();
    	try {
            conn = DataBaseConnection.getConnection();
            state = conn.createStatement();
            result = state.executeQuery(select);
            while (result.next()) {
               
            }
            System.out.println("Asraaaaaa"+pt.getAsrIquama());
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    	return pt;
    }
    public void savePrayersTime(PrayersTime ptModel){
         String insert="insert into prayertimes(fajr_time,fajr_iquama,sherouk_time,douhr_time,douhr_iquama,asr_time,asr_iquama,magrib_time,magrib_iquama,isaa_time,isaa_iquama,mousque_id)values"
                 + "('"+ptModel.getFajrTimeFormated()+"',"+ptModel.getFajrIquama()+""
                 + ",'"+ptModel.getSheroukTimeFormated()+"',"
                 + "'"+ptModel.getDouhrTimeFormated()+"',"+ptModel.getDouhrIquama()+","
                 + "'"+ptModel.getAsrTimeFormated()+"',"+ptModel.getAsrIquama()+","
                 + "'"+ptModel.getMagribTimeFormated()+"',"+ptModel.getMagribIquama()+","
                 + "'"+ptModel.getIsaaTimeFormated()+"',"+ptModel.getIsaaIquama()+","
                 + ""+ptModel.getMosqueID()+")";
         
            try {
                conn = DataBaseConnection.getConnection();
                state = conn.createStatement();
                 state.executeUpdate(insert);
            } catch (SQLException ex) {
                Logger.getLogger(PrayerTimesServices.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("inser statement error");
            }
           
    
        
    
    }
    public PrayersTime getPrayersTimes(int userID){
        
        String select="SELECT fajr_time,fajr_iquama,sherouk_time,"
                + "douhr_time,douhr_iquama,asr_time,asr_iquama,magrib_time,"
                + "magrib_iquama,isaa_time,isaa_iquama FROM timeprayer.prayertimes "
                + "where mousque_id="+userID+" ";
        PrayersTime pt=new PrayersTime();
        try {
                conn = DataBaseConnection.getConnection();
                state = conn.createStatement();
                result = state.executeQuery(select);
                while (result.next()) {
                pt.setFajrTime(result.getTime(1));
                pt.setFajrIquama(result.getInt(2));
                pt.setSheroukTime(result.getTime(3));
                pt.setDouhrTime(result.getTime(4));
                pt.setDouhrIquama(result.getInt(5));
                pt.setAsrTime(result.getTime(6));
                pt.setAsrIquama(result.getInt(7));
                pt.setMagribTime(result.getTime(8));
                pt.setMagribIquama(result.getInt(9));
                pt.setIsaaTime(result.getTime(10));
                pt.setIsaaIquama(result.getInt(11));
               
            }


            } catch (SQLException ex) {
                Logger.getLogger(PrayerTimesServices.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("inser statement error");
            }
        
    return pt;

    }
    public void updatePrayerTimes(PrayersTime ptModel){
        String update ="update prayertimes set fajr_time='"+ptModel.getFajrTimeFormated()+"' "
                + ",fajr_iquama= "+ptModel.getFajrIquama()+""
                + ",sherouk_time= '"+ptModel.getSheroukTimeFormated()+"' "
                + ",douhr_time='"+ptModel.getDouhrTimeFormated()+"' "
                + ",douhr_iquama="+ptModel.getDouhrIquama()+" "
                + ",asr_time='"+ptModel.getAsrTimeFormated()+"' "
                + ",asr_iquama="+ptModel.getAsrIquama()+" "
                + ",magrib_time='"+ptModel.getMagribTimeFormated()+"' "
                + ",magrib_iquama= "+ptModel.getMagribIquama()+","
                + "isaa_time='"+ptModel.getIsaaTimeFormated()+"' ,isaa_iquama="+ptModel.getIsaaIquama()+"  "
                + "where mousque_id="+ptModel.getMosqueID()+"";
        try {
                conn = DataBaseConnection.getConnection();
                state = conn.createStatement();
                 state.executeUpdate(update);
            } catch (SQLException ex) {
                Logger.getLogger(PrayerTimesServices.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("inser statement error");
            }
    
    }
public void saveUserIdInPRayertimes(int userId){
    String insert="insert into prayertimes(mousque_id) values("+userId+")";
     try {
                conn = DataBaseConnection.getConnection();
                state = conn.createStatement();
                 state.executeUpdate(insert);
     } catch (SQLException ex) {
                Logger.getLogger(PrayerTimesServices.class.getName()).log(Level.SEVERE, null, ex);
                
            }
    }
public void displayPraeronScreen(Date currentPrayer,Date nextPrayer,int ekamaTime,JLabel label,String labelContent) throws ParseException{
    DateFormat df=new SimpleDateFormat("HH:mm");    
    Date now=new Date();
     now=df.parse(df.format(now));
        if(now.getTime()>=currentPrayer.getTime()){
           
            
   
        
       
        if(now==currentPrayer){
        
        }else if(now.getTime()<currentPrayer.getTime()+(ekamaTime+1000 * 60)){
        
        }
             }
  
     }

     public String iquamaFormate(Date salahTime,int iquamaTime){
     
     
     String[] salahParts=salahTime.toString().split(":");
    int sum=(Integer.parseInt(salahParts[1])+iquamaTime);
    String iquamaFroamte=salahParts[0]+":"+String.valueOf(sum);
    
    return iquamaFroamte;
     }
}
