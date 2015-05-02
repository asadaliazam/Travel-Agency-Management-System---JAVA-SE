/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication8;


import DBLayer.StaffHandler;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danial
 */
public class TravelAgencyOffice {

    private Staff staff;
    private List<Staff> staffList = new ArrayList<Staff>();
    private StaffHandler   dbHandlertravelAgency;


    public TravelAgencyOffice()
    {

      dbHandlertravelAgency= new StaffHandler();
      staffList=dbHandlertravelAgency.getStaffList();

    }

    public void loadstaffList()
    {
       
    }


    

    public void addstaff(String name, String post,String contact,String address)
    {
          staff=new Staff(name,post,contact,address);
          staffList.add(staff);
          dbHandlertravelAgency.addstafftoDatabase(staff);

     }
    
        public void deletestafftoOffice(int staffid)
    {
     
     for (int i = 0; i < staffList.size(); i++) {
            if (staffid == staffList.get(i).getStaffID()) {
             //   Staff temp = staffList.get(i);
                staffList.remove(i);
                dbHandlertravelAgency.deleteStaffFromDB(staffid);

                break;
            }

        }


    }
public Staff searchstaff(int staffid)
{

    for (int i = 0; i < staffList.size(); i++) {
            if (staffid == staffList.get(i).getStaffID()) {
                return staffList.get(i);
            }
        }
        return null;

}

    public List<Staff> getStafflisttoOffice()
    {
        
      return staffList;

    }




}
