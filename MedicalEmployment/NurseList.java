/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalEmployment;

import java.util.ArrayList;

/**
 *
 * @author Sandeep
 */
public class NurseList {
    
    private  ArrayList<Nurse> nurseList;

    public NurseList() {
        this.nurseList = new ArrayList<Nurse>() ;
    }
    
    

    public ArrayList<Nurse> getNurseList() {
        return nurseList;
    }

    public void setNurseList(ArrayList<Nurse> nurseList) {
        this.nurseList = nurseList;
    }
    
    
    
}
