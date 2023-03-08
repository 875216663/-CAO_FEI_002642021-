/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Branch;
import Business.Business;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author caofei
 */
public abstract class Role {
    
    private static String[] roles = {"system admin", "branch manager", "customer", "librarian"};
    //静态的一个列表列出角色的名字
    
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    
    public abstract JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount);
}
