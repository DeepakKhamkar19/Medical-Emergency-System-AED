
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project.Hospital;

import java.util.ArrayList;


public class HospitalDirectory{
    
    private ArrayList<Hospital> hospitalDirectory;
    
    public HospitalDirectory() {
        
        hospitalDirectory = new ArrayList();
        
    }

    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public Hospital newHospital(String userName, String name, String address, String phoneNumber, String patientName){
        Hospital hospital = new Hospital(userName, name, address, phoneNumber, patientName);
        hospitalDirectory.add(hospital);
        return hospital;
    }
    
    public void removeHospital(Hospital hospital){
        hospitalDirectory.remove(hospital);
    }
    
    public Hospital getHospital(String name){
        for(Hospital hospital: hospitalDirectory){
            if(hospital.getPatientName().equalsIgnoreCase(name)){
                return hospital;
            }
        }
        return null;
    }
    
}
