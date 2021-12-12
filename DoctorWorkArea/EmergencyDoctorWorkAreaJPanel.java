/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorWorkArea;

import Project.EcoSystem;
import Project.Venture.Venture;
import Project.Network.NetworkService;
import Project.Organization.DoctorOrganizationService;
import Project.Organization.OrganizationService;
import Project.UserAccount.UserAccountService;
import userinterface.Ambulance.*;
import Project.WorkQueue.EmergencyPatientRequestService;
import Project.WorkQueue.DoctorWorkRequestService;
import Project.WorkQueue.WorkRequestService;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sandeep
 */
public class EmergencyDoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyAmbulanceUserJPanel
     */
    JPanel userProcessContainer;
    UserAccountService account;
    OrganizationService organization;
    Venture enterprise;
    NetworkService network;
    EcoSystem business;
    
    public EmergencyDoctorWorkAreaJPanel(JPanel userProcessContainer, 
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
        DefaultTableModel model = (DefaultTableModel) WorkReqTable.getModel();
        model.setRowCount(0);
        System.out.println("Total workreq "+account.getWorkkQueue().getWorkRequestList().size());
        
         OrganizationService doctorOrg = null;
                     for(Venture enterprise : network.getVentureDirectory().getVentureList())
                    {
                        for (OrganizationService organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                           if (organization instanceof DoctorOrganizationService ) {

                               doctorOrg = organization;
                               break;
                           }
                       }
                    }
          for(UserAccountService ua : doctorOrg.getUserAccounttDirectory().getUserAccounttList())
                               {
        for (WorkRequestService wr : ua.getWorkkQueue().getWorkRequestList()) {
            System.out.println("ua" + ua.getUserName());
            System.out.println("account" +account.getUserName() );
               
            if(ua.getUserName().equals(account.getUserName()))
            {
            if(wr instanceof DoctorWorkRequestService) {
                System.out.println(wr);
                DoctorWorkRequestService epr = (DoctorWorkRequestService)wr;
                  System.out.println("epr" + wr);
                Object[] row = new Object[model.getColumnCount()];
                row[0] = epr;
                row[1] = epr.getPat().getPatName();//epr.getSender().getEmployee().getName();
                row[2] = epr.getPat().getPatName();
                row[3] = epr.getPat().getAdd();
                row[4] = epr.getCritical();
                row[5] = epr.getStat();// epr.getRequestdate();
                row[6] = epr.getReqDate();
                row[7] = epr.getPat().getPhoneNo();
                //row[8] = "" ;
               // row[9] = "";//epr.getEmergencyDoctor() != null ? epr.getEmergencyDoctor().;
                model.addRow(row);
            }
            }
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
        WorkReqTable = new javax.swing.JTable();
        btnAck = new javax.swing.JButton();
        btnRej = new javax.swing.JButton();
        btnCompleteReq = new javax.swing.JButton();
        btnProc = new javax.swing.JButton();
        jkLabel1 = new javax.swing.JLabel();
        jkLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WorkReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RequestId", "Sender", "Patient Name", "Patient Address", "Criticality", "Status", "Request Date", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(WorkReqTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 81, 778, 169));

        btnAck.setText("Accept Request");
        btnAck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAckActionPerformed(evt);
            }
        });
        add(btnAck, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 280, 150, -1));

        btnRej.setText("Reject Request");
        btnRej.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejActionPerformed(evt);
            }
        });
        add(btnRej, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 280, 150, -1));

        btnCompleteReq.setText("Complete Request");
        btnCompleteReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteReqActionPerformed(evt);
            }
        });
        add(btnCompleteReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 280, 150, -1));

        btnProc.setText("Process Request");
        btnProc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcActionPerformed(evt);
            }
        });
        add(btnProc, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 280, 150, -1));

        jkLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jkLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jkLabel1.setText("EMERGENCY DOCTOR WORK AREA");
        add(jkLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 19, 857, 32));

        jkLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doctor2.jpg"))); // NOI18N
        add(jkLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 880, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAckActionPerformed
        int count = WorkReqTable.getSelectedRowCount();
        if(count != 1) {
            JOptionPane.showMessageDialog(null, "Select a request");
        }else {
            int selectedRow = WorkReqTable.getSelectedRow();
            DoctorWorkRequestService emerReq = (DoctorWorkRequestService) WorkReqTable.getValueAt(selectedRow, 0);
            if(emerReq.getStat().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStat().equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request is already Accepted");
            }else if(emerReq.getStat().equals("Processing")) {
                JOptionPane.showMessageDialog(null, "Request is already Processing");
            }else if(emerReq.getStat().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStat().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                  if(msg != null)
                {
                emerReq.setStat("Accepted");
                emerReq.setMes(msg);
                
                }
               populateTable();
            }
            //emerReq.setStatus("Accepted");
        }
    }//GEN-LAST:event_btnAckActionPerformed

    private void btnRejActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejActionPerformed
        int count = WorkReqTable.getSelectedRowCount();
        if(count != 1) {
            JOptionPane.showMessageDialog(null, "Select a request");
        }else {
            int selectedRow = WorkReqTable.getSelectedRow();
            DoctorWorkRequestService emerReq = (DoctorWorkRequestService) WorkReqTable.getValueAt(selectedRow, 0);
            if(emerReq.getStat().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStat().equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request is already Accepted");
            }else if(emerReq.getStat().equals("Processing")) {
                JOptionPane.showMessageDialog(null, "Request is already Accepted and Processing");
            }else if(emerReq.getStat().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStat().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                  if(msg != null)
                {
                emerReq.setStat("Rejected");
                emerReq.setMes(msg);
                }
                populateTable();
            }
        }
    }//GEN-LAST:event_btnRejActionPerformed

    private void btnCompleteReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteReqActionPerformed
        int count = WorkReqTable.getSelectedRowCount();
        if(count != 1) {
            JOptionPane.showMessageDialog(null, "Select a request");
        }else {
            int selectedRow = WorkReqTable.getSelectedRow();
            DoctorWorkRequestService emerReq = (DoctorWorkRequestService) WorkReqTable.getValueAt(selectedRow, 0);
            if(emerReq.getStat().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStat().equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request should be in processing state before marking complete");
            }else if(emerReq.getStat().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStat().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else if(emerReq.getStat().equals("Requested")) {
                JOptionPane.showMessageDialog(null, "Request is not yet Accepted");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                  if(msg != null)
                {
                emerReq.setStat("Completed");
                emerReq.setMes(msg);
                }
                populateTable();
            }
        }
    }//GEN-LAST:event_btnCompleteReqActionPerformed

    private void btnProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcActionPerformed
        int count = WorkReqTable.getSelectedRowCount();
        if (count != 1) {
            JOptionPane.showMessageDialog(null, "Select one row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            int selectedRow = WorkReqTable.getSelectedRow();
            DoctorWorkRequestService emerReq = (DoctorWorkRequestService) WorkReqTable.getValueAt(selectedRow, 0);
            if(emerReq.getStat().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else if(emerReq.getStat().equals("Processing")){
                JOptionPane.showMessageDialog(null, "Request is already Processing");
            }else if(emerReq.getStat().equals("Rejected")){
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStat().equals("Completed")){
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStat().equals("Requested")) {
                JOptionPane.showMessageDialog(null, "Request is not yet Accepted");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                  if(msg != null)
                {
                emerReq.setStat("Processing");
                emerReq.setMes(msg);
                }
                populateTable();
            }
        }
    }//GEN-LAST:event_btnProcActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable WorkReqTable;
    private javax.swing.JButton btnAck;
    private javax.swing.JButton btnCompleteReq;
    private javax.swing.JButton btnProc;
    private javax.swing.JButton btnRej;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jkLabel1;
    private javax.swing.JLabel jkLabel2;
    // End of variables declaration//GEN-END:variables
}