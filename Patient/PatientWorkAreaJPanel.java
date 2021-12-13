/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Patient;
import org.apache.log4j.Logger;
import Project.EcoSystem;
import Project.Venture.Emergency;
import Project.Venture.Venture;
import static Project.Venture.Venture.VentureType.ManagementUnit;
import Project.Venture.Management;
import Project.MedicalEmployment.DoctorService;
import Project.MedicalEmployment.PatientDetails;
import Project.MedicalEmployment.PatienttList;
import Project.Network.NetworkService;
import Project.Organization.DoctorOrganizationService;
import Project.Organization.EmergencyOrganizationService;
import Project.Organization.LabOrganizationService;
import Project.Organization.OrganizationService;
import Project.Organization.PatientOrganizationService;
import Project.UserAccount.UserAccountService;
import Project.WorkQueue.DoctorCheckUpWorkRequestService;
import Project.WorkQueue.EmergencyPatientRequestService;
import Project.WorkQueue.LabWorkRequestService;
import Project.WorkQueue.WorkRequestService;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkArea
     */
     private EcoSystem ecoSystem;
     private JPanel userProcessContainer;
     private UserAccountService userAccount;
     PatienttList patientList;
     PatientDetails patient;
     EmergencyPatientRequestService emergencyRequest;
     NetworkService network;
     OrganizationService organization;
     Venture enterprise;
    private static Logger log = Logger.getLogger(PatientWorkAreaJPanel.class);
    private static final String CLASS_NAME = PatientWorkAreaJPanel.class.getName();
     
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccountService account,EcoSystem ecoSystem, NetworkService network,
            OrganizationService organization,Venture enterprise) {
        initComponents();
        this.ecoSystem =ecoSystem;
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.userAccount = account;
        this.patientList = ecoSystem.getPatientDirectory();
        this.organization = organization;
        
        for(NetworkService netwrk : ecoSystem.getNetworkList())
        {
            for( Venture enprise : netwrk.getVentureDirectory().getVentureList())
            {
                if(enprise instanceof Management)
                {
                     this.enterprise = enprise;
                }

            }
        }
        
         for( PatientDetails patient :  ecoSystem.getPatientDirectory().getPatienttList())
        {
            if(patient.getPatName().equals(userAccount.getEmployeee().getName()))
            {
                this.patient = patient;
            }
        }   
        
        populatePatientFields();
        //valueLabel.setText(account.getEmployee().getName());
        //populateRequestTable();
        populateRequestTable();
        populateRequestCheckupTable();
        populateTable();
    }
    
     public void populatePatientFields()
    {
      log.info("Info for populatePatientFields");
//        DefaultTableModel ordModel = (DefaultTableModel) workRequestJTable.getModel();
//                    ordModel.setRowCount(0);
        for( PatientDetails patient :  ecoSystem.getPatientDirectory().getPatienttList())
        {
            if(patient.getPatName().equals(userAccount.getEmployeee().getName()))
            {
                ljblName.setText(patient.getPatName());
                txtpatientname.setText(patient.getPatName());
                txtage.setText(String.valueOf(patient.getPatAge()));
                txtEmailAdd.setText(patient.getEmailAdd());
               // txtbloodgroup.setText(patient.getBloodGrp());
                txtPhoneNum.setText(patient.getPhoneNo());
               // txtgender.setText(patient.getGender());
                txtAddress.setText(patient.getAdd());
                txtPatientId.setText(String.valueOf(patient.getPatId()));
                txtAssigDoc.setText(patient.getDoctorr());
               // txtgender.setText(patient.getGender());
                txtLocation.setText(patient.getLocaation());
                cbGender.setSelectedItem(patient.getPatGender());
                cbBloodGrp.setSelectedItem(patient.getBloodGroup());
                
            }
            
        }
        
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
        String UserName = "";
        String Password ="";
                
        for(UserAccountService useraccount : patientOrg.getUserAccounttDirectory().getUserAccounttList())
            {
                if(useraccount.getEmployeee().getName().equals(patient.getPatName()))
                {
                    System.out.println(useraccount);
                    UserName = useraccount.getUserName();
                    Password = useraccount.getUserName();
                }
            }
           txtUserName.setText(UserName);
                txtPassword.setText(Password);
    }
     
       public void populateTable()
    {
        
         DefaultTableModel model = (DefaultTableModel) jtblEmerReq1.getModel();
        model.setRowCount(0);
        
         OrganizationService org = null;
       for(Venture enterprise : network.getVentureDirectory().getVentureList())  
       {
            for (OrganizationService organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof LabOrganizationService) {
                    System.out.println(organization.getTypee());
                    org = organization;
                    break;
                }
            }
       }
        if (org != null) {
            for(WorkRequestService wr : org.getWorkkQueue().getWorkRequestList())
            {
                if(wr instanceof LabWorkRequestService)
                {
                    LabWorkRequestService lwr = (LabWorkRequestService)wr;
                    if(lwr.getPati().equals(patient))
                    {
                        Object[] row = new Object[6];
                        row[0] = lwr.getLabTestReqId();
                        row[1] = lwr.getSpeciType();  
                        row[2] = lwr.getLabTesttName();          
                        row[3] = lwr.getLabTestAdmFeedbck();
                        row[4] = lwr.getReqdate();
                        row[5] = lwr.getStat();

                        model.addRow(row);
                    }
                    
                }
            }
            //userAccount.getWorkQueue().getWorkRequestList().add(request);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        txtpatientname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ljblName = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEmailAdd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtAssigDoc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        cbBloodGrp = new javax.swing.JComboBox<>();
        cbGender = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbtnSOS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jVitalSign = new javax.swing.JTable();
        jkLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblEmerReq = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jCreateCheckupReq = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblEmerReq1 = new javax.swing.JTable();
        jkLabel13 = new javax.swing.JLabel();
        jkLabel20 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(300);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtpatientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 180, 154, -1));

        jLabel2.setText("Patient Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 185, -1, -1));

        jLabel6.setText("Patient Gender :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 228, -1, -1));

        jLabel7.setText("Blood Group :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 273, -1, -1));

        jLabel8.setText("Patient Age :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 319, -1, -1));

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        jPanel1.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 314, 154, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Hi..");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        ljblName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ljblName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/patient1.png"))); // NOI18N
        ljblName.setText("<Name>");
        jPanel1.add(ljblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 6, 300, 850));

        jLabel16.setText("Patient Id :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 141, -1, -1));

        txtPatientId.setEditable(false);
        jPanel1.add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 136, 151, -1));

        jLabel9.setText("Phone Number :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 363, -1, -1));
        jPanel1.add(txtPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 358, 154, -1));

        jLabel10.setText("Email Address :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 407, 77, -1));
        jPanel1.add(txtEmailAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 402, 154, -1));

        jLabel11.setText("Patient Address :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 451, 84, -1));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 446, 154, -1));

        btnUpdate.setText("Update ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 635, 146, -1));

        jLabel12.setText("Assgined Doctor :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 539, -1, -1));

        txtAssigDoc.setEditable(false);
        jPanel1.add(txtAssigDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 534, 153, -1));

        jLabel14.setText("Location :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 495, -1, -1));
        jPanel1.add(txtLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 490, 153, -1));

        jButton2.setText("Update Location");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 588, -1, -1));

        txtUserName.setEditable(false);
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserNameFocusLost(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 48, 151, -1));

        jLabel15.setText("User Name :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 53, -1, 17));

        txtPassword.setEditable(false);
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 92, 151, -1));

        jLabel17.setText("Password :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 97, -1, -1));

        cbBloodGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel1.add(cbBloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 269, 154, -1));

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        cbGender.setToolTipText("");
        jPanel1.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 224, 154, -1));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 51));
        jLabel18.setText("Location will help up to reach you in emergency time");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 572, -1, -1));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 6, 80, 30));

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Checkup History");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 6, 161, 26));

        jbtnSOS.setBackground(new java.awt.Color(255, 51, 51));
        jbtnSOS.setText("SOS");
        jbtnSOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSOSActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnSOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 540, 42));

        jVitalSign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Heart Rate", "Blood Pressure", "Respiratory Rate", "Weight", "Appointment Date", "Checkup Date", "Doctor"
            }
        ));
        jScrollPane1.setViewportView(jVitalSign);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 38, 540, 100));

        jkLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jkLabel3.setText("Emeregency Request History");
        jPanel2.add(jkLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 209, 26));

        jtblEmerReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request iD", "Request Date", "Status", "Treatment Date"
            }
        ));
        jScrollPane2.setViewportView(jtblEmerReq);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 540, 100));

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("For Emergency Please click below button, Emeregency Request automatically created");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 461, -1));

        jCreateCheckupReq.setText("Create Appoinment for Checkup Request");
        jCreateCheckupReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateCheckupReqActionPerformed(evt);
            }
        });
        jPanel2.add(jCreateCheckupReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 163, 540, -1));

        jtblEmerReq1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Request iD", "Specimen Type", "Lab Test Name", "Test Feedback", "Request Date", "Status"
            }
        ));
        jScrollPane3.setViewportView(jtblEmerReq1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 540, 118));

        jkLabel13.setText("Lab Test Request Table");
        jPanel2.add(jkLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jkLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/doctor1.png"))); // NOI18N
        jPanel2.add(jkLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 630, 860));

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSOSActionPerformed
        // TODO add your handling code here:
        OrganizationService Emeorg = null;
       for(Venture enterprise : network.getVentureDirectory().getVentureList())  
       {
         for (OrganizationService organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
             if(organization instanceof EmergencyOrganizationService)
             {
                    Emeorg = organization;
                    break;
                }
            }
       }
       
        for (WorkRequestService wr : Emeorg.getWorkkQueue().getWorkRequestList()) {
            if(wr instanceof EmergencyPatientRequestService) {
                
                    EmergencyPatientRequestService epr = (EmergencyPatientRequestService)wr;
                    if(epr.getPat().equals(patient) && !epr.getStat().equals("Completed"))
                    {
                         JOptionPane.showMessageDialog(null, "SOS Request already created and Emergency Team will be there in few minutes.");
                         return;
                    }
            }
        }





        


        emergencyRequest = new EmergencyPatientRequestService();
        emergencyRequest.setPat(patient);
        emergencyRequest.setRecieverNet(network);
        emergencyRequest.setSenderNet(network);
        emergencyRequest.setReqdate(new Date());
        emergencyRequest.setStat("Requested");
        emergencyRequest.setCritical("High");
        emergencyRequest.setSendr(userAccount);
          
        
        emergencyRequest.setRecieverOrg(Emeorg);
         for (OrganizationService organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
             if(organization instanceof PatientOrganizationService)
             {
                   emergencyRequest.setSenderOrg(organization); 
                    break;
                }
            }
        
        Emeorg.getWorkkQueue().addWorkRequest(emergencyRequest);
        JOptionPane.showMessageDialog(null, "SOS Request has created and Emergency Team will be there in few minutes.");
        System.out.println(emergencyRequest.getEmergencyReqId());
        populateRequestTable();
        
         
    }//GEN-LAST:event_jbtnSOSActionPerformed

    public void populateRequestTable()
     {
          DefaultTableModel ordModel = (DefaultTableModel) jtblEmerReq.getModel();
                    ordModel.setRowCount(0);
       for(Venture enterprise : network.getVentureDirectory().getVentureList())
       {
        for (OrganizationService organization : enterprise.getOrganizationDirectory().getOrganizationList()) 
          {
        
            for(WorkRequestService workrequest :  organization.getWorkkQueue().getWorkRequestList())  
            {
                if(organization instanceof EmergencyOrganizationService)
                {
                    
                    EmergencyPatientRequestService epr = (EmergencyPatientRequestService)workrequest;
                    if(epr.getPat() == patient)
                    {

                          Object [] row = new Object[4];
                                row[0] = epr.getEmergencyReqId();
                                row[1] = epr.getReqdate();
                                row[2] = epr.getStat();
                                row[3] = epr.getResolvDate();
                                ordModel.addRow(row);
                    }
                }
            }
         }
       }
            
                    
         
     }
    
    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void jCreateCheckupReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateCheckupReqActionPerformed
        // TODO add your handling code here:
        
        
        JDateChooser jd = new JDateChooser();
        jd.setMinSelectableDate(new Date());
     //   jd.setMaxSelectableDate(new Date().);
        //new Date().
        Date referenceDate = new Date();
        Calendar c = Calendar.getInstance(); 
        c.setTime(referenceDate); 
        c.add(Calendar.MONTH, 3);
        System.out.println("C.gettime "+ c.getTime());
        jd.setMaxSelectableDate(c.getTime());
