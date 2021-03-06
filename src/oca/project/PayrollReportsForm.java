/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author 90048753
 */
public class PayrollReportsForm extends javax.swing.JFrame {

    /**
     * Creates new form PayrollReportsForm
     */
    ArrayList<Person> personList;
    
    public PayrollReportsForm() {
        initComponents();
    }
    
    public void setList(ArrayList<Person> inputlist){
        this.personList = inputlist;
    }
    
    public void populateNameComboBox(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for(Person person:personList){
            if(person instanceof CEO){ 
            }
            else{
                model.addElement(person);
            }
        }
        this.cboName.setModel(model);
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgPane = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        lblFirstDate = new javax.swing.JLabel();
        lblSecondDate = new javax.swing.JLabel();
        txtFirstDate = new javax.swing.JTextField();
        txtSecondDate = new javax.swing.JTextField();
        btnAllPaymentsForAperiod = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnBonusesReport = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        cboName = new javax.swing.JComboBox();
        btnPaymentHistoryByPerson = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnListFortnightlyPayments = new javax.swing.JButton();
        btnListMonthlyPayments = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payroll Reports");

        lblFirstDate.setText("First Date:");

        lblSecondDate.setText("Second Date:");

        btnAllPaymentsForAperiod.setText("All Payments for a period");
        btnAllPaymentsForAperiod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllPaymentsForAperiodActionPerformed(evt);
            }
        });

        btnBonusesReport.setText("Bonuses Report");
        btnBonusesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBonusesReportActionPerformed(evt);
            }
        });

        btnPaymentHistoryByPerson.setText("Payment History by Person");
        btnPaymentHistoryByPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentHistoryByPersonActionPerformed(evt);
            }
        });

        btnListFortnightlyPayments.setText("List Fortnightly Payments");
        btnListFortnightlyPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListFortnightlyPaymentsActionPerformed(evt);
            }
        });

        btnListMonthlyPayments.setText("List Monthly Payments");
        btnListMonthlyPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListMonthlyPaymentsActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblSecondDate)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSecondDate))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnAllPaymentsForAperiod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBonusesReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPaymentHistoryByPerson, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblFirstDate)
                                        .addGap(34, 34, 34)
                                        .addComponent(txtFirstDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnListMonthlyPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnListFortnightlyPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(888, 888, 888)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstDate)
                            .addComponent(txtFirstDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSecondDate)
                            .addComponent(txtSecondDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAllPaymentsForAperiod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBonusesReport, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPaymentHistoryByPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnListFortnightlyPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListMonthlyPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAllPaymentsForAperiodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllPaymentsForAperiodActionPerformed

       DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
       Date date1 = new Date();
       Date date2 = new Date();
       try{
            date1 = df.parse(txtFirstDate.getText());
            date2 = df.parse(txtSecondDate.getText());
            ArrayList<PayrollReportItem> fortnightlyPayments = MainForm.getFortnightPayments();
            ArrayList<PayrollReportItem> monthlyPayments = MainForm.getMonthlyPayments();
        
            int fSize = fortnightlyPayments.size();
            int mSize = monthlyPayments.size();
            if(fSize != 0 && mSize != 0){
            for(PayrollReportItem item:fortnightlyPayments){
               if((item.getStartDateOfPayPeriod().after(date1) || item.getStartDateOfPayPeriod().equals(date1)) && 
                       (item.getStartDateOfPayPeriod().before(date2) || item.getStartDateOfPayPeriod().equals(date2))){
                   txtArea.append(item + "\n");
               }
            }
        
            for(PayrollReportItem item:monthlyPayments){
               if((item.getStartDateOfPayPeriod().after(date1) || item.getStartDateOfPayPeriod().equals(date1)) && 
                       (item.getStartDateOfPayPeriod().before(date2) || item.getStartDateOfPayPeriod().equals(date2))){
                   txtArea.append(item + "\n");
               }
            }
        }
        else{
            msgPane.showMessageDialog(this,"There are no payments recorded for the period entered.", 
                    "No Payments",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }
       }
       catch(ParseException pe){
           msgPane.showMessageDialog(this,"Enter a valid first and second date in dd/MM/yyyy format", 
                    "Format Error",javax.swing.JOptionPane.ERROR_MESSAGE);
       }  
    }//GEN-LAST:event_btnAllPaymentsForAperiodActionPerformed

    private void btnListFortnightlyPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListFortnightlyPaymentsActionPerformed
        ArrayList<PayrollReportItem> fortnightlyPayments = MainForm.getFortnightPayments();
        int size = fortnightlyPayments.size();
        if(size != 0){
            for(PayrollReportItem item:fortnightlyPayments){
                txtArea.append(item + "\n");
            }
       }
       else{
           msgPane.showMessageDialog(this,"There are no fortnightly payments made.", 
                    "No Payments",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
    }//GEN-LAST:event_btnListFortnightlyPaymentsActionPerformed

    private void btnListMonthlyPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListMonthlyPaymentsActionPerformed
       ArrayList<PayrollReportItem> monthlyPayments = MainForm.getMonthlyPayments();
       int payCount = monthlyPayments.size();
       if(payCount != 0){
            for(PayrollReportItem item:monthlyPayments){
                txtArea.append(item + "\n");
            }
       }
       else{
           msgPane.showMessageDialog(this,"There are no monthly payments made.", 
                    "No Payments",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
       }
       
    }//GEN-LAST:event_btnListMonthlyPaymentsActionPerformed

    private void btnPaymentHistoryByPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentHistoryByPersonActionPerformed
        
        Person employee = (Person)cboName.getSelectedItem();
        txtArea.setText(" ");
        ArrayList<PayrollReportItem> fortnightlyPayments = MainForm.getFortnightPayments();
        ArrayList<PayrollReportItem> monthlyPayments = MainForm.getMonthlyPayments();
        int fortPayCount = fortnightlyPayments.size();
        int monthPayCount = monthlyPayments.size();
        
        if(fortPayCount != 0 && monthPayCount != 0){
             for(PayrollReportItem item:fortnightlyPayments){
                if(employee == item.getperson()){
                    txtArea.append(item + "\n");
                }
            }
        for(PayrollReportItem item:monthlyPayments){
                if(employee == item.getperson()){
                    txtArea.append(item + "\n");
                }
            }
        }
        else{
            msgPane.showMessageDialog(this,"There are no payments record for the selected employee.", 
                    "No Payments",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
     
    }//GEN-LAST:event_btnPaymentHistoryByPersonActionPerformed

    private void btnBonusesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBonusesReportActionPerformed
       ArrayList<String> bonuses = MainForm.getBonusEntries();
       int size = bonuses.size();
       if(size != 0){
        for(String bonus: bonuses){
            txtArea.append(bonus + "\n");
        } 
       }
       else{
           msgPane.showMessageDialog(this,"There are no bonus entry recorded.", 
                    "No Bonus",javax.swing.JOptionPane.INFORMATION_MESSAGE);
       }
       
    }//GEN-LAST:event_btnBonusesReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PayrollReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayrollReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayrollReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayrollReportsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollReportsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllPaymentsForAperiod;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBonusesReport;
    private javax.swing.JButton btnListFortnightlyPayments;
    private javax.swing.JButton btnListMonthlyPayments;
    private javax.swing.JButton btnPaymentHistoryByPerson;
    private javax.swing.JComboBox cboName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblFirstDate;
    private javax.swing.JLabel lblSecondDate;
    private javax.swing.JOptionPane msgPane;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtFirstDate;
    private javax.swing.JTextField txtSecondDate;
    // End of variables declaration//GEN-END:variables
}
