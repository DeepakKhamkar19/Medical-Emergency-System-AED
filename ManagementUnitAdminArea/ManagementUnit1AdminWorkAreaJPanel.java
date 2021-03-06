/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagementUnitAdminArea;

import Project.EcoSystem;
import Project.Venture.Venture;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.*;

/**
 *
 * @author Raveena
 */
public class ManagementUnit1AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Venture enterprise;
    EcoSystem ecosystem;
    
    public ManagementUnit1AdminWorkAreaJPanel(JPanel userProcessContainer, Venture enterprise, EcoSystem ecosystem) {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jkPanel1 = new javax.swing.JPanel();
        jkLabel1 = new javax.swing.JLabel();
        jbtnManageOrganisation = new javax.swing.JButton();
        jbtnManageUser = new javax.swing.JButton();
        jbtnManageEmployee = new javax.swing.JButton();
        jkLabel2 = new javax.swing.JLabel();
        jviewJPanel = new javax.swing.JPanel();

        jMenuItem1.setText("jMenuItem1");

        jkPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jkLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jkLabel1.setText("MANAGEMEMENT ADMIN");

        jbtnManageOrganisation.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jbtnManageOrganisation.setText("MANAGE ORGANISATION");
        jbtnManageOrganisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnManageOrganisationActionPerformed(evt);
            }
        });

        jbtnManageUser.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jbtnManageUser.setText("MANAGE USER");
        jbtnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnManageUserActionPerformed(evt);
            }
        });

        jbtnManageEmployee.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jbtnManageEmployee.setText("MANAGE EMPLOYEE");
        jbtnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnManageEmployeeActionPerformed(evt);
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
                        .addComponent(jbtnManageOrganisation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addComponent(jbtnManageEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jkPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jkLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jkPanel1Layout.setVerticalGroup(
            jkPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jkPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jkLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jkLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbtnManageOrganisation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbtnManageEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbtnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );

        jviewJPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jkPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jviewJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jviewJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jkPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnManageOrganisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnManageOrganisationActionPerformed
        // TODO add your handling code here:
         ManagementUnitOrganizationsJPanel gumjp = new ManagementUnitOrganizationsJPanel(jviewJPanel, enterprise, ecosystem);
        jviewJPanel.add("EmergencyUnitManageOrganizationsJPanel",gumjp);
        CardLayout layout = (CardLayout) jviewJPanel.getLayout();
        layout.next(jviewJPanel);
    }//GEN-LAST:event_jbtnManageOrganisationActionPerformed

    private void jbtnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnManageEmployeeActionPerformed
        // TODO add your handling code here:
        ManagementUnitManageEmployeeJPanel gumejp = new ManagementUnitManageEmployeeJPanel(jviewJPanel, enterprise, ecosystem);
        jviewJPanel.add("EmergencyUnitManageUsersJPanel",gumejp);
        CardLayout layout = (CardLayout) jviewJPanel.getLayout();
        layout.next(jviewJPanel);
    }//GEN-LAST:event_jbtnManageEmployeeActionPerformed

    private void jbtnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnManageUserActionPerformed
        // TODO add your handling code here:
        ManagementUnitManageUsersJPanel gumujp = new ManagementUnitManageUsersJPanel(jviewJPanel, enterprise, ecosystem);
        jviewJPanel.add("EmergencyUnitManageUsersJPanel",gumujp);
        CardLayout layout = (CardLayout) jviewJPanel.getLayout();
        layout.next(jviewJPanel);
    }//GEN-LAST:event_jbtnManageUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton jbtnManageEmployee;
    private javax.swing.JButton jbtnManageOrganisation;
    private javax.swing.JButton jbtnManageUser;
    private javax.swing.JLabel jkLabel1;
    private javax.swing.JLabel jkLabel2;
    private javax.swing.JPanel jkPanel1;
    private javax.swing.JPanel jviewJPanel;
    // End of variables declaration//GEN-END:variables
}
