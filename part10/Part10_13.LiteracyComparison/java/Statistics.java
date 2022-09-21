/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Statistics {
    private String country;
    private int year;
    private String  gender;
    private double rate;

    public Statistics(String country, int year, String gender, double rate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.rate = rate;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public double getRate() {
        return rate;
    }
    public String toString(){
        return  this.getCountry() + " (" + this.getYear() + "), " + this.getGender() + ", " + this.getRate();
    }

}

