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
import Project.Role.RoleService;
import Project.UserAccount.UserAccountService;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raveena
 */
public class MedicineUnitManageUsersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicineUnitManageUsersJPanel
     */
      private JPanel userContainer;
    private Venture enterprise;
    private EcoSystem ecosystem;
    
    public MedicineUnitManageUsersJPanel(JPanel userContainer,Venture enterprise,EcoSystem ecosystem) {
        initComponents();
        this.enterprise = enterprise;
        this.userContainer = userContainer;
        this.ecosystem = ecosystem;
        populateOrgComboBox();
       // employeeJComboBox.removeAllItems();
        populateData();
    }

    public void populateOrgComboBox(){
       jorgJComboBox.removeAllItems();
        for(OrganizationService organization :enterprise.getOrganizationDirectory().getOrganizationList() ){
            jorgJComboBox.addItem(organization);
        }
        
    }
    
    public void populateEmployeeComboBox(OrganizationService organization){
         jemployeeJCombo.removeAllItems();
        
        for (Employee employee : organization.getEmployeeeDirectory().getEmployeeList()){
            jemployeeJCombo.addItem(employee);
        }
    }
    
    public void populateRoleComboBox(OrganizationService organization){
        jroleJComboBox.removeAllItems();
          for (RoleService role : organization.getSupportedRole()){
            jroleJComboBox.addItem(role);
        }
    }
    
    
    public void populateData(){
        
        DefaultTableModel model = (DefaultTableModel) juserJTable.getModel();

        model.setRowCount(0);

        for (OrganizationService organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccountService ua : organization.getUserAccounttDirectory().getUserAccounttList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRolee();
                ((DefaultTableModel) juserJTable.getModel()).addRow(row);
            }
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

        jkLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        juserJTable = new javax.swing.JTable();
        jkLabel2 = new javax.swing.JLabel();
        jorgJComboBox = new javax.swing.JComboBox();
        jkLabel5 = new javax.swing.JLabel();
        jemployeeJCombo = new javax.swing.JComboBox();
        jkLabel3 = new javax.swing.JLabel();
        jroleJComboBox = new javax.swing.JComboBox();
        jkLabel6 = new javax.swing.JLabel();
        jtxtUserName = new javax.swing.JTextField();
        jkLabel4 = new javax.swing.JLabel();
        jtxtPassword = new javax.swing.JTextField();
        jcreateUserJButton = new javax.swing.JButton();
        jkLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jkLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jkLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jkLabel1.setText("MANAGE MEDICINE USERS");
        add(jkLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 20, 338, -1));

        juserJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        juserJTable.setForeground(new java.awt.Color(25, 56, 82));
        juserJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        juserJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(juserJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 500, 181));

        jkLabel2.setText("Organization");
        add(jkLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 296, -1, 24));

        jorgJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jorgJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        jorgJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jorgJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jorgJComboBoxActionPerformed(evt);
            }
        });
        add(jorgJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 291, 250, 29));

        jkLabel5.setText("Employee");
        add(jkLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 355, -1, 24));

        jemployeeJCombo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jemployeeJCombo.setForeground(new java.awt.Color(25, 56, 82));
        jemployeeJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jemployeeJCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemployeeJComboActionPerformed(evt);
            }
        });
        add(jemployeeJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 350, 250, 29));

        jkLabel3.setText("Role");
        add(jkLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 410, 35, 24));

        jroleJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jroleJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        jroleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jroleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jroleJComboBoxActionPerformed(evt);
            }
        });
        add(jroleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 409, 250, 29));

        jkLabel6.setText("UserName");
        add(jkLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 470, -1, 24));

        jtxtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUserNameActionPerformed(evt);
            }
        });
        add(jtxtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 468, 250, 29));

        jkLabel4.setText("Password");
        add(jkLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 529, -1, 24));
        add(jtxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 527, 250, 29));

        jcreateUserJButton.setBackground(new java.awt.Color(255, 255, 255));
        jcreateUserJButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jcreateUserJButton.setForeground(new java.awt.Color(25, 56, 82));
        jcreateUserJButton.setText("Create");
        jcreateUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcreateUserJButtonActionPerformed(evt);
            }
        });
        add(jcreateUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 586, 250, -1));

        jkLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jkLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/medicine.jpg"))); // NOI18N
        add(jkLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 800, 480));
    }// </editor-fold>//GEN-END:initComponents

    private void jorgJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jorgJComboBoxActionPerformed
        OrganizationService organization = (OrganizationService) jorgJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_jorgJComboBoxActionPerformed

    private void jemployeeJComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemployeeJComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jemployeeJComboActionPerformed

    private void jroleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jroleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jroleJComboBoxActionPerformed

    private void jcreateUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcreateUserJButtonActionPerformed
        String userName = jtxtUserName.getText();
        String password = jtxtPassword.getText();
        if(!userName.isEmpty() && !password.isEmpty()){
            OrganizationService organization = (OrganizationService) jorgJComboBox.getSelectedItem();
            if(ecosystem.checkIfUserIsUnique(userName)){
                Employee employee = (Employee) jemployeeJCombo.getSelectedItem();
                RoleService role = (RoleService) jroleJComboBox.getSelectedItem();
                organization.getUserAccounttDirectory().createUserAccount(userName, password, employee, role);
                populateData();
                JOptionPane.showMessageDialog(null, "User account Created!");
                jtxtUserName.setText("");
                jtxtPassword.setText("");
            } else{
                JOptionPane.showMessageDialog(null, "Username already exists!");
            }

        } else{
            JOptionPane.showMessageDialog(null, "Enter all fields!");
        }
    }//GEN-LAST:event_jcreateUserJButtonActionPerformed

    private void jtxtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jcreateUserJButton;
    private javax.swing.JComboBox jemployeeJCombo;
    private javax.swing.JLabel jkLabel1;
    private javax.swing.JLabel jkLabel2;
    private javax.swing.JLabel jkLabel3;
    private javax.swing.JLabel jkLabel4;
    private javax.swing.JLabel jkLabel5;
    private javax.swing.JLabel jkLabel6;
    private javax.swing.JLabel jkLabel7;
    private javax.swing.JComboBox jorgJComboBox;
    private javax.swing.JComboBox jroleJComboBox;
    private javax.swing.JTextField jtxtPassword;
    private javax.swing.JTextField jtxtUserName;
    private javax.swing.JTable juserJTable;
    // End of variables declaration//GEN-END:variables
}
