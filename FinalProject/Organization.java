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
import Project.Employee.EmployeeDirectory;
import Project.Hospital.HospitalDirectory;
import Project.Role.Role;
import Project.UserAccount.UserAccountDirectory;
import Project.WorkQueue.WorkQueue;
import java.util.ArrayList;

public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
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
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
