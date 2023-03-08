/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Employee.Librarian;
import Employee.Manager;
import java.util.ArrayList;



/**
 *
 * @author caofei
 */
public class Library {
    

   
   BookDirectory bookdirectory;
   MagazineDirectory magazineDirectory;
   int buildingnum;
   
      
    
    public Library() {
        
        this.bookdirectory = new BookDirectory();
        this.magazineDirectory=new MagazineDirectory();
        
       
    }

    public BookDirectory getBookdirectory() {
        return bookdirectory;
    }

    public void setBookdirectory(BookDirectory bookdirectory) {
        this.bookdirectory = bookdirectory;
    }

    

    public MagazineDirectory getMagazineDirectory() {
        return magazineDirectory;
    }

    public void setMagazineDirectory(MagazineDirectory magazineDirectory) {
        this.magazineDirectory = magazineDirectory;
    }

    

    public int getBuildingnum() {
        return buildingnum;
    }

    public void setBuildingnum(int buildingnum) {
        this.buildingnum = buildingnum;
    }
    

    
}
