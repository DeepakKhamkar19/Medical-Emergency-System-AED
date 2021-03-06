/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManagementUnitAdminArea;

import userinterface.EmergencyUnitAdminArea.*;
import Project.EcoSystem;
import Project.Employee.Employee;
import Project.Venture.Venture;
import Project.Organization.DoctorOrganizationService;
import Project.Organization.OrganizationService;
import Project.Organization.OrganizationDirectory;
import Project.Organization.PatientOrganizationService;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Raveena
 */
public class ManagementUnitManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyUnitManageEmployeeJPanel
     */
     JPanel userProcessContainer;
    Venture enterprise;
    EcoSystem ecosystem;
    private OrganizationDirectory organizationDirectory;
    public ManagementUnitManageEmployeeJPanel(JPanel userProcessContainer, Venture enterprise, EcoSystem ecosystem) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.organizationDirectory = enterprise.getOrganizationDirectory();
         
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jkLabel1 = new javax.swing.JLabel();
        orgJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgJTable = new javax.swing.JTable();
        jkLabel3 = new javax.swing.JLabel();
        orgEmpJComboBox = new javax.swing.JComboBox();
        jkLabel2 = new javax.swing.JLabel();
        jnameJTextField = new javax.swing.JTextField();
        jaddJButton = new javax.swing.JButton();
        jkLabel4 = new javax.swing.JLabel();
        jkLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jkLabel1.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        jkLabel1.setText("Organization");
        add(jkLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 87, -1, -1));

        orgJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgJComboBoxActionPerformed(evt);
            }
        });
        add(orgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 84, 177, -1));

        orgJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 141, 480, 107));

        jkLabel3.setText("Organization");
        add(jkLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 282, -1, -1));

        orgEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgEmpJComboBoxActionPerformed(evt);
            }
        });
        add(orgEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 278, 205, -1));

        jkLabel2.setText("Name");
        add(jkLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 340, -1, -1));

        jnameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameJTextFieldActionPerformed(evt);
            }
        });
        add(jnameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 335, 205, -1));

        jaddJButton.setText("Create Employee");
        jaddJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddJButtonActionPerformed(evt);
            }
        });
        add(jaddJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 391, -1, -1));

        jkLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jkLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jkLabel4.setText("EMPLOYEE MANAGEMENT");
        add(jkLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 24, -1, 31));

        jkLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mng.png"))); // NOI18N
        add(jkLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void orgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgJComboBoxActionPerformed
        OrganizationService organization = (OrganizationService) orgJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_orgJComboBoxActionPerformed

     public void populateOrganizationComboBox() {
        orgJComboBox.removeAllItems();

        for (OrganizationService organization : organizationDirectory.getOrganizationList()) {
            if (organization instanceof PatientOrganizationService || organization instanceof DoctorOrganizationService ) {
                continue;
            } else {
                orgJComboBox.addItem(organization);
            }
        }
    }

    public void populateOrganizationEmpComboBox() {
        orgEmpJComboBox.removeAllItems();
        for (OrganizationService organization : organizationDirectory.getOrganizationList()){
           if(organization instanceof PatientOrganizationService || organization instanceof DoctorOrganizationService )
           {
               continue;
           }
           else{
            orgEmpJComboBox.addItem(organization);
           }
        }

//        for (OrganizationService organization : organizationDirectory.getOrganizationList()) {
//            organizationEmpJComboBox.addItem(organization);
//        }
    }
     private void populateTable(OrganizationService organization) {
       //To change body of generated methods, choose Tools | Templates.
       
       DefaultTableModel model = (DefaultTableModel) orgJTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            //row[2] = employee.g//
            model.addRow(row);
        }
//      organizationJTable.setBackground(Color.yellow);
//      organizationJTable.setForeground(Color.white);
      JTableHeader tableHeader = orgJTable.getTableHeader();
      tableHeader.setBackground(Color.BLACK);
      tableHeader.setForeground(Color.blue);
      JFrame frame = new JFrame();
       
    }
    private void orgEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgEmpJComboBoxActionPerformed
        // TODO add your handling code here:
        OrganizationService organization = (OrganizationService) orgEmpJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_orgEmpJComboBoxActionPerformed

    private void jaddJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddJButtonActionPerformed

        OrganizationService organization = (OrganizationService) orgEmpJComboBox.getSelectedItem();
        String name = jnameJTextField.getText();

        organization.getEmployeeeDirectory().createEmployee(name);
        jnameJTextField.setText("");
        populateTable(organization);
    }//GEN-LAST:event_jaddJButtonActionPerformed

    private void jnameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jaddJButton;
    private javax.swing.JLabel jkLabel1;
    private javax.swing.JLabel jkLabel2;
    private javax.swing.JLabel jkLabel3;
    private javax.swing.JLabel jkLabel4;
    private javax.swing.JLabel jkLabel5;
    private javax.swing.JTextField jnameJTextField;
    private javax.swing.JComboBox orgEmpJComboBox;
    private javax.swing.JComboBox orgJComboBox;
    private javax.swing.JTable orgJTable;
    // End of variables declaration//GEN-END:variables

   
}
