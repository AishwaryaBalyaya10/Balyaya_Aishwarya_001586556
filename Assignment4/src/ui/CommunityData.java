/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import communityManagementSystem.Encounter;
import communityManagementSystem.EncounterDirectory;
import communityManagementSystem.House;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aish
 */
public class CommunityData extends javax.swing.JPanel {

    /**
     * Creates new form CommunityData
     */
    Stack<Encounter> s;
    ArrayList<House> ah;
    HashSet<String> sAge = new HashSet<>();
    HashSet<String> sHouse = new HashSet<>();
    DefaultTableModel dtm;
    int count = 0;
    public CommunityData(Stack<Encounter> s, ArrayList<House> ah) {
        initComponents();
        this.s = s;
        this.ah = ah;
        for(House h:ah)
            sHouse.add(h.getCommunity());
        for(String scm: sHouse)
            cmbxCommunity.addItem(scm);
        for(Encounter e:s)
            sAge.add(e.Group);
        for(String aGrp:sAge)
            cmbxAgeGrp.addItem(aGrp);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbxCommunity = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblCnt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbxAgeGrp = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel1.setText("Community Abnormal Data");

        jLabel2.setText("Select Community:");

        jLabel3.setText("Count of People with Abnormalities:");

        lblCnt.setText("Count");

        jLabel5.setText("Age Group:");

        cmbxAgeGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxAgeGrpActionPerformed(evt);
            }
        });

        jButton1.setText("Get Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "City", "Community", "ID", "Blood Pressure"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbxAgeGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCnt)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(157, 157, 157))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbxAgeGrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblCnt))
                .addGap(56, 56, 56))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Collections.reverse(s);
        dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        for(Encounter et:s){
            Object [] row= new Object[7];
            String ageGrp = cmbxAgeGrp.getSelectedItem().toString();
            String cm = cmbxCommunity.getSelectedItem().toString();
            boolean a1 = et.getGroup().equalsIgnoreCase(ageGrp);
            boolean a2 = et.getCommnuity().equalsIgnoreCase(cm);
            boolean a3 = et.isIsAbnormal();
            if(et.isIsAbnormal() && et.getGroup().equalsIgnoreCase(ageGrp) && et.getCommnuity().equalsIgnoreCase(cm)){
            row[0]= et.getName();
            row[1]=et.getAge();
            row[2]=et.getGender();
            row[3]=et.getCity();
            row[4]=et.getCommnuity();
            row[5]=et.getPersonID();
            row[6]=et.getBloodPressure();
            dtm.addRow(row);
            count++;
            }
	}
        lblCnt.setText(String.valueOf(count));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbxAgeGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxAgeGrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxAgeGrpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbxAgeGrp;
    private javax.swing.JComboBox<String> cmbxCommunity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCnt;
    // End of variables declaration//GEN-END:variables
}
