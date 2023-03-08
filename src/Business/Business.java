/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Customer.Customer;
import Customer.CustomerDirectory;
import Library.Author;
import Library.AuthorDirectory;
import Library.Genre;
import Library.GenreDirectory;
import Rental.RentalDirectory;
import Role.SystemAdminRole;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class Business {
    ArrayList<Branch> branches;//分支
    UserAccountDirectory topLevelUserAccountDirectory;//用户名顶层的，客户
    CustomerDirectory customerlist;//客户实体
    GenreDirectory genreDirectory;//类型总和
    AuthorDirectory authorDirectory;//作者总和
    RentalDirectory allRentalDirectory;
    
    
    Business() {
        this.branches = new ArrayList<Branch>();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        this.authorDirectory=new AuthorDirectory();
        this.genreDirectory=new GenreDirectory();
        this.customerlist=new CustomerDirectory();
        //创建一个数列，里面存储高级别的用户，管理者和顾客
        this.allRentalDirectory=new RentalDirectory();
        
        //创建一个管理者
        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole());
    }

    
    
    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }

    public CustomerDirectory getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(CustomerDirectory customerlist) {
        this.customerlist = customerlist;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public void setGenreDirectory(GenreDirectory genreDirectory) {
        this.genreDirectory = genreDirectory;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public RentalDirectory getAllRentalDirectory() {
        return allRentalDirectory;
    }

    public void setAllRentalDirectory(RentalDirectory allRentalDirectory) {
        this.allRentalDirectory = allRentalDirectory;
    }
    

    
    
    
    
    
    
    //创建分图书馆
    public Branch createBranch(String name) {
        Branch branch = new Branch(name);
        this.branches.add(branch);
        return branch;
    }
    public Branch  findByName(String name) {
        for(Branch b: this.branches) {
            if(b.getName().equals(name)) {
                return b;
            }
        }
        
        return null;
    }
    //判断图书馆是否已经存在
    public Boolean branchExists(String name) {
        for(Branch u: this.branches) {
            if(u.getName().equals(name)) {
                return true;
            }
        }
        
        return false;
    }
    //获得本体
    public static Business getInstance() {
        return new Business();
    }
    //删除分支
    public void removeBranch(String name) {
        for(Branch p: this.branches) {
            if(p.name.equals(name)) {
                this.branches.remove(p);
                break;
            }
        }
    }
    public void addAuthor(String aname){
        
        Author a=new Author();
        a.setName(aname);
        this.authorDirectory.getAuthorlist().add(a);
    }
    public void addGenre(String genre){
        
        Genre a=new Genre();
        a.setGenrename(genre);
        this.genreDirectory.getGenrelist().add(a);
    }
    
        
}
