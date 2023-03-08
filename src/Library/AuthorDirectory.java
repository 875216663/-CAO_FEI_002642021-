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
public class AuthorDirectory {
     ArrayList<Author> authorlist;
      
    
    public AuthorDirectory() {
        this.authorlist = new ArrayList<Author>();
    }

    public ArrayList<Author> getAuthorlist() {
        return authorlist;
    }

    public void setAuthorlist(ArrayList<Author> authorlist) {
        this.authorlist = authorlist;
    }
    
    
    public Author createCustomer( String name) {
        Author a = new Author();
        
        a.setName(name);
       
        this.authorlist.add(a);
        return a;
    }
}
