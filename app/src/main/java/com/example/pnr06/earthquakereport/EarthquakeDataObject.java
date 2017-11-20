package com.example.pnr06.earthquakereport;

import android.widget.ArrayAdapter;

/**
 * Created by PNR06 on 11/19/2017.
 */

public class EarthquakeDataObject {
    private String mag;
    private String loc;
    private String time;

    public EarthquakeDataObject(String mag, String loc, String time) {
        this.mag = mag;
        this.loc = loc;
        this.time = time;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
