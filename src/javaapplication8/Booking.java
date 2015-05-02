/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

//import DBLayer.BookingHandler;
import java.util.List;

/**
 *
 * @author Asad
 */
public class Booking 
{
    private int bookingID;
    private int flightID;
    private int membershipID;
    private int transactionID;
    

    public Booking() {
        
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public void setMembershipID(int membershipID) {
        this.membershipID = membershipID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public Booking(int flightID, int membershipID, int transactionID) {
        this.flightID = flightID;
        this.membershipID = membershipID;
        this.transactionID = transactionID;
        this.bookingID = 3000 + (int)(Math.random()*1200);
        
    }

    public int getBookingID() {
        return bookingID;
    }

    public int getFlightID() {
        return flightID;
    }

    public int getMembershipID() {
        return membershipID;
    }

    public int getTransactionID() {
        return transactionID;
    }
    
    
    
    
}

