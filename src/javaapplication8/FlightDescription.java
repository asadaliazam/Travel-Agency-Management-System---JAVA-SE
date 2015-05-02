/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

//import DBLayer.FlightDescriptionHandler;
import java.util.List;

/**
 *
 * @author Asad
 */
public class FlightDescription 
{
    private int flightNumber;
    private String departureDate;
    private String departureTime;
    private String arrivalTime;
    private String destination;
    private int noOfStopovers;
    private String Origin;
    private String airLineCompanyName;
    private int seats;
    private int fare;
    
    

    public FlightDescription() 
    {
        
        
    }
        
    
    

    

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
    

    public int getSeats() {
        return seats;
    }
    

    public FlightDescription(int flightNumber, String departureDate, String departureTime, String arrivalTime, String destination, int noOfStopovers, String Origin, String airLineCompanyName, int seats, int fare) {
        this.flightNumber = flightNumber;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.destination = destination;
        this.noOfStopovers = noOfStopovers;
        this.Origin = Origin;
        this.airLineCompanyName = airLineCompanyName;
        this.seats = seats;
        this.fare = fare;
        
    }

    public void setAirLineCompanyName(String airLineCompanyName) {
        this.airLineCompanyName = airLineCompanyName;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirLineCompanyName() {
        return airLineCompanyName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return Origin;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNoOfStopovers() {
        return noOfStopovers;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNoOfStopovers(int noOfStopovers) {
        this.noOfStopovers = noOfStopovers;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
    
    
    
    @Override
    public String toString()
    {
        return "Flight Number - "+flightNumber+"\n"+"Departure Date -"+departureDate+"\n"+"Departure Time -"+ departureTime+"\n"+"Arrival Time -"+arrivalTime+"\n"+"Destination - "+destination+"\n"+"No of Stopovers"+ noOfStopovers+"\n"+"Origin  - "+ Origin+"\n"+ "Airline Company - "+airLineCompanyName+"\n"+"Seat Number - "+ seats+"\n"+"Fare - "+ fare;
    }
    
    public String toStringForReceipt()
    {
        return "Flight Number - "+flightNumber+"\n"+"Airline Company - "+airLineCompanyName+"\n"+"Seat Number - "+ seats+"\n"+"Fare - "+ fare;
    }
    
}
