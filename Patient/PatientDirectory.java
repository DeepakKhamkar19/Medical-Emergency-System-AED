/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Patient;

import java.util.ArrayList;


public class PatientDirectory{
    
    private ArrayList<Patient> patientDirectory;
    
    public PatientDirectory() {
        
        patientDirectory = new ArrayList();
        
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public Patient newPatient(String userName, String name, String email, String phoneNumber,String address, int age, String bloodGroup, String healthInsurance){
        Patient patient = new Patient(userName, name, email, phoneNumber,address, age, bloodGroup, healthInsurance);
        patientDirectory.add(patient);
        return patient;
    }
    
    public void removePatient(Patient patient){
        patientDirectory.remove(patient);
    }
    
    public Patient getPatient(String name){
        for(Patient patient: patientDirectory){
            if(patient.getName().equalsIgnoreCase(name)){
                return patient;
            }
        }
        return null;
    }
    
}