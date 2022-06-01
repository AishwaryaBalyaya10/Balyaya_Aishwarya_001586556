/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList = new ArrayList();
    }
    
    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }
    
    public Customer createCustomer(String name){
        Customer c = new Customer();
        c.setName(name);
        customerList.add(c);
        return c;
    }
}
