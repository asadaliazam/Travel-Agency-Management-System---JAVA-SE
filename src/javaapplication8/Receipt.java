/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import DBLayer.ReceiptHandler;
import java.util.List;

/**
 *
 * @author Asad
 */
public class Receipt 
{
    private int bookingID;
    private int transactionID;
    private ReceiptHandler     receiptHandler ;


    public Receipt() {
        
            receiptHandler=new ReceiptHandler(); 

    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public Receipt(int bookingID, int transactionID) {
        this.bookingID = bookingID;
        this.transactionID = transactionID;
        receiptHandler=new ReceiptHandler(); 
    }
    
    
    public List<Receipt> getrceiptlist()
    {
    
    return receiptHandler.getReceiptList();
    
    
    }
    
      
}
