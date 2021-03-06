/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PaymentForm.java
 *
 * Created on Nov 25, 2013, 7:13:37 PM
 */
package GUI;

import javaapplication8.TravelAgency;

/**
 *
 * @author Asad
 */
public class PaymentForm extends javax.swing.JFrame {
    
    private TravelAgency travelAgency;
    private int flightNumber;
    private int membershipID;

    /** Creates new form PaymentForm */
    public PaymentForm() {
        initComponents();
    }
    
    public PaymentForm(TravelAgency travelAgency, int flightNumber,int membershipID) 
    {
        initComponents();
        this.travelAgency = travelAgency;
        this.flightNumber = flightNumber;
        this.membershipID = membershipID;
        
        
       
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitButton = new javax.swing.JButton();
        creditoption = new javax.swing.JRadioButton();
        cashoption = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        creditoption.setText("Credit Card Payment");

        cashoption.setText("Cash Payment");

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14));
        jLabel1.setText("Payment Options");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(submitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashoption)
                            .addComponent(creditoption))))
                .addContainerGap(306, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(creditoption)
                .addGap(18, 18, 18)
                .addComponent(cashoption)
                .addGap(54, 54, 54)
                .addComponent(submitButton)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (cashoption.isSelected())
        {
            
        }
        
        else if (creditoption.isSelected())
        {
            CreditCardPaymentFrame obj = new CreditCardPaymentFrame(travelAgency, flightNumber,membershipID);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PaymentForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cashoption;
    private javax.swing.JRadioButton creditoption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
