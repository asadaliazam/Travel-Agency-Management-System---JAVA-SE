/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DBLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javaapplication8.DbConnection;
import javaapplication8.Staff;

/**
 *
 * @author Danial
 */
public class StaffHandler {

    public  boolean addstafftoDatabase(Staff obj) {

        try {



            Connection conn = DbConnection.connect();
            String sql = "INSERT INTO ASAD.STAFF VALUES (?,?,?,?,?)";
            PreparedStatement prepSt = conn.prepareStatement(sql);

            prepSt.setInt(1, obj.getStaffID());
            prepSt.setString(2, obj.getName());
            prepSt.setString(3, obj.getPost());
            prepSt.setString(4, obj.getContact());
            prepSt.setString(5, obj.getAddress());




            int result = prepSt.executeUpdate();

            if (result > 0) {
                return true;

            } else {
                return false;
            }


        } catch (Exception E) {
            E.printStackTrace();
            return false;
        }

    }

    public  boolean deleteStaffFromDB(int id) {

        try {

            Connection conn = DbConnection.connect();
            String sql = "DELETE FROM ASAD.STAFF WHERE STAFFID=" + id + "";

            PreparedStatement prepSt = conn.prepareCall(sql);


            int result = prepSt.executeUpdate();
            if (result > 0) {

                return true;

            } else {
                return false;

            }




        } catch (Exception E) {
            E.printStackTrace();
            return false;
        }

    }

    public  String searchStaffFROMDatabase(int id) {
        try {


            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.STAFF WHERE STAFFID = " + id + "";


            PreparedStatement prepSt = conn.prepareStatement(sql);



            java.sql.Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            String p = "NULL";

            while (rs.next()) {

                String name = rs.getString("NAME");
                String staffid = rs.getString("STAFFID");
                String post = rs.getString("POST");
                String cont = rs.getString("contact");
                String addres = rs.getString("ADDRESS");




                p = name + "\t" + staffid + "\t" + post+"\t"+cont+"\t"+addres;
                //System.out.println(p);

            }

            return p;

        } catch (Exception E) {
            E.printStackTrace();
            return "not found";

        }


    }

    public  List<Staff> getStaffList() {
        try {
            Connection conn = DbConnection.connect();
            String sql = "SELECT * FROM ASAD.STAFF";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<Staff> staffList = new ArrayList<Staff>();
            while (rs.next()) {
                Staff newStaff = new Staff();
                newStaff.setName(rs.getString("NAME"));
                newStaff.setStaffID(rs.getInt("STAFFID"));
                newStaff.setPost(rs.getString("POST"));
                newStaff.setContact(rs.getString("CONTACT"));
                newStaff.setAddress(rs.getString("ADDRESS"));
                staffList.add(newStaff);
            }
            return staffList;
        } catch (SQLException ex) {
            Logger.getLogger(StaffHandler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }
}
