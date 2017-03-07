package org.fmwtech.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrayersTime {
    DateFormat df=new SimpleDateFormat("HH:mm");
	//private int prayersID;
	private int mosqueID;
	private Date fajrTime;
	private int fajrIquama;
	private Date sheroukTime;
	private Date douhrTime;
	private int douhrIquama;
	private Date asrTime;
	private int asrIquama;
	private Date magribTime;
	private int magribIquama;
	private Date isaaTime;
        private int isaaIquama;

    public DateFormat getDf() {
        return df;
    }

    public void setDf(DateFormat df) {
        this.df = df;
    }

    public int getIsaaIquama() {
        return isaaIquama;
    }

    public void setIsaaIquama(int isaaIquama) {
        this.isaaIquama = isaaIquama;
    }

    public int getMosqueID() {
        return mosqueID;
    }
    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }


    public void setMosqueID(int mosqueID) {
        this.mosqueID = mosqueID;
    }

    public Date getFajrTime() {
        return fajrTime;
    }
    
    public String getFajrTimeFormated() {
        return df.format(fajrTime);
    }

    public void setFajrTime(Date fajrTime) {
        this.fajrTime = fajrTime;
    }

    public int getFajrIquama() {
        return fajrIquama;
    }

    public void setFajrIquama(int fajrIquama) {
        this.fajrIquama = fajrIquama;
    }

    public Date getSheroukTime() {
        return sheroukTime;
    }
    public String getSheroukTimeFormated() {
        return df.format(sheroukTime);
    }

    public void setSheroukTime(Date sheroukTime) {
        this.sheroukTime = sheroukTime;
    }

    public Date getDouhrTime() {
        return douhrTime;
    }
     public String getDouhrTimeFormated() {
        return df.format(douhrTime);
    }

    public void setDouhrTime(Date douhrTime) {
        this.douhrTime = douhrTime;
    }

    public int getDouhrIquama() {
        return douhrIquama;
    }

    public void setDouhrIquama(int douhrIquama) {
        this.douhrIquama = douhrIquama;
    }

    public Date getAsrTime() {
        return asrTime;
    }
    public String getAsrTimeFormated() {
        return df.format(asrTime);
    }

    public void setAsrTime(Date asrTime) {
        this.asrTime = asrTime;
    }

    public int getAsrIquama() {
        return asrIquama;
    }

    public void setAsrIquama(int asrIquama) {
        this.asrIquama = asrIquama;
    }

    public Date getMagribTime() {
        return magribTime;
    }
     public String getMagribTimeFormated() {
        return df.format(magribTime);
    }

    public void setMagribTime(Date magribTime) {
        this.magribTime = magribTime;
    }

    public int getMagribIquama() {
        return magribIquama;
    }

    public void setMagribIquama(int magribIquama) {
        this.magribIquama = magribIquama;
    }

    public Date getIsaaTime() {
        return isaaTime;
    }
    public String getIsaaTimeFormated() {
        return df.format(isaaTime);
    }

    public void setIsaaTime(Date isaaTime) {
        this.isaaTime = isaaTime;
    }
	
	

}
