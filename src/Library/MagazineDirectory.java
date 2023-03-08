/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class MagazineDirectory {
     ArrayList<Magazine> magazinelist;
      
    
    public MagazineDirectory() {
        this.magazinelist = new ArrayList<Magazine>();
    }

    public ArrayList<Magazine> getMagazinelist() {
        return magazinelist;
    }

    public void setMagazinelist(ArrayList<Magazine> magazinelist) {
        this.magazinelist = magazinelist;
    }
    
     public Magazine createMagazine(String cname,String type,String serialnum,String name,String date) {
        Magazine c = new Magazine();
          c.setComname(cname);
          c.setIssuetype(type);
          c.setSerialnum(serialnum);
          c.setName(name);
          c.setDate(date);
       
        
        this.magazinelist.add(c);
        return c;
    }
    
}
