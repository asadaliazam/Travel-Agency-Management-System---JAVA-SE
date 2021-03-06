/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Nov 20, 2013, 1:28:11 AM
 */

package GUI;

import javaapplication8.TravelAgency;



/**
 *
 * @author Danial
 */
public class MainFrame extends javax.swing.JFrame {
     private TravelAgency travelAgency;
    /** Creates new form MainFrame */
    public MainFrame(TravelAgency travelAgency) {
        this.travelAgency=travelAgency;
        initComponents();
    }

    private MainFrame() {
        initComponents();
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
        checkStatusButton = new javax.swing.JButton();
        manageStaffButton = new javax.swing.JButton();
        quitbutton = new javax.swing.JButton();
        searchflightbutton = new javax.swing.JButton();
        membershipbutton = new javax.swing.JButton();
        booking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TravelAgency");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("TravelAgency");

        checkStatusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkStatusButton.setForeground(new java.awt.Color(102, 102, 255));
        checkStatusButton.setText("CheckFlightStatus");
        checkStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStatusButtonActionPerformed(evt);
            }
        });

        manageStaffButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        manageStaffButton.setForeground(new java.awt.Color(102, 102, 255));
        manageStaffButton.setText("ManagStaff");
        manageStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStaffButtonActionPerformed(evt);
            }
        });

        quitbutton.setFont(new java.awt.Font("Tahoma", 1, 18));
        quitbutton.setForeground(new java.awt.Color(255, 51, 0));
        quitbutton.setText("Quit");
        quitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitbuttonActionPerformed(evt);
            }
        });

        searchflightbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchflightbutton.setForeground(new java.awt.Color(0, 102, 255));
        searchflightbutton.setText("SearchFlight");
        searchflightbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchflightbuttonActionPerformed(evt);
            }
        });

        membershipbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        membershipbutton.setForeground(new java.awt.Color(51, 102, 255));
        membershipbutton.setText("Membership");
        membershipbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipbuttonActionPerformed(evt);
            }
        });

        booking.setFont(new java.awt.Font("Tahoma", 1, 18));
        booking.setForeground(new java.awt.Color(0, 102, 255));
        booking.setText("Book Seat");
        booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(booking, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(121, 121, 121)
                .addComponent(manageStaffButton, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(313, Short.MAX_VALUE)
                .addComponent(quitbutton)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel1)
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchflightbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(390, 390, 390))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(membershipbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(390, 390, 390))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkStatusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(390, 390, 390))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageStaffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(searchflightbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(membershipbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(checkStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(quitbutton)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStatusButtonActionPerformed
        CheckFlightStatusFrame checkStatusFrame=new CheckFlightStatusFrame(travelAgency);
        checkStatusFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_checkStatusButtonActionPerformed

    private void manageStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStaffButtonActionPerformed
         AuthenticationFrame authfram=new AuthenticationFrame(travelAgency);
        authfram.setVisible(true);
        dispose();

    }//GEN-LAST:event_manageStaffButtonActionPerformed

    private void quitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitbuttonActionPerformed
        dispose();
    }//GEN-LAST:event_quitbuttonActionPerformed

    private void searchflightbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchflightbuttonActionPerformed
        SearchFlightFrame  searchFlight=new  SearchFlightFrame(travelAgency);
        searchFlight.setVisible(true);
        dispose();
    }//GEN-LAST:event_searchflightbuttonActionPerformed

    private void membershipbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipbuttonActionPerformed
        MembershipFrame membershipFram=new MembershipFrame(travelAgency);
        membershipFram.setVisible(true);
    }//GEN-LAST:event_membershipbuttonActionPerformed

    private void bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingActionPerformed
           Booking booking =new Booking (travelAgency);
            booking.setVisible(true);
    }//GEN-LAST:event_bookingActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booking;
    private javax.swing.JButton checkStatusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageStaffButton;
    private javax.swing.JButton membershipbutton;
    private javax.swing.JButton quitbutton;
    private javax.swing.JButton searchflightbutton;
    // End of variables declaration//GEN-END:variables

}
