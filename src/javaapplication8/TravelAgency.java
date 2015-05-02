/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Asad
 */
public class TravelAgency 
{
    
  
    
   private Register register;
    private AccountOffice accountOffice;
    
    private ReceiptRecord receiptRecord;
    private Bank bank;
   /////////////////////////
   private TravelAgencyOffice travelAgencyOffice;
    Manager manager = new Manager("danial", "1234");
    boolean status;
    private FlightStatus   flightStatus;
  
    private List<FlightStatus> flightStatusList = new ArrayList<FlightStatus>();
   
    public TravelAgency() 
    {
         register=new Register();
        accountOffice = new AccountOffice();
   //     bookingRecord = new BookingRecord();
     //   ticketList = new TicketList();
        receiptRecord = new ReceiptRecord();
        bank = new Bank();
        ///////////////////////////////////////////////

            flightStatus=new FlightStatus();
   // flightDescription =new FlightDescription ();
    flightStatusList=flightStatus.loadFlightStatusList();
  //  flightDescriptionList=flightDescription.loadFLightDesriptionList();
    travelAgencyOffice =new TravelAgencyOffice();
       //    travelerRecord =new TravelerRecord();



    }
    
 
    public void getInfoForReceipt(int bookingID, int transactionID,int flightNumber)
    {
        Receipt newReceipt = new Receipt(bookingID, transactionID);
        receiptRecord.addToReceiptList(newReceipt);
        
        
        //FlightDescription tempObj=searchFlightDescriptionByFlightNumber(flightNumber);
       // flightDescription.getFlightToUpdateSeats(tempObj);
        
    }
    
    public String getTicketInfo(int flightNumber)
    {
        FlightDescription tempObj=register.searchFlightDescriptionByFlightNumber(flightNumber);
        
        //return tempObject;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String currentDate =dateFormat.format(date);

        
        register.addToTicketList(currentDate, flightNumber);
        
        String s =  tempObj.toString();
       
        return s;
    }
    
    public boolean authenticateCreditCardNumber(String creditCardNumber)
    {
        return bank.authenticateCreditCardNumber(creditCardNumber);
    }
    
    public String getTicketInfoForReceipt(int flightNumber)
    {
        FlightDescription tempObj=searchFlightDescriptionByFlightNumber(flightNumber);
        
        //return tempObject;
        
        String s =  tempObj.toStringForReceipt();
        //System.out.println(s);
        return s;
    }
    
    public String getTransactionInfo(int transactionID)
    {
        Transaction tempObj = accountOffice.searchTransectionById(transactionID);
        
        
        
        return tempObj.toString();
        
    
    }
    
    public int getBookingInfo(int travelerMembershipID, int flightNumber, int transactionID )
    {
        
        
        int bookingId= register.addToBookingList(flightNumber, travelerMembershipID, transactionID);

         FlightDescription tempObj=searchFlightDescriptionByFlightNumber(flightNumber);
          register.getFlightToUpdateSeats(tempObj);
        return bookingId;

    }
    
    
    
  




   public boolean checkSeatAvailibility(int flightNumber)
    {
        FlightDescription tempObj = searchFlightDescriptionByFlightNumber(flightNumber);
        if (tempObj.getSeats()>0)
        {
            return true;
        }
        return false;
    }


    public List<FlightDescription> searchFlightDescription(String depdate, String dest, String airline)
    {
       return register.searchFlightDescription(depdate, dest, airline);
    }

    
    public FlightDescription searchFlightDescriptionByFlightNumber(int flightNumber)
    {
       return register.searchFlightDescriptionByFlightNumber(flightNumber);
    }
    

    
    public int updateAccounts(int membershipID , int flightID)
    {
        double amount=0.0;
    

    FlightDescription tempobj=    register.searchFlightDescriptionByFlightNumber(flightID);
    amount=tempobj.getFare();
    return accountOffice.addToTransactionList(membershipID,flightID,amount);
        
        //return newTransaction.getTransactionID();
        
    }

    //////////////////other use caes/////////////////



////////////FlightStatus////////////////////////////

    public FlightStatus checkflightStatus(int id) {


        for(int i=0;i<flightStatusList.size();i++)
        {
           if(id==flightStatusList.get(i).getFlightNumber())
         {
             //flightStatusList.get(i).getFlightStatustodatabase(id);
              return flightStatusList.get(i);

        }
        }
        return null;
    }

        //////////////searchflightdiscription/////////
 //     public  FlightDescription searchFlight(String date)
   // {

     // return register.searchFlightDescription(date);
    //}



///////////////////////Staffmanagement/////////////////////
    public boolean managerAuthenticate(String name, String passwrd) {

        status = manager.Authentication(name, passwrd);

        return status;

    }

    public void addStaff(String name, String post,String contact,String address) {



        manager.addstafflist(name,post,contact,address);

    }

    public void deleteStaff(int staffid) {

        manager.deletStaffFrmList(staffid);

    }

    public String serchstaff(int staffid) {

        Staff staff = manager.serching(staffid);

        if(staff!=null)
            return staff.toString();
        else
            return "null";

    }

    public List<Staff> getStafflist() {



       return manager.getStaffList();


    }


      ///////////////membership/////////////////////////////////////////
public int  obtainmemberShip(String passportID, String travelerName, String travelerAddress, String travelerContact)
{
   return register.obtainMembership(passportID, travelerName, travelerAddress, travelerContact);

}
    
public Traveler getMemeber(int id)
{

return  register.getMember(id);

}

public boolean authenticateMembershipID(int id)
{
 return register.authenticateMembershipID(id);

}
    
}
