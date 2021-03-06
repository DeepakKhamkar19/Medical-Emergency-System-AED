/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Project.EcoSystem;
import Project.Venture.Venture;
import Project.Network.NetworkService;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateComboBox();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jenterpriseJTable.getModel();

        model.setRowCount(0);
        for (NetworkService network : system.getNetworkList()) {
            for (Venture enterprise : network.getVentureDirectory().getVentureList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getOrgName();
                row[1] = network.getNetName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }
    
    private void populateComboBox() {
        networkJComBox.removeAllItems();
        //networkJComboBox.addItem("Select");
        enterpriseTypeJComBox.removeAllItems();
       //  enterpriseTypeJComboBox.addItem("Select");

        for (NetworkService network : system.getNetworkList()) {
            networkJComBox.addItem(network);
        }

        for (Venture.VentureType type : Venture.VentureType.values()) {
            enterpriseTypeJComBox.addItem(type);
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
        enterpriseTypeJComBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jnameJTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        ManageEnterPrise = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
                "Department Name ", "Hospital Name", "Department"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 77, 523, 95));

        jLabel1.setText("Hospital Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 202, -1, -1));

        networkJComBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComBoxActionPerformed(evt);
            }
        });
        add(networkJComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 197, 200, 29));

        enterpriseTypeJComBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComBoxActionPerformed(evt);
            }
        });
        add(enterpriseTypeJComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 256, 200, 29));

        jLabel3.setText("Department");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 261, -1, -1));

        jLabel2.setText("Department Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));
        add(jnameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 315, 200, 29));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 374, 200, -1));

        ManageEnterPrise.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ManageEnterPrise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageEnterPrise.setText("MANAGE HOSPITAL DETAILS ");
        add(ManageEnterPrise, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 370, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/enterprise.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        if(networkJComBox.getSelectedItem().equals("Select") || enterpriseTypeJComBox.getSelectedItem().equals("Select"))
        {
            JOptionPane.showMessageDialog(null, "Please select Type and Hospital!");
            return;
        }
        NetworkService network = (NetworkService) networkJComBox.getSelectedItem();
        Venture.VentureType type = (Venture.VentureType) enterpriseTypeJComBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        
        
      
        
         for (NetworkService netwrk : system.getNetworkList())
         {
            for (Venture enterprise : netwrk.getVentureDirectory().getVentureList()) 
            {
                if(type == enterprise.getEnterpriseType() && netwrk.getNetName().equals(network.getNetName()))
                {
                     JOptionPane.showMessageDialog(null, "Department Type already Created");
                     jnameJTextField.setText("");
                     return;
                }
            }
         }

        String name = jnameJTextField.getText();

        Venture enterprise = network.getVentureDirectory().createAndAddVenture(name, type);
         JOptionPane.showMessageDialog(null, "Department Successfully Created");
        jnameJTextField.setText("");
        populateTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void enterpriseTypeJComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeJComBoxActionPerformed

    private void networkJComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManageEnterPrise;
    private javax.swing.JComboBox enterpriseTypeJComBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jenterpriseJTable;
    private javax.swing.JTextField jnameJTextField;
    private javax.swing.JComboBox networkJComBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
