/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Applicant;

import java.util.ArrayList;

/**
 *
 * @author caofei
 */
 
public class ApplicantDirectory {
    ArrayList<Applicant> applicantlist;
    public ApplicantDirectory() {
        this.applicantlist = new ArrayList<Applicant>();
    }   

    public ArrayList<Applicant> getApplicantlist() {
        return applicantlist;
    }

    public void setApplicantlist(ArrayList<Applicant> applicantlist) {
        this.applicantlist = applicantlist;
    }
    
    
    public void removeApplicant(String id) {
        for(Applicant app: this.applicantlist) {
            if(app.getApplicationID().equals(id)) {
                this.applicantlist.remove(app);
                break;
            }
        }
    }
    public Applicant createApplicant(String id,String fname, String lname) {
        Applicant applicant = new Applicant();
        
        applicant.setApplicationID(id);
        applicant.setOwnerFirstname(fname);
        applicant.setOwnerLastName(lname);
        
        this.applicantlist.add(applicant);
        
        return applicant;
    }
    public Boolean checkIfApplicantUnique(String id) {
        for(Applicant app: this.applicantlist) {
            if(app.getApplicationID().equals(id)) {
                return false;
            }
        }
        return true;
    }
    public Applicant findApplicant(String id) {
        for(Applicant applicant: this.applicantlist) {
            if(applicant.getApplicationID().equals(id)) {
                return applicant;
            }
        }
        return null;
    }
    
    public Applicant findApplicantByName(String firstName, String lastName) {
        for(Applicant applicant: this.applicantlist) {
            if(applicant.getOwnerFirstname().equals(firstName) && applicant.getOwnerLastName().equals(lastName)) {
                return applicant;
            }
        }
        return null;
    }
    
}




    