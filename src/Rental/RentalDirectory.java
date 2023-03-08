/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental;


import Library.Book;
import Library.Magazine;
import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class RentalDirectory {
     ArrayList<Rental> rentallist;
     static int allrentprice=0;

    public RentalDirectory() {
        this.rentallist = new ArrayList<Rental>();
    }

    public ArrayList<Rental> getRentallist() {
        return rentallist;
    }

    public void setRentallist(ArrayList<Rental> rentallist) {
        this.rentallist = rentallist;
    }

    public int getAllrentprice() {
        return allrentprice;
    }

    public void setAllrentprice(int allrentprice) {
        this.allrentprice = allrentprice;
    }
    
    
     public Rental findByBook(Book book) {
        for(Rental r: this.rentallist) {
            if(r.getBook()==book) {
                return r;
            }
        }
        
        return null;
    }
     public Rental findByMagazine(Magazine magazine) {
        for(Rental r: this.rentallist) {
            if(r.getMagazine()==magazine) {
                return r;
            }
        }
        
        return null;
    }
    
}
