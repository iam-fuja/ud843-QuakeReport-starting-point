package com.example.android.quakereport;

public class Earthquake {

    private double nMagntude;


    private String nLocation;


    private Long nTimeInMilliseconds;


    /**
     * Website URL of the earthquake
     */
    private String mUrl;


    public Earthquake(double magnitude, String location, Long timeInMilliseconds, String url) {
      nMagntude = magnitude;
      nLocation = location;
        nTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    public double getMagnitude(){
      return nMagntude;
   }


    public String getLocation(){
        return nLocation;
    }

    public Long getTimeInMilliseconds() {
        return nTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;}

}