//return c.getTime()
        
        String message ="Choose Appointment date:\n";
        Object[] params = {message,jd};
        JOptionPane.showConfirmDialog(null,params,"Start date", JOptionPane.PLAIN_MESSAGE);
        
        
                String s="";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        JDateChooser date =(JDateChooser)params[1];//Casting params[1] makes me able to get its information
        System.out.println(date.getDate());
        
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
        
        String docterName = txtAssigDoc.getText();
                     
         for(DoctorService doc : ecoSystem.getDoctroDirectory().getDoctorrList())
        {
           if(doc.getDoctorName().equals(docterName))
           {
               for(UserAccountService ua : doctorOrg.getUserAccounttDirectory().getUserAccounttList())
               {
                   if(ua.getEmployeee().getName().equals(docterName))
                   {  
                       System.out.println("Apppoint date "+ date);
                        DoctorCheckUpWorkRequestService cur = new DoctorCheckUpWorkRequestService() ;
                        cur.setDoc(doc);
                        cur.setSendr(userAccount);
                        cur.setReceivr(ua);
                        cur.setPat(patient);
                        cur.setStat("Request"); 
                        cur.setReqDate(date.getDate());
                        cur.setSenderrNetwork(network);
                        cur.setSenderrOrganization(organization);
                        cur.setRecieverrNetwork(network);
                        cur.setRecieverrOrganization(organization);
                        ua.getWorkkQueue().addWorkRequest(cur);
                         JOptionPane.showMessageDialog(null, "Check up Request create and will no");
                   }   
               }
           }
        }
         
         
         populateRequestCheckupTable();
        
        
        //JOptionPane.showMessageDialog(null,"Donor details added1");
        //  wr.setTestResult(result);
