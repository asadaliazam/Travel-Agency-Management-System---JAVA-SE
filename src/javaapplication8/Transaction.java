/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import DBLayer.TransectionHandler;
import java.util.List;

/**
 *
 * @author Asad
 */
public class Transaction 
{  
    private int transactionID;
    private double amount;
    private int travelerMembershipID;
    private int flightNumber;
    private TransectionHandler transectionHandler;

    public Transaction() {
        transectionHandler=new TransectionHandler();
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }
    

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transaction(double amount) {
        this.amount = amount;
    }

    public Transaction(double amount, int travelerMembershipID, int flightNumber) {
        
        this.amount = amount;
        this.travelerMembershipID = travelerMembershipID;
        this.flightNumber = flightNumber;
        this.transactionID = 2000 + (int)(Math.random()*1200);
        transectionHandler=new TransectionHandler();
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    

    public int getTravelerMembershipID() {
        return travelerMembershipID;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    

    public void setTravelerMembershipID(int travelerMembershipID) {
        this.travelerMembershipID = travelerMembershipID;
    }
    
    @Override
    public String toString()
    {
        return "Transaction ID -"+transactionID+"\n"+"Amount Paid -"+ amount+"\n"+"Traveler Membership ID - "+travelerMembershipID+"\n";
    }
    public List<Transaction> gettransectionList()
    {
    
    return transectionHandler.getTtansactionList();
    
    }
}
