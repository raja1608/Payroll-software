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
 * @author 90048753
 */
public class CEO extends Person implements IManager {
    
    SalaryInformation salaryInformation;
    private TimePeriods timePeriod;
    private ArrayList<ISubordinate> subordinatesList = new ArrayList<ISubordinate>();
    
    public CEO(double baseSalary){
        salaryInformation = new SalaryInformation(baseSalary);
    }
    
    @Override public ArrayList<ISubordinate> getSubordinateList(){
        return subordinatesList;
    }
    
    public void addSubordinate(ISubordinate iSubordinate){
        subordinatesList.add(iSubordinate);
    }
    
    public void setTimePeriod(TimePeriods timePeriod){
        this.timePeriod = timePeriod;
    }
    
    public TimePeriods getTimeperiod(){
        return this.timePeriod;
    }
    
    @Override public double CalculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception{
        Double pay;
        pay = salaryInformation.CalculatePayPerTimePeriod(this.getTimeperiod(), startDateOfPayPeriod);
        return pay;
    }
}
