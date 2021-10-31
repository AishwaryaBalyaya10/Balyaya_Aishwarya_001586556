/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communityManagementSystem;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Aish
 */
public class HouseDirectory {
    ArrayList<House> ah = new ArrayList<>();
    
    public void addHouse(House h){
        ah.add(h);
    }

    public ArrayList<House> getEncounter() {
        return ah;
    }
    
    public int getSize(){
        return ah.size();
    }
    
    
}
