/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental;

import Customer.Customer;
import Library.Book;
import Library.Magazine;

/**
 *
 * @author caofei
 */
public class Rental {
    private String rentalId;
    private int price=3;
    private String status;
    private String rentalDuration;
    private String branchName;
    private String customerId;
    private static int counter = 0;
    private Book book;
    private Magazine magazine;
    
    public Rental(){
        this.rentalId="rental"+this.counter++;
        this.book=new Book();
        this.magazine=new Magazine();
    }

    public String getRentalId() {
        return rentalId;
    }

    public void setRentalId(String rentalId) {
        this.rentalId = rentalId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(String rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Rental.counter = counter;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
    
}
