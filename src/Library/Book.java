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
public class Book extends Material {
    
    String author;
    String genre;
    String status;
    String noofpage;
    String language;
    Manager manager;
    Customer customer;
    int price;
    String typeofbinding;
    String duration;
    
 
    public Book(){
        this.customer=new Customer();
        this.status="unborrowed";
        this.customer=new Customer();
        this.manager=new Manager();
    }
   

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNoofpage() {
        return noofpage;
    }

    public void setNoofpage(String noofpage) {
        this.noofpage = noofpage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeofbinding() {
        return typeofbinding;
    }

    public void setTypeofbinding(String typeofbinding) {
        this.typeofbinding = typeofbinding;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIsAvaliable() {
        return isAvaliable;
    }

    public void setIsAvaliable(String isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    
    
}
