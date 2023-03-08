/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.BranchManagerPanels;

import Business.Branch;
import Business.Business;
import Library.Book;
import Library.Magazine;
import Rental.Rental;
import UI.MainJFrame;
import UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caofei
 */
public class BranchManagerJFrame extends javax.swing.JFrame {

    private final Business business;
    private final Branch branch;
    private final UserAccount useraccount;
    DefaultTableModel appTableModel;
    DefaultTableModel appTableModel1;
    int rent;

    /**
     * Creates new form BranchManagerJFrame
     */
    

    public BranchManagerJFrame(Business business, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.business = business;
        this.branch = branch;
        this.useraccount = useraccount;
        this.appTableModel = (DefaultTableModel) applicantCatalog.getModel();
        this.appTableModel1 = (DefaultTableModel) applicantCatalog1.getModel();
        this.rent=this.branch.getRentalrequest().getAllrentprice();
        
        displayBookCatalog();
        displayMagazineCatalog();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicantCatalog = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        applicantCatalog1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel4.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 50));

        applicantCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Author", "Genre", "No of Page", "Language", "SerialNum", "Registered Date", "Staus", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(applicantCatalog);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 620, 200));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setText("Book");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 60, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Magazine");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 120, 30));

        applicantCatalog1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Company Name", "Issue type", "SerialNum", "Registered Date", "Staus", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(applicantCatalog1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 610, 200));

        jButton1.setText("Agree");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        jButton2.setText("Reject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        jButton4.setText("Reject");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, -1, -1));

        jButton3.setText("Agree");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        jLabel2.setText("All Value");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 53, 100, 30));

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_backBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedrow = applicantCatalog.getSelectedRow();//在其中的表中找到相应的行
        Book b=(Book)applicantCatalog.getValueAt(selectedrow, 0);

        Rental r=this.branch.getRentalrequest().findByBook(b);

        
        r.setStatus("Agree");
        b.setStatus("Agree");
        

        displayBookCatalog();
        this.branch.getRentalrequest().setAllrentprice(this.rent+3);
        jTextField1.setText(String.valueOf(this.branch.getRentalrequest().getAllrentprice()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedrow = applicantCatalog.getSelectedRow();//在其中的表中找到相应的行
        Book b=(Book)applicantCatalog.getValueAt(selectedrow, 0);

        Rental r=this.branch.getRentalrequest().findByBook(b);

        r.setStatus("Reject");
        b.setStatus("Reject");

        displayBookCatalog();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedrow = applicantCatalog1.getSelectedRow();//在其中的表中找到相应的行
        Magazine b=(Magazine)applicantCatalog1.getValueAt(selectedrow, 0);

        Rental r=this.branch.getRentalrequest().findByMagazine(b);

        r.setStatus("Reject");
        b.setStatus("Reject");

        displayBookCatalog();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedrow = applicantCatalog1.getSelectedRow();//在其中的表中找到相应的行
        Magazine b=(Magazine)applicantCatalog1.getValueAt(selectedrow, 0);

        Rental r=this.branch.getRentalrequest().findByMagazine(b);

        r.setStatus("Agree");
        b.setStatus("Agree");

        displayBookCatalog();
        this.branch.getRentalrequest().setAllrentprice(this.rent+3);
        jTextField1.setText(String.valueOf(this.branch.getRentalrequest().getAllrentprice()));
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BranchManagerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new BranchManagerJFrame().setVisible(true);
            }
        });
    }

    public void displayBookCatalog() {
        ArrayList<Book> booklist = this.branch.getLibrary().getBookdirectory().getBooklist();
        
        if(booklist.size() > 0) {
            appTableModel.setRowCount(0);
            for(Book a: booklist) {
                Object row[] = new Object[9];
                row[0] = a;
                row[1] = a.getAuthor();
                row[2] = a.getGenre();
                row[3] = a.getNoofpage();
                row[4] = a.getLanguage();
                row[5] = a.getSerialnum();
                row[6] = a.getDate();
                row[7] = a.getStatus();
                row[8] = a.getDuration();
                appTableModel.addRow(row);
            }
        }
    }
 public void displayMagazineCatalog() {
        ArrayList<Magazine> magazinelist = this.branch.getLibrary().getMagazineDirectory().getMagazinelist();
        
        if(magazinelist.size() > 0) {
            appTableModel1.setRowCount(0);
            for(Magazine a: magazinelist) {
                Object row[] = new Object[6];
                row[0] = a;
            
                row[1] = a.getComname();
                row[2] = a.getIssuetype();
                row[3] = a.getSerialnum();
                row[4] = a.getDate();
                row[5] = a.getStatus();
                row[6] = a.getDuration();
                appTableModel1.addRow(row);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable applicantCatalog;
    private javax.swing.JTable applicantCatalog1;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
