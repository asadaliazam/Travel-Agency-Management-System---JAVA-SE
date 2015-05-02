/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;


import DBLayer.FlightStatusHandler;
import java.util.List;

/**
 *
 * @author Asad
 */
public class FlightStatus 
{
    private int flightNumber;
    private String departureTime;
    private String arrivalTime;
    private String status;
     private FlightStatusHandler   dbHandlerflightstatus;
   public FlightStatus()
   {
       dbHandlerflightstatus =new FlightStatusHandler();
   }
    public String getArrivalTime() {
        return arrivalTime;
    }

    public FlightStatus(int flightNumber, String departureTime, String arrivalTime, String status) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.status = status;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getFlightStatustodatabase(int staffid)
    {
      return dbHandlerflightstatus.displayFlightDatabase(staffid);
    }

    public List<FlightStatus> loadFlightStatusList()
    {

     return  dbHandlerflightstatus.getFlightStatusList();

    }

    public String toString()
    {
     return flightNumber+"\t"+departureTime+"\t"+arrivalTime+"\t"+status;

    }
    
    
    
}
