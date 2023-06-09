/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import jail.*;
import java.time.DateTimeException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author husse
 */

public class AddOfficer extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddPrisner
     */
    String offID;
    public AddOfficer() {
        initComponents();
        int checker = 1;
                Random random = new Random();
                offID = Integer.toString(random.nextInt(9999));
                do {
            for (int i = 0; i < Database.getOfficers().size(); i++) {
                if(Database.getOfficers().get(i).getBadgeNumber().equals( offID)){
                offID = Integer.toString(random.nextInt(1000,9999));
                    checker = 0;
                    break;
                }}}while(checker == 0);
                offId.setText("Of-" + offID);
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
        jLabel1 = new javax.swing.JLabel();
        namein = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IDin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dobdayin = new javax.swing.JComboBox<>();
        dobmonthin = new javax.swing.JComboBox<>();
        dobyearin = new javax.swing.JComboBox<>();
        genderin = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        offId = new javax.swing.JLabel();
        Rankinn = new javax.swing.JComboBox<>();
        inIDDD = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("   Add Officer");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 70));

        namein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameinActionPerformed(evt);
            }
        });
        jPanel1.add(namein, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 320, 30));

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel4.setText(" ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, 30));
        jPanel1.add(IDin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 320, 30));

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel5.setText("Date Of Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 30));

        dobdayin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dobdayin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 30));

        dobmonthin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novembver", "December" }));
        jPanel1.add(dobmonthin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 30));

        dobyearin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" }));
        jPanel1.add(dobyearin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, 30));

        genderin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "M", "F" }));
        genderin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderinActionPerformed(evt);
            }
        });
        jPanel1.add(genderin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 30));

        add.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 120, 40));

        offId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(offId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 260, 30));

        Rankinn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rank", "Officer", "Corporal", "Sergeant", "Lieutenant", "Captain", " Chief", "Sheriff" }));
        jPanel1.add(Rankinn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 30));

        inIDDD.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        inIDDD.setText("Officer ID");
        jPanel1.add(inIDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 110, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel3.setText("Officer Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 840, 450));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 860, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        try{
        String name = namein.getText();
        String id = IDin.getText();
        
        if(dobdayin.getSelectedIndex() == 0 || dobmonthin.getSelectedIndex() == 0 || dobyearin.getSelectedIndex() == 0 
                || genderin.getSelectedItem() == "Gender" || Rankinn.getSelectedIndex()== 0){
            JOptionPane.showMessageDialog(rootPane, "please enter all the information");
        }

        else{
        int dayDOB = Integer.parseInt((String) dobdayin.getSelectedItem());
        
        int monthDOB = dobmonthin.getSelectedIndex();
        
        
        int yearDOB = Integer.parseInt((String) dobyearin.getSelectedItem());
        
        
        char gender = 'A';
        if (genderin.getSelectedItem() == "M"){
            gender = 'M';
        }
        else{
            gender = 'F';
        }
        
        Date dobDate = new Date(dayDOB, monthDOB, yearDOB);
        
        
        String rank = (String)Rankinn.getSelectedItem();
        

        Officer o1 = new Officer(name , dobDate , gender, id, offID, rank);

        namein.setText("");
        IDin.setText("");
        Rankinn.setSelectedIndex(0);
        dobdayin.setSelectedIndex(0);
        dobmonthin.setSelectedIndex(0);
        dobyearin.setSelectedIndex(0);
        
        JOptionPane.showMessageDialog(rootPane, "Added successfully");
        
        int checker = 1;
        Random random = new Random();
        offID = Integer.toString(random.nextInt(1000,9999));
        do {
            for (int i = 0; i < Database.getOfficers().size(); i++) {
                if(Database.getOfficers().get(i).getBadgeNumber().equals( offID)){
                offID = Integer.toString(random.nextInt(9999));
                    checker = 0;
                    break;
                }}}while(checker == 0);
                offId.setText("Of-" + offID);
        
        }
        }catch(DateTimeException dte){
            JOptionPane.showMessageDialog(rootPane, "the Date is not correct");
        }

    }//GEN-LAST:event_addActionPerformed

    private void nameinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameinActionPerformed

    private void genderinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDin;
    private javax.swing.JComboBox<String> Rankinn;
    private javax.swing.JButton add;
    private javax.swing.JComboBox<String> dobdayin;
    private javax.swing.JComboBox<String> dobmonthin;
    private javax.swing.JComboBox<String> dobyearin;
    private javax.swing.JComboBox<String> genderin;
    private javax.swing.JLabel inIDDD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namein;
    private javax.swing.JLabel offId;
    // End of variables declaration//GEN-END:variables
}
