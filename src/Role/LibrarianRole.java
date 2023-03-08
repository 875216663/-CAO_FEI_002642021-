/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.Branch;
import Business.Business;
import UI.CustomerPanels.CustomerJFrame;
import UIlibrarian.LibrarianJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author caofei
 */
public class LibrarianRole extends Role{
     @Override
    public JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount) {
      return new LibrarianJFrame(business, branch, useraccount);
        
    }
    
}
