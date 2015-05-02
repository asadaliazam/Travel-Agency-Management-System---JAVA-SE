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
import javaapplication8.Receipt;
//import javaapplication8.Transaction;

/**
 *
 * @author Asad
 */
public class ReceiptHandler {
      public boolean addREACEIPTToDatabase ( Receipt obj)
    {
        try
        {
            


        Connection conn = DbConnection.connect();
        String sql = "INSERT INTO APP.RECEIPT VALUES (?,?)";
        PreparedStatement prepSt = conn.prepareStatement(sql);
          prepSt.setInt(1, obj.getTransactionID());
        prepSt.setInt(2, obj.getBookingID());
        
      
        
        

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

       
        
        public List<Receipt> getReceiptList()
    {
        try
        {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.RECEIPT";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            List <Receipt> receiptList = new ArrayList<Receipt>();
            while(rs.next())
                {
                        Receipt receipt = new Receipt();
                     
                        receipt.setTransactionID(rs.getInt("RECEIPTID"));
                        receipt.setBookingID(rs.getInt("BOOKINGID"));
                        receiptList.add(receipt);
                        
                 }
            return receiptList;
            
        }
            
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
    
}
