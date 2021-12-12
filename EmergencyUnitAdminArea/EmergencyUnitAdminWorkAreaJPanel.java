/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EmergencyUnitAdminArea;

import userinterface.MedicineUnitAdminArea.*;
import Project.EcoSystem;
import Project.Venture.Venture;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.ManagementUnitAdminArea.*;
import userinterface.SystemAdminWorkArea.*;

/**
 *
 * @author Dell
 */

public class EmergencyUnitAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Venture enterprise;
    EcoSystem ecosystem;
    public EmergencyUnitAdminWorkAreaJPanel(JPanel userProcessContainer, Venture enterprise, EcoSystem ecosystem) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jkPanel1 = new javax.swing.JPanel();
        jkLabel1 = new javax.swing.JLabel();
        btnManageOrg = new javax.swing.JButton();
        jbtnManageUser = new javax.swing.JButton();
        btnManageEmp = new javax.swing.JButton();
        jkLabel2 = new javax.swing.JLabel();
        viewJPanel = new javax.swing.JPanel();

        jkPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jkLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jkLabel1.setText("EMERGENCY ADMIN");

        btnManageOrg.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnManageOrg.setText("MANAGE ORGANISATION");
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });

        jbtnManageUser.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jbtnManageUser.setText("MANAGE USER");
        jbtnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnManageUserActionPerformed(evt);
            }
        });

        btnManageEmp.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnManageEmp.setText("MANAGE EMPLOYEE");
        btnManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpActionPerformed(evt);
            }
        });

        jkLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/folder/ManagementAdmin.png"))); // NOI18N

        javax.swing.GroupLayout jkPanel1Layout = new javax.swing.GroupLayout(jkPanel1);
        jkPanel1.setLayout(jkPanel1Layout);
        jkPanel1Layout.setHorizontalGroup(
            jkPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jkPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(jkPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jkLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jkPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnManageOrg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))))
            .addGroup(jkPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jkLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jkPanel1Layout.setVerticalGroup(
            jkPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jkPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jkLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jkLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnManageOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnManageEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbtnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        viewJPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jkPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jkPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(viewJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
        // TODO add your handling code here:
        EmergencyUnitManageOrganizationsJPanel muajp = new EmergencyUnitManageOrganizationsJPanel(viewJPanel, enterprise, ecosystem);
        viewJPanel.add("EmergencyUnitManageOrganizationsJPanel",muajp);
        CardLayout layout = (CardLayout) viewJPanel.getLayout();
        layout.next(viewJPanel);
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpActionPerformed
        // TODO add your handling code here:
         EmergencyUnitManageEmployeeJPanel mujp = new EmergencyUnitManageEmployeeJPanel(viewJPanel, enterprise, ecosystem);
        viewJPanel.add("EmergencyUnitManageUsersJPanel",mujp);
        CardLayout layout = (CardLayout) viewJPanel.getLayout();
        layout.next(viewJPanel);
    }//GEN-LAST:event_btnManageEmpActionPerformed

    private void jbtnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnManageUserActionPerformed
        // TODO add your handling code here:
         EmergencyUnitManageUsersJPanel mujp = new EmergencyUnitManageUsersJPanel(viewJPanel, enterprise, ecosystem);
        viewJPanel.add("EmergencyUnitManageUsersJPanel",mujp);
        CardLayout layout = (CardLayout) viewJPanel.getLayout();
        layout.next(viewJPanel);
    }//GEN-LAST:event_jbtnManageUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmp;
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton jbtnManageUser;
    private javax.swing.JLabel jkLabel1;
    private javax.swing.JLabel jkLabel2;
    private javax.swing.JPanel jkPanel1;
    private javax.swing.JPanel viewJPanel;
    // End of variables declaration//GEN-END:variables
}