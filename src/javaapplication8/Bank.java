/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import DBLayer.CreditCardHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asad
 */
public class Bank 
{
    private List<CreditCard> creditCardList = new ArrayList<CreditCard>();
    private CreditCardHandler creditCardHandler;
    public Bank() 
    {      
        creditCardHandler=new CreditCardHandler();
        creditCardList  = creditCardHandler.getCraditCardList();
    }
    
    public boolean authenticateCreditCardNumber(String creditCardNumber)
    {
        for (int i =0 ; i<creditCardList.size() ; i++)
        {
            if (creditCardList.get(i).getCreditCardNumber().equalsIgnoreCase(creditCardNumber))
            {
                
                return true;
            }
            else
            {
                return false;
            }
            
        }
        return false;
    }
    
    public void showList()
    {
        System.out.println("OOOOo");
        for (int i=0 ;i <creditCardList.size() ; i++)
        {
            System.out.println(creditCardList.get(i).getCreditCardNumber());
        }
    }
    
}
