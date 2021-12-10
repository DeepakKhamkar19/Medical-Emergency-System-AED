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


public abstract class Role {
    
    public enum RoleType{
        DoctorAdmin("DoctorAdmin"),
        Patient("Patient"),
        PharmacyAdmin("PharmacyAdmin"),
        EmergencyServiceAdmin("EmergencyServiceAdmin"),
        HealthInsuranceAdmin("HealthInsuranceAdmin"),
        BillingAdmin("BillingAdmin"),
        LaboratoryAdmin("LaboratoryAdmin"),
        HospitalAdmin("Hospitaladmin"),
        SysAdmin("Sysadmin");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract  JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business,
            PatientDirectory patientDirectory, DoctorDirectory doctorDirectory, EmergencyServiceDirectory emergencyServiceDirectory, 
            HealthInsuranceDirectory healthInsuranceDirectory, PharmacyDirectory pharmacyDirectory, LaboratoryDirectory laboratoryDirectory,
            BillingDirectory billingDirectory, HospitalDirectory hospitalDirectory);
  
  


    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}