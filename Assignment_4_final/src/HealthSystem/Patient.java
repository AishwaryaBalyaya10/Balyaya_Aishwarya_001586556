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
public class Patient extends Person {
    
    public Patient(Person p){
        name = p.name;
        age = p.age;
        cnt = p.cnt;
        commnuity = p.commnuity;
        Gender = p.Gender;
        cnt = p.cnt;
        
    }
}
