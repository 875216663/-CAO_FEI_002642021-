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
public class PetDirectory {
    ArrayList<Pet> petlist;
    public PetDirectory() {
        this.petlist = new ArrayList<Pet>();
    } 

    public ArrayList<Pet> getPetlist() {
        return petlist;
    }

    public void setPetlist(ArrayList<Pet> petlist) {
        this.petlist = petlist;
    }
    public void removePet(String  petname) {
        for(Pet p: this.petlist) {
            if(p.getPetName().equals(petname)){    
                this.petlist.remove(p);
                break;
            }
        }
    }
    public Pet createPet(String  petName,int petAge,String petGender,String petType,String petBreed) {
        Pet pet = new Pet();
        
        pet.setPetName(petName);
        pet.setPetAge(petAge);
        pet.setPetType(petType);
        pet.setPetGender(petGender);
        pet.setPetBreed(petBreed);
        
        
        this.petlist.add(pet);
        
        return pet;
    }
    
    public Boolean checkIfPetUnique(String petname) {
        for(Pet p: this.petlist) {
            if(p.getPetName().equals(petname)) {
                return false;
            }
        }
        return true;
    }
    public Pet findObservation(String petname) {
        for(Pet p: this.petlist) {
            if (p.getPetName().equals(petname)) {
                return p;
            }
        }
        return null;
}
}