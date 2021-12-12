/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalEmployment;

import Business.Medicine.PrescriptionList;
import java.util.Date;

/**
 *
 * @author Sandeep
 */
public class Patient {
    
    private int patientId;
    private String patientName;
    private int age;
    private String Gender;
    private String Test;
    private String doctor;
    private PatientHistory patientHistory;
    private String emailAddress;
    private  String address; 
    private String userName;
    private String phoneNumber;
    private Date birthDate;
    private String bloodGrp;
    private PrescriptionList prescriptionlist;
    private static int patientCount=1;
   private String location;
    
    public Patient(String firstName, String email, String phoneNumber, int age, String homeAddress, 
            String userName, Date birthdate,String bloodGrp,String doc,String gender,String location){
        this.patientName = firstName;
        this.emailAddress = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = homeAddress;
        this.userName = userName;
        this.patientId = patientCount;
        this.birthDate = birthdate;
        this.doctor = doc;
        this.Gender = gender;
        this.bloodGrp = bloodGrp;
        this.location = location;
        this.prescriptionlist = new PrescriptionList();
        patientCount++;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PrescriptionList getPrescriptionlist() {
        return prescriptionlist;
    }

    public void setPrescriptionlist(PrescriptionList prescriptionlist) {
        this.prescriptionlist = prescriptionlist;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

  

    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodGrp() {
        return bloodGrp;
    }

    public void setBloodGrp(String bloodGrp) {
        this.bloodGrp = bloodGrp;
    }
    
    

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    public String getTest() {
        return Test;
    }

    public void setTest(String Test) {
        this.Test = Test;
    }

    public PatientHistory getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(PatientHistory patientHistory) {
        this.patientHistory = patientHistory;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
 
    @Override
     public String toString()
     {
         return this.patientName;
     }
     
     
}
