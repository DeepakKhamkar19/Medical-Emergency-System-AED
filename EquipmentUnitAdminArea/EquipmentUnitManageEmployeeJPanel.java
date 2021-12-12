/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EquipmentUnitAdminArea;

import Project.EcoSystem;
import Project.Employee.Employee;
import Project.Venture.Venture;
import Project.Organization.OrganizationService;
import Project.Organization.OrganizationDirectory;
import Project.Organization.PatientOrganizationService;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raveena
 */
public class EquipmentUnitManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EquipmentUnitManageEmployeeJPanel
     */
    JPanel userProcessContainer;
    Venture enterprise;
    EcoSystem ecosystem;
    private OrganizationDirectory organizationDirectory;
    
    public EquipmentUnitManageEmployeeJPanel(JPanel userProcessContainer, Venture enterprise, EcoSystem ecosystem) {
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
        jorgEmpJComboBox = new javax.swing.JComboBox();
        jkLabel2 = new javax.swing.JLabel();
        jnameJTextField = new javax.swing.JTextField();
        jaddJButton = new javax.swing.JButton();
        jkLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jkLabel1.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        jkLabel1.setText("Organization");
        add(jkLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 23, -1, -1));

        orgJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgJComboBoxActionPerformed(evt);
            }
        });
        add(orgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 20, 200, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 97, 480, 92));

        jkLabel3.setText("Organization");
        add(jkLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 244, -1, -1));

        jorgEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jorgEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jorgEmpJComboBoxActionPerformed(evt);
            }
        });
        add(jorgEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 239, 213, 29));

        jkLabel2.setText("Name");
        add(jkLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 304, -1, -1));
        add(jnameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 298, 213, 29));

        jaddJButton.setText("Create Employee");
        jaddJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddJButtonActionPerformed(evt);
            }
        });
        add(jaddJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 357, 213, -1));

        jkLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/equipment.jpg"))); // NOI18N
        add(jkLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 256, 870, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void orgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgJComboBoxActionPerformed
        OrganizationService organization = (OrganizationService) orgJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_orgJComboBoxActionPerformed

     private void populateTable(OrganizationService organization) {
       //To change body of generated methods, choose Tools | Templates.
       DefaultTableModel model = (DefaultTableModel) orgJTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
       
    }
    public void populateOrganizationComboBox() {
        orgJComboBox.removeAllItems();

        for (OrganizationService organization : organizationDirectory.getOrganizationList()) {
            if (organization instanceof PatientOrganizationService) {
                continue;
            } else {
                orgJComboBox.addItem(organization);
            }
        }
    }
    public void populateOrganizationEmpComboBox() {
        jorgEmpJComboBox.removeAllItems();
//        for (OrganizationService organization : organizationDir.getOrganizationList()){
//           if(organization instanceof PatientOrganizationService)
//           {
//               continue;
//           }
//           else{
//            organizationJComboBox.addItem(organization);}
//        }

        for (OrganizationService organization : organizationDirectory.getOrganizationList()) {
            jorgEmpJComboBox.addItem(organization);
        }
    }
    private void jorgEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jorgEmpJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jorgEmpJComboBoxActionPerformed

    private void jaddJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddJButtonActionPerformed

        OrganizationService organization = (OrganizationService) jorgEmpJComboBox.getSelectedItem();
        String name = jnameJTextField.getText();

        organization.getEmployeeeDirectory().createEmployee(name);
        populateTable(organization);
    }//GEN-LAST:event_jaddJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jaddJButton;
    private javax.swing.JLabel jkLabel1;
    private javax.swing.JLabel jkLabel2;
    private javax.swing.JLabel jkLabel3;
    private javax.swing.JLabel jkLabel4;
    private javax.swing.JTextField jnameJTextField;
    private javax.swing.JComboBox jorgEmpJComboBox;
    private javax.swing.JComboBox orgJComboBox;
    private javax.swing.JTable orgJTable;
    // End of variables declaration//GEN-END:variables
}
