/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAccount;

import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author caofei
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> useraccountlist;
    
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }

    
    public ArrayList<UserAccount> getUseraccountList() {
        return useraccountlist;
    }
    public void setUseraccountList(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    
    
    
    
    
    //创建账户
    public UserAccount createUserAccount(String name, String password, Role role) {
        UserAccount user = new UserAccount(name, password, role);
        this.useraccountlist.add(user);
        return user;
    }
    //查找账户
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    //判断是否账户存在
    public Boolean accountExists(String username, String password, String role) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return true;
            }
        }
        
        return false;
    }
    //根据用户查重id
     public UserAccount findById(String id) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
        }
        
        return null;
    }
      public UserAccount findByUsername(String username) {
        for(UserAccount u: this.useraccountlist) {
            if(u.getUsername().equals(username)) {
                return u;
            }
        }
        
        return null;
    }
    
}
