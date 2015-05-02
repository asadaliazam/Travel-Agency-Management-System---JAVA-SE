/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaapplication8.DbConnection;

import javaapplication8.Transaction;

/**
 *
 * @author Asad
 */
public class TransectionHandler {
     public boolean addTransectionToDatabase (Transaction obj)
    {
        try
        {
            


        Connection conn = DbConnection.connect();
        String sql = "INSERT INTO ASAD.TRANSACTIONTABLE VALUES (?,?,?,?)";
        PreparedStatement prepSt = conn.prepareStatement(sql);

        prepSt.setInt(1, obj.getTransactionID());
        prepSt.setDouble(2, obj.getAmount());
        prepSt.setInt(3, obj.getTravelerMembershipID());
        prepSt.setInt(4, obj.getFlightNumber());
        
        

        int result = prepSt.executeUpdate();

        if (result > 0)
        {
            return true;

        }

        else
        {
            return false;
        }


        }

        catch (Exception E)
        {
            E.printStackTrace();
            return false;
        }
    }

        
        public List<Transaction> getTtansactionList()
    {
        try
        {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.TRANSACTIONTABLE";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            List <Transaction> transactionList = new ArrayList<Transaction>();
            while(rs.next())
                    {
                        Transaction transaction = new Transaction();
                     
                        transaction.setTransactionID(rs.getInt("TRANSACTIONID"));
                        transaction.setAmount(rs.getDouble("AMOUNT"));
                        transaction.setTravelerMembershipID(rs.getInt("TRAVELERMEMBERSHIPID"));
                        transaction.setFlightNumber(rs.getInt("FLIGHTNUMBER"));
                        transactionList.add(transaction);
                        
                    }
            return transactionList;
            
        }
            
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
    
}
