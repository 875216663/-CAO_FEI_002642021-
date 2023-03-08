/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class EmployeeDirectory {
    ArrayList<Librarian> librarianList;
    ArrayList<Manager> managerList;
    
     
    public EmployeeDirectory() {
        this.librarianList = new ArrayList<Librarian>();
        this.managerList = new ArrayList<Manager>();
    }

    public ArrayList<Librarian> getLibrarianList() {
        return librarianList;
    }

    public void setLibrarianList(ArrayList<Librarian> librarianList) {
        this.librarianList = librarianList;
    }

    public ArrayList<Manager> getManagerList() {
        return managerList;
    }

    public void setManagerList(ArrayList<Manager> managerList) {
        this.managerList = managerList;
    }

    
    
   

    
    
//    public Employee findById(String id) {
//        for(Employee d: this.employeeList) {
//            if(d.getPersonID().equals(id)) {
//                return d;
//            }
//        }
//        
//        return null;
//    }
    
       
    
    public Librarian createLibrarian(String id, String name,String experience,String designation) {
        Librarian l = new Librarian();
        l.setPersonID(id);
        l.setName(name);     
        l.setExperience(experience);
        l.setDesignation(designation);
        this.librarianList.add(l);
        return l;
    }
    public Manager createManager(String id, String name,String experience,String designation) {
        Manager m = new Manager();
        m.setPersonID(id);
        m.setName(name); 
        m.setExperience(experience);
        m.setDesignation(designation);
        this.managerList.add(m);
        return m;
    }
    
}
