/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.HealthInsurance;

/**
 *
 * @author Raveena
 */
public class HealthInsurance {
    
    private String userName;
    private String patientName;
    private String healthInsuraneNumber;
    private String validity;
    
     public HealthInsurance(String userName, String patientName, String healthInsuraneNumber, String validity) {  
         
        this.userName = userName;
        this.patientName = patientName;
        this.healthInsuraneNumber = healthInsuraneNumber;
        this.validity = validity;
       
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getHealthInsuraneNumber() {
        return healthInsuraneNumber;
    }

    public void setHealthInsuraneNumber(String healthInsuraneNumber) {
        this.healthInsuraneNumber = healthInsuraneNumber;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
    
    @Override
    public String toString() {
        return userName;
    }
    
}
