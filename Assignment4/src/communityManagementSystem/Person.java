package communityManagementSystem;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aish
 */
public class Person {
    

    public Person() {
        //++cnt;
    }
    //This is for passsing value to patient
    public Person(int cnt){
        this.passedcnt =  cnt;
    }
    int passedcnt;
    String name;
    int age;
    String city;
    String commnuity;
    String Gender;
    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    int cnt;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
    
    public int getPersonID() {
        return cnt;
    }
    
    public int getPassedCnt() {
        return cnt;
    }

    public void setCnt(int i) {
        cnt = i;
    }
    
}
