/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UIlibrarian;

import Business.Branch;
import Business.Business;
import Library.Book;
import Library.BookDirectory;
import Library.Magazine;
import Library.MagazineDirectory;
import Rental.Rental;
import Rental.RentalDirectory;
import UI.MainJFrame;
import UserAccount.UserAccount;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caofei
 */
public class LibrarianJFrame extends javax.swing.JFrame {

    private Business business;
    DefaultTableModel appTableModel;
    DefaultTableModel appTableModel1;
    private Branch branch;
    private UserAccount useraccount;
    private UserAccountDirectory userAccountDirectory;
    Book selectbook;
    int rentprice;
    public LibrarianJFrame() {
       
    }
    public LibrarianJFrame(Business business, Branch branch, UserAccount useraccount) {
       initComponents();
       this.setVisible(true);
       this.appTableModel = (DefaultTableModel) applicantCatalog.getModel();
       this.appTableModel1 = (DefaultTableModel) applicantCatalog1.getModel();
       this.business = business;
       this.branch = branch;
       this.useraccount = useraccount;
       this.rentprice=this.branch.getRentalrequest().getAllrentprice();
       
       displayBookCatalog();
       displayMagazineCatalog();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BooknameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AuthorText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        GenreText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicantCatalog = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        DateText = new javax.swing.JTextField();
        serialNumText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MagzineText = new javax.swing.JTextField();
        IssuetypeText = new javax.swing.JTextField();
        ComnameText = new javax.swing.JTextField();
        NumifpageText = new javax.swing.JTextField();
        LanguageText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        applicantCatalog1 = new javax.swing.JTable();
        addBtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TypeofbindingText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(153, 255, 0));

        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(914, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Book Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        BooknameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BooknameTextFocusLost(evt);
            }
        });
        jPanel2.add(BooknameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, 40));

        jLabel3.setText("Author");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        AuthorText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                AuthorTextFocusLost(evt);
            }
        });
        jPanel2.add(AuthorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 120, 40));

        jLabel8.setText("Registered Date");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        GenreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                GenreTextFocusLost(evt);
            }
        });
        jPanel2.add(GenreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 40));

        applicantCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Author", "Genre", "No of Page", "Language", "SerialNum", "Date", "Staus", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(applicantCatalog);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 760, 200));

        addBtn.setText("ADD BOOK");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 100, 30));

        DateText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DateTextFocusLost(evt);
            }
        });
        jPanel2.add(DateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, 40));

        serialNumText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                serialNumTextFocusLost(evt);
            }
        });
        jPanel2.add(serialNumText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 120, 40));

        jLabel9.setText("Genre");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel10.setText("Serial number");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        MagzineText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MagzineTextFocusLost(evt);
            }
        });
        jPanel2.add(MagzineText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 120, 40));

        IssuetypeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                IssuetypeTextFocusLost(evt);
            }
        });
        jPanel2.add(IssuetypeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 120, 40));

        ComnameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ComnameTextFocusLost(evt);
            }
        });
        jPanel2.add(ComnameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 120, 40));

        NumifpageText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NumifpageTextFocusLost(evt);
            }
        });
        jPanel2.add(NumifpageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 120, 40));

        LanguageText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LanguageTextFocusLost(evt);
            }
        });
        jPanel2.add(LanguageText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 120, 40));

        jLabel4.setText("Magazine Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel5.setText("Company Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jLabel12.setText("Issue Type");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        jLabel6.setText("No.of Page");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel13.setText("Type of binding");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Magazine");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 120, 30));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setText("Book");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 60, 30));

        applicantCatalog1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Company Name", "Issue type", "SerialNum", "Date", "Staus", "Duration"
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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 750, 200));

        addBtn1.setText("ADD MAGAZINE");
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, -1, 30));

        jButton1.setText("Agree");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        jButton2.setText("Reject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, -1, -1));

        jButton3.setText("Agree");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, -1, -1));

        jButton4.setText("Reject");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, -1));

        TypeofbindingText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TypeofbindingTextFocusLost(evt);
            }
        });
        TypeofbindingText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeofbindingTextActionPerformed(evt);
            }
        });
        jPanel2.add(TypeofbindingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 120, 40));

        jLabel14.setText("Language");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel11.setText("MAGAZINE");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setText("BOOK");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed
        String serialNum=serialNumText.getText();
        String Date=DateText.getText();
        String Magzinename=MagzineText.getText();
        String Comname=ComnameText.getText();
        String Issuetype=IssuetypeText.getText();
        
        MagazineDirectory directory=this.branch.getLibrary().getMagazineDirectory();
        directory.createMagazine(Comname, Issuetype, serialNum, Magzinename, Date);
        
        displayMagazineCatalog();

        JOptionPane.showMessageDialog(null, "Saved!");
    }//GEN-LAST:event_addBtn1ActionPerformed

    private void LanguageTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LanguageTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_LanguageTextFocusLost

    private void NumifpageTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NumifpageTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_NumifpageTextFocusLost

    private void IssuetypeTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IssuetypeTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_IssuetypeTextFocusLost

    private void ComnameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ComnameTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ComnameTextFocusLost

    private void MagzineTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MagzineTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_MagzineTextFocusLost

    private void serialNumTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serialNumTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNumTextFocusLost

    private void DateTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTextFocusLost

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        String bookname = BooknameText.getText();
        String author = AuthorText.getText();
        String genre = GenreText.getText();
        String serialNum=serialNumText.getText();
        String Date=DateText.getText();
        String Numifpage=NumifpageText.getText();
        String Language=LanguageText.getText();
        String typeofbinding=TypeofbindingText.getText();

        BookDirectory directory = this.branch.getLibrary().getBookdirectory();
        directory.createBook(author, genre, Numifpage, Language, bookname, Date,serialNum,typeofbinding);
        this.business.addAuthor(author);
        this.business.addGenre(genre);
        displayBookCatalog();

        JOptionPane.showMessageDialog(null, "Saved!");
    }//GEN-LAST:event_addBtnActionPerformed

    private void GenreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GenreTextFocusLost

    }//GEN-LAST:event_GenreTextFocusLost

    private void AuthorTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AuthorTextFocusLost

    }//GEN-LAST:event_AuthorTextFocusLost

    private void BooknameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BooknameTextFocusLost
        //        // TODO add your handling code here:
        //        String id = fieldId.getText();
        //        Boolean isUnique=this.business.getAppDirectory().checkIfApplicantUnique(id);
        //        if(isUnique) {
            //
            //        } else {
            //            fieldId.setText("");
            //            JOptionPane.showMessageDialog(null, "Applicant already exists");
            //        }
        //        String detect = fieldId.getText();
        //        this.vID = detect.isEmpty();
    }//GEN-LAST:event_BooknameTextFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedrow = applicantCatalog.getSelectedRow();//在其中的表中找到相应的行
        Book b=(Book)applicantCatalog.getValueAt(selectedrow, 0);
        
        
        Rental r=this.branch.getRentalrequest().findByBook(b);
        
        r.setStatus("Agree");
        b.setStatus("Agree");
        
        this.branch.getRentalrequest().setAllrentprice(this.rentprice+3);
        displayBookCatalog();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedrow = applicantCatalog.getSelectedRow();//在其中的表中找到相应的行
        Book b=(Book)applicantCatalog.getValueAt(selectedrow, 0);
        
        
        Rental r=this.branch.getRentalrequest().findByBook(b);
        
        r.setStatus("Reject");
        b.setStatus("Reject");
        
        
        displayBookCatalog();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedrow = applicantCatalog1.getSelectedRow();//在其中的表中找到相应的行
        Magazine b=(Magazine)applicantCatalog1.getValueAt(selectedrow, 0);
        
        
        Rental r=this.branch.getRentalrequest().findByMagazine(b);
        
        r.setStatus("Agree");
        b.setStatus("Agree");
        
        this.branch.getRentalrequest().setAllrentprice(this.rentprice+3);
        displayBookCatalog();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedrow = applicantCatalog1.getSelectedRow();//在其中的表中找到相应的行
        Magazine b=(Magazine)applicantCatalog1.getValueAt(selectedrow, 0);
        
        
        Rental r=this.branch.getRentalrequest().findByMagazine(b);
        
        r.setStatus("Reject");
        b.setStatus("Reject");
        
        
        displayBookCatalog();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TypeofbindingTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TypeofbindingTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeofbindingTextFocusLost

    private void TypeofbindingTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeofbindingTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeofbindingTextActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibrarianJFrame().setVisible(true);
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
                Object row[] = new Object[7];
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
    private javax.swing.JTextField AuthorText;
    private javax.swing.JTextField BooknameText;
    private javax.swing.JTextField ComnameText;
    private javax.swing.JTextField DateText;
    private javax.swing.JTextField GenreText;
    private javax.swing.JTextField IssuetypeText;
    private javax.swing.JTextField LanguageText;
    private javax.swing.JTextField MagzineText;
    private javax.swing.JTextField NumifpageText;
    private javax.swing.JTextField TypeofbindingText;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton addBtn1;
    private javax.swing.JTable applicantCatalog;
    private javax.swing.JTable applicantCatalog1;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField serialNumText;
    // End of variables declaration//GEN-END:variables
}
