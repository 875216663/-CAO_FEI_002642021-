/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Applicant;

import Insurance.PlanDetail;

/**
 *
 * @author caofei
 */
public class Applicant {
    String applicationID;
    String OwnerFirstname;
    String OwnerLastName;
    PlanDetail petinsurancePlan;
    Pet pet;

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public String getOwnerFirstname() {
        return OwnerFirstname;
    }

    public void setOwnerFirstname(String OwnerFirstname) {
        this.OwnerFirstname = OwnerFirstname;
    }

    public String getOwnerLastName() {
        return OwnerLastName;
    }

    public void setOwnerLastName(String OwnerLastName) {
        this.OwnerLastName = OwnerLastName;
    }

    public PlanDetail getPetinsurancePlan() {
        return petinsurancePlan;
    }

    public void setPetinsurancePlan(PlanDetail petinsurancePlan) {
        this.petinsurancePlan = petinsurancePlan;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.applicationID);
    }
    
    
    
}
