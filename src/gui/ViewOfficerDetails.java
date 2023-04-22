package gui;

import jail.Database;
import jail.Officer;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hussain
 */
public class ViewOfficerDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewOfficerDetails
     */
    private final DefaultListModel mod;
    private Officer p;

    public ViewOfficerDetails() {
        initComponents();
        menu.add(panel);
        mod = new DefaultListModel();
        list.setModel(mod);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPopupMenu();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        upperLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        enter = new javax.swing.JLabel();
        searchtf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fd = new javax.swing.JLabel();
        sds = new javax.swing.JLabel();
        adas = new javax.swing.JLabel();
        adfa = new javax.swing.JLabel();
        aa = new javax.swing.JLabel();
        adfad = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();

        menu.setFocusable(false);

        panel.setFocusable(false);

        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        jPanel1.setPreferredSize(new java.awt.Dimension(880, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperLabel.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        upperLabel.setText("   View Officer Details");
        upperLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(upperLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 56));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Search with");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 40));

        cb1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one...", "Name", "ID", "Badge Number" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel1.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 170, 40));

        enter.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jPanel1.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 120, 40));

        searchtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtfKeyReleased(evt);
            }
        });
        jPanel1.add(searchtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 210, 40));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 80, 100, 40));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 840, 80));

        fd.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        fd.setText("Name:");
        jPanel1.add(fd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 30));

        sds.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        sds.setText("Age:");
        jPanel1.add(sds, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 120, 30));

        adas.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        adas.setText("Gender:");
        jPanel1.add(adas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 30));

        adfa.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        adfa.setText("ID:");
        jPanel1.add(adfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 120, 30));

        aa.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        aa.setText("Badge Number:");
        jPanel1.add(aa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        adfad.setFont(new java.awt.Font("Georgia", 3, 16)); // NOI18N
        adfad.setText("Rank:");
        jPanel1.add(adfad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 120, 30));

        tf5.setEditable(false);
        tf5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel1.add(tf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 330, 30));

        tf4.setEditable(false);
        tf4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel1.add(tf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 330, 30));

        tf3.setEditable(false);
        tf3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel1.add(tf3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 330, 30));

        tf2.setEditable(false);
        tf2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel1.add(tf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 330, 30));

        tf1.setEditable(false);
        tf1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel1.add(tf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 330, 30));

        tf6.setEditable(false);
        tf6.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jPanel1.add(tf6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 330, 30));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 840, 380));

        backLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 860, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        if (cb1.getSelectedIndex() == 1) {
            enter.setText("Enter Name:");
        } else if (cb1.getSelectedIndex() == 2) {
            enter.setText("Enter ID:");
        } else if (cb1.getSelectedIndex() == 3) {
            enter.setText("Badge number:");
        }
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
            searchtf.setText("");
    }//GEN-LAST:event_cb1ActionPerformed

    private void searchtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyReleased
        if (cb1.getSelectedIndex() == 1) {
            String search = searchtf.getText().trim().toLowerCase();
            if (!search.equals("")) {
                mod.removeAllElements();
                for (Officer p : Database.getOfficers()) {
                    if (p.getName().toLowerCase().startsWith(search)) {
                        mod.addElement(p.getName() + " " + p.getID());
                    }
                }
                menu.show(searchtf, 0, searchtf.getHeight());
            }
        }
    }//GEN-LAST:event_searchtfKeyReleased

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        searchtf.setText(list.getSelectedValue());
        menu.setVisible(false);
    }//GEN-LAST:event_listMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (cb1.getSelectedIndex() == 2) {
            p = Database.getOfficerByID(searchtf.getText());
        } else if (cb1.getSelectedIndex() == 3) {
            p = Database.getOfficer(searchtf.getText());
        } else if (cb1.getSelectedIndex() == 1) {
            String[] s = searchtf.getText().split(" ");
            if (s.length != 2) {
                JOptionPane.showMessageDialog(rootPane, "Please select name from the list");
            } else {
                p = Database.getOfficerByID(s[1]);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please select search method");
        }
        if (p == null && cb1.getSelectedIndex() != 0) {
            JOptionPane.showMessageDialog(rootPane, "Please enter a valid Officer");
        } else if (cb1.getSelectedIndex() != 0) {
            searchtf.setText("");
            tf1.setText(p.getName());
            tf2.setText(p.getDOB().getAge() + "");
            if (p.getGender() == 'M') {
                tf3.setText("Male");
            } else {
                tf2.setText("Female");
            }
            tf4.setText(p.getID());
            tf5.setText(p.getBadgeNumber());
            tf6.setText(p.getRank());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aa;
    private javax.swing.JLabel adas;
    private javax.swing.JLabel adfa;
    private javax.swing.JLabel adfad;
    private javax.swing.JLabel backLabel;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel enter;
    private javax.swing.JLabel fd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel sds;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JLabel upperLabel;
    // End of variables declaration//GEN-END:variables
}
