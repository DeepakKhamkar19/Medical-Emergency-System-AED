/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorWorkArea;

import Project.EcoSystem;
import Project.Venture.Venture;
import Project.MedicalEmployment.DoctorService;
import Project.MedicalEmployment.PatientDetails;
import Project.Network.NetworkService;
import Project.Organization.DoctorOrganizationService;
import Project.Organization.OrganizationService;
import Project.UserAccount.UserAccountService;
import Project.WorkQueue.DoctorCheckUpWorkRequestService;
import Project.WorkQueue.WorkRequestService;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
     JPanel userProcessContainer;
    UserAccountService account;
    OrganizationService organization;
    Venture enterprise;
    NetworkService network;
    EcoSystem business;
        String value = "\\d+";
   
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, 
            UserAccountService account,OrganizationService organization,Venture enterprise,NetworkService network,
            EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
         this.account = account;
         this.organization = organization;
         this.enterprise = enterprise;
         this.network = network;
         this.business = business;
         populateTable();
    }

    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblDocRequest.getModel();
        model.setRowCount(0);
        System.out.println("Total workreq "+account.getWorkkQueue().getWorkRequestList().size());
        
        for (WorkRequestService wr : account.getWorkkQueue().getWorkRequestList()) {
            if(wr instanceof DoctorCheckUpWorkRequestService) {
                
                DoctorCheckUpWorkRequestService epr = (DoctorCheckUpWorkRequestService)wr;
                
                Object[] row = new Object[4];
                row[0] = epr;
                row[1] = epr.getPat().getPatName();
                row[2] = epr.getStat();               
                row[3] = epr.getMes();
             
                model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDocRequest = new javax.swing.JTable();
        jkLabel1 = new javax.swing.JLabel();
        jkLabel2 = new javax.swing.JLabel();
        txtrespirate = new javax.swing.JTextField();
        txtbloodpress = new javax.swing.JTextField();
        jkLabel3 = new javax.swing.JLabel();
        txtwt = new javax.swing.JTextField();
        jkLabel4 = new javax.swing.JLabel();
        txthrtrate = new javax.swing.JTextField();
        btnreq = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        jkButton3 = new javax.swing.JButton();
        jkButton1 = new javax.swing.JButton();
        jkLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDocRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request ID", "Patient", "Status", "Message"
            }
        ));
        jScrollPane1.setViewportView(tblDocRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 117, 642, 121));

        jkLabel1.setText("Respiratory Rate :");
        add(jkLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 273, -1, -1));

        jkLabel2.setText("Blood Pressure :");
        add(jkLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 317, -1, -1));
        add(txtrespirate, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 268, 128, -1));
        add(txtbloodpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 312, 128, -1));

        jkLabel3.setText("Weight :");
        add(jkLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 273, -1, -1));
        add(txtwt, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 268, 128, -1));

        jkLabel4.setText("Heart Rate :");
        add(jkLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 317, -1, -1));

        txthrtrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthrtrateActionPerformed(evt);
            }
        });
        add(txthrtrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 312, 128, -1));

        btnreq.setText("Request for Lab Test");
        btnreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreqActionPerformed(evt);
            }
        });
        add(btnreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 385, -1, -1));

        btnsubmit.setText("Submit Vital Info");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 385, 173, -1));

        jkButton3.setText("Refresh");
        jkButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkButton3ActionPerformed(evt);
            }
        });
        add(jkButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 76, 96, -1));

        jkButton1.setText("Write Prescription ");
        jkButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jkButton1ActionPerformed(evt);
            }
        });
        add(jkButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 385, 173, -1));

        jkLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jkLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jkLabel5.setText("DOCTOR WORK AREA");
        add(jkLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 22, 292, 36));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doctor2.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 810, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void jkButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkButton3ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jkButton3ActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblDocRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
