/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

//import GUI.Booking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javaapplication8.DbConnection;
import javaapplication8.Booking;
import javaapplication8.FlightDescription;
import javaapplication8.Ticket;
import javaapplication8.Traveler;

/**
 *
 * @author Asad
 */
public class RegisterDBHandler 
{
    public boolean addBookingToDatabase (Booking obj)
    {
        try
        {
            


        Connection conn = DbConnection.connect();
        String sql = "INSERT INTO ASAD.BOOKING VALUES (?,?,?,?)";
        PreparedStatement prepSt = conn.prepareStatement(sql);

        
        prepSt.setInt(1, obj.getBookingID());
        prepSt.setInt(2, obj.getFlightID());
        prepSt.setInt(3, obj.getMembershipID());
        prepSt.setInt(4, obj.getTransactionID());
        
        

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

        
        public List<Booking> getBookingList()
    {
        try
        {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.BOOKING";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            List <Booking> bookingList = new ArrayList<Booking>();
            while(rs.next())
                    {
                        Booking booking = new Booking();
                     
                        booking.setBookingID(rs.getInt("BOOKINGID"));
                       
                        booking.setMembershipID(rs.getInt("MEMBERSHIPID"));
                         booking.setFlightID(rs.getInt("FLIGHTNUMBER"));
                         booking.setTransactionID(rs.getInt("TRANSACTIONID"));
                         
                        bookingList.add(booking);
                        
                    }
            return bookingList;
            
        }
            
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
        
        public boolean addTicketToDatabase (Ticket obj)
    {
        try
        {
            


        Connection conn = DbConnection.connect();
        String sql = "INSERT INTO ASAD.TICKET VALUES (?,?,?)";
        PreparedStatement prepSt = conn.prepareStatement(sql);

        prepSt.setString(1, obj.getIssueDate());
    
        prepSt.setInt(2, obj.getFlightNumber());
        prepSt.setInt(3, obj.getTicketNumber());
        
        
        

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

        
        public List<Ticket> getTicketList()
    {
        try
        {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.TICKET";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            List <Ticket> ticketList = new ArrayList<Ticket>();
            while(rs.next())
                    {
                        Ticket ticket = new Ticket();
                     
                        ticket.setIssueDate(rs.getString("ISSUEDATE"));
                        
                        ticket.setTicketNumber(rs.getInt("TICKETNUMBER"));
                         ticket.setFlightNumber(rs.getInt("FLIGHTNUMBER"));
                        ticketList.add(ticket);
                        
                    }
            return ticketList;
            
        }
            
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }
    
    
    public boolean addTravelerToDatabase (Traveler obj)
    {
        try
        {
            


        Connection conn = DbConnection.connect();
        String sql = "INSERT INTO ASAD.TRAVELER VALUES (?,?,?,?,?,?)";
        PreparedStatement prepSt = conn.prepareStatement(sql);

        prepSt.setString(1, obj.getPassportID());
        prepSt.setInt(2, obj.getTravelerMembershipID());
        prepSt.setString(3, obj.getTravelerName());
        prepSt.setString(4, obj.getTravelerAddress());
        prepSt.setString(5, obj.getTravelerContact());
        prepSt.setInt(6, obj.getMilesTravelled());
        
        

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


     public List<Traveler> loadTravlerList()
    {
        try
        {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.TRAVELER";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            List <Traveler> travelerList = new ArrayList<Traveler>();
            while(rs.next())
                    {
                        Traveler traveler = new Traveler();


                        traveler.setPassportID(rs.getString("PASSPORTNUMBER"));
                        traveler.setTravelerMembershipID(rs.getInt("MEMBERSHIPID"));
                        traveler.setTravelerName(rs.getString("NAME"));
                        traveler.setTravelerAddress(rs.getString("ADDRESS"));
                        traveler.setTravelerContact(rs.getString("CONTACTNUMBER"));
                        traveler.setMilesTravelled(rs.getInt("MILESTRAVELLED"));

                        travelerList.add(traveler);

                    }
            return travelerList;

        }

            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
        }

    
     
     
    public List<FlightDescription> getFlightDescriptionList()
    {
        try
        {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.FLIGHTDESCRIPTION";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            List <FlightDescription> flightDescriptionist = new ArrayList<FlightDescription>();
            while(rs.next())
                    {
                        FlightDescription flightDescription = new FlightDescription();
                        
                        flightDescription.setFlightNumber(rs.getInt("FLIGHTNUMBER"));
                        flightDescription.setDepartureDate(rs.getString("DEPARTUREDATE"));
                        flightDescription.setDepartureTime(rs.getString("DEPARTURETIME"));
                        flightDescription.setArrivalTime(rs.getString("ARRIVALTIME"));
                        flightDescription.setDestination(rs.getString("DESTINATION"));
                        flightDescription.setNoOfStopovers(rs.getInt("STOPOVERS"));
                        flightDescription.setOrigin(rs.getString("ORIGIN"));
                        flightDescription.setAirLineCompanyName(rs.getString("AIRLINECOMPANYNAME"));
                        flightDescription.setSeats(rs.getInt("AVAILABLESEATS"));
                        flightDescription.setFare(rs.getInt("FARE"));
                        flightDescriptionist.add(flightDescription);
                        
                    }
            return flightDescriptionist;
            
        }
            
            catch(Exception e)
            {
                e.printStackTrace();
                return null;
            }
    }
    
    
    
    public boolean updateFlightDescriptionInDatabase (FlightDescription obj)
    {
        try
        {

        Connection conn = DbConnection.connect();
        String sql = "UPDATE ASAD.FLIGHTDESCRIPTION SET AVAILABLESEATS="+(obj.getSeats()-1)+" WHERE FLIGHTNUMBER="+obj.getFlightNumber()+"";
        PreparedStatement prepSt = conn.prepareStatement(sql);




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
     }

     




    
