/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import java.util.ArrayList;

/**
 *
 * @author Sandeep
 */
public class MedicineList {
    
     private ArrayList<Medicine> medicineList;

    public MedicineList() {
        medicineList=new ArrayList<>();
        }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
     public Medicine addMedicine()
    {
        Medicine mi = new Medicine();
        medicineList.add(mi);
        return mi;
    }
    
    public void deleteMedicine(Medicine mi){
     medicineList.remove(mi);
    }
}
