/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication8;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Danial
 */
public class DbConnection {


   public static Connection connect()
   {
    try
    {
        
        Class.forName("oracle.jdbc.OracleDriver");
        String connString  = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "Asad";
        String password = "asad";
        Connection conn=DriverManager.getConnection(connString, username, password);
        
        return conn;
    }
    catch(Exception E)
    {
        E.printStackTrace();
        return null;
    }
  }









}
