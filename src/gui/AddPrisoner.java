/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import jail.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author husse
 */
public class AddPrisoner extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddPrisner
     */
    public AddPrisoner() {
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        namein = new javax.swing.JTextField();
        IDin = new javax.swing.JTextField();
        offensein = new javax.swing.JTextField();
        cellnumin = new javax.swing.JTextField();
        durationin = new javax.swing.JTextField();
        entrydayin = new javax.swing.JComboBox<>();
        entrymonthin = new javax.swing.JComboBox<>();
        entryyearin = new javax.swing.JComboBox<>();
        genderin = new javax.swing.JComboBox<>();
        dobdayin = new javax.swing.JComboBox<>();
        dobmonthin = new javax.swing.JComboBox<>();
        dobyearin = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        reportt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Prisoner Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Prisoner ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel5.setText("Date Of Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel7.setText("offense");
        jLabel7.setPreferredSize(new java.awt.Dimension(40, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel8.setText("Cell number");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel9.setText("Duration");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel10.setText("Entry Date:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));
        jPanel1.add(namein, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, -1));
        jPanel1.add(IDin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 160, -1));
        jPanel1.add(offensein, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, -1));
        jPanel1.add(cellnumin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 160, -1));
        jPanel1.add(durationin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 160, -1));

        entrydayin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(entrydayin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        entrymonthin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novembver", "December" }));
        jPanel1.add(entrymonthin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, -1, -1));

        entryyearin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        jPanel1.add(entryyearin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        genderin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jPanel1.add(genderin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        dobdayin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(dobdayin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        dobmonthin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novembver", "December" }));
        jPanel1.add(dobmonthin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        dobyearin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" }));
        jPanel1.add(dobyearin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        add.setText("ADD PRISONER");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));
        jPanel1.add(reportt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 390, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 860, 550));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("   Add Prisoner");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 56));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(dobdayin.getSelectedIndex() == 0 || dobmonthin.getSelectedIndex() == 0 || dobyearin.getSelectedIndex() == 0 
                || genderin.getSelectedItem() == "Gender"){
            reportt.setText("please enter all the information");}
        else{
        String name = namein.getText();
        
        String id = IDin.getText();
        
        int dayDOB = Integer.parseInt((String) dobdayin.getSelectedItem());
        
        int monthDOB = dobmonthin.getSelectedIndex();
        
        int yearDOB = Integer.parseInt((String) dobyearin.getSelectedItem());
        
        String offense = offensein.getText();
        
        int cellnumber = Integer.parseInt(cellnumin.getText());
        
        int duration = Integer.parseInt(durationin.getText());
        
        char gender = 'A';
        
        if (genderin.getSelectedItem() == "M"){
            gender = 'M';
        }
        else{
            gender = 'F';
        }
        
        int dayEntry = Integer.parseInt((String) entrydayin.getSelectedItem());
        
        int monthEntry = entrymonthin.getSelectedIndex()+2;
        
        int yearEntry = Integer.parseInt((String) entryyearin.getSelectedItem());
        
        Date dobDate = new Date(dayDOB, monthDOB, yearDOB);
        
        Date entryDate = new Date(dayEntry, monthEntry, yearEntry);
        
        Prisoner p1 = new Prisoner(name , dobDate , gender, id, offense, duration, entryDate, cellnumber);
        
        namein.setText("");
        IDin.setText("");
        cellnumin.setText("");
        offensein.setText("");
        durationin.setText("");

        
        
        }
        
        
    }//GEN-LAST:event_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDin;
    private javax.swing.JButton add;
    private javax.swing.JTextField cellnumin;
    private javax.swing.JComboBox<String> dobdayin;
    private javax.swing.JComboBox<String> dobmonthin;
    private javax.swing.JComboBox<String> dobyearin;
    private javax.swing.JTextField durationin;
    private javax.swing.JComboBox<String> entrydayin;
    private javax.swing.JComboBox<String> entrymonthin;
    private javax.swing.JComboBox<String> entryyearin;
    private javax.swing.JComboBox<String> genderin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namein;
    private javax.swing.JTextField offensein;
    private javax.swing.JLabel reportt;
    // End of variables declaration//GEN-END:variables
}
