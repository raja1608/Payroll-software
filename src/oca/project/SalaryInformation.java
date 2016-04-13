/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.text.DecimalFormat;
import java.util.*;


/**
 *
 * @author Raja
 */
public class SalaryInformation {
    
    private double baseSalary;
    private double currentBonus;
    DecimalFormat df = new DecimalFormat("#.00");
    
    
    public SalaryInformation(double baseSalary){
        this.baseSalary = baseSalary;
    }
    
    public void setCurrentBonus(double currentBonus){
        this.currentBonus = currentBonus;
    }
    
    public double getCurrentBonus(){
        return this.currentBonus;
    }
    
    public int CalculateNoOfYears(Date first, Date last){
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int noOfYears = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
        if (a.get(Calendar.DAY_OF_YEAR) > b.get(Calendar.DAY_OF_YEAR)) {
            noOfYears--;
        }
        return noOfYears;
    }
    
    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
}
    
    public double CalculateIncrease(double baseSalary,Date dateStarted){
        double increase;
        Date currentDate = new Date();
        int noOfYears = this.CalculateNoOfYears(currentDate, dateStarted);
        int count = noOfYears / 2;
        increase = (baseSalary * 0.02)*count;         
        return increase;
    }
    
    public double CalculateFinalYearlyPay(Date startDate){
        double salaryIncrease = CalculateIncrease(baseSalary, startDate);
        double finalPay = baseSalary + salaryIncrease + currentBonus;
        return finalPay;
    }
    
    public double CalculatePayPerTimePeriod(TimePeriods timePeriod,Date startDate){
        double yearlyPay = CalculateFinalYearlyPay(startDate);
        double periodicPay;
        if( timePeriod == TimePeriods.MONTHLY){
            periodicPay = yearlyPay / 12;
        }
        else{
            periodicPay = yearlyPay / 26;
        }
        return periodicPay;
    }
}
