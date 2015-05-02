/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asad
 */
public class AccountOffice 
{
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Asad
 */

    private double totalBalance = 0.0;
   


    private List<Transaction> transactionList = new ArrayList<Transaction>();
    private Transaction transaction;

    public AccountOffice() {
        transaction=new Transaction();
      transactionList= transaction.gettransectionList();
        
    }
    
    
    public int addToTransactionList(int membershipID , int flightID,double amount)
    {
        Transaction newTransaction = new Transaction(amount, membershipID,flightID);
        transactionList.add(newTransaction);
        totalBalance = totalBalance + newTransaction.getAmount();
        //DB

        return newTransaction.getTransactionID();
    }
    public Transaction searchTransectionById(int transactionID)
    {
        for (int i =0 ; i<transactionList.size() ; i++)
            
        {
            if ((transactionID==transactionList.get(i).getTransactionID()))
            {
                return transactionList.get(i);
                
            }
        }
        return null;
    }
}
    
