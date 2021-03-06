/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 90048753
 */
public class AssignBonusForm extends javax.swing.JFrame {

    /**
     * Creates new form AssignBonusForm
     */
    
    ArrayList<Person> personList;
    Person selectedManager = null;
    ISubordinate selectedSubordinate = null;
    
    public AssignBonusForm() {
        initComponents();
    }
    
  
   // this method gets the list of person from the MainForm and sets it in personList       
    public void setList(ArrayList<Person> inputlist){
        this.personList = inputlist;
    }
    
    public void populateManagerComboBox(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();;
        for(Person person:personList){
            if(person instanceof Manager){
                model.addElement(person);
            }
            else if(person instanceof CEO){
                model.addElement(person);
            }
        }
        this.cboManager.setModel(model);
    } 
    
    public void populateSubordinateComboBox(Person selectedItem){
        
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        DefaultComboBoxModel model1 = new DefaultComboBoxModel();
        int contractorCount = 0;
        
        selectedManager = (Person)cboManager.getSelectedItem();
        for(Person person:personList){
            if(person instanceof ISubordinate){
                if(person instanceof ContractSubordinate){
                    selectedSubordinate = ((ISubordinate)person);
                    if(selectedSubordinate.getManager() == selectedManager){
                            model.addElement(selectedSubordinate);
                            contractorCount++;
                        }
                }
                else{
                    selectedSubordinate = ((ISubordinate)person);
                    if(selectedSubordinate.getManager() == selectedManager){
                    model.addElement(selectedSubordinate);
                    }
                }
            }
        }
        
        if(contractorCount == model.getSize()){
            model1.addElement("No salaried subordinates");
            cboSubordinateList.setModel(model1);
        }
        else{
            cboSubordinateList.setModel(model);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgOptionPane = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        lblManager = new javax.swing.JLabel();
        lblSubordinatesList = new javax.swing.JLabel();
        lblBonus = new javax.swing.JLabel();
        cboManager = new javax.swing.JComboBox();
        cboSubordinateList = new javax.swing.JComboBox();
        txtBonus = new javax.swing.JTextField();
        btnAssignBonus = new javax.swing.JButton();
        btnCheckCurrentBonus = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assign Bonus");

        lblManager.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblManager.setText("Manager:");

        lblSubordinatesList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSubordinatesList.setText("Subordinates List:");

        lblBonus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBonus.setText("Bonus:");

        cboManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboManagerActionPerformed(evt);
            }
        });

        btnAssignBonus.setText("Assign Bonus");
        btnAssignBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignBonusActionPerformed(evt);
            }
        });

        btnCheckCurrentBonus.setText("Check Current Bonus");
        btnCheckCurrentBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckCurrentBonusActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblManager)
                            .addComponent(lblSubordinatesList)
                            .addComponent(lblBonus))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(cboManager, 0, 170, Short.MAX_VALUE)
                                .addComponent(cboSubordinateList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCheckCurrentBonus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAssignBonus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(lblManager))
                    .addComponent(cboManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubordinatesList)
                    .addComponent(cboSubordinateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBonus)
                    .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAssignBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCheckCurrentBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboManagerActionPerformed
       Person managerName = (Person)cboManager.getSelectedItem();
       populateSubordinateComboBox(managerName);
    }//GEN-LAST:event_cboManagerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignBonusActionPerformed
        if(txtBonus.getText().equals("")){
            msgOptionPane.showMessageDialog(this,"You haven't specified the bonus", 
                    "No bonus assigned",javax.swing.JOptionPane.INFORMATION_MESSAGE); 
        }
        else{
            Manager manager = (Manager)selectedManager;
            String result = manager.AssignBonus((ISubordinate)cboSubordinateList.getSelectedItem(), 
            Double.parseDouble(txtBonus.getText()));
            msgOptionPane.showMessageDialog(this, result, "Announcement",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAssignBonusActionPerformed

    private void btnCheckCurrentBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckCurrentBonusActionPerformed
        Manager manager = (Manager)selectedManager;
        Double lastBonus = manager.getLastBonusAssigned();
        msgOptionPane.showMessageDialog(this,lastBonus , "Employee Bonus",javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCheckCurrentBonusActionPerformed

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
            java.util.logging.Logger.getLogger(AssignBonusForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignBonusForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignBonusForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignBonusForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssignBonusForm().setVisible(true);
            }
        });
    }
    
          



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignBonus;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckCurrentBonus;
    private javax.swing.JComboBox cboManager;
    private javax.swing.JComboBox cboSubordinateList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBonus;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblSubordinatesList;
    private javax.swing.JOptionPane msgOptionPane;
    private javax.swing.JTextField txtBonus;
    // End of variables declaration//GEN-END:variables
}
