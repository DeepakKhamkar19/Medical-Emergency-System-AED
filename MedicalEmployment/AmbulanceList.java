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
public class AmbulanceList {
     private ArrayList<Ambulance> ambulanceList;

    public AmbulanceList() {
        this.ambulanceList = new ArrayList<Ambulance>() ;
    }
    
     public Ambulance addNewAmbulance(String name,  String number, String homeAddress)
    {
        Ambulance ambulance = new Ambulance(name,number,homeAddress);
        ambulanceList.add(ambulance);
        return ambulance;
    }
   
   

    public ArrayList<Ambulance> getambulanceList() {
        return ambulanceList;
    }

    public void setambulanceList(ArrayList<Ambulance> ambulanceList) {
        this.ambulanceList = ambulanceList;
    }
   
}
