/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import java.util.Random;
import jail.*;
import static java.lang.Math.random;
import java.time.DateTimeException;
import javax.swing.JOptionPane;

/**
 *
 * @author husse
 */
public class AddPrisoner extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddPrisner
     */
    String inmateID;
    public AddPrisoner() {
        initComponents();
        int checker = 1;
                Random random = new Random();
                inmateID = Integer.toString(random.nextInt(1000, 9999));
                do {
            for (int i = 0; i < Database.getPrisoners().size(); i++) {
                if(Database.getPrisoners().get(i).getInmateID().equals( inmateID)){
                inmateID = Integer.toString(random.nextInt(1000, 9999));
                    checker = 0;
                    break;
                }}}while(checker == 0);
                inID.setText(inmateID);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        namein = new javax.swing.JTextField();
        IDin = new javax.swing.JTextField();
        offensein = new javax.swing.JTextField();
        durationin = new javax.swing.JTextField();
        entrydayin = new javax.swing.JComboBox<>();
        entrymonthin = new javax.swing.JComboBox<>();
        entryyearin = new javax.swing.JComboBox<>();
        genderin = new javax.swing.JComboBox<>();
        dobdayin = new javax.swing.JComboBox<>();
        dobmonthin = new javax.swing.JComboBox<>();
        dobyearin = new javax.swing.JComboBox<>();
        cellnumin = new javax.swing.JComboBox<>();
        inID = new javax.swing.JTextField();
        inIDDD = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jlabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel3.setText("Prisoner Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 30));

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 100, 30));

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel5.setText("Date Of Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));

        jLabel7.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel7.setText("offense");
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, 30));

        jLabel9.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel9.setText("Duration");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 90, 30));

        jLabel10.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel10.setText("Entry Date:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 30));
        jPanel1.add(namein, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 220, 30));

        IDin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDinActionPerformed(evt);
            }
        });
        jPanel1.add(IDin, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 220, 30));
        jPanel1.add(offensein, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 220, 30));

        durationin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationinActionPerformed(evt);
            }
        });
        jPanel1.add(durationin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 220, 30));

        entrydayin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(entrydayin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, 30));

        entrymonthin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novembver", "December" }));
        jPanel1.add(entrymonthin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, 30));

        entryyearin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        jPanel1.add(entryyearin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, 30));

        genderin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "M", "F" }));
        genderin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderinActionPerformed(evt);
            }
        });
        jPanel1.add(genderin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 30));

        dobdayin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dobdayin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 70, 30));

        dobmonthin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novembver", "December" }));
        dobmonthin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobmonthinActionPerformed(evt);
            }
        });
        jPanel1.add(dobmonthin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 100, 30));

        dobyearin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" }));
        jPanel1.add(dobyearin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 70, 30));

        cellnumin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cell Number", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cellnumin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellnuminActionPerformed(evt);
            }
        });
        jPanel1.add(cellnumin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 120, 30));

        inID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inID.setEnabled(false);
        jPanel1.add(inID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 220, 30));

        inIDDD.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        inIDDD.setText("Inmate ID");
        jPanel1.add(inIDDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 30));

        add.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 180, 40));

        jlabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("   Add Prisoner");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        try {
            if (dobdayin.getSelectedIndex() == 0 || dobmonthin.getSelectedIndex() == 0 || dobyearin.getSelectedIndex() == 0
                    || genderin.getSelectedItem() == "Gender" || entrydayin.getSelectedIndex() == 0 || entrymonthin.getSelectedIndex() == 0
                    || entryyearin.getSelectedIndex() == 0 || cellnumin.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(rootPane, "please enter all the information");
            } else {
                
                
                
                String name = namein.getText();

                String id = IDin.getText();

                int dayDOB = Integer.parseInt((String) dobdayin.getSelectedItem());

                int monthDOB = dobmonthin.getSelectedIndex();

                int yearDOB = Integer.parseInt((String) dobyearin.getSelectedItem());

                String offense = offensein.getText();

                int cellnumber = Integer.parseInt((String)cellnumin.getSelectedItem());

                int duration = Integer.parseInt(durationin.getText());

                char gender = 'A';

                if (genderin.getSelectedItem() == "M") {
                    gender = 'M';
                } else {
                    gender = 'F';
                }

                int dayEntry = Integer.parseInt((String) entrydayin.getSelectedItem());

                int monthEntry = entrymonthin.getSelectedIndex() + 2;

                int yearEntry = Integer.parseInt((String) entryyearin.getSelectedItem());

                Date dobDate = new Date(dayDOB, monthDOB, yearDOB);

                Date entryDate = new Date(dayEntry, monthEntry, yearEntry);

                if (dobDate.isAfter(entryDate)) {
                    JOptionPane.showMessageDialog(rootPane, "You cannot go to jail before being born!\nPlease check the dates again");

                } else {
                    Prisoner p1 = new Prisoner(name, dobDate, gender, id, offense, duration, entryDate, inmateID,  cellnumber);

                    namein.setText("");
                    IDin.setText("");
                    cellnumin.setSelectedIndex(0);
                    offensein.setText("");
                    durationin.setText("");
                    dobdayin.setSelectedIndex(0);
                    dobmonthin.setSelectedIndex(0);
                    dobyearin.setSelectedIndex(0);
                    entrydayin.setSelectedIndex(0);
                    entrymonthin.setSelectedIndex(0);
                    entryyearin.setSelectedIndex(0);

                    JOptionPane.showMessageDialog(rootPane, "Added successfully");
                    int checker = 1;
                Random random = new Random();
                inmateID = Integer.toString(random.nextInt(1000, 9999));
                do {
            for (int i = 0; i < Database.getPrisoners().size(); i++) {
                if(Database.getPrisoners().get(i).getInmateID().equals( inmateID)){
                inmateID = Integer.toString(random.nextInt(1000, 9999));
                    checker = 0;
                    break;
                }}}while(checker == 0);
                inID.setText(inmateID);

                }
            }
        } catch (DateTimeException dte) {
            JOptionPane.showMessageDialog(rootPane, "the Date is not correct");
        }

    }//GEN-LAST:event_addActionPerformed

    private void dobmonthinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobmonthinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobmonthinActionPerformed

    private void IDinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDinActionPerformed

    private void genderinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderinActionPerformed

    private void durationinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationinActionPerformed

    private void cellnuminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellnuminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellnuminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDin;
    private javax.swing.JButton add;
    private javax.swing.JComboBox<String> cellnumin;
    private javax.swing.JComboBox<String> dobdayin;
    private javax.swing.JComboBox<String> dobmonthin;
    private javax.swing.JComboBox<String> dobyearin;
    private javax.swing.JTextField durationin;
    private javax.swing.JComboBox<String> entrydayin;
    private javax.swing.JComboBox<String> entrymonthin;
    private javax.swing.JComboBox<String> entryyearin;
    private javax.swing.JComboBox<String> genderin;
    private javax.swing.JTextField inID;
    private javax.swing.JLabel inIDDD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JTextField namein;
    private javax.swing.JTextField offensein;
    // End of variables declaration//GEN-END:variables
}
