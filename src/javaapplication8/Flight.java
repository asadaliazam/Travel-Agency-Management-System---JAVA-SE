/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Asad
 */
public class Flight 
{
    private int flightNumber;
    FlightDescription obj;
    //DBHandler dbHandlerObject;

    public Flight(int flightNumber) 
    {
        this.flightNumber = flightNumber;
    }

    Flight() 
    {
    //dbHandlerObject = new DBHandler();    
    }
    

    public int getFlightNumber() {
        return flightNumber;
    }

    public FlightDescription getObj() {
        return obj;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setObj(FlightDescription obj) {
        this.obj = obj;
    }
    
    public void hod()
    {
        String xyz;
        xyz = obj.getAirLineCompanyName();
        
        System.out.println(xyz);
    }
    
    /*public String displayFlightDatabase(String date)
    {
    
        String disp = dbHandlerObject.displayFlightDatabase(date);
        return disp;
    }*/
    
}
