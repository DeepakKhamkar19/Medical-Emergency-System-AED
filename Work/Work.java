/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Work;

import java.util.ArrayList;

/**
 *
 * @author raveena
 */
public class Work {
    
    private ArrayList<WorkRequest> workRequestList;

    public Work() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
