/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Restaurant;
import Business.Organization;
import static Business.Organization.Type.RestaurantAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author braya
 */
public class CreateNewRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewManagerJPanel
     */
    JPanel cardSequenceJPanel;
    EcoSystem system;
    Enterprise enterprise;
    Organization organization;
    public CreateNewRestaurantJPanel(JPanel cardSequenceJPanel,EcoSystem system) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.system=system;
        
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
        btnBack = new javax.swing.JButton();
//        AddManagersBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRestaurantAddress = new javax.swing.JTextField();
        BtnSaveRestaurant = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Restaurant");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

//        AddManagersBtn.setText("Add Managers >>");
//        AddManagersBtn.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                AddManagersBtnActionPerformed(evt);
//            }
//        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Restaurant Name:");

        txtRestaurantName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestaurantNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Address :");

        txtRestaurantAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestaurantAddressActionPerformed(evt);
            }
        });

        BtnSaveRestaurant.setText("Save Restaurant");
        BtnSaveRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveRestaurantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                .addComponent(AddManagersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(BtnSaveRestaurant)))
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                //.addComponent(AddManagersBtn)
                .addGap(29, 29, 29)
                .addComponent(BtnSaveRestaurant)
                .addContainerGap(292, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
          CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        cardSequenceJPanel.remove(this);
        layout.previous(cardSequenceJPanel);
        
        
        Component[] comps = this.cardSequenceJPanel.getComponents();
        for(Component comp : comps){
            if(comp instanceof ManageRestaurantsJPanel){
                ManageRestaurantsJPanel manageRestaurantsJPanel= (ManageRestaurantsJPanel) comp;
               manageRestaurantsJPanel.populateTable(); 
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void AddManagersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddManagersBtnActionPerformed
        // TODO add your handling code here:
        if(organization==null){
            JOptionPane.showMessageDialog(null, "Please save the Restaurant");
         return ; }
         CreateNewManagerJPanel panel = new CreateNewManagerJPanel(cardSequenceJPanel,system,enterprise,organization);
        cardSequenceJPanel.remove(this);
        cardSequenceJPanel.add("CreateNewFlightJPanel", panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();

        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_AddManagersBtnActionPerformed

    private void txtRestaurantNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestaurantNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestaurantNameActionPerformed

    private void txtRestaurantAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestaurantAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestaurantAddressActionPerformed

    private void BtnSaveRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveRestaurantActionPerformed
        // TODO add your handling code here:
        String name=txtRestaurantName.getText();
        String address=txtRestaurantAddress.getText();
                 if (name.equals("") || address.equals("") ){
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return;
            
        }
       enterprise= system.getEnterpriseDirectory().createAndAddEnterprise(name,address,Restaurant);
              
     organization=  (Organization)enterprise.getRestaurantDirectory().createOrganization(Organization.Type.RestaurantAdmin);
       JOptionPane.showMessageDialog(null, "Restaurant saved successfully");
        CreateNewManagerJPanel panel = new CreateNewManagerJPanel(cardSequenceJPanel,system,enterprise,organization);
        cardSequenceJPanel.add("CreateNewFlightJPanel", panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
       
       
        
    }//GEN-LAST:event_BtnSaveRestaurantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    //private javax.swing.JButton AddManagersBtn;
    private javax.swing.JButton BtnSaveRestaurant;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtRestaurantAddress;
    private javax.swing.JTextField txtRestaurantName;
    // End of variables declaration//GEN-END:variables
}
