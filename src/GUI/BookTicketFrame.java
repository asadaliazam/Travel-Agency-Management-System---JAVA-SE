/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BookTicketFrame.java
 *
 * Created on Nov 22, 2013, 9:47:10 PM
 */
package GUI;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javaapplication8.FlightDescription;
import javaapplication8.TravelAgency;

/**
 *
 * @author Asad
 */
public class BookTicketFrame extends javax.swing.JFrame {
    TravelAgency travelAgency;
    int membershipID;

    /** Creates new form BookTicketFrame */
    public BookTicketFrame() {
        initComponents();
    }
     public BookTicketFrame(TravelAgency travelAgency, int membershipiD) {
        initComponents();
        this.travelAgency = travelAgency;
        this.membershipID = membershipiD;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        airlineCombobox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        destinationCombobox = new javax.swing.JComboBox();
        searchButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        flightCombobox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Enter Date Of Departure");

        airlineCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PIA", "Airblue", "Shaheen", "Fast", "Any" }));
        airlineCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlineComboboxActionPerformed(evt);
            }
        });

        jLabel2.setText("AirLine Company");

        showTextArea.setColumns(20);
        showTextArea.setRows(5);
        jScrollPane1.setViewportView(showTextArea);

        jLabel3.setText("Destination");

        destinationCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Karachi", "London", "Lahore", "Delhi", "NewYork" }));
        destinationCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationComboboxActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("FlightNumber");

        jLabel5.setText("ArrivalTime");

        jLabel6.setText("Departure Date");

        jLabel7.setText("DepartureTime");

        jLabel9.setText("Available Seats");

        jLabel10.setText("Stopovers");

        bookButton.setText("Book");
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });

        flightCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightComboboxActionPerformed(evt);
            }
        });

        jLabel11.setText("Select Your Desired Flight From List");

        jLabel12.setText("Fare");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destinationCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(airlineCombobox, 0, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addGap(33, 33, 33)
                        .addComponent(flightCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(113, 113, 113))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(destinationCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(airlineCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(searchButton)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookButton)
                    .addComponent(flightCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void airlineComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlineComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlineComboboxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        showTextArea.setText("");
        Date dateFromDateChooser = jDateChooser1.getDate();
        String dateString = String.format("%1$td-%1$tm-%1$tY", dateFromDateChooser);
        
        //String date = dateField.getText();
        String destination = (String) destinationCombobox.getSelectedItem();
        String airline = (String) airlineCombobox.getSelectedItem();
        
        //System.out.println(date);
        //System.out.println(destination);
        //System.out.println(airline);
        List <FlightDescription> showList = new ArrayList<FlightDescription>();
        showList = travelAgency.searchFlightDescription(dateString, destination, airline);
        showTextArea.setText("");
        
        for (int i = 0 ; i <showList.size(); i++)
        {
            showTextArea.append(String.valueOf(showList.get(i).getFlightNumber()));
            showTextArea.append("                     ");
            showTextArea.append(showList.get(i).getDepartureDate());
            showTextArea.append("                     ");
            showTextArea.append(showList.get(i).getDepartureTime());
            showTextArea.append("                     ");
            showTextArea.append(showList.get(i).getArrivalTime());
            showTextArea.append("                     ");
            showTextArea.append(String.valueOf(showList.get(i).getNoOfStopovers()));
            showTextArea.append("                     ");
            showTextArea.append(String.valueOf(showList.get(i).getSeats()));
            showTextArea.append("                     ");
            showTextArea.append(String.valueOf(showList.get(i).getFare()));
            
            
            
            showTextArea.append("\n");
            
            flightCombobox.addItem(showList.get(i).getFlightNumber());
        }
        //showTextArea.setText("");
    
    }//GEN-LAST:event_searchButtonActionPerformed

    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        
        
        String stringflightNumber = String.valueOf(flightCombobox.getSelectedItem());
        
        int flightNumber = Integer.parseInt(stringflightNumber);
        
        boolean a = travelAgency.checkSeatAvailibility(flightNumber);
        if (a == true)
            
        {
        PaymentForm paymentForm =new PaymentForm(travelAgency, flightNumber,membershipID);
        paymentForm.setVisible(true);
        }
        else if (a==false)
        {
        }
        
    }//GEN-LAST:event_bookButtonActionPerformed

    private void destinationComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationComboboxActionPerformed

    private void flightComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightComboboxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BookTicketFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox airlineCombobox;
    private javax.swing.JButton bookButton;
    private javax.swing.JComboBox destinationCombobox;
    private javax.swing.JComboBox flightCombobox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextArea showTextArea;
    // End of variables declaration//GEN-END:variables
}