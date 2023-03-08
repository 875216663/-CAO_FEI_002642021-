/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;


import Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class BookDirectory {
     ArrayList< Book> booklist;
      
    
    public BookDirectory() {
        this.booklist = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(ArrayList<Book> booklist) {
        this.booklist = booklist;
    }
     public Book createBook(String author,String genre,String page,String language,String name,String date,String sreialnum,String typeofbinding) {
        Book c = new Book();
          c.setName(name);
          c.setAuthor(author);
          c.setGenre(genre);
          c.setDate(date);
          c.setLanguage(language);
          c.setNoofpage(page);
          c.setSerialnum(sreialnum);
          c.setTypeofbinding(typeofbinding);
        
        this.booklist.add(c);
        return c;
    }
     public void removeBook(String name) {
        for(Book b: this.booklist) {
            if(b.getName().equals(name)) {
                this.booklist.remove(b);
                break;
            }
        }
    }
     public Book requestOrder(Customer customer) {
        Book o = new Book();
        o.setCustomer(customer);
        return o;
    }
    
//    public Book assignOrder(Book o, DeliveryAgent del) {
//        o.setAgent(del);
//        return o;
//    }
}
