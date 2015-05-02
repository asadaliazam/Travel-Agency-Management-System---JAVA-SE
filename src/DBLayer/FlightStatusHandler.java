/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DBLayer;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javaapplication8.DbConnection;
import javaapplication8.FlightStatus;


/**
 *
 * @author Danial
 */
public class FlightStatusHandler {

 public  boolean addFlightStatustoDatabase(FlightStatus obj)
 {

     try
        {



        Connection conn = DbConnection.connect();
        String sql = "INSERT INTO APP.FLIGHTSTATUS VALUES (?,?,?,?)";
        PreparedStatement prepSt = conn.prepareStatement(sql);

        prepSt.setInt(1, obj.getFlightNumber());
        prepSt.setString(2, obj.getArrivalTime());
        prepSt.setString(3, obj.getDepartureTime());
        prepSt.setString(4, obj.getStatus());



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
    

        public  String displayFlightDatabase (int id)
    {
        try
        {


        Connection conn = DbConnection.connect();
        String sql = "SELECT * FROM APP.FLIGHTSTATUS WHERE FLIGHTNO = "+id+"";


        PreparedStatement prepSt = conn.prepareStatement(sql);

       

        java.sql.Statement stmt= conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        String p="NULL";

        while(rs.next())
        {

            String flightno = rs.getString("FLIGHTNO");
            String arrivaltime = rs.getString("ARRIVALTIME");
            String deptime = rs.getString("DEPARTURETIME");
            String status = rs.getString("FLIGHTSTATUS");



            p = flightno + "                              " + arrivaltime + "                              " + deptime + "                          " + status;
            

        }

        return p;

        }

        catch (Exception E)
        {
            E.printStackTrace();
            return "not found";
            //return false;
        }


    }

            public  List<FlightStatus> getFlightStatusList() {
        try {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.FLIGHTSTATUS";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<FlightStatus> FlightStatusList = new ArrayList<FlightStatus>();
            while (rs.next()) {
                FlightStatus newFlightStatus = new FlightStatus();
                newFlightStatus.setFlightNumber(rs.getInt("FLIGHTNUMBER"));
                newFlightStatus.setArrivalTime(rs.getString("ARRIVALTIME"));
                newFlightStatus.setDepartureTime(rs.getString("DEPARTURETIME"));
                newFlightStatus.setStatus(rs.getString("STATUS"));
                FlightStatusList.add(newFlightStatus);
            }
            return FlightStatusList;
        } catch (SQLException ex) {
            Logger.getLogger(StaffHandler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
 



    }







