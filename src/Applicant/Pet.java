/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Applicant;

import Insurance.PlanDetail;
import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class Pet {
   String  petName;
   int petAge;
   String petGender;
   String petType;
   String petBreed;
   ArrayList<Vaccine> vaccineList;
   String plan;
    
   

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getPetGender() {
        return petGender;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
    public Vaccine createVaccine(String name, Boolean completed) {
        Vaccine vaccine = new Vaccine();
        vaccine.setVaccineName(name);
        vaccine.setCompleted(completed);
        
        this.vaccineList.add(vaccine);
        
        return vaccine;
    }
     public Boolean checkIfVaccineUnique(String name) {
        for(Vaccine vaccine: this.vaccineList) {
            if(vaccine.getVaccineName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    
    @Override
    public String toString() {
        return String.valueOf(this.petName);
    }

    
   
   
   
    
    
}
