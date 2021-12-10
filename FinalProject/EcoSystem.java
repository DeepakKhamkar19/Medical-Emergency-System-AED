/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;


import Project.Patient.PatientDirectory;
import Project.Doctor.DoctorDirectory;
import Project.UserAccount.UserAccount;
import javax.swing.JPanel;
import Project.EmergencyService.EmergencyServiceDirectory;
import Project.HealthInsurance.HealthInsuranceDirectory;
import Project.Pharmacy.PharmacyDirectory;
import Project.Laboratory.LaboratoryDirectory;
import Project.Billing.BillingDirectory;
import Project.Hospital.HospitalDirectory;
import Project.Role.Role;
import Project.Role.SystemAdminRole;
import java.util.ArrayList;

public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private EmergencyServiceDirectory emergencyServiceDirectory;
    private HealthInsuranceDirectory healthInsuranceDirectory;
    private PharmacyDirectory pharmacyDirectory;
    private LaboratoryDirectory laboratoryDirectory;
    private BillingDirectory billingDirectory;
    private HospitalDirectory hospitalDirectory;

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public EmergencyServiceDirectory getEmergencyServiceDirectory() {
        return emergencyServiceDirectory;
    }

    public void setEmergencyServiceDirectory(EmergencyServiceDirectory emergencyServiceDirectory) {
        this.emergencyServiceDirectory = emergencyServiceDirectory;
    }

    public HealthInsuranceDirectory getHealthInsuranceDirectory() {
        return healthInsuranceDirectory;
    }

    public void setHealthInsuranceDirectory(HealthInsuranceDirectory healthInsuranceDirectory) {
        this.healthInsuranceDirectory = healthInsuranceDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }

    public LaboratoryDirectory getLaboratoryDirectory() {
        return laboratoryDirectory;
    }

    public void setLaboratoryDirectory(LaboratoryDirectory laboratoryDirectory) {
        this.laboratoryDirectory = laboratoryDirectory;
    }

    public BillingDirectory getBillingDirectory() {
        return billingDirectory;
    }

    public void setBillingDirectory(BillingDirectory billingDirectory) {
        this.billingDirectory = billingDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public EcoSystem( 
	PatientDirectory patientDirectory, DoctorDirectory doctorDirectory, EmergencyServiceDirectory emergencyServiceDirectory, 
        HealthInsuranceDirectory healthInsuranceDirectory, PharmacyDirectory pharmacyDirectory, LaboratoryDirectory laboratoryDirectory,
    BillingDirectory billingDirectory, HospitalDirectory hospitalDirectory)
    {
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
        this.emergencyServiceDirectory = emergencyServiceDirectory;
        this.healthInsuranceDirectory = healthInsuranceDirectory;
        this.pharmacyDirectory = pharmacyDirectory;
        this.laboratoryDirectory = laboratoryDirectory;
        this.billingDirectory = billingDirectory;
        this.hospitalDirectory = hospitalDirectory;
        
    }

    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        patientDirectory = new PatientDirectory();
        doctorDirectory = new DoctorDirectory();
        emergencyServiceDirectory = new EmergencyServiceDirectory();
        healthInsuranceDirectory = new HealthInsuranceDirectory();
        pharmacyDirectory = new PharmacyDirectory();
        laboratoryDirectory = new LaboratoryDirectory();
        billingDirectory = new BillingDirectory();
        hospitalDirectory = new HospitalDirectory();
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
        //
       return false;
    }

    
}