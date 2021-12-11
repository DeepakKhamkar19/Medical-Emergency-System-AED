/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.HealthInsurance;

import java.util.ArrayList;


public class HealthInsuranceDirectory{
    
    private ArrayList<HealthInsurance> healthinsuranceDirectory;
    
    public HealthInsuranceDirectory() {
        
        healthinsuranceDirectory = new ArrayList();
    }

    public ArrayList<HealthInsurance> getHealthInsuranceDirectory() {
        return healthinsuranceDirectory;
    }

    public void setHealthInsuranceDirectory(ArrayList<HealthInsurance> healthinsuranceDirectory) {
        this.healthinsuranceDirectory = healthinsuranceDirectory;
    }
    
    public HealthInsurance newHealthInsurance(String userName, String patientName, String healthInsuraneNumber, String validity){
        HealthInsurance healthinsurance = new HealthInsurance(userName, patientName, healthInsuraneNumber, validity);
        healthinsuranceDirectory.add(healthinsurance);
        return healthinsurance;
    }
    
    public void removeHealthInsurance(HealthInsurance healthinsurance){
        healthinsuranceDirectory.remove(healthinsurance);
    }
    
    public HealthInsurance getHealthInsurance(String name){
        for(HealthInsurance healthinsurance: healthinsuranceDirectory){
            if(healthinsurance.getPatientName().equalsIgnoreCase(name)){
                return healthinsurance;
            }
        }
        return null;
    }
    
}