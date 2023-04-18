/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import jail.Database;
import jail.Prisoner;
import jail.Visitor;
import jail.Date;
import jail.Visitation;

/**
 *
 * @author husse
 */
public class VisitationGui extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddPrisner
     */
    public VisitationGui() {
        initComponents();
        initSettings();
        Database db = new Database();
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
        actionType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        addVisitation = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        visitationId = new javax.swing.JTextField();
        DoVLabel = new javax.swing.JLabel();
        ToVLabel = new javax.swing.JLabel();
        visitDay = new javax.swing.JComboBox<>();
        visitMonth = new javax.swing.JComboBox<>();
        visitYear = new javax.swing.JTextField();
        visitHour = new javax.swing.JComboBox<>();
        visitTime = new javax.swing.JComboBox<>();
        existingVisitor = new javax.swing.JRadioButton();
        newVisitor = new javax.swing.JRadioButton();
        prisonerPanel = new javax.swing.JPanel();
        prisonerName = new javax.swing.JTextField();
        prisonerGender = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        prisonerIdNumber = new javax.swing.JTextField();
        prisonerIdLabel = new javax.swing.JLabel();
        prisonerID = new javax.swing.JTextField();
        prisonerStatus = new javax.swing.JLabel();
        prisonerYear = new javax.swing.JTextField();
        prisonerDay = new javax.swing.JTextField();
        prisonerMonth = new javax.swing.JTextField();
        prisonerSearch = new javax.swing.JButton();
        existingVisitorPanel = new javax.swing.JPanel();
        eVisitorName = new javax.swing.JTextField();
        eVisitorGender = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        eVisitorIdNumber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        eVisitorID = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        visitorStatus = new javax.swing.JLabel();
        eVisitorYear = new javax.swing.JTextField();
        eVisitorDay = new javax.swing.JTextField();
        eVisitorMonth = new javax.swing.JTextField();
        eVisitorSearch = new javax.swing.JButton();
        newVisitorPanel = new javax.swing.JPanel();
        nVisitorName = new javax.swing.JTextField();
        nVisitorDay = new javax.swing.JComboBox<>();
        nVisitorMonth = new javax.swing.JComboBox<>();
        nVisitorGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nVisitorIdNumber = new javax.swing.JTextField();
        nVisitorYear = new javax.swing.JTextField();
        createVisitation = new javax.swing.JButton();
        visitationStatus = new javax.swing.JLabel();
        visitationGenerate1 = new javax.swing.JButton();
        finalTextPanel = new javax.swing.JScrollPane();
        finalText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Select your action:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        actionType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        actionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Add Visitation", "Edit Visitation", "View Visitation" }));
        actionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionTypeActionPerformed(evt);
            }
        });
        jPanel1.add(actionType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("   Visitation");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 56));

        addVisitation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Visitation ID:");
        jLabel4.setEnabled(false);
        addVisitation.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        visitationId.setText("0000");
        visitationId.setEnabled(false);
        visitationId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitationIdActionPerformed(evt);
            }
        });
        addVisitation.add(visitationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 130, -1));

        DoVLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DoVLabel.setText("Date of Visit:");
        DoVLabel.setEnabled(false);
        addVisitation.add(DoVLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        ToVLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ToVLabel.setText("Time of Visit:");
        ToVLabel.setEnabled(false);
        addVisitation.add(ToVLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        visitDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        visitDay.setEnabled(false);
        visitDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitDayActionPerformed(evt);
            }
        });
        addVisitation.add(visitDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 60, -1));

        visitMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        visitMonth.setEnabled(false);
        visitMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitMonthActionPerformed(evt);
            }
        });
        addVisitation.add(visitMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 60, -1));

        visitYear.setEnabled(false);
        addVisitation.add(visitYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 80, -1));

        visitHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        visitHour.setEnabled(false);
        visitHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitHourActionPerformed(evt);
            }
        });
        addVisitation.add(visitHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 60, -1));

        visitTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        visitTime.setEnabled(false);
        visitTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitTimeActionPerformed(evt);
            }
        });
        addVisitation.add(visitTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 60, -1));

        existingVisitor.setText("Existing Visitor");
        existingVisitor.setEnabled(false);
        existingVisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existingVisitorActionPerformed(evt);
            }
        });
        addVisitation.add(existingVisitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        newVisitor.setText("New Visitor");
        newVisitor.setEnabled(false);
        newVisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newVisitorActionPerformed(evt);
            }
        });
        addVisitation.add(newVisitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        prisonerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prisonerName.setEnabled(false);
        prisonerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prisonerNameActionPerformed(evt);
            }
        });
        prisonerPanel.add(prisonerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 220, -1));

        prisonerGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        prisonerGender.setEnabled(false);
        prisonerGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prisonerGenderActionPerformed(evt);
            }
        });
        prisonerPanel.add(prisonerGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("ID Number:");
        jLabel16.setEnabled(false);
        prisonerPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Prisoner Gender:");
        jLabel17.setEnabled(false);
        prisonerPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Date of Birth:");
        jLabel18.setEnabled(false);
        prisonerPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Prisoner Name:");
        jLabel19.setEnabled(false);
        prisonerPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        prisonerIdNumber.setEnabled(false);
        prisonerIdNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prisonerIdNumberActionPerformed(evt);
            }
        });
        prisonerPanel.add(prisonerIdNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));

        prisonerIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prisonerIdLabel.setText("Prisoner ID:");
        prisonerIdLabel.setEnabled(false);
        prisonerPanel.add(prisonerIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        prisonerID.setEnabled(false);
        prisonerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prisonerIDActionPerformed(evt);
            }
        });
        prisonerPanel.add(prisonerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 130, -1));

        prisonerStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prisonerStatus.setForeground(new java.awt.Color(255, 0, 0));
        prisonerPanel.add(prisonerStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 250, 20));

        prisonerYear.setEnabled(false);
        prisonerPanel.add(prisonerYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 80, -1));

        prisonerDay.setEnabled(false);
        prisonerPanel.add(prisonerDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 60, -1));

        prisonerMonth.setEnabled(false);
        prisonerPanel.add(prisonerMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 60, -1));

        prisonerSearch.setText("Search");
        prisonerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prisonerSearchActionPerformed(evt);
            }
        });
        prisonerPanel.add(prisonerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 80, -1));

        addVisitation.add(prisonerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 340, 190));

        existingVisitorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eVisitorName.setEnabled(false);
        eVisitorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eVisitorNameActionPerformed(evt);
            }
        });
        existingVisitorPanel.add(eVisitorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 220, -1));

        eVisitorGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Male", "Female" }));
        eVisitorGender.setEnabled(false);
        eVisitorGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eVisitorGenderActionPerformed(evt);
            }
        });
        existingVisitorPanel.add(eVisitorGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Visitor Gender:");
        jLabel12.setEnabled(false);
        existingVisitorPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Date of Birth:");
        jLabel13.setEnabled(false);
        existingVisitorPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Visitor Name:");
        jLabel14.setEnabled(false);
        existingVisitorPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        eVisitorIdNumber.setEnabled(false);
        eVisitorIdNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eVisitorIdNumberActionPerformed(evt);
            }
        });
        existingVisitorPanel.add(eVisitorIdNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 220, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Visitor ID:");
        existingVisitorPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        eVisitorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eVisitorIDActionPerformed(evt);
            }
        });
        existingVisitorPanel.add(eVisitorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 130, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("ID Number:");
        jLabel21.setEnabled(false);
        existingVisitorPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        visitorStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        visitorStatus.setForeground(new java.awt.Color(255, 0, 0));
        existingVisitorPanel.add(visitorStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 20));

        eVisitorYear.setEnabled(false);
        existingVisitorPanel.add(eVisitorYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 80, -1));

        eVisitorDay.setEnabled(false);
        existingVisitorPanel.add(eVisitorDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 60, -1));

        eVisitorMonth.setEnabled(false);
        existingVisitorPanel.add(eVisitorMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 60, -1));

        eVisitorSearch.setText("Search");
        eVisitorSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eVisitorSearchActionPerformed(evt);
            }
        });
        existingVisitorPanel.add(eVisitorSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 80, -1));

        addVisitation.add(existingVisitorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 350, 180));

        newVisitorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nVisitorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nVisitorNameActionPerformed(evt);
            }
        });
        newVisitorPanel.add(nVisitorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 180, -1));

        nVisitorDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        nVisitorDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nVisitorDayActionPerformed(evt);
            }
        });
        newVisitorPanel.add(nVisitorDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 50, -1));

        nVisitorMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        nVisitorMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nVisitorMonthActionPerformed(evt);
            }
        });
        newVisitorPanel.add(nVisitorMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 50, -1));

        nVisitorGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        nVisitorGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nVisitorGenderActionPerformed(evt);
            }
        });
        newVisitorPanel.add(nVisitorGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("ID Number:");
        newVisitorPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Visitor Gender:");
        newVisitorPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Date of Birth:");
        newVisitorPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Visitor Name:");
        newVisitorPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        nVisitorIdNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nVisitorIdNumberActionPerformed(evt);
            }
        });
        newVisitorPanel.add(nVisitorIdNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 180, -1));
        newVisitorPanel.add(nVisitorYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 60, -1));

        addVisitation.add(newVisitorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 290, 150));

        createVisitation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        createVisitation.setText("Create");
        createVisitation.setEnabled(false);
        createVisitation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVisitationActionPerformed(evt);
            }
        });
        addVisitation.add(createVisitation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 130, -1));

        visitationStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        visitationStatus.setForeground(new java.awt.Color(255, 0, 0));
        addVisitation.add(visitationStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 250, 30));

        visitationGenerate1.setText("New");
        visitationGenerate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitationGenerate1ActionPerformed(evt);
            }
        });
        addVisitation.add(visitationGenerate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 80, -1));

        finalText.setColumns(20);
        finalText.setRows(5);
        finalTextPanel.setViewportView(finalText);

        addVisitation.add(finalTextPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 400, 140));

        jPanel1.add(addVisitation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 820, 410));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 860, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visitDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitDayActionPerformed

    private void visitMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitMonthActionPerformed

    private void visitHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitHourActionPerformed

    private void visitTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitTimeActionPerformed

    private void nVisitorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nVisitorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nVisitorNameActionPerformed

    private void nVisitorDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nVisitorDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nVisitorDayActionPerformed

    private void nVisitorGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nVisitorGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nVisitorGenderActionPerformed

    private void nVisitorMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nVisitorMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nVisitorMonthActionPerformed

    private void nVisitorIdNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nVisitorIdNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nVisitorIdNumberActionPerformed

    private void newVisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newVisitorActionPerformed
        newVisitorPanel.setVisible(true);
        existingVisitorPanel.setVisible(false);
        existingVisitor.setSelected(false);
    }//GEN-LAST:event_newVisitorActionPerformed

    private void eVisitorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eVisitorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eVisitorNameActionPerformed

    private void eVisitorGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eVisitorGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eVisitorGenderActionPerformed

    private void eVisitorIdNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eVisitorIdNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eVisitorIdNumberActionPerformed

    private void eVisitorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eVisitorIDActionPerformed
        
    }//GEN-LAST:event_eVisitorIDActionPerformed

    private void existingVisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existingVisitorActionPerformed
        newVisitorPanel.setVisible(false);
        existingVisitorPanel.setVisible(true);
        newVisitor.setSelected(false);
    }//GEN-LAST:event_existingVisitorActionPerformed

    private void prisonerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prisonerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prisonerNameActionPerformed

    private void prisonerGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prisonerGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prisonerGenderActionPerformed

    private void prisonerIdNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prisonerIdNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prisonerIdNumberActionPerformed

    private void prisonerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prisonerIDActionPerformed
        
    }//GEN-LAST:event_prisonerIDActionPerformed

    private void actionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionTypeActionPerformed
        if (actionType.getSelectedIndex() == 1) {
            addVisitation.setVisible(true);
        }
    }//GEN-LAST:event_actionTypeActionPerformed

    private void createVisitationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVisitationActionPerformed
        Visitor visitor;
        Date DoV = new Date(Integer.parseInt(visitDay.getSelectedItem().toString()), Integer.parseInt(visitMonth.getSelectedItem().toString()), Integer.parseInt(visitYear.getText()));
        if (newVisitor.isSelected()) {
            Date DOB = new Date(Integer.parseInt(nVisitorDay.getSelectedItem().toString()), Integer.parseInt(nVisitorMonth.getSelectedItem().toString()), Integer.parseInt(nVisitorYear.getText()));
            String VID = "Vs-" + (int)(Math.random() * 10000);
            visitor = new Visitor(nVisitorName.getText(), DOB, nVisitorGender.getSelectedItem().toString().charAt(0), nVisitorIdNumber.getText(), VID);
            // String name, Date DOB, char gender, String personID, String visitorID
            Visitation visit = new Visitation(visitationId.getText(), DoV, visitHour.getSelectedItem().toString() + visitTime.getSelectedItem().toString(), prisonerID.getText(), eVisitorID.getText());
            // String visitationID, Date dateOfVisit, String time, String prisonerID, String visitorID
            finalText.setText(visit.display());
            finalTextPanel.setVisible(true);
        } else if (existingVisitor.isSelected()) {
            visitor = Database.getVisitor(eVisitorID.getText());
            Visitation visit = new Visitation(visitationId.getText(), DoV, visitHour.getSelectedItem().toString() + visitTime.getSelectedItem().toString(), prisonerID.getText(), visitor.getVisitorID());
            // String visitationID, Date dateOfVisit, String time, String prisonerID, String visitorID
            finalText.setText(visit.display());
            finalTextPanel.setVisible(true);
        } else {
            visitor = null;
            visitationStatus.setText("No visitor selected");
        }
    }//GEN-LAST:event_createVisitationActionPerformed

    private void eVisitorSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eVisitorSearchActionPerformed
        Visitor visitor = Database.getVisitor(eVisitorID.getText());
        if (!(visitor == null)) {
            eVisitorName.setText(visitor.getName());
            eVisitorDay.setText(visitor.getDOB().getDay() + "");
            eVisitorMonth.setText(visitor.getDOB().getMonth() + "");
            eVisitorYear.setText(visitor.getDOB().getYear() + "");
            eVisitorGender.setSelectedIndex((visitor.getGender() == 'M')? 1 : 2);
            eVisitorIdNumber.setText(visitor.getID());
            visitorStatus.setText("");
        } else {
            eVisitorName.setText("");
            eVisitorDay.setText("");
            eVisitorMonth.setText("");
            eVisitorYear.setText("");
            eVisitorGender.setSelectedIndex(0);
            eVisitorIdNumber.setText("");
            visitorStatus.setText("Invalid Visitor ID");
        }
    }//GEN-LAST:event_eVisitorSearchActionPerformed

    private void visitationGenerate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitationGenerate1ActionPerformed
        visitationId.setText("Visit-" + (int)(Math.random() * 10000));
        DoVLabel.setEnabled(true);
        ToVLabel.setEnabled(true);
        visitDay.setEnabled(true);
        visitMonth.setEnabled(true);
        visitYear.setEnabled(true);
        visitHour.setEnabled(true);
        visitTime.setEnabled(true);
        prisonerID.setEnabled(true);
        prisonerIdLabel.setEnabled(true);
        newVisitor.setEnabled(true);
        existingVisitor.setEnabled(true);
    }//GEN-LAST:event_visitationGenerate1ActionPerformed

    private void visitationIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitationIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitationIdActionPerformed

    private void prisonerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prisonerSearchActionPerformed
        Prisoner prisoner = Database.getPrisonerByInmateID(prisonerID.getText());
        if (!(prisoner == null)) {
            prisonerName.setText(prisoner.getName());
            eVisitorDay.setText(prisoner.getDOB().getDay() + "");
            eVisitorMonth.setText(prisoner.getDOB().getMonth() + "");
            prisonerYear.setText(prisoner.getDOB().getYear() + "");
            prisonerGender.setSelectedIndex((prisoner.getGender() == 'M')? 1 : 2);
            prisonerIdNumber.setText(prisoner.getID());
            prisonerStatus.setText("");
            createVisitation.setEnabled(true);
        } else {
            prisonerName.setText("");
            eVisitorDay.setText("");
            eVisitorMonth.setText("");
            prisonerYear.setText("");
            prisonerGender.setSelectedIndex(0);
            prisonerIdNumber.setText("");
            prisonerStatus.setText("Invalid Inmate ID");
            createVisitation.setEnabled(false);
        }
    }//GEN-LAST:event_prisonerSearchActionPerformed

    private void initSettings() {
        addVisitation.setVisible(false);
        newVisitorPanel.setVisible(false);
        existingVisitorPanel.setVisible(false);
        finalTextPanel.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoVLabel;
    private javax.swing.JLabel ToVLabel;
    private javax.swing.JComboBox<String> actionType;
    private javax.swing.JPanel addVisitation;
    private javax.swing.JButton createVisitation;
    private javax.swing.JTextField eVisitorDay;
    private javax.swing.JComboBox<String> eVisitorGender;
    private javax.swing.JTextField eVisitorID;
    private javax.swing.JTextField eVisitorIdNumber;
    private javax.swing.JTextField eVisitorMonth;
    private javax.swing.JTextField eVisitorName;
    private javax.swing.JButton eVisitorSearch;
    private javax.swing.JTextField eVisitorYear;
    private javax.swing.JRadioButton existingVisitor;
    private javax.swing.JPanel existingVisitorPanel;
    private javax.swing.JTextArea finalText;
    private javax.swing.JScrollPane finalTextPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> nVisitorDay;
    private javax.swing.JComboBox<String> nVisitorGender;
    private javax.swing.JTextField nVisitorIdNumber;
    private javax.swing.JComboBox<String> nVisitorMonth;
    private javax.swing.JTextField nVisitorName;
    private javax.swing.JTextField nVisitorYear;
    private javax.swing.JRadioButton newVisitor;
    private javax.swing.JPanel newVisitorPanel;
    private javax.swing.JTextField prisonerDay;
    private javax.swing.JComboBox<String> prisonerGender;
    private javax.swing.JTextField prisonerID;
    private javax.swing.JLabel prisonerIdLabel;
    private javax.swing.JTextField prisonerIdNumber;
    private javax.swing.JTextField prisonerMonth;
    private javax.swing.JTextField prisonerName;
    private javax.swing.JPanel prisonerPanel;
    private javax.swing.JButton prisonerSearch;
    private javax.swing.JLabel prisonerStatus;
    private javax.swing.JTextField prisonerYear;
    private javax.swing.JComboBox<String> visitDay;
    private javax.swing.JComboBox<String> visitHour;
    private javax.swing.JComboBox<String> visitMonth;
    private javax.swing.JComboBox<String> visitTime;
    private javax.swing.JTextField visitYear;
    private javax.swing.JButton visitationGenerate1;
    private javax.swing.JTextField visitationId;
    private javax.swing.JLabel visitationStatus;
    private javax.swing.JLabel visitorStatus;
    // End of variables declaration//GEN-END:variables
}
