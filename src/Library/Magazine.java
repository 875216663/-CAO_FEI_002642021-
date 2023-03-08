/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Customer.Customer;
import Employee.Manager;

/**
 *
 * @author caofei
 */
public class Magazine extends Material{
    private String comname;
    private String issuetype;
    String status;
    Customer customer;
    Manager manager;
    int price;
    String duration;
    public Magazine(){
        super();
        this.customer=new Customer();
        this.manager=new Manager();
        this.status="unborowed";
    }

    public String getComname() {
        return comname;
       
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(String issuetype) {
        this.issuetype = issuetype;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    
}
