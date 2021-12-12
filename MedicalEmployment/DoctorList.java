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
public class DoctorList {
   private ArrayList<Doctor> doctorList;

    public DoctorList() {
        this.doctorList = new ArrayList<Doctor>() ;
    }
   
      public Doctor addNewDoctor(String fullName, String qualification, String specilization, Boolean emeDoc)
    {
        Doctor doctor = new Doctor(fullName,qualification,specilization,emeDoc);
        doctorList.add(doctor);
        return doctor;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
   
    public void removeDoctor(Doctor doctor)
    {
        doctorList.remove(doctor);
    }
   
}
