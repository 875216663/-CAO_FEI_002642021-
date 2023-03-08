/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class CustomerDirectory {
    ArrayList<Customer> customerlist;
      
    
    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customer>();
    }
    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
    
   
    
   //根据id查找
    public Customer findById(String id) {
        for(Customer c: this.customerlist) {
            if(c.getPersonID().equals(id)) {
                return c;
            }
        }
        
        return null;
    }
    //创建消费者
    public Customer createCustomer(String id, String name) {
        Customer c = new Customer();
        c.setPersonID(id);
        c.setName(name);
        
        
        this.customerlist.add(c);
        return c;
    }
}