//        String compare = (String) tblDocReq.getValueAt(selectedRow, 3);
//        if (compare.equalsIgnoreCase("completed")) {
//            JOptionPane.showMessageDialog(this, "It has been already completed!", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }

        if (txtrespirate.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Respiratory Rate");
            return;
        } else if (!txtrespirate.getText().matches(value)) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Respiratory Rate");
            return;
        }
        if (txtbloodpress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Blood Pressure");
            return;
        } else if (!txtbloodpress.getText().matches(value)) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Blood Pressure");
            return;
        }
        if (txthrtrate.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Heart Rate");
            return;
        } else if (!txthrtrate.getText().matches(value)) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Heart Rate");
            return;
        }
        if (txtwt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Weight");
            return;
        } else if (!txtwt.getText().matches(value)) {
            JOptionPane.showMessageDialog(null, "Enter an appropriate Weight");
            return;
        }
          
       // String result=txtTestResult.getText();
       //  JOptionPane.showMessageDialog(null,"Donor details added1");
        int rr = Integer.parseInt(txtrespirate.getText());
        int bp = Integer.parseInt(txtbloodpress.getText());
        int weight = Integer.parseInt(txtwt.getText());
        int hr = Integer.parseInt(txthrtrate.getText());
        DoctorCheckUpWorkRequestService cur = (DoctorCheckUpWorkRequestService) tblDocRequest.getValueAt(selectedRow, 0);
        //JOptionPane.showMessageDialog(null,"Donor details added1");
//        if(rr.trim()==0 || bp.trim()==0)
//        {
//                  JOptionPane.showMessageDialog(null,"Enter details!");
//                  return;
//              }
        //  wr.setTestResult(result);
        cur.getCheckkUp().setRespiratoryyRate(rr);
        cur.getCheckkUp().setBlooddPressure(bp);
        cur.getCheckkUp().setHeartRate(hr);
        cur.getCheckkUp().setWeightt(weight);
        cur.getCheckkUp().setDatee(new Date());
        cur.setResolvDate(new Date());
        cur.setStat("Completed"); //labtest
        //txtTestResult.setEnabled(true);
        // wr.setBarCode(barCode);

        //        wr.setBloodType(bloodType);
        //     wr.setBarCode(barCode);
        JOptionPane.showMessageDialog(null, "Check Up  completed");
        btnreq.setEnabled(true);
        btnsubmit.setEnabled(false);
        populateTable();
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreqActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = tblDocRequest.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DoctorCheckUpWorkRequestService dcwr = (DoctorCheckUpWorkRequestService) tblDocRequest.getValueAt(selectedRow, 0);
        
        PatientDetails patient = dcwr.getPat();
        DoctorService doctor = dcwr.getDoc() ;
//         for (WorkRequestService wr : account.getWorkQueue().getWorkRequestList()) {
//            if(wr instanceof DoctorCheckUpWorkRequestService) {
//                
//                DoctorCheckUpWorkRequestService epr = (DoctorCheckUpWorkRequestService)wr;
//                patient = epr.getPatient();
//                doctor = epr.getDoctor();
//            }
//         }
        
        RequestLabTestJPanel manageNetworkJPanel = new RequestLabTestJPanel(userProcessContainer,account,enterprise,
                patient,doctor,organization,network,business);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnreqActionPerformed

    private void jkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jkButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblDocRequest.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DoctorCheckUpWorkRequestService dcwr = (DoctorCheckUpWorkRequestService) tblDocRequest.getValueAt(selectedRow, 0);
        
        PatientDetails patient = dcwr.getPat();
        DoctorService doctor = dcwr.getDoc() ;
//         PatientDetails patient = null;
//        DoctorService doctor = null ;
//         for (WorkRequestService wr : account.getWorkQueue().getWorkRequestList()) {
//            if(wr instanceof DoctorCheckUpWorkRequestService) {
//                
//                DoctorCheckUpWorkRequestService epr = (DoctorCheckUpWorkRequestService)wr;
//                patient = epr.getPatient();
//                doctor = epr.getDoctor();
//            }
//         }
 
   
        PrescriptionJPanel manageNetworkJPanel = new PrescriptionJPanel(userProcessContainer,account,enterprise,
                organization,business,network,patient,doctor);
        userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jkButton1ActionPerformed

    private void txthrtrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthrtrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthrtrateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreq;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jkButton1;
    private javax.swing.JButton jkButton3;
    private javax.swing.JLabel jkLabel1;
    private javax.swing.JLabel jkLabel2;
    private javax.swing.JLabel jkLabel3;
    private javax.swing.JLabel jkLabel4;
    private javax.swing.JLabel jkLabel5;
    private javax.swing.JTable tblDocRequest;
    private javax.swing.JTextField txtbloodpress;
    private javax.swing.JTextField txthrtrate;
    private javax.swing.JTextField txtrespirate;
    private javax.swing.JTextField txtwt;
    // End of variables declaration//GEN-END:variables
}
