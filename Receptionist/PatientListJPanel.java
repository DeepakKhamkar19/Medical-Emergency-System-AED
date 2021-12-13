/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Receptionist;

import Project.EcoSystem;
import Project.Venture.Venture;
import Project.MedicalEmployment.DoctorService;
import Project.MedicalEmployment.DoctorrList;
import Project.MedicalEmployment.PatientDetails;
import Project.MedicalEmployment.PatienttList;
import Project.Network.NetworkService;
import Project.Organization.DoctorOrganizationService;
import Project.Organization.OrganizationService;
import Project.Organization.PatientOrganizationService;
import Project.UserAccount.UserAccountService;
import Project.WorkQueue.DoctorWorkRequestService;
import Project.WorkQueue.WorkRequestService;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;
import userinterface.Patient.PatientWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Deepak Khamkar
 */
public class PatientListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientListJPanel
     */
    PatienttList patientList;
    DoctorrList doctorList;
    EcoSystem ecoSystem;
    JPanel userProcessContainer;
    NetworkService network;
    OrganizationService organization ;
    private static Logger log = Logger.getLogger(PatientListJPanel.class);
    private static final String CLASS_NAME = PatientListJPanel.class.getName();
    public PatientListJPanel(JPanel userProcessContainer,NetworkService network, OrganizationService organization ,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.patientList = ecoSystem.getPatientDirectory();
        this.doctorList = ecoSystem.getDoctroDirectory();
        this.network = network;
        this.organization = organization;
        populateTable();
        populateDocTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPat = new javax.swing.JTable();
        btnCreatePatient = new javax.swing.JButton();
        btnUpdatePatient = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoc = new javax.swing.JTable();
        btnCreateDoctor = new javax.swing.JButton();
        btnUpdatePatient1 = new javax.swing.JButton();
        btnDeletePatient1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("RECEPTIONIST AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 6, -1, 26));

        tblPat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "FullName", "PhoneNumber", "EmailAddress", "BirthDate", "Address", "UserName"
            }
        ));
        jScrollPane1.setViewportView(tblPat);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 97, 649, 133));

        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });
        add(btnCreatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 261, 184, -1));

        btnUpdatePatient.setText("View Patient Info");
        btnUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatientActionPerformed(evt);
            }
        });
        add(btnUpdatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 261, 184, -1));

        btnDeletePatient.setText("Delete Patient");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });
        add(btnDeletePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 261, 184, -1));

        tblDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FullName", "Qualification", "Specilization", "UserName"
            }
        ));
        jScrollPane2.setViewportView(tblDoc);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 362, 649, 133));

        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });
        add(btnCreateDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 513, 184, -1));

        btnUpdatePatient1.setText("Modify or View Doctor");
        btnUpdatePatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatient1ActionPerformed(evt);
            }
        });
        add(btnUpdatePatient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 513, -1, -1));

        btnDeletePatient1.setText("Delete Doctor");
        btnDeletePatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatient1ActionPerformed(evt);
            }
        });
        add(btnDeletePatient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 513, 184, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 325, 790, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/receptionist.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 670, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel createPatient = new CreatePatientJPanel(userProcessContainer, ecoSystem, patientList, network);
        userProcessContainer.add("CreatePatientJPanel",createPatient);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatientActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPat.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first");
            return;
        }
        PatientDetails patient = (PatientDetails)tblPat.getValueAt(selectedRow,0);
        CreatePatientJPanel modifyPatient = new CreatePatientJPanel(userProcessContainer, ecoSystem, patientList, patient,network);
        userProcessContainer.add("ModifyPatientJPanel",modifyPatient);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdatePatientActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPat.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        PatientDetails patient = (PatientDetails) tblPat.getValueAt(selectedRow, 0);
        patientList.removePatient(patient);
        populateTable();
    }//GEN-LAST:event_btnDeletePatientActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
         CreateDoctorJPanel createDoctor = new CreateDoctorJPanel(userProcessContainer, ecoSystem, doctorList, network);
        userProcessContainer.add("CreatePatientJPanel",createDoctor);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnUpdatePatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatient1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDoc.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first");
            return;
        }
        DoctorService doctor = (DoctorService)tblDoc.getValueAt(selectedRow,0);
        CreateDoctorJPanel createDoctor = new CreateDoctorJPanel(userProcessContainer, ecoSystem, doctorList, network,doctor);
        userProcessContainer.add("CreatePatientJPanel",createDoctor);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdatePatient1ActionPerformed

    private void btnDeletePatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatient1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblDoc.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
         DoctorService doctorSelected = (DoctorService) tblDoc.getValueAt(selectedRow, 0);
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

            for(DoctorService doctor : doctorList.getDoctorrList())
            {
                String UserName = "" ;
                String Password = ""; 
                for(UserAccountService useraccount : doctorOrg.getUserAccounttDirectory().getUserAccounttList())
                {
                    if(useraccount.getEmployeee().getName().equals(doctorSelected.getDoctorName()))
                    {
                        if(useraccount.getWorkkQueue().getWorkRequestList().size() > 0)
                        {
                             JOptionPane.showMessageDialog(null,"There is already request assigned to this Doctor, So Doctor won't delete");
                             return;
                        }
                    }
                }
            }
        
        
        
        
        
