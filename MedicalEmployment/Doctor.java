/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalEmployment;

import java.util.Date;

/**
 *
 * @author Sandeep
 */
public class Doctor {
    private String patientName;
    private int age;
    private String Gender;
    private String qualification;
    private Date practicingfrom ;
    private String specilizationName;
    private String DocName;
    private Boolean emergencyDoctor;

    public Doctor(String DocName,String qualification, String specilizationName,Boolean emergencyDoctor ) {
        this.qualification = qualification;
        this.specilizationName = specilizationName;
        this.DocName = DocName;
        this.emergencyDoctor = emergencyDoctor;
    }

    public Boolean getEmergencyDoctor() {
        return emergencyDoctor;
    }

    public void setEmergencyDoctor(Boolean emergencyDoctor) {
        this.emergencyDoctor = emergencyDoctor;
    }

           
    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    
    public String getPatientName() {
        return patientName;
    }

    
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Date getPracticingfrom() {
        return practicingfrom;
    }

    public void setPracticingfrom(Date practicingfrom) {
        this.practicingfrom = practicingfrom;
    }

    public String getSpecilizationName() {
        return specilizationName;
    }

    public void setSpecilizationName(String specilizationName) {
        this.specilizationName = specilizationName;
    }
    
    @Override
    public String toString()
    {
        return DocName;
    }
    
}
