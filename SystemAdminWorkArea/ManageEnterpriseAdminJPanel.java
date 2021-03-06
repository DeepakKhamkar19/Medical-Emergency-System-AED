/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Project.EcoSystem;
import Project.Employee.Employee;
import Project.Venture.Venture;
import Project.Network.NetworkService;
import Project.Role.AccountingAdminRoleService;
import Project.Role.AdminRoleService;
import Project.Role.EmergencyAdminRoleService;
import Project.Role.EquipmeentAdminService;
import Project.Role.ManagementAdminRoleService;
import Project.Role.MedicineAdminService;
import Project.UserAccount.UserAccountService;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jenterpriseJTable.getModel();

        model.setRowCount(0);
        for (NetworkService network : system.getNetworkList()) {
            for (Venture enterprise : network.getVentureDirectory().getVentureList()) {
                for (UserAccountService userAccount : enterprise.getUserAccounttDirectory().getUserAccounttList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getOrgName();
                    row[1] = network.getNetName();
                    row[2] = userAccount.getUserName();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        networkJComBox.removeAllItems();
       // networkJComboBox.addItem("Select");
       //  enterpriseJComboBox.removeAllItems();
          //  enterpriseJComboBox.addItem("Select");
        for (NetworkService network : system.getNetworkList()) {
            networkJComBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(NetworkService network) {
        enterpriseJComBox.removeAllItems();
           // enterpriseJComboBox.addItem("Select");
        for (Venture enterprise : network.getVentureDirectory().getVentureList()) {
            enterpriseJComBox.addItem(enterprise);
        }

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jenterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComBox = new javax.swing.JComboBox();
        enterpriseJComBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jusernameJTextField = new javax.swing.JTextField();
        jpasswordJPasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jnameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jenterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Department ", "Hospital Name", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jenterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 69, 523, 95));

        jLabel1.setText("Hospital Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        networkJComBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComBoxActionPerformed(evt);
            }
        });
        add(networkJComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 189, 136, 29));

        enterpriseJComBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComBoxActionPerformed(evt);
            }
        });
        add(enterpriseJComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 243, 136, 29));

        jLabel3.setText("Department");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 248, -1, -1));

        jLabel2.setText("Username");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 303, -1, -1));
        add(jusernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 297, 136, 29));
        add(jpasswordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 351, 136, 29));

        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 357, -1, -1));

        jLabel5.setText("Admin Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));
        add(jnameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 405, 136, 29));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 459, 136, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE HOSPITAL ADMIN");
        jLabel6.setPreferredSize(new java.awt.Dimension(400, 50));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 13, 381, 38));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/enterprise.png"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 910, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComBoxActionPerformed

       System.out.println(networkJComBox.getSelectedItem());
        if(networkJComBox.getSelectedItem() != "Select")
        {
            NetworkService network = (NetworkService) networkJComBox.getSelectedItem();
            if (network != null ) {
                populateEnterpriseComboBox(network);
            }
        }
        else
        {
             enterpriseJComBox.removeAllItems();
            enterpriseJComBox.addItem("Select");
        
        }

    }//GEN-LAST:event_networkJComBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

          if(enterpriseJComBox.getSelectedItem().equals("Select") || networkJComBox.getSelectedItem().equals("Select"))
        {
            JOptionPane.showMessageDialog(null, "Please select Type and Hospital!");
            return;
        }
        Venture enterprise = (Venture) enterpriseJComBox.getSelectedItem();
         NetworkService network = (NetworkService) networkJComBox.getSelectedItem();

        String username = jusernameJTextField.getText();
        String password = String.valueOf(jpasswordJPasswordField.getPassword());
        String name = jnameJTextField.getText();

       // Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
          for (NetworkService netwrk : system.getNetworkList()) {
            for (Venture enterpre : netwrk.getVentureDirectory().getVentureList()) {
                for (UserAccountService userAccount : enterpre.getUserAccounttDirectory().getUserAccounttList()) {
                    
//                    if(userAccount.getRole() instanceof EmergencyAdminRoleService && network.getName().equals(netwrk.getName()) )
//                    {
//                          System.out.println(userAccount.getUsername());
//                        System.out.println(network.getName());
//                      JOptionPane.showMessageDialog(null, "Admin already created");   
//                       usernameJTextField.setText("");
//                        passwordJPasswordField.setText("");
//                        nameJTextField.setText("");
//                      return;
//                    }
                
                }
            }
          }

//        UserAccountService account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRoleService());
        if (system.checkIfUserIsUnique(username)) {
                UserAccountService account = null;
                if (enterprise.getEnterpriseType() == Venture.VentureType.EmergencyUnit) {
                    Employee employee = enterprise.getEmployeeeDirectory().createEmployee(name);
                    account = enterprise.getUserAccounttDirectory().createUserAccount(username, password, employee, new EmergencyAdminRoleService());
                } else if (enterprise.getEnterpriseType() == Venture.VentureType.Accounting) {
                    Employee employee = enterprise.getEmployeeeDirectory().createEmployee(name);
                    account = enterprise.getUserAccounttDirectory().createUserAccount(username, password, employee, new AccountingAdminRoleService());
                } else if (enterprise.getEnterpriseType() == Venture.VentureType.EquipmentUnit) {
                    Employee employee = enterprise.getEmployeeeDirectory().createEmployee(name);
                    account = enterprise.getUserAccounttDirectory().createUserAccount(username, password, employee, new EquipmeentAdminService());
                } else if (enterprise.getEnterpriseType() == Venture.VentureType.ManagementUnit) {
                    Employee employee = enterprise.getEmployeeeDirectory().createEmployee(name);
                    account = enterprise.getUserAccounttDirectory().createUserAccount(username, password, employee, new ManagementAdminRoleService());
                }else if (enterprise.getEnterpriseType() == Venture.VentureType.MedicalUnit) {
                    Employee employee = enterprise.getEmployeeeDirectory().createEmployee(name);
                    account = enterprise.getUserAccounttDirectory().createUserAccount(username, password, employee, new MedicineAdminService());
                }
                
                jusernameJTextField.setText("");
                jpasswordJPasswordField.setText("");
                jnameJTextField.setText("");
                JOptionPane.showMessageDialog(null, "Account created sucessfully");
                populateTable();
            }else {
                JOptionPane.showMessageDialog(null, "Please enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        populateTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void enterpriseJComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox enterpriseJComBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jenterpriseJTable;
    private javax.swing.JTextField jnameJTextField;
    private javax.swing.JPasswordField jpasswordJPasswordField;
    private javax.swing.JTextField jusernameJTextField;
    private javax.swing.JComboBox networkJComBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
