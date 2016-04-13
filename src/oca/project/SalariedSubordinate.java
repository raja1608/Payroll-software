/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.util.Date;

/**
 *
 * @author Raja
 */
public class SalariedSubordinate extends Subordinate implements ISalariedPerson{

   private SalaryInformation salaryInformation;
   private TimePeriods timePeriod;
   private double baseSalary;
   
   public SalariedSubordinate(double baseSalary, IManager manager){
       super(manager);
       this.baseSalary = baseSalary;
       salaryInformation = new SalaryInformation(baseSalary);
   }
   
   @Override public double CalculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception {
       double pay;
       pay = salaryInformation.CalculatePayPerTimePeriod(this.getTimePeriod(), startDateOfPayPeriod);
       return pay;
   }
   
   @Override public void setTimePeriod(TimePeriods timePeriod){
        this.timePeriod = timePeriod;
    }
   
   @Override public TimePeriods getTimePeriod(){
       return timePeriod;
   }
    
   @Override public void setCurrentBonus(double currentBonus){
       salaryInformation.setCurrentBonus(currentBonus);
   }
   
   @Override public double getCurrentBonus(){
       return salaryInformation.getCurrentBonus();
   }
   
    public double getBaseSalary(){
        return baseSalary;
    }
}
