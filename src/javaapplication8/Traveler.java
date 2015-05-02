/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;





/**
 *
 * @author danial
 */
public class Traveler
{
   
    private int travelerMembershipID;
    private String passportID;
    private String travelerName;
    private String travelerAddress;
    private String travelerContact;
    private int milesTravelled;



    public Traveler() {

    }

    public void setMilesTravelled(int milesTravelled) {
        this.milesTravelled = milesTravelled;
    }

    public int getMilesTravelled() {
        return milesTravelled;
    }

    public String getPassportID() {
        return passportID;
    }

    public String getTravelerAddress() {
        return travelerAddress;
    }

    public String getTravelerContact() {
        return travelerContact;
    }

    public int getTravelerMembershipID() {
        return travelerMembershipID;
    }

    public String getTravelerName() {
        return travelerName;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public void setTravelerAddress(String travelerAddress) {
        this.travelerAddress = travelerAddress;
    }

    public void setTravelerContact(String travelerContact) {
        this.travelerContact = travelerContact;
    }

    public void setTravelerMembershipID(int travelerMembershipID) {
        this.travelerMembershipID = travelerMembershipID;
    }

    public void setTravelerName(String travelerName) {
        this.travelerName = travelerName;
    }

    public Traveler(int travelerMembershipID, String passportID, String travelerName, String travelerAddress, String travelerContact) {
        this.travelerMembershipID = travelerMembershipID;
        this.passportID = passportID;
        this.travelerName = travelerName;
        this.travelerAddress = travelerAddress;
        this.travelerContact = travelerContact;
        this.milesTravelled = 0;
        
        
    }

    public String toString()
    {

    return  "travelerMembershipID:   "+ travelerMembershipID+"\n"+"passportID:  "+passportID+"\n"+"Name:  "+travelerName+"\n"+"Address:  "+travelerAddress+"\n"+"Contact:  "+ travelerContact+"\n"+"milesTravelled:  "+milesTravelled;

    }
    
  
    
}
