package com.example.android.quakereport;

public class Earthquake {

    private String nMagntude;


    private String nLocation;


    private  String nDate;





  public Earthquake(String magnitude, String location, String date){
      nMagntude = magnitude;
      nLocation = location;
      nDate = date;
      }


   public String getMagnitude(){
      return nMagntude;
   }


    public String getLocation(){
        return nLocation;
    }

    public String getDate(){
        return nDate;
    }

}
