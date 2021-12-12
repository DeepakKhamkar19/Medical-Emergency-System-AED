/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalEmployment;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sandeep
 */
public class PatientList {
    private ArrayList<Patient> patientList;

    public PatientList() {
        patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
      public Patient addNewPatient(String fullName, String email, String phoneNumber, int age, String homeAddress, 
              String userName, Date birthdate,String bloodGrp,String doctor,String gender,String location)
    {
        Patient patient = new Patient(fullName,email,phoneNumber,age, homeAddress,userName,birthdate,bloodGrp,
                doctor,gender,location);
        patientList.add(patient);
        return patient;
    }
    
    public void removePatient(Patient patient)
    {
        patientList.remove(patient);
    }

    
    
    
}
