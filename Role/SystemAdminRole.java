/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;


import Project.Patient.PatientDirectory;
import Project.Doctor.DoctorDirectory;
import Project.UserAccount.UserAccount;
import javax.swing.JPanel;
import FinalProject.EcoSystem;
import Project.EmergencyService.EmergencyServiceDirectory;
import Project.HealthInsurance.HealthInsuranceDirectory;
import Project.Pharmacy.PharmacyDirectory;
import Project.Laboratory.LaboratoryDirectory;
import Project.Billing.BillingDirectory;
import Project.Hospital.HospitalDirectory;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author DELL
 */
public class SystemAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, PatientDirectory patientDirectory, 
            DoctorDirectory doctorDirectory, EmergencyServiceDirectory emergencyServiceDirectory, 
            HealthInsuranceDirectory healthInsuranceDirectory, PharmacyDirectory pharmacyDirectory,
            LaboratoryDirectory laboratoryDirectory, BillingDirectory billingDirectory, 
            HospitalDirectory hospitalDirectory) {
         {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business, patientDirectory, doctorDirectory, pharmacyDirectory, 
                billingDirectory, hospitalDirectory);
         }
    }
   
 

 
    
}