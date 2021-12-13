/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Receptionist;

import Project.EcoSystem;
import Project.Employee.Employee;
import Project.Venture.Venture;
import Project.MedicalEmployment.DoctorService;
import Project.MedicalEmployment.PatientDetails;
import Project.MedicalEmployment.PatienttList;
import Project.Network.NetworkService;
import Project.Organization.OrganizationService;
import Project.Organization.PatientOrganizationService;
import Project.Role.PatientRoleService;
import Project.UserAccount.UserAccountService;
import java.awt.CardLayout;
import java.awt.Component;
import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Receptionist.LocationMap;

/**
 *
 * @author Deepak Khamkar
 */

public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecoSystem;
    PatienttList patientList ;
    PatientDetails patient;
    NetworkService network;
    public CreatePatientJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, PatienttList patientList, 
            NetworkService network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.patientList = patientList;
        this.network = network;
        btnUpdate.setVisible(false);
         txtPatiId.setEditable(false);
         txtAssignDoc.setEditable(false);
    }
    
    
     
       public CreatePatientJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, PatienttList patientList,PatientDetails patient,
               NetworkService network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.patientList = patientList;
        this.patient=patient;
        
        this.network = network;
        btnUpdate.setVisible(true);
        PopulateValue(patient);
        btnPatientSave.setVisible(false);
        txtPatiId.setEditable(false);
         txtAssignDoc.setEditable(false);
         cbsBloodGrp.setEnabled(false);
         cbsGender.setEnabled(false);
         jLabel1.setText("Update Patient");
         lblMsg.setText("Only location and Doctor can be update from this form");
    }
     
     
       public void PopulateValue(PatientDetails patient)
    {
        jtxtFirstName.setText(patient.getPatName());
        //txtMiddelName.setText(customer.getMiddelName());
        //txtLastName.setText(customer.getLastName());
        txtEmailAddress.setText(patient.getEmailAdd());
        jtxtPhoneNum.setText(patient.getPhoneNo());
        txtName.setText(patient.getUserrName());
        jtxtAge.setText(String.valueOf(patient.getPatAge()));
        cbsBloodGrp.setSelectedItem(patient.getBloodGroup());
        cbsGender.setSelectedItem(patient.getPatGender());
        txtAdd.setText(patient.getAdd());
        txtPatiId.setText(String.valueOf(patient.getPatId()));
        txtAssignDoc.setText(patient.getDoctorr());
        txtLoc.setText(patient.getLocaation());
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
           txtName.setText(UserName);
                txtPasswd.setText(Password);
            txtName.setEditable(false);
            txtPasswd.setEditable(false);
        
            jtxtFirstName.setEditable(false);
        //txtMiddelName.setText(customer.getMiddelName());
        //txtLastName.setText(customer.getLastName());
        txtEmailAddress.setEditable(false);
        jtxtPhoneNum.setEditable(false);
        txtName.setEditable(false);
        jtxtAge.setEditable(false);
        txtAdd.setEditable(false);
        txtAssignDoc.setEditable(false);
       
    }

    public void ppopulateLongituteLatitude(String locationPoint)
       {
           txtLoc.setText(locationPoint);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnPatientSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtxtFirstName = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        jtxtPhoneNum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtAge = new javax.swing.JTextField();
        txtAdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtPatiId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtAssignDoc = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        cbsBloodGrp = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cbsGender = new javax.swing.JComboBox<>();
        txtLoc = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPasswd = new javax.swing.JPasswordField();
        lblMsg = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE PATIENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 19, 237, 39));

        jLabel2.setText("Full Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 272, -1, -1));

        jLabel5.setText("Phone Number :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 460, -1, 20));

        jLabel6.setText("Email Address :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 507, -1, 30));

        jLabel7.setText("Patient Address :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 567, -1, -1));

        jLabel8.setText("User Name :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 106, -1, 25));

        jLabel9.setText("Password :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 161, -1, 25));

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 104, 278, 30));

        btnPatientSave.setText("Save");
        btnPatientSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnPatientSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 130, -1));

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 130, -1));

        jtxtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 264, 278, 30));
        jPanel1.add(txtEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 507, 278, 30));
        jPanel1.add(jtxtPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 455, 278, 30));

        jLabel12.setText("Age :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 360, -1, 25));
        jPanel1.add(jtxtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 357, 278, 30));
        jPanel1.add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 559, 278, 30));

        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("*");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 111, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 166, 17, -1));

        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("*");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 272, 17, -1));

        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 463, 17, -1));

        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("*");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 515, 17, -1));

        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("*");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 567, 17, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 130, -1));

        jLabel16.setText("Patient Id :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 215, -1, 25));
        jPanel1.add(txtPatiId, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 213, 278, 30));

        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("*");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 17, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/folder/patient.jpg"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 777, -1, 150));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/folder/EmergencyHospitalSign.jpg"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 5, -1, 77));

        jButton1.setText("Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 134, -1));

        jLabel19.setText("Assigned Doctor :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 665, -1, -1));
        jPanel1.add(txtAssignDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 665, 278, 30));

        jButton3.setText("Assign Doctor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 130, -1));

        jLabel20.setText("Blood Group :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 405, -1, -1));

        cbsBloodGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(cbsBloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 405, 278, 30));

        jLabel21.setText("Gender :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 315, -1, -1));

        cbsGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        cbsGender.setToolTipText("");
        jPanel1.add(cbsGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 312, 278, 30));

        txtLoc.setEditable(false);
        jPanel1.add(txtLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 611, 278, 30));

        jLabel22.setText("Set Location :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 611, -1, -1));
        jPanel1.add(txtPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 159, 278, 30));

        lblMsg.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(lblMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 290, 19));
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 50));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/patientreg.jpg"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 930));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if(txtName.getText().isEmpty())
        {
            return;
        }
        String userName = txtName.getText();
        for(UserAccountService account : ecoSystem.getUserAccounttDirectory().getUserAccounttList()) {
            if(account.getUserName().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                txtName.setText(null);
                return;
            }
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnPatientSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientSaveActionPerformed
        // TODO add your handling code here:

        if(jtxtFirstName.getText().isEmpty() ||  txtEmailAddress.getText().isEmpty() ||
            jtxtPhoneNum.getText().isEmpty() || txtName.getText().isEmpty() || txtPasswd.getPassword().length <= 0 ||
            txtAdd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "First Name, Email address , User Name, Password,  Phone number  and Address Fields cannot be left empty");
            return;
        }

        boolean flag ;

        String email = txtEmailAddress.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        for(PatientDetails patient : ecoSystem.getPatientDirectory().getPatienttList() ){
            if(patient.getEmailAdd().equals(email)) {
                JOptionPane.showMessageDialog(null, "Email Address already exists");
                return;
            }
        }

        String phoneNumber = jtxtPhoneNum.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }

        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        for(PatientDetails patient : patientList.getPatienttList()) {
            if(patient.getPhoneNo().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }

        int age = 0;

        try {

            if(!jtxtAge.getText().isEmpty())
            {
                age = Integer.parseInt(jtxtAge.getText());
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }

        String firstname = jtxtFirstName.getText() ;
        // String email = txtEmailAdd.getText();
        String phone = jtxtPhoneNum.getText();
        String address = txtAdd.getText();
        // String age = txtAge.getText();
        String userName= txtName.getText();
         char[] passwordCharArray = txtPasswd.getPassword();
        String password = String.valueOf(passwordCharArray);
        //String password = txtPassword.getText();
        Object booldGroup = cbsBloodGrp.getSelectedItem();
        Object gender = cbsGender.getSelectedItem();
        String doctor = txtAssignDoc.getText();
        String location = txtLoc.getText();
        System.out.println(booldGroup.toString());
         System.out.println(gender.toString());
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
       
        System.out.println(booldGroup.toString());
        patientList.addNewPatient(firstname,email,phone,age, address, userName,new Date(),booldGroup.toString(),doctor,gender.toString(),location);
        Employee employee = ecoSystem.getEmployeeeDirectory().createEmployee(firstname);
        UserAccountService usserAccount = patientOrg.getUserAccounttDirectory().createUserAccount(userName, password, employee, new PatientRoleService());
        SendEmail( email, userName,  password);
        JOptionPane.showMessageDialog(null, "Patient Profile Created");
        
          userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientListJPanel mcjp = (PatientListJPanel) component;
        mcjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnPatientSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

//        if(txtFirstName.getText().isEmpty() ||  txtEmailAdd.getText().isEmpty() ||
//            txtPhoneNum.getText().isEmpty() || txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty() ||
//            txtAddress.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "First Name, Email address , User Name, Password,  Phone number  and Address Fields cannot be left empty");
//            return;
//        }

        boolean flag ;

        String email = txtEmailAddress.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        for(PatientDetails patient : ecoSystem.getPatientDirectory().getPatienttList()) {
            if(patient != patient)
            {
                if(patient.getEmailAdd().equals(email))
                {
                    JOptionPane.showMessageDialog(null, "Email Address already exists");
                }
            }
        }

        String phoneNumber = jtxtPhoneNum.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }

        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        for(PatientDetails patient : patientList.getPatienttList()) {
            if(patient != patient)
            {
                if(patient.getPhoneNo().equals(phoneNumber)) {
                    JOptionPane.showMessageDialog(null, "Phone Number already exists");
                }
            }
        }

        int age = 0;

        try {

            if(!jtxtAge.getText().isEmpty())
            {
                age = Integer.parseInt(jtxtAge.getText());
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }

        String firstname = jtxtFirstName.getText() ;
        // String email = txtEmailAdd.getText();
        String phone = jtxtPhoneNum.getText();
        String address = txtAdd.getText();
        // String age = txtAge.getText();
        String userName= txtName.getText();
        char[] passwordCharArray = txtPasswd.getPassword();
        String password = String.valueOf(passwordCharArray);

        patient.setPatName(firstname);
        patient.setEmailAdd(email);
        patient.setPhoneNo(phone);
        patient.setPatAge(age);
        patient.setAdd(address);
        patient.setDoctorr(txtAssignDoc.getText());
        patient.setLocaation(txtLoc.getText());
       

        JOptionPane.showMessageDialog(null, "Patient Profile Updated");

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LocationMap createPatient = new LocationMap(userProcessContainer);
        userProcessContainer.add("CreatePatientJPanel",createPatient);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         int size = ecoSystem.getDoctroDirectory().getDoctorrList().size();
                    String[] DoctorList = new String[size+1]; ;
                    int i= 0;
                    DoctorList[i] = "Select";
                    i++;
                    for(DoctorService doctor : ecoSystem.getDoctroDirectory().getDoctorrList())
                    {
                        if( doctor.getEmergencyDoctorr() != null && !doctor.getEmergencyDoctorr())
                        {
                            DoctorList[i] = doctor.getDoctorName();
                            i++;
                        } 
                    }

                     final JComboBox<String> combo = new JComboBox<>(DoctorList);

                    String[] options = { "OK", "Cancel" };

                    String title = "Title";
                    int selection = JOptionPane.showOptionDialog(null, combo, title,
                          JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                          options, options[0]);

                    if (selection > 0) {
                       System.out.println("Doctor is: " + options[selection]);
                    }
//                     OrganizationService doctorOrg = null;
//                     for(Venture enterprise : network.getEnterpriseDirectory().getEnterpriseList())
//                    {
//                        for (OrganizationService organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                           if (organization instanceof DoctorOrganization ) {
//
//                               doctorOrg = organization;
//                               break;
//                           }
//                       }
//                    }


                    Object docterName = combo.getSelectedItem();
                    if( !docterName.equals("Select"))
                    {
                         txtAssignDoc.setText(docterName.toString());
                    }
                    else
                    {
                         txtAssignDoc.setText("");
                    }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtxtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFirstNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PatientListJPanel mcjp = (PatientListJPanel) component;
        mcjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public void SendEmail(String emailAddress,String userName, String Password)
    {
        System.out.println("Inside Email ");
         String to = emailAddress;
        String from = "donotreplymedicalemergency@gmail.com";
        String pass = "Password@123";
// Assuming you are sending email from localhost
// String host = "192.168.0.16";

// Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";

        properties.put("mail.smtp.starttls.enable", "true");

        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
// properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

// Setup mail server
// properties.setProperty("mail.smtp.host", host);
// properties.put("mail.smtp.starttls.enable", "true");
// Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        try {
// Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

// Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

// Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            String htmlText = ("<div style=\"color:red;\">BRIDGEYE</div>");
            message.setContent(htmlText, "text/html");

// Set Subject: header field
            message.setSubject("Patient Registration");
            
            
            String msg = "Welcome to Emergency Medical System and Thank you for registering with us. Your account Created with User Name -"+userName +" and Password -" + Password +". Please stay happy and safe";
           // String text= "<table><tr><td>EmpId</td><td>Emp name</td><td>age</td></tr><tr><td>value</td><td>value</td><td>value</td></tr></table>";
            message.setText(msg);
// Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Invalid email id");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatientSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbsBloodGrp;
    private javax.swing.JComboBox<String> cbsGender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtPhoneNum;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtAssignDoc;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPasswd;
    private javax.swing.JTextField txtPatiId;
    // End of variables declaration//GEN-END:variables
}
