/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import jail.Database;
import jail.Date;
import jail.Prisoner;
import java.awt.Dimension;
import java.time.DateTimeException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author husse
 */
public class Clinic extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddPrisner
     */
    ArrayList<String> inmateIDS = new ArrayList<String>();
    ArrayList<String> recordIDS = new ArrayList<String>();
    public Clinic() {
        initComponents();
        initialize();
        for (int i = 0; i < Database.getPrisoners().size(); i++) {
            inmateIDS.add(Database.getPrisoners().get(i).getInmateID());
        }
        for (int i = 0; i < Database.getMedicalRecords().size(); i++) {
            recordIDS.add(Database.getMedicalRecords().get(i).getRecordID());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Treatment_view = new javax.swing.JTextField();
        Diagnosis_view = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        InmateName_view = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InmateID_view = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        RecordID_view = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DAY_view = new javax.swing.JTextField();
        MONTH_view = new javax.swing.JTextField();
        year_view = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        RecordID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        InmateName = new javax.swing.JTextField();
        DAYCB = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        InmateID = new javax.swing.JTextField();
        Treatment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Diagnosis = new javax.swing.JTextField();
        MONTHCB = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        year_write = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Treatment:");
        jLabel8.setEnabled(false);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        Treatment_view.setEnabled(false);
        jPanel2.add(Treatment_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 120, -1));

        Diagnosis_view.setEnabled(false);
        Diagnosis_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Diagnosis_viewActionPerformed(evt);
            }
        });
        jPanel2.add(Diagnosis_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Diagnosis:");
        jLabel7.setEnabled(false);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Date of Visit:");
        jLabel9.setEnabled(false);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        InmateName_view.setEnabled(false);
        InmateName_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InmateName_viewActionPerformed(evt);
            }
        });
        jPanel2.add(InmateName_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Inmate Name: ");
        jLabel3.setEnabled(false);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        InmateID_view.setEnabled(false);
        InmateID_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InmateID_viewActionPerformed(evt);
            }
        });
        jPanel2.add(InmateID_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Inmate's ID:");
        jLabel5.setEnabled(false);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jButton2.setText("View");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        RecordID_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordID_viewActionPerformed(evt);
            }
        });
        jPanel2.add(RecordID_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Record ID:");
        jLabel6.setMaximumSize(new java.awt.Dimension(78, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(78, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(78, 20));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        DAY_view.setEnabled(false);
        jPanel2.add(DAY_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 40, -1));

        MONTH_view.setEnabled(false);
        MONTH_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MONTH_viewActionPerformed(evt);
            }
        });
        jPanel2.add(MONTH_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 40, -1));

        year_view.setEnabled(false);
        jPanel2.add(year_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 40, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 800, 400));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Record ID:");
        jLabel16.setEnabled(false);
        jLabel16.setMaximumSize(new java.awt.Dimension(78, 20));
        jLabel16.setMinimumSize(new java.awt.Dimension(78, 20));
        jLabel16.setPreferredSize(new java.awt.Dimension(78, 20));
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setText("Add New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Date of Visit:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        RecordID.setEnabled(false);
        jPanel3.add(RecordID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Treatment:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Diagnosis:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        InmateName.setEnabled(false);
        InmateName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InmateNameActionPerformed(evt);
            }
        });
        jPanel3.add(InmateName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 120, -1));

        DAYCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel3.add(DAYCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 50, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Inmate's ID:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 70, -1));

        InmateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InmateIDActionPerformed(evt);
            }
        });
        jPanel3.add(InmateID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, -1));
        jPanel3.add(Treatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Inmate Name: ");
        jLabel4.setEnabled(false);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        Diagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosisActionPerformed(evt);
            }
        });
        jPanel3.add(Diagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 120, -1));

        MONTHCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel3.add(MONTHCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 50, -1));

        jButton4.setText("New");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 70, -1));

        year_write.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        year_write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_writeActionPerformed(evt);
            }
        });
        jPanel3.add(year_write, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 780, 400));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("   View Medical Record");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 56));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Select your action:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "New Medical Record", "View Medical Record" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 190, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel2.setEnabled(false);
        jLabel2.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jLabel2HierarchyChanged(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 860, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Diagnosis_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Diagnosis_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Diagnosis_viewActionPerformed

    private void InmateID_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InmateID_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InmateID_viewActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        if(jComboBox5.getSelectedIndex() == 1){
            jPanel3.setVisible(true);
            jPanel2.setVisible(false);
        }
        if(jComboBox5.getSelectedIndex() == 2){
            jPanel3.setVisible(false);
            jPanel2.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void InmateName_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InmateName_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InmateName_viewActionPerformed

    private void DiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiagnosisActionPerformed

    private void InmateNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InmateNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InmateNameActionPerformed

    private void InmateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InmateIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InmateIDActionPerformed

    private void jLabel2HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jLabel2HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2HierarchyChanged

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
//        Prisoner p = Database.getPrisonerByInmateID(InmateID.getText());
//        if () {
//            JOptionPane.showMessageDialog(this, "Please Insert a Valid ID");
//        }
//        else{
//            InmateName.setText(p.getName());
//        }
          if(inmateIDS.contains(InmateID.getText()) == false){
              JOptionPane.showMessageDialog(this, "Please Insert a Valid ID");
          }
          else{
              Prisoner p = Database.getPrisonerByInmateID(InmateID.getText());
              InmateName.setText(p.getName());
          }
        
    }//GEN-LAST:event_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
        Date d = new Date(Integer.parseInt(DAYCB.getSelectedItem() + ""), Integer.parseInt(MONTHCB.getSelectedItem() + ""), Integer.parseInt(year_write.getSelectedItem().toString()));
        jail.Clinic MR = new jail.Clinic(Database.getPrisonerByInmateID(InmateID.getText()), d, RecordID.getText(), Diagnosis.getText(), Treatment.getText());
        recordIDS.add(RecordID.getText());
        RecordID.setText("");
        InmateID.setText("");
        InmateName.setText("");
        Diagnosis.setText("");
        Treatment.setText("");
        year_write.setSelectedIndex(0);
        DAYCB.setSelectedIndex(0);
        MONTHCB.setSelectedIndex(0);
        JOptionPane.showMessageDialog(rootPane, "Added Successfully");
        }catch(DateTimeException dte){
            JOptionPane.showMessageDialog(rootPane, "the Date is not correct");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String recordID = "Mr-" + (int)(Math.random() * 10000);
        RecordID.setText(recordID);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(recordIDS.contains(RecordID_view.getText()) == false){
              JOptionPane.showMessageDialog(this, "Please Insert a Valid ID");
          }
          else{
              jail.Clinic MR = Database.getMedicalRecord(RecordID_view.getText());
              InmateID_view.setText(MR.getPrisoner().getInmateID());
              InmateName_view.setText(MR.getPrisoner().getName());
              Diagnosis_view.setText(MR.getDiagnosis());
              Treatment_view.setText(MR.getTreatment());
              DAY_view.setText(MR.getDate().getDay() + "");
              MONTH_view.setText(MR.getDate().getMonth() + "");
              year_view.setText(MR.getDate().getYear() + "");
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MONTH_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MONTH_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MONTH_viewActionPerformed

    private void year_writeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_writeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year_writeActionPerformed

    private void RecordID_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordID_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordID_viewActionPerformed

    private void initialize(){
        jPanel3.setVisible(false);
        jPanel2.setVisible(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DAYCB;
    private javax.swing.JTextField DAY_view;
    private javax.swing.JTextField Diagnosis;
    private javax.swing.JTextField Diagnosis_view;
    private javax.swing.JTextField InmateID;
    private javax.swing.JTextField InmateID_view;
    private javax.swing.JTextField InmateName;
    private javax.swing.JTextField InmateName_view;
    private javax.swing.JComboBox<String> MONTHCB;
    private javax.swing.JTextField MONTH_view;
    private javax.swing.JTextField RecordID;
    private javax.swing.JTextField RecordID_view;
    private javax.swing.JTextField Treatment;
    private javax.swing.JTextField Treatment_view;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton search;
    private javax.swing.JTextField year_view;
    private javax.swing.JComboBox<String> year_write;
    // End of variables declaration//GEN-END:variables
}
