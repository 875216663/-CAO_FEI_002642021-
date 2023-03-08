package Business;


import Employee.EmployeeDirectory;
import Employee.Librarian;
import Employee.Manager;
import Library.Library;
import Rental.RentalDirectory;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class Branch {
    //
    String name;//分支名称
    UserAccountDirectory branchuseraccountDirectory;//管理者的用户
    EmployeeDirectory employeeDirectory;//暂时不知道用不用
    Library library;//图书馆
    Librarian  librarian;
    Manager manager;
    static RentalDirectory rentalrequest;
    
    
    
    Branch(String name) {
        this.name = name; 
        this.branchuseraccountDirectory = new UserAccountDirectory();
        this.library=new Library();
        this.employeeDirectory=new EmployeeDirectory();
        this.librarian=new Librarian();
        this.manager=new Manager();
        this.rentalrequest=new RentalDirectory();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }
    
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public RentalDirectory getRentalrequest() {
        return rentalrequest;
    }

    public void setRentalrequest(RentalDirectory rentalrequest) {
        this.rentalrequest = rentalrequest;
    }

   
    
    @Override
    public String toString() {
       return this.name;
    }

   

    
    
}
