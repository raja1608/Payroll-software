/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author Raja
 */
public class PayrollReportItem {
    
    private Person person;
    private Double salary; 
    private Date startOfPayPeriod;
    TimePeriods payPeriod;
    String payTimePeriod;
    DecimalFormat df = new DecimalFormat("####0.00");
    
    public PayrollReportItem(Person person, Double salary, Date startOfPayPeriod, TimePeriods payPeriod){
        this.person = person;
        this.salary = salary;
        this.startOfPayPeriod = startOfPayPeriod;
        this.payPeriod = payPeriod;
    }
    
    public Person getperson(){
        return person;
    }
    
    public Date getStartDateOfPayPeriod(){
        return startOfPayPeriod;
    }
    
    @Override public String toString(){
        payTimePeriod = person + " was paid " + df.format(salary)
                + " on the " + startOfPayPeriod + ". Payment Period: " + this.payPeriod;        
       
      return payTimePeriod;
    }
}
