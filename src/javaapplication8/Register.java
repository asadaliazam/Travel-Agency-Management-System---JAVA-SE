/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import DBLayer.RegisterDBHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asad
 */
public class Register {
    /*
     * To change this template, choose Tools | Templates
     * and open the template in the editor.
     */

    private List<Booking> bookingList = new ArrayList<Booking>();
    private List<Ticket> ticketList = new ArrayList<Ticket>();
    private List<Traveler> travelerList = new ArrayList<Traveler>();
    private List<FlightDescription> flightDescriptionList = new ArrayList<FlightDescription>();
    private RegisterDBHandler dbHandlerRegister;

    public Register() {

        dbHandlerRegister = new RegisterDBHandler();
        bookingList = dbHandlerRegister.getBookingList();
        ticketList = dbHandlerRegister.getTicketList();

        travelerList = dbHandlerRegister.loadTravlerList();
    }

    ////////////////////Booking
    public int addToBookingList(int travelerMembershipID, int flightNumber, int transactionID) {
        Booking newBooking = new Booking(flightNumber, travelerMembershipID, transactionID);
        bookingList.add(newBooking);
        dbHandlerRegister.addBookingToDatabase(newBooking);
        return newBooking.getBookingID();

    }
    ////////////////Ticket//////////

    public void addToTicketList(String currentDate, int flightNumber) {
        Ticket newticket = new Ticket(currentDate, flightNumber);
        ticketList.add(newticket);
        dbHandlerRegister.addTicketToDatabase(newticket);

    }
/////////////////////////Taveler//////////

    public Traveler getMember(int id) {
        for (int i = 0; i < travelerList.size(); i++) {
            if (id == travelerList.get(i).getTravelerMembershipID()) {
                return travelerList.get(i);
            }
        }
        return null;




    }

    public int obtainMembership(String passportID, String travelerName, String travelerAddress, String travelerContact) {


        int membershipid = 1000 + (int) (Math.random() * 1200);


        Traveler obj = new Traveler(membershipid, passportID, travelerName, travelerAddress, travelerContact);

        travelerList.add(obj);
        dbHandlerRegister.addTravelerToDatabase(obj);
        return membershipid;


    }

    public boolean authenticateMembershipID(int id) {
        for (int i = 0; i < travelerList.size(); i++) {
            if (id == travelerList.get(i).getTravelerMembershipID()) {
                return true;
            }
        }
        return false;

    }
///////////////////FlightDescription///////////////////////

    public void addFlightDescription(FlightDescription obj) {
        flightDescriptionList.add(obj);




    }

    public List<FlightDescription> searchFlightDescription(String depdate, String dest, String airline) {
        List<FlightDescription> templist = new ArrayList<FlightDescription>();
        for (int i = 0; i < flightDescriptionList.size(); i++) {
            if ((depdate.equalsIgnoreCase(flightDescriptionList.get(i).getDepartureDate()) && (dest.equalsIgnoreCase(flightDescriptionList.get(i).getDestination()) && (airline.equalsIgnoreCase(flightDescriptionList.get(i).getAirLineCompanyName()))))) {

                templist.add(flightDescriptionList.get(i));
            }
        }
        return templist;
    }

    public FlightDescription searchFlightDescriptionByFlightNumber(int flightNumber) {
        for (int i = 0; i < flightDescriptionList.size(); i++) {
            if ((flightNumber == flightDescriptionList.get(i).getFlightNumber())) {
                return flightDescriptionList.get(i);

            }
        }
        return null;
    }

    public void getFlightToUpdateSeats(FlightDescription obj) {
        dbHandlerRegister.updateFlightDescriptionInDatabase(obj);

    }
}
