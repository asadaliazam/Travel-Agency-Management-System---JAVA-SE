/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danial
 */
public class Manager {

    //private Staff staff;
   

   private TravelAgencyOffice travelAgencyOffice;
    private String userName;
    private String password;

    public Manager()
    {
    }

    public Manager(String userName, String password) {
        this.userName = userName;
        this.password = password;
      //  staff=new Staff();
       // staffList=staff.loadStaffList();
        travelAgencyOffice=new TravelAgencyOffice();
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

/////////////staffManager//////////////////////////
    public boolean Authentication(String username, String password) {
        if (username.equalsIgnoreCase(this.userName) && password.equalsIgnoreCase(this.password)) {
            return true;
        } else {
            return false;
        }



    }

    public void addstafflist(String name, String post,String contact,String address) {

        
        travelAgencyOffice.addstaff(name, post,contact,address);

    }

    public List<Staff> getStaffList() {
        return travelAgencyOffice.getStafflisttoOffice();
        
    }

    public Staff serching(int id) {

        return travelAgencyOffice.searchstaff(id);
       
    }

    public void deletStaffFrmList(int id) {
        
      
                travelAgencyOffice.deletestafftoOffice(id);
               

               
            

        
       
    }
}

