/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminPanels;

import Business.Branch;
import Business.Business;
import Customer.Customer;
import Library.Author;
import Library.AuthorDirectory;
import Library.Genre;
import Library.GenreDirectory;
import Role.BranchAdminRole;
import Role.CustomerRole;
import Role.Role;
import UI.MainJFrame;
import UserAccount.UserAccount;
import UserAccount.UserAccountDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caofei
 */
public class SystemAdminJFrame extends javax.swing.JFrame {

    private Business business;
    private Branch branch;
    private UserAccount useraccount;
    private UserAccountDirectory userAccountDirectory;
    private AuthorDirectory authorDirectory;
    private GenreDirectory genreDirectory;
    

    /**
     * Creates new form SystemAdminJFrame
     */
    public SystemAdminJFrame(Business business, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);

        this.business = business;
        this.useraccount = useraccount;
        this.genreDirectory=this.business.getGenreDirectory();
        this.authorDirectory=this.business.getAuthorDirectory();
        populateDropdown();
        populateDropdown1();
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        AuthorComboBox = new javax.swing.JComboBox();
        GenreComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 30));

        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 130, 30));

        jSplitPane1.setTopComponent(jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.add(AuthorComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 40));

        jPanel3.add(GenreComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 200, 40));

        jLabel1.setText("Author List");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel2.setText("Genre List");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jSplitPane1.setRightComponent(jPanel3);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jSplitPane1.setRightComponent(new CreatJPanel(business,branch,useraccount));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemAdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SystemAdminJFrame().setVisible(true);
            }
        });
    }
     public void populateDropdown() {
        AuthorComboBox.removeAllItems();
        for (Author author : this.authorDirectory.getAuthorlist()) {
            AuthorComboBox.addItem(author.getName());
        }
    }
    public void populateDropdown1() {
        GenreComboBox.removeAllItems();
        for (Genre n : business.getGenreDirectory().getGenrelist()) {
            GenreComboBox.addItem(n.getGenrename());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AuthorComboBox;
    private javax.swing.JComboBox GenreComboBox;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
