/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prayerstimedesktopapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.chrono.HijrahChronology;
import java.time.chrono.HijrahDate;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.joda.time.Chronology;
import org.joda.time.LocalDate;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.ISOChronology;

import org.fmwtech.guifroms.LandingForm;
import org.fmwtech.services.GraphicsPane;import org.fmwtech.guifroms.LandingForm;
import org.fmwtech.model.PrayersTime;
import org.fmwtech.model.Users;
import org.fmwtech.services.GraphicsPane;
import org.fmwtech.services.PrayerTimesServices;
import org.fmwtech.services.UserServices;

/**
 * import org.fmwtech.guifroms.LandingForm; import
 * org.fmwtech.services.TestPane;
 *
 * /**
 *
 * @author ahmed
 */


public class PrayersTimeDesktopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, ParseException {
        // TODO code application logic here
       try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
           
       }

//        JWindow window = new JWindow();
//        window.getContentPane().add(
//                new JLabel("", new ImageIcon(new URL("http://docs.oracle.com/javase/tutorial/uiswing/examples/misc/SplashDemoProject/src/misc/images/splash.gif")), SwingConstants.CENTER));
//        window.setBounds(500, 150, 300, 200);
//        
//        window.setVisible(true);
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        window.setVisible(false);
        LandingForm landing = new LandingForm();
        landing.setVisible(true);
        landing.setLocation(0, 0);
        landing.setVisible(true);
        //landing.hide();
        
        

   PrayerTimesServices ps=new PrayerTimesServices();
   PrayersTime pt=ps.getPrayersTimes(2);
       String[] asrHourpartHours=pt.getAsrTime().toString().split(":");
String asrHourFormated=asrHourpartHours[0];
       
        System.out.println(Integer.parseInt(asrHourFormated));
        System.out.println("asr time"+pt.getAsrTime().getTime());
            DateFormat df=new SimpleDateFormat("HH:mm");

        Date now = new Date();        
        System.out.println(now.getTime());

     
Users user=new Users();
        UserServices userServices=new UserServices();
      user=userServices.checkExistUser("ahmed");
        System.out.println("user name from main " +user.getEmail());
 int x=9;

    }
   
}
