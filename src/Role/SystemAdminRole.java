/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.Branch;
import Business.Business;
import UI.MainJFrame;
import UI.SystemAdminPanels.SystemAdminJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author caofei
 */
public class SystemAdminRole extends Role {

    
    
    
    @Override
    public JFrame createWorkArea(Business business, Branch branch, UserAccount useraccount) {
        return new SystemAdminJFrame(business, branch, useraccount);
    }
    
}
