/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.Date;

/**
 *
 * @author caofei
 */
public class Material {
    private String serialnum;
    private String name;
    String date;
    String isAvaliable;
    

    public String getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(String serialnum) {
        this.serialnum = serialnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    
    @Override
    public String toString() {
        return this.name;
    }
  
    
}
