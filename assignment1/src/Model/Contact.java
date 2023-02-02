/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class Contact {//一个分类可以同时关联至person和recipe
    
    long phoneNumber;
    String emailID;

    ArrayList<Recipe> recipeList;
    Person person;
    
    public Contact(){
        this.person=new Person();
        this.recipeList=new ArrayList<Recipe>();
    }

    

    public ArrayList<Recipe> getProductList() {
        return recipeList;
    }

    public void setProductList(ArrayList<Recipe> productList) {
        this.recipeList = productList;
    }

    public Person getCustomer() {
        return person;
    }

    public void setCustomer(Person customer) {
        this.person = customer;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    //方法帮助生产创造product
    public Recipe createRecipe(String recT,float noS,String igF,double dL,int noI,String coF,String deS) {
        Recipe recipe = new Recipe();
        
        recipe.setRecT(recT);
        recipe.setNoS(noS);
        recipe.setIgF(igF);
        recipe.setdL(dL);
        recipe.setNoI(noI);
        recipe.setCoF(coF);
        recipe.setDeS(deS);
       
        this.recipeList.add(recipe);//将产生的recipe存在recipelist中

        return recipe;
    }

    public Recipe findRecipe(String pid) {//找
        for (Recipe prod : this.recipeList) {
            if (prod.getRecT() == pid) {
                return prod;
            }
        }
        return null;
    }
    
}
