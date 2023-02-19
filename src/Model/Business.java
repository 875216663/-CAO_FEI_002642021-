/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import Applicant.ApplicantDirectory;
import Applicant.PetDirectory;
import Insurance.InsurancePlan;

/**
 *
 * @author caofei
 */
public class Business {

    /**
     * @param args the command line arguments
     */
    private ApplicantDirectory appDirectory;
    private InsurancePlan insPlan;
    private PetDirectory petDirectory;
    
    public Business() {
        this.appDirectory=new ApplicantDirectory();
        this.insPlan=new InsurancePlan();
        this.petDirectory=new PetDirectory();
         
    }

    public ApplicantDirectory getAppDirectory() {
        return appDirectory;
    }

    public void setAppDirectory(ApplicantDirectory appDirectory) {
        this.appDirectory = appDirectory;
    }

    public InsurancePlan getInsPlan() {
        return insPlan;
    }

    public void setInsPlan(InsurancePlan insPlan) {
        this.insPlan = insPlan;
    }

    public PetDirectory getPetDirectory() {
        return petDirectory;
    }

    public void setPetDirectory(PetDirectory petDirectory) {
        this.petDirectory = petDirectory;
    }

   
    
    
}
