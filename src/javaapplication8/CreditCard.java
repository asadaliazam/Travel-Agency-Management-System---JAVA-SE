/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import DBLayer.CreditCardHandler;
import java.util.List;

/**
 *
 * @author Asad
 */
public class CreditCard 
{
    private String creditCardNumber;
    private CreditCardHandler creditCardHandler;
    

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public CreditCard() {
        creditCardHandler=new CreditCardHandler();
        
    }
    

    public CreditCard(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    public List<CreditCard> getCredirCardList()
    {
    
    return  creditCardHandler.getCraditCardList();
    }
}
