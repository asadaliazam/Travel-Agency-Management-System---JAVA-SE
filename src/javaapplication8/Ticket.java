/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

//import DBLayer.TicketHandler;
import java.util.List;

/**
 *
 * @author Asad
 */
public class Ticket {

    private int ticketNumber;
    private String issueDate;
    private int flightNumber;

    public Ticket() {
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public Ticket(String issueDate, int flightNumber) {
        this.issueDate = issueDate;
        this.flightNumber = flightNumber;
        this.ticketNumber = 4000 + (int) (Math.random() * 1200);

    }
}