//        for (WorkRequestService wr : account.getWorkQueue().getWorkRequestList()) {
//            if(wr instanceof DoctorWorkRequestService) {
//                
//                DoctorWorkRequestService epr = (DoctorWorkRequestService)wr;

       
        doctorList.removeeDoctor(doctorSelected);
        populateDocTable();
    }//GEN-LAST:event_btnDeletePatient1ActionPerformed

    
    
    public void populateTable()
    {
        DefaultTableModel patientModel = (DefaultTableModel) tblPat.getModel();
        patientModel.setRowCount(0);
        
        for(PatientDetails patient : patientList.getPatienttList())
        {
            String UserName = "" ;
            String Password = ""; 
             OrganizationService patientOrg = null;
        for(Venture enterprise : network.getVentureDirectory().getVentureList())
        {
            for (OrganizationService organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
               if (organization instanceof PatientOrganizationService) {

                   patientOrg = organization;
                   break;
               }
           }
        }
            for(UserAccountService useraccount : patientOrg.getUserAccounttDirectory().getUserAccounttList())
            {
                if(useraccount.getEmployeee().getName().equals(patient.getPatName()))
                {
                    System.out.println(useraccount);
                    UserName = useraccount.getUserName();
                    Password = useraccount.getUserName();
                }
            }
            //for()
            Object [] row = new Object[6];
            row[0] = patient;
            row[1] = patient.getPhoneNo();
            row[2] = patient.getEmailAdd();
            row[3] = patient.getDob();
            row[4] = patient.getAdd();
            row[5] = patient.getUserrName();
           
            patientModel.addRow(row);
        }
    }
    
    public void populateDocTable()
    {
        try{
            log.info("Receptionist Panel Opening");
            DefaultTableModel patientModel = (DefaultTableModel) tblDoc.getModel();
            patientModel.setRowCount(0);
            
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

            for(DoctorService doctor : doctorList.getDoctorrList())
            {
                String UserName = "" ;
                String Password = ""; 
                for(UserAccountService useraccount : doctorOrg.getUserAccounttDirectory().getUserAccounttList())
                {
                    if(useraccount.getEmployeee().getName().equals(doctor.getDoctorName()))
                    {
                        UserName = useraccount.getUserName();
                        Password = useraccount.getUserName();
                    }
                }
                //for()
                Object [] row = new Object[4];
                row[0] = doctor;
                row[1] = doctor.getDocQualification();
                row[2] = doctor.getSpecilizationnName();
                row[3] = UserName;

                patientModel.addRow(row);
            }
        }
        catch(Exception e)
        {
            log.error(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnDeletePatient1;
    private javax.swing.JButton btnUpdatePatient;
    private javax.swing.JButton btnUpdatePatient1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDoc;
    private javax.swing.JTable tblPat;
    // End of variables declaration//GEN-END:variables
}