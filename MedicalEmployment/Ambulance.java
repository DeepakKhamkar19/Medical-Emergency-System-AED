/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalEmployment;

/**
 *
 * @author Sandeep
 */
public class Ambulance {
    String driverName;
    String ambulanceNumber;
    String location;
    private double longitude;
    private double latitude;

    
    public Ambulance(String driverName,String ambulanceNumber,String location)
    {
        this.ambulanceNumber = ambulanceNumber;
        this.driverName = driverName;
        this.location = location;
    }
    
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getAmbulanceNumber() {
        return ambulanceNumber;
    }

    public void setAmbulanceNumber(String ambulanceNumber) {
        this.ambulanceNumber = ambulanceNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    
    @Override
    public String toString()
    {
        return ambulanceNumber;
    }
    
}
