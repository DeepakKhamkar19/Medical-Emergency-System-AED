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

/**
 *
 * @author Raveena
 */
public class ManagementUnitAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagementUnitAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Venture enterprise;
    EcoSystem ecosystem;
    public ManagementUnitAdminWorkAreaJPanel(JPanel userProcessContainer, Venture enterprise, EcoSystem ecosystem) {
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

        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jkLabel1 = new javax.swing.JLabel();
        jkButton2 = new javax.swing.JButton();
        btnManOrg = new javax.swing.JButton();
        jkButton3 = new javax.swing.JButton();
        jviewJPanel = new javax.swing.JPanel();

        jSplitPane1.setDividerSize(6);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jkLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jkLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jkLabel1.setText("Government Unit Admin Area");

        jkButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jkButton2.setText("Manage User");
        jkButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkButton2ActionPerformed(evt);
            }
        });

        btnManOrg.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnManOrg.setText("Manage Organization");
        btnManOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManOrgActionPerformed(evt);
            }
        });

        jkButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jkButton3.setText("Manage Employee");
        jkButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jkLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnManOrg)
                .addGap(42, 42, 42)
                .addComponent(jkButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jkButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jkLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jkButton2)
                    .addComponent(btnManOrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jkButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel2);

        jviewJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(jviewJPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jkButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkButton2ActionPerformed
        // TODO add your handling code here:
        ManagementUnitManageUsersJPanel gumujp = new ManagementUnitManageUsersJPanel(jviewJPanel, enterprise, ecosystem);
        jviewJPanel.add("EmergencyUnitManageUsersJPanel",gumujp);
        CardLayout layout = (CardLayout) jviewJPanel.getLayout();
        layout.next(jviewJPanel);
    }//GEN-LAST:event_jkButton2ActionPerformed

    private void btnManOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManOrgActionPerformed
        // TODO add your handling code here:
        ManagementUnitOrganizationsJPanel gumjp = new ManagementUnitOrganizationsJPanel(jviewJPanel, enterprise, ecosystem);
        jviewJPanel.add("EmergencyUnitManageOrganizationsJPanel",gumjp);
        CardLayout layout = (CardLayout) jviewJPanel.getLayout();
        layout.next(jviewJPanel);
    }//GEN-LAST:event_btnManOrgActionPerformed

    private void jkButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkButton3ActionPerformed
        // TODO add your handling code here:
        ManagementUnitManageEmployeeJPanel gumejp = new ManagementUnitManageEmployeeJPanel(jviewJPanel, enterprise, ecosystem);
        jviewJPanel.add("EmergencyUnitManageUsersJPanel",gumejp);
        CardLayout layout = (CardLayout) jviewJPanel.getLayout();
        layout.next(jviewJPanel);
    }//GEN-LAST:event_jkButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManOrg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton jkButton2;
    private javax.swing.JButton jkButton3;
    private javax.swing.JLabel jkLabel1;
    private javax.swing.JPanel jviewJPanel;
    // End of variables declaration//GEN-END:variables
}
