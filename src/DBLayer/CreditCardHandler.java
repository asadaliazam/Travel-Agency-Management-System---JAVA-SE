/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javaapplication8.CreditCard;

import javaapplication8.DbConnection;

/**
 *
 * @author Asad
 */
public class CreditCardHandler 
{
    public List<CreditCard> getCraditCardList()
    {
        try
        {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.CREDITCARD";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            List <CreditCard> creditCardList = new ArrayList<CreditCard>();
            while(rs.next())
                    {
                        CreditCard creditCard = new CreditCard();
                        
                        
                        creditCard.setCreditCardNumber(rs.getString("CREDITCARDNUMBER"));
                      
                        creditCardList.add(creditCard);
                        
                    }
            return creditCardList;
            
        }
            
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
    
}
