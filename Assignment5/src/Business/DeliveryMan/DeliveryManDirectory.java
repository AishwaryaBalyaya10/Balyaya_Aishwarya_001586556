/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
     private ArrayList<DeliveryMan> deliveryList;
     
     public DeliveryManDirectory() {
        deliveryList = new ArrayList();
    }
   
    public ArrayList<DeliveryMan> getEmployeeList() {
        return deliveryList;
    }
    
    public DeliveryMan createEmployee(String name){
        DeliveryMan dm = new DeliveryMan();
        dm.setName(name);
        deliveryList.add(dm);
        return dm;
    }
     
}
