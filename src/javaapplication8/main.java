/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import DBLayer.Singleton;
//import DBLayer.TravlerHandler;
import GUI.MainFrame;



/**
 *
 * @author Asad
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
        /*
        Flight flight = new Flight(1234);
        
        
        
        FlightDescription obj = new FlightDescription(flight.getFlightNumber(),"28","12:00","2:00","Karachi",1,"Islamabad","PIA",10,20000);
        
        TravelAgency travelAgency = new TravelAgency();
        
        travelAgency.addFlightDescription(obj);
        
        travelAgency.obtainMembership("2352525","asad" , "house", "03332423");
        travelAgency.displayTravlerList();
        
        //travelAgency.displaySchedule();
        
        Bank bank = new Bank();
        //bank.showList();
        
        //TravelAgency travelAgency = new TravelAgency();
        
        
        MainmenuFrame mainMenuframe = new MainmenuFrame(travelAgency);
        //try {
    	//	mainMenuframe.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("C:\\Users\\Asad\\Desktop\\1474016_324265454381343_878165314_n.jpg")))));
    	//} catch (IOException e) {
    	//	e.printStackTrace();
    	//}
    	//mainMenuframe.pack();
    	mainMenuframe.setVisible(true);
        //mainMenuframe.setVisible(true);
        
        */



        
        // TODO code application logic here
           TravelAgency travelAgency = new TravelAgency();

     
        MainFrame mainfram=new MainFrame(travelAgency);
        mainfram.setVisible(true);







    }
}
