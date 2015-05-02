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
public class Airline 
{
    private String Name;
    private List<Flight> flightList = new ArrayList <Flight>();
    
    public void addFlight(Flight obj)
    {
        
        flightList.add(obj);
        
    }

    
    
}
