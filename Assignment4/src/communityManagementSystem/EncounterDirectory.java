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
public class EncounterDirectory {
    Stack<Encounter> encounterDirectory = new Stack<>();
    
    public void addEncounter(Encounter et){
        encounterDirectory.push(et);
        JOptionPane.showMessageDialog(null, et.bloodPressure);
    }

    public Stack<Encounter> getEncounter() {
        return encounterDirectory;
    }

    public int getSize() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return encounterDirectory.size();
    }
    
    
}
