/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import jail.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author husse
 */
public class ReleasePrisoner extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddPrisner
     */
    ArrayList<String> inmateIDS = new ArrayList<String>();
    public ReleasePrisoner() {
        initComponents();
        inmateIDS = new ArrayList<String>();
        for (int i = 0; i < Database.getCells().size(); i++) {
            Database.getCells().get(i).getPrisoners().clear();
        }
        
        for (int i = 0; i < Database.getPrisoners().size(); i++) {
            Database.getCells().get((Database.getPrisoners().get(i).getCellNumber())-1).add_prisoner(Database.getPrisoners().get(i));
        }
        for (int i = 0; i < Database.getPrisoners().size(); i++) {
            inmateIDS.add(Database.getPrisoners().get(i).getInmateID());
            CMB.addItem(Database.getPrisoners().get(i).getName() + " - " + Database.getPrisoners().get(i).getInmateID());
        }
        statusLBL.setForeground(Color.green);
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
        jLabel6 = new javax.swing.JLabel();
        releaseBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TF3 = new javax.swing.JTextField();
        TF2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF1 = new javax.swing.JTextField();
        CB = new javax.swing.JCheckBox();
        statusLBL = new javax.swing.JLabel();
        CMB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setToolTipText("");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel6.setText("Prisoners:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, 30));

        releaseBTN.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        releaseBTN.setText("Release");
        releaseBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releaseBTNActionPerformed(evt);
            }
        });
        jPanel1.add(releaseBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 200, 40));

        jLabel5.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel5.setText("Reason For Release:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, 30));
        jPanel1.add(TF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 200, 30));

        TF2.setEnabled(false);
        jPanel1.add(TF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, 30));

        jLabel3.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel3.setText("Prisoner Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        TF1.setEnabled(false);
        jPanel1.add(TF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 200, 30));

        CB.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        CB.setText("Enter Manually");
        CB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBMouseClicked(evt);
            }
        });
        jPanel1.add(CB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 40));

        statusLBL.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        statusLBL.setForeground(new java.awt.Color(51, 153, 0));
        statusLBL.setText("Status: Working!");
        jPanel1.add(statusLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 490, 40));

        jPanel1.add(CMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 200, 30));

        jLabel4.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel4.setText("Inmate ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("   Release Prisoner");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 860, 70));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void releaseBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releaseBTNActionPerformed
        if (CB.isSelected()){
            if (!inmateIDS.contains(TF2.getText())){
                JFrame f = new JFrame("MSG");
                JOptionPane.showMessageDialog(f, "Prisoner Not Found");
                statusLBL.setText("Status: Prisoner Not Found");
                statusLBL.setForeground(Color.red);
            }
            else if (inmateIDS.contains(TF2.getText()) && !Database.getPrisonerByInmateID(TF2.getText()).getName().equals(TF1.getText())){
                JFrame f = new JFrame("MSG");
                JOptionPane.showMessageDialog(f, ("InmateID and name dont match did you mean to search for " + Database.getPrisonerByInmateID(TF2.getText()).getName()));
                statusLBL.setText("Status: InmateID and name dont match did you mean to search for " + Database.getPrisonerByInmateID(TF2.getText()).getName());
                statusLBL.setForeground(Color.red);
            }
            else{
                for (int i = 0; i < Database.getPrisoners().size(); i++) {
                    if (Database.getPrisoners().get(i).getInmateID().equals(TF2.getText())){
                        Database.getCells().get((Database.getPrisoners().get(i).getCellNumber())-1).remove_prisoner(Database.getPrisoners().get(i));
                        Database.getPrisoners().remove(i);
                        CMB.removeItemAt(i);
                        inmateIDS.remove(i);
                    }
                }
                JFrame f = new JFrame("MSG");
                JOptionPane.showMessageDialog(f, "Prisoner Has Been Removed");
                statusLBL.setText("Status: Working!");
                statusLBL.setForeground(Color.green);
            }
        }
        else{
            int index = CMB.getSelectedIndex();
            Database.getCells().get((Database.getPrisoners().get(index).getCellNumber())-1).remove_prisoner(Database.getPrisoners().get(index));
            Database.getPrisoners().remove(index);
            CMB.setSelectedIndex(0);
            CMB.removeItemAt(index);
            inmateIDS.remove(index);
            JFrame f = new JFrame("MSG");
            JOptionPane.showMessageDialog(f, "Prisoner Has Been Removed");
            statusLBL.setText("Status: Working!");
            statusLBL.setForeground(Color.green);
        }
    }//GEN-LAST:event_releaseBTNActionPerformed

    private void CBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBMouseClicked
        if (CB.isSelected()){
            TF1.setEnabled(true);
            TF2.setEnabled(true);
            CMB.setEnabled(false);
        }
        else{
            TF1.setEnabled(false);
            TF2.setEnabled(false);
            CMB.setEnabled(true);
        }
    }//GEN-LAST:event_CBMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CB;
    private javax.swing.JComboBox<String> CMB;
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField TF3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton releaseBTN;
    private javax.swing.JLabel statusLBL;
    // End of variables declaration//GEN-END:variables
}