//        cur.getCheckUp().setRespiratoryRate(rr);
//        cur.getCheckUp().setBloodPressure(bp);
//        cur.getCheckUp().setHeartRate(hr);
//        cur.getCheckUp().setWeight(weight);
//        cur.getCheckUp().setDate(new Date());

        
    }//GEN-LAST:event_jCreateCheckupReqActionPerformed

    public void populateRequestCheckupTable()
    {
        System.out.println("PopulateCheck table");
        DefaultTableModel ordModel = (DefaultTableModel) jtblEmerReq1.getModel();
        ordModel.setRowCount(0);
         DefaultTableModel vitalModel = (DefaultTableModel) jVitalSign.getModel();
        vitalModel.setRowCount(0);
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

          //  for(DoctorService doc : ecoSystem.getDoctroDirectory().getDoctorList())
    //    {
         //  System.out.println("DOC " +doc.getDocName());
               for(UserAccountService ua : doctorOrg.getUserAccounttDirectory().getUserAccounttList())
               {
                    System.out.println("UA-" +ua.getUserName());
                   for(WorkRequestService wr : ua.getWorkkQueue().getWorkRequestList())
                   {  
                       System.out.println("wr-"+wr);
                        if(wr instanceof DoctorCheckUpWorkRequestService)
                        {
                            DoctorCheckUpWorkRequestService epr = (DoctorCheckUpWorkRequestService)wr;
                            if(epr.getPat() == patient)
                            {
                                System.out.println("For loop Table row added");

//                                                                   
                                        if(epr.getCheckkUp() != null)
                                        {
                                            Object [] row2 = new Object[8];
                                                    row2[0] = epr.getCheckupReqId();
                                                    row2[1] = epr.getCheckkUp().getHeartRate() ;
                                                    row2[2] = epr.getCheckkUp().getBlooddPressure();
                                                    row2[3] = epr.getCheckkUp().getRespiratoryyRate();
                                                    row2[4] =  epr.getCheckkUp().getWeightt();
                                                    row2[5] = epr.getReqDate();
                                                    row2[6] = epr.getCheckkUp().getDatee();
                                                    row2[7] = epr.getDoc().getDoctorName();
                                                    vitalModel.addRow(row2);
                                        }
                            }
                        }
                
                   }
                }
           
    //    }
                    
                    
                    
                    
                    
//        for (OrganizationService organization : enterprise.getOrganizationDirectory().getOrganizationList()) 
//            {
//                 if(organization instanceof DoctorOrganizationService)
//                {     
//            for(WorkRequestService workrequest :  organization.getWorkQueue().getWorkRequestList())  
//            {
//               
//                    
//                    DoctorCheckUpWorkRequestService epr = (DoctorCheckUpWorkRequestService)workrequest;
//                    if(epr.getPatient() == patient)
//                    {
//
//                          Object [] row = new Object[3];
//                                row[0] = epr.getCheckupRequestId();
//                                row[1] = epr.getRequestdate();
//                                row[2] = epr.getStatus();
//                                ordModel.addRow(row);
//                    }
//                }
//            }
//        }
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
//        if(txtpatientname.getText().isEmpty() ||  txtEmailAdd.getText().isEmpty() ||
//            txtPhoneNum.getText().isEmpty() || 
//            txtAddress.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "First Name, Email address , User Name, Password,  Phone number  and Address Fields cannot be left empty");
//            return;
//        }

        boolean flag ;

        String email = txtEmailAdd.getText();

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

        String phoneNumber = txtPhoneNum.getText();

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

            if(!txtage.getText().isEmpty())
            {
                age = Integer.parseInt(txtage.getText());
            }

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }

        String firstname = txtpatientname.getText() ;
        // String email = txtEmailAdd.getText();
        String phone = txtPhoneNum.getText();
        String address = txtAddress.getText();
        // String age = txtAge.getText();
       // String userName= txtUserName.getText();
       // String password = txtPassword.getText();
      

        patient.setPatName(firstname);
        patient.setEmailAdd(email);
        patient.setPhoneNo(phone);
        patient.setPatAge(age);
        patient.setAdd(address);
       

        JOptionPane.showMessageDialog(null, "Patient Profile Updated");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PatientLocationMap createPatient = new PatientLocationMap(userProcessContainer);
        userProcessContainer.add("CreatePatientJPanel",createPatient);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusLost
        // TODO add your handling code here:
        if(txtUserName.getText().isEmpty())
        {
            return;
        }
        String userName = txtUserName.getText();
        for(UserAccountService account : ecoSystem.getUserAccounttDirectory().getUserAccounttList()) {
            if(account.getUserName().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                txtUserName.setText(null);
                return;
            }
        }
    }//GEN-LAST:event_txtUserNameFocusLost

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed
    public void ppopulateLongituteLatitude(String locationPoint)
       {
           txtLocation.setText(locationPoint);
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbBloodGrp;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jCreateCheckupReq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jVitalSign;
    private javax.swing.JButton jbtnSOS;
    private javax.swing.JLabel jkLabel13;
    private javax.swing.JLabel jkLabel20;
    private javax.swing.JLabel jkLabel3;
    private javax.swing.JTable jtblEmerReq;
    private javax.swing.JTable jtblEmerReq1;
    private javax.swing.JLabel ljblName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAssigDoc;
    private javax.swing.JTextField txtEmailAdd;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtpatientname;
    // End of variables declaration//GEN-END:variables
}
