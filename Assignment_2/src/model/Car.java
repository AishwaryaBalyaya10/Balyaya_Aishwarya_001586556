/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author aishw
 */
public class Car {
    private String Car_Make ;
    private int  Model_Year;
    private int No_of_Seats;
    private int Serial_No;
    private int Model_No;
    private String Expiery_Maintnance;
    private String Availability;
    private String City;
    private String Expiry;

    public String getExpiry() {
        return Expiry;
    }

    public void setExpiry(String Expiry) {
        this.Expiry = Expiry;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String Availability) {
        this.Availability = Availability;
    }

    public String getCar_Make() {
        return Car_Make;
    }

    public void setCar_Make(String Car_Make) {
        this.Car_Make = Car_Make;
    }

    public int getModel_Year() {
        return Model_Year;
    }

    public void setModel_Year(int Model_Year) {
        this.Model_Year = Model_Year;
    }

    public int getNo_of_Seats() {
        return No_of_Seats;
    }

    public void setNo_of_Seats(int No_of_Seats) {
        this.No_of_Seats = No_of_Seats;
    }

    public int getSerial_No() {
        return Serial_No;
    }

    public void setSerial_No(int Serial_No) {
        this.Serial_No = Serial_No;
    }

    public int getModel_No() {
        return Model_No;
    }

    public void setModel_No(int Model_No) {
        this.Model_No = Model_No;
    }

    public String getExpiery_Maintnance() {
        return Expiery_Maintnance;
    }

    public void setExpiery_Maintnance(String Expiery_Maintnance) {
        this.Expiery_Maintnance = Expiery_Maintnance;
    }
    
    
            }
