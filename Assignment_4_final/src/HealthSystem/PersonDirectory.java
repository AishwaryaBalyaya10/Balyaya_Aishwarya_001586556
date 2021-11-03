/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HealthSystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Aish
 */
public class PersonDirectory {
ArrayList<Person> personList;
 

    public PersonDirectory() {
        personList = new ArrayList<>();
    }
    
    public void addPerson(Person p) {
        personList.add(p);
    }
    
    public void deletePerson(Person p) {
        personList.remove(p);
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    
        public void deleteByName(String name) {
        for (Person v : personList) {

            if (v.getName() == name) {
                personList.remove(v);
                break;
            }
        }
    }
}
