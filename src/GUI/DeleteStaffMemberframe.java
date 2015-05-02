/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DeleteStaffMemberframe.java
 *
 * Created on Nov 20, 2013, 12:34:42 AM
 */

package GUI;

import javaapplication8.TravelAgency;



/**
 *
 * @author Danial
 */
public class DeleteStaffMemberframe extends javax.swing.JFrame {
   private TravelAgency travelAgency;
    /** Creates new form DeleteStaffMemberframe */
    public DeleteStaffMemberframe(TravelAgency travelAgency) {
        this.travelAgency=travelAgency;
        initComponents();
    }

    private DeleteStaffMemberframe() {
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

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        Staffid = new javax.swing.JTextField();
        submitbutton = new javax.swing.JButton();
        gobackbutton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeleteStaffMemeber");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Enter StaffID");

        submitbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitbutton.setForeground(new java.awt.Color(51, 102, 255));
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        gobackbutton.setFont(new java.awt.Font("Tahoma", 1, 18));
        gobackbutton.setForeground(new java.awt.Color(102, 153, 0));
        gobackbutton.setText("GoBack");
        gobackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Staffid, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(gobackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Staffid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(gobackbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed

        if(!Staffid.getText().isEmpty())
        {
        int staffid=Integer.parseInt(Staffid.getText());
        travelAgency.deleteStaff(staffid);
        Staffid.setText("");
        }
        else
        {  
         InvalidinformationEnteredFrame invalidinfo =new InvalidinformationEnteredFrame();
         invalidinfo.setVisible(true);
        
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
                new DeleteStaffMemberframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Staffid;
    private javax.swing.JButton gobackbutton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton submitbutton;
    // End of variables declaration//GEN-END:variables

}