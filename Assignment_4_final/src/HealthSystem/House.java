/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthSystem;

/**
 *
 * @author Aish
 */
public class House extends Community{
    String streetName;
    String aptNo;
    public static String[] States = Community.State; 
    public static String[] Cities = Community.City;
    // Since extending can access community and getters and setters for community 
    // can access cities as well

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }
}
