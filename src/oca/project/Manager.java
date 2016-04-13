/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Raja
 */
public abstract class Manager extends Person implements IManager, ISubordinate, ISalariedPerson {
    
    private double baseSalary;
    private IManager manager;
    private ISalariedPerson person;
    private ArrayList<ISubordinate> subordinateList = new ArrayList<ISubordinate>();
    SalaryInformation salaryInformation;
    private TimePeriods timePeriod;
    
    private double bonusAllocated = 5000;
    private double lastBonusAssigned = 0;
    
    
    public Manager(double baseSalary, IManager manager, ArrayList<ISubordinate> subordinateList ){
    this.baseSalary = baseSalary;
    this.manager = manager;
    this.subordinateList = subordinateList;
    salaryInformation = new SalaryInformation(baseSalary);
}
    public Manager(double baseSalary, IManager imanager){
       this(baseSalary,imanager, new ArrayList<ISubordinate>()); 
    }
    
    public String AssignBonus(ISubordinate subordinate, double bonus){
        
        String message = " ";
        PayrollReportItem bonusEntry = null;
            
        for(ISubordinate Subordinate:subordinateList){
            
            if(Subordinate == subordinate){
              
                if(subordinate instanceof Manager){
                  if (((Manager)subordinate).getCurrentBonus() == 0)// checking whether the bonus has been already assigned to the particular subordinate.
                {
                    if(bonus <= bonusAllocated && bonus != 0)
                    {
                        ((Manager)subordinate).setCurrentBonus(bonus);
                        bonusAllocated = bonusAllocated - bonus;
                        lastBonusAssigned = bonus;
                        message = "The bonus of $ " + bonus + " has been assigned to " 
                                +  ((Manager)subordinate).getFirstName() + " " + ((Manager)subordinate).getLastName();
                        
                        String payrollEntry = ((Manager)subordinate).getFirstName() + " " + ((Manager)subordinate).getLastName() 
                               + "has a bonus of " + bonus; 
                        MainForm.addBonusEntry(payrollEntry);
                    }
                    else
                    {
                        message = "Manager " + this.getFirstName() + " " + this.getLastName()
                                + " cannot allocate more than $" + bonusAllocated;
                    } 
                }
                else
                {
                    message = ((Manager)subordinate).getFirstName() + " " + ((Manager)subordinate).getLastName() + 
                            " has already got a bonus assigned";
                } 
            }
                else if(subordinate instanceof SalariedSubordinate){
                       if (((SalariedSubordinate)subordinate).getCurrentBonus() == 0)// checking whether the bonus has been already assigned to the particular subordinate.
                {
                    if(bonus <= bonusAllocated && bonus != 0)
                    {
                        ((SalariedSubordinate)subordinate).setCurrentBonus(bonus);
                        bonusAllocated = bonusAllocated - bonus;
                        lastBonusAssigned = bonus;
                        message = "The bonus of $" + bonus + " has been assigned to " 
                                +  ((SalariedSubordinate)subordinate).getFirstName() + " " + ((SalariedSubordinate)subordinate).getLastName();
                        String payrollEntry = ((SalariedSubordinate)subordinate).getFirstName() + " " + ((SalariedSubordinate)subordinate).getLastName() 
                                + "has a bonus of " + bonus; 
                        MainForm.addBonusEntry(payrollEntry);
                    }
                    else
                    {
                        message = "Manager " + this.getFirstName() + " " + this.getLastName()
                                + " cannot allocate more than $" + bonusAllocated;
                    } 
                }
                else
                {
                    message = ((SalariedSubordinate)subordinate).getFirstName() + " " + ((SalariedSubordinate)subordinate).getLastName() + 
                            " has already got a bonus assigned";
                } 
            }
                else{
                    message = "The selected subordinate is a contractor";
                }
        } 
       
      }
      return message;        
    }
    
    
  
    
   public void addSubordinate(ISubordinate iSubordinate){
        subordinateList.add(iSubordinate);
    }
    
    @Override public ArrayList<ISubordinate> getSubordinateList(){
        return subordinateList;
    }
    
    public void setManager(IManager manager){
        this.manager = manager;
    }
    
    @Override public IManager getManager(){
        return manager;
    }
    
    @Override public void setCurrentBonus(double currentBonus){
        salaryInformation.setCurrentBonus(currentBonus);
    }
    
    @Override public double getCurrentBonus(){
    return salaryInformation.getCurrentBonus();
    }
    
    @Override public void setTimePeriod(TimePeriods timePeriod){
        this.timePeriod = timePeriod;
    }
    
    @Override public TimePeriods getTimePeriod(){
        return timePeriod;
    }
    
    public double getLastBonusAssigned(){
        return lastBonusAssigned;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    @Override public double CalculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception{
        //Clarify , the method parameter says start date of pay period but all the salary information method has start date of the employee in the 
        //company as a parameter
        double pay = 0;
        pay = salaryInformation.CalculatePayPerTimePeriod(this.getTimePeriod(), startDateOfPayPeriod);
        return pay;
    }
    
}
