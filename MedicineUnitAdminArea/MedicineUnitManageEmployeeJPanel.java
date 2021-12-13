/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicineUnitAdminArea;

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
public class MedicineUnitManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicineUnitManageEmployeeJPanel
     */
    JPanel userProcessContainer;
    Venture enterprise;
    EcoSystem ecosystem;
    private OrganizationDirectory organizationDirectory;
    public MedicineUnitManageEmployeeJPanel(JPanel userProcessContainer, Venture enterprise, EcoSystem ecosystem) {
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

        jkLabel4 = new javax.swing.JLabel();
        jkLabel1 = new javax.swing.JLabel();
        jorganizationJComboBox = new javax.swing.JComboBox();
        jaddJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jorganizationJTable = new javax.swing.JTable();
        jkLabel3 = new javax.swing.JLabel();
        jorganizationEmpJComboBox = new javax.swing.JComboBox();
        jkLabel2 = new javax.swing.JLabel();
        jnameJTextField = new javax.swing.JTextField();

        jkLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jkLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jkLabel4.setText("MANAGE MEDICINE EMPLOYEE");

        jkLabel1.setFont(new java.awt.Font("Khmer UI", 1, 14)); // NOI18N
        jkLabel1.setText("Organization View");

        jorganizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jorganizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jorganizationJComboBoxActionPerformed(evt);
            }
        });

        jaddJButton.setText("Create Employee");
        jaddJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddJButtonActionPerformed(evt);
            }
        });

        jorganizationJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jorganizationJTable);

        jkLabel3.setText("Organization");

        jorganizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jorganizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jorganizationEmpJComboBoxActionPerformed(evt);
            }
        });

        jkLabel2.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jkLabel3)
                            .addComponent(jkLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jnameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jorganizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jaddJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jkLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jkLabel1)
                                .addGap(50, 50, 50)
                                .addComponent(jorganizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jaddJButton, jnameJTextField, jorganizationEmpJComboBox});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jkLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jkLabel1)
                    .addComponent(jorganizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jkLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jorganizationEmpJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jkLabel2)
                    .addComponent(jnameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jaddJButton)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jnameJTextField, jorganizationEmpJComboBox});

    }// </editor-fold>//GEN-END:initComponents

    private void jorganizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jorganizationJComboBoxActionPerformed
        OrganizationService organization = (OrganizationService) jorganizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_jorganizationJComboBoxActionPerformed

    private void populateTable(OrganizationService organization) {
       //To change body of generated methods, choose Tools | Templates.
       DefaultTableModel model = (DefaultTableModel) jorganizationJTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
       
    }
    public void populateOrganizationComboBox() {
        jorganizationJComboBox.removeAllItems();

        for (OrganizationService organization : organizationDirectory.getOrganizationList()) {
            if (organization instanceof PatientOrganizationService) {
                continue;
            } else {
                jorganizationJComboBox.addItem(organization);
            }
        }
    }
    public void populateOrganizationEmpComboBox() {
        jorganizationEmpJComboBox.removeAllItems();
//        for (OrganizationService organization : organizationDir.getOrganizationList()){
//           if(organization instanceof PatientOrganizationService)
//           {
//               continue;
//           }
//           else{
//            organizationJComboBox.addItem(organization);}
//        }

        for (OrganizationService organization : organizationDirectory.getOrganizationList()) {
            jorganizationEmpJComboBox.addItem(organization);
        }
    }
    private void jorganizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jorganizationEmpJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jorganizationEmpJComboBoxActionPerformed

    private void jaddJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddJButtonActionPerformed

        OrganizationService organization = (OrganizationService)jorganizationEmpJComboBox.getSelectedItem();
        String name = jnameJTextField.getText();

        organization.getEmployeeeDirectory().createEmployee(name);
        jnameJTextField.setText("");
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
    private javax.swing.JComboBox jorganizationEmpJComboBox;
    private javax.swing.JComboBox jorganizationJComboBox;
    private javax.swing.JTable jorganizationJTable;
    // End of variables declaration//GEN-END:variables
}