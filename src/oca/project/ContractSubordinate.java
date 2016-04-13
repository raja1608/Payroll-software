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
public class ContractSubordinate extends Subordinate {
    
    ContractInformation contractInformation;
    private TimePeriods timePeriod = TimePeriods.MONTHLY;
    
    public ContractSubordinate(double hourlyRate, IManager manager){
        super(manager);
        contractInformation =new ContractInformation(hourlyRate);
    }
    
     @Override public double CalculatePay(Date startDateOfPayPeriod, double numberOfHours) throws Exception{
       double pay = 0;
       pay = contractInformation.CalculatePay(timePeriod, numberOfHours);
       return pay;
   }
     
     public TimePeriods getTimePeriod(){
         return this.timePeriod;
     }
}
