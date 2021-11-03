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
public class Encounter extends VitalSigns {
    
    public int personID;
    public String name;
    public int age;
    public int cnt;
    public String city;
    public boolean isAbnormal = false;

    public boolean isIsAbnormal() {
        return isAbnormal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String commnuity;
    public String Gender;
    public String Group;

    public String getGroup() {
        return Group;
    }

    public void setAgeGroup(int AgeGroup) {
        if(AgeGroup == 1)
            this.Group = "Young";
        else if(AgeGroup == 2)
            this.Group = "Young Adult";
        else if(AgeGroup == 3)
            this.Group = "Adult";
        else if(AgeGroup == 4)
            this.Group = "Old Adult";
        else
            this.Group = "Old";
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getCommnuity() {
        return commnuity;
    }

    public void setCommnuity(String commnuity) {
        this.commnuity = commnuity;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    @Override
    public int getBloodPressure(){
        return bloodPressure;
    }
    
    @Override
    public void setBloodPressure(int BP, int g){
        bloodPressure = BP;
        if(bloodPressure > 79 && g == 1)
            isAbnormal = true;
        if(bloodPressure > 76 && g == 2)
            isAbnormal = true;
        if(bloodPressure > 79 && g == 3)
            isAbnormal = true;
        if(bloodPressure > 81 && g == 4)
            isAbnormal = true;
        if(bloodPressure > 75 && g == 5)
            isAbnormal = true;
    }
    
    public void setPerson(int pid){
        personID = pid;
    }
    
}
