/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fmwtech.guifroms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import org.fmwtech.model.PrayersTime;
import org.fmwtech.model.Users;
import org.fmwtech.services.PrayerTimesServices;
import org.fmwtech.services.UserServices;

import prayerstimedesktopapp.PrayersTimeDesktopApp;

/**
 *
 * @author ahmed
 */
public class MosqueSetting extends javax.swing.JFrame {

    /**
     * Creates new form MosqueSetting
     */
    UserServices userServices = new UserServices();

    Users user = LoginForm.userInfoSession();

    PrayerTimesServices prayerServices = new PrayerTimesServices();
    PrayersTime pt = prayerServices.getPrayersTimes(user.getId());

    public MosqueSetting() {
        initComponents();
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("/media/ahmed/102052EB2052D6F6/Work/Fathi Alwosaibi/PrayersTimeDesktop/src/main/java/org/fmwtech/resources/1.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        pack();

        //getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
    }

    URI uri = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        isaaIquama = new javax.swing.JSpinner();
        String[] isaaHourpartsHours=pt.getIsaaTime().toString().split(":");
        String isaaHourFormated=isaaHourpartsHours[0];
        isaaHour = new javax.swing.JSpinner();
        String[] isaaMinparts=pt.getIsaaTime().toString().split(":");
        String isaaMinFormated=isaaMinparts[1];
        isaaMin = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        magribIquama = new javax.swing.JSpinner();
        String[] magribHourpartsHours=pt.getMagribTime().toString().split(":");
        String magribHourFormated=magribHourpartsHours[0];
        magribHour = new javax.swing.JSpinner();
        String[] magribMinparts=pt.getMagribTime().toString().split(":");
        String magribMinFormated=magribMinparts[1];
        magribMin = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        asrIquama = new javax.swing.JSpinner();
        String[] asrHourpartHours=pt.getAsrTime().toString().split(":");
        String asrHourFormated=asrHourpartHours[0];
        asrHour = new javax.swing.JSpinner();
        asrMin = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        douhrIquama = new javax.swing.JSpinner();
        String[] dohrtimeparthour=pt.getDouhrTime().toString().split(":");
        String dohrHoursFormated=dohrtimeparthour[0];
        dohrHour = new javax.swing.JSpinner();
        dohrMin = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        sheroukHour = new javax.swing.JSpinner();
        String[] sheroukminPart=pt.getSheroukTime().toString().split(":");
        String sheroukMinFormated=sheroukminPart[1];
        shroukMin = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        String[] fajrpartsHours=pt.getFajrTime().toString().split(":");
        String fajrHoursFormated=fajrpartsHours[0];
        fajrHour = new javax.swing.JSpinner();
        fajrHour.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(fajrHoursFormated),0 , 60, 1));
        String[] fajrMinutesPart=pt.getFajrTime().toString().split(":");
        String fajrMinutesFormated=fajrMinutesPart[1];
        fajrMin = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fajrIquama = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mosqueLocation = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        mosqueName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));

        jButton1.setText("رحوع");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("حفظ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setText("دقيقة");

        isaaIquama.setModel(new javax.swing.SpinnerNumberModel(pt.getIsaaIquama(), 5, 60, 1));

        isaaHour.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(isaaHourFormated),0 , 60, 1));

        isaaMin.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(isaaMinFormated),0 , 60, 1));

        jLabel13.setText("العشاء");

        jLabel17.setText("دقيقة");

        magribIquama.setModel(new javax.swing.SpinnerNumberModel(pt.getMagribIquama(), 5, 60, 1));

        magribHour.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(magribHourFormated),0 , 60, 1));

        magribMin.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(magribMinFormated),0 , 60, 1));

        jLabel12.setText("المغرب");

        jLabel16.setText("دقيقة");

        asrIquama.setModel(new javax.swing.SpinnerNumberModel(pt.getAsrIquama(), 5, 60, 1));

        asrHour.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(asrHourFormated), 0, 60, 1));

        String[] asrMinpartMinutes=pt.getAsrTime().toString().split(":");
        String asrMinFormated=asrMinpartMinutes[1];

        asrMin.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(asrMinFormated), 0, 60, 1));

        jLabel11.setText("العصر");

        jLabel18.setText("دقيقة");

        douhrIquama.setModel(new javax.swing.SpinnerNumberModel(pt.getDouhrIquama(), 5, 60, 1));

        dohrHour.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(dohrHoursFormated), 0, 60, 1));

        String[] dohrtimepartMinutes=pt.toString().split(":");
        String dohrMinutesFormated=dohrtimeparthour[1];

        dohrMin.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(dohrMinutesFormated), 0, 60, 1));

        jLabel10.setText("الظهر");

        String[] sheroukparts=pt.getSheroukTime().toString().split(":");
        String sheroukHoursFormated=sheroukparts[0];
        sheroukHour.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(sheroukHoursFormated), 0, 60, 1));

        shroukMin.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(sheroukMinFormated), 0, 60, 1));

        jLabel14.setText("الشروق");

        fajrMin.setModel(new javax.swing.SpinnerNumberModel(Integer.parseInt(fajrMinutesFormated),0, 60, 1));

        jLabel7.setText("الفجر");

        jLabel5.setText("دقيقة");

        fajrIquama.setModel(new javax.swing.SpinnerNumberModel(pt.getFajrIquama(), 5, 60, 1));

        jLabel4.setText("الوقت بين الصلاه والاقامه");

        jLabel9.setText("ساعة");

        jLabel8.setText("دقيقة");

        mosqueLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "الرياض", "مكة المكرمة", "المدينة المنورة", " القصيم", "المنطقة الشرقية", "عسير", "تبوك", "حائل", "جازان", "نجران", "الباحة", "الجوف" }));

        jLabel3.setText("موقع المسجد");

        mosqueName.setFont(new java.awt.Font("KacstArt", 0, 24)); // NOI18N
        mosqueName.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        mosqueName.setText(user.getMosqueName());

        jLabel2.setText("اسم المسجد");

        try {
            uri = new URI("http://timesprayer.com/prayer-times-in-riyadh.html");
        } catch (URISyntaxException ex) {
            Logger.getLogger(PrayersTimeDesktopApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        class OpenUrlAction implements ActionListener {
            @Override public void actionPerformed(ActionEvent e) {
                open(uri);
            }
        }
        jButton3.setText("<HTML>Click the <FONT color=\"#000099\"><U>link</U></FONT>"
            + " to go to the Java website.</HTML>");
        jButton3.setHorizontalAlignment(SwingConstants.LEFT);
        jButton3.setBorderPainted(false);
        jButton3.setOpaque(false);
        jButton3.setBackground(Color.BLUE);
        jButton3.setToolTipText(uri.toString());
        jButton3.addActionListener(new OpenUrlAction());
        jButton3.setText("إضافة مواقيت الصلاه من الانترنت");

        jLabel6.setFont(new java.awt.Font("KacstBook", 2, 36)); // NOI18N
        jLabel6.setText("إضافة مواقيت الصلاة");

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("حفظ اسم المسجد وموقعه في قاعده البيانات");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)
                        .addComponent(fajrIquama, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fajrHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sheroukHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fajrMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shroukMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel18)
                        .addGap(54, 54, 54)
                        .addComponent(douhrIquama, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(dohrHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(dohrMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel16)
                        .addGap(54, 54, 54)
                        .addComponent(asrIquama, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(asrHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(asrMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel17)
                        .addGap(54, 54, 54)
                        .addComponent(magribIquama, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(magribHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(magribMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(isaaIquama, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(isaaHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(isaaMin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(mosqueLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(mosqueName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mosqueName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mosqueLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fajrIquama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fajrHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(sheroukHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fajrMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(shroukMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(douhrIquama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dohrHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dohrMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asrIquama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asrHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asrMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(magribIquama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(magribHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(magribMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isaaIquama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isaaHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isaaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HomeForm home = new HomeForm();
        home.setVisible(true);
        home.setLocation(0, 0);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int fajrHours = (int) fajrHour.getValue();
        int fajrMinutes = (int) fajrMin.getValue();
        int sheroukHours = (int) sheroukHour.getValue();
        int sheroukMinutes = (int) shroukMin.getValue();
        int douhrHours = (int) dohrHour.getValue();
        int douhrMinutes = (int) dohrMin.getValue();
        int asrHours = (int) asrHour.getValue();
        int asrMninutes = (int) asrMin.getValue();
        int magribHours = (int) magribHour.getValue();
        int magribMinutes = (int) magribMin.getValue();
        int isaaHours = (int) isaaHour.getValue();
        int isaaMinutes = (int) isaaMin.getValue();
        int fajrIquama = (int) this.fajrIquama.getValue();
        int douhrIquama = (int) this.douhrIquama.getValue();
        int asrIquama = (int) this.asrIquama.getValue();
        int magribIquama = (int) this.magribIquama.getValue();
        int isaaIquama = (int) this.isaaIquama.getValue();

        PrayersTime ptModel = new PrayersTime();
        ptModel.setFajrTime(new Date(0, 1, 1, fajrHours, fajrMinutes));
        ptModel.setFajrIquama(fajrIquama);
        ptModel.setSheroukTime(new Date(0, 1, 1, sheroukHours, sheroukMinutes));
        ptModel.setDouhrTime(new Date(0, 1, 1, douhrHours, douhrMinutes));
        ptModel.setDouhrIquama(douhrIquama);
        ptModel.setAsrTime(new Date(0, 1, 1, asrHours, asrMninutes));
        ptModel.setAsrIquama(asrIquama);
        ptModel.setMagribTime(new Date(0, 1, 1, magribHours, magribMinutes));
        ptModel.setMagribIquama(magribIquama);
        ptModel.setIsaaTime(new Date(0, 1, 1, isaaHours, isaaMinutes));
        ptModel.setIsaaIquama(isaaIquama);
        ptModel.setMosqueID(user.getId());

        PrayersTime pt = prayerServices.getPrayersTimes(user.getId());
        if (pt == null) {
            prayerServices.savePrayersTime(ptModel);
            JOptionPane.showMessageDialog(null, "تم تحديث مواقيت الصلاه");
        } else {
            prayerServices.updatePrayerTimes(ptModel);
            JOptionPane.showMessageDialog(null, "تم تحديث مواقيت الصلاه");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        // TODO add your handling code here:
                UserServices userServices=new UserServices();
                 userServices.updateNameLocation(user.getId(), mosqueLocation.getItemAt(WIDTH), mosqueName.getText());
                 JOptionPane.showMessageDialog(null, "تم تحديث اسم المسجد والموقع");
                 

    }//GEN-LAST:event_jButton4ActionPerformed
    private static void open(URI uri) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(uri);
            } catch (IOException e) {
                /* TODO: error handling */ }
        } else {
            /* TODO: error handling */ }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner asrHour;
    private javax.swing.JSpinner asrIquama;
    private javax.swing.JSpinner asrMin;
    private javax.swing.JSpinner dohrHour;
    private javax.swing.JSpinner dohrMin;
    private javax.swing.JSpinner douhrIquama;
    private javax.swing.JSpinner fajrHour;
    private javax.swing.JSpinner fajrIquama;
    private javax.swing.JSpinner fajrMin;
    private javax.swing.JSpinner isaaHour;
    private javax.swing.JSpinner isaaIquama;
    private javax.swing.JSpinner isaaMin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner magribHour;
    private javax.swing.JSpinner magribIquama;
    private javax.swing.JSpinner magribMin;
    private javax.swing.JComboBox<String> mosqueLocation;
    private javax.swing.JTextField mosqueName;
    private javax.swing.JSpinner sheroukHour;
    private javax.swing.JSpinner shroukMin;
    // End of variables declaration//GEN-END:variables

}
