package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("customer1", "pass@1", employee, new CustomerRole());
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("customer2", "pass@2", employee, new CustomerRole());
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("customer3", "pass@3", employee, new CustomerRole());
        
        return system;
    }
    
}
