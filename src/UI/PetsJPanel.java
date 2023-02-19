/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Applicant.Applicant;
import Applicant.Pet;
import Applicant.PetDirectory;
import Applicant.Vaccine;
import Model.Business;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caofei
 */
public class PetsJPanel extends javax.swing.JPanel {

    

     private Business business;
    DefaultTableModel appTableModel;
    Pet selectedPet;
    public PetsJPanel() {
        initComponents();
    }
    PetsJPanel(Business business) {
        initComponents();
        this.business = business;
        this.appTableModel = (DefaultTableModel) petCatalog.getModel();
        displayPetCatalog();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        petCatalog = new javax.swing.JTable();
        fieldGender = new javax.swing.JTextField();
        fieldpetName = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        fieldAge = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldPetType = new javax.swing.JTextField();
        fieldBreed = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        petCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PET NAME", "AGE", "GENDER", "PET TYPE", "BREED"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(petCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 410, 430));
        add(fieldGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 120, 40));

        fieldpetName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldpetNameFocusLost(evt);
            }
        });
        add(fieldpetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 120, 40));

        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 110, 40));

        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 90, 40));
        add(fieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 120, 40));

        jLabel1.setText("GENDER");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel2.setText("PET NAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel3.setText("AGE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setText("CREATE NEW  PET");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        fieldPetType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldPetTypeFocusLost(evt);
            }
        });
        add(fieldPetType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 120, 40));
        add(fieldBreed, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 120, 40));

        jLabel6.setText("PET TYPE");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        jLabel7.setText("BREED");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldpetNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldpetNameFocusLost
        // TODO add your handling code here:
        String name = fieldpetName.getText();
        Boolean isUnique=this.business.getPetDirectory().checkIfPetUnique(name);
        if(isUnique) {

        } else {
            fieldpetName.setText("");
            JOptionPane.showMessageDialog(null, "Applicant already exists");
        }
    }//GEN-LAST:event_fieldpetNameFocusLost

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        int selectedRow = petCatalog.getSelectedRow();
        if(selectedRow >= 0) {
            Pet a = (Pet) petCatalog.getValueAt(selectedRow, 0);
            this.business.getPetDirectory().removePet(a.getPetName());
            displayPetCatalog();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String name = fieldpetName.getText();
        String age = fieldAge.getText();
        String gend = fieldGender.getText();
        String type = fieldPetType.getText();
        String breed = fieldBreed.getText();

        PetDirectory directory = this.business.getPetDirectory();
        ArrayList<Vaccine> vaccineList = new ArrayList<Vaccine>();
        directory.createPet(name,Integer.valueOf(age),gend,type,breed);
        displayPetCatalog();
    }//GEN-LAST:event_addBtnActionPerformed

    private void fieldPetTypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPetTypeFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldPetTypeFocusLost
public void displayPetCatalog() {
        ArrayList<Pet> pet = this.business.getPetDirectory().getPetlist();
        
        if(pet.size() > 0) {
            appTableModel.setRowCount(0);
            for(Pet a: pet) {
                Object row[] = new Object[5];
                row[0] = a;
                row[1] = a.getPetAge();
                row[2] = a.getPetGender();
                row[3] = a.getPetType();
                row[4] = a.getPetBreed();
                appTableModel.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fieldAge;
    private javax.swing.JTextField fieldBreed;
    private javax.swing.JTextField fieldGender;
    private javax.swing.JTextField fieldPetType;
    private javax.swing.JTextField fieldpetName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable petCatalog;
    // End of variables declaration//GEN-END:variables
}
