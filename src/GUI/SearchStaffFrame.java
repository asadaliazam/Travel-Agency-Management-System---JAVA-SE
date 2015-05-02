/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchStaffFrame.java
 *
 * Created on Nov 20, 2013, 12:42:08 AM
 */

package GUI;

import javaapplication8.TravelAgency;



/**
 *
 * @author Danial
 */
public class SearchStaffFrame extends javax.swing.JFrame {
    private TravelAgency travelAgency;
    /** Creates new form SearchStaffFrame */
    public SearchStaffFrame(TravelAgency travelAgency) {
        this.travelAgency=travelAgency;
        initComponents();
    }

    private SearchStaffFrame() {
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
        Staffid = new javax.swing.JTextField();
        submitbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffarea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        gobackbutton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SearchStaffMember");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Enter StaffID");

        submitbutton.setFont(new java.awt.Font("Tahoma", 1, 12));
        submitbutton.setForeground(new java.awt.Color(51, 102, 255));
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        staffarea.setColumns(20);
        staffarea.setRows(5);
        jScrollPane1.setViewportView(staffarea);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("View Search Result");

        gobackbutton.setFont(new java.awt.Font("Tahoma", 1, 12));
        gobackbutton.setForeground(new java.awt.Color(0, 153, 153));
        gobackbutton.setText("GoBack");
        gobackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackbuttonActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jTextField1.setForeground(new java.awt.Color(0, 51, 255));
        jTextField1.setText(" NAME           STAFFID       POST       Contact      Address      ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(Staffid, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(submitbutton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(gobackbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Staffid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(submitbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(gobackbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed

             if(!Staffid.getText().equals(""))
     {
     int staffid=Integer.parseInt(Staffid.getText());
     String discription =travelAgency.serchstaff(staffid);
     staffarea.setText(discription);
     Staffid.setText("");


     }
    }//GEN-LAST:event_submitbuttonActionPerformed

    private void gobackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackbuttonActionPerformed
           ManageStaffFrame manageStaffFram=new   ManageStaffFrame(travelAgency);
         manageStaffFram.setVisible(true);
         dispose();
    }//GEN-LAST:event_gobackbuttonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStaffFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Staffid;
    private javax.swing.JButton gobackbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea staffarea;
    private javax.swing.JButton submitbutton;
    // End of variables declaration//GEN-END:variables

}
