/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

/**
 *
 * @author Raja
 */
public class ContractInformation {
    double hourlyRate;
    final int FULL_TIME_HOURS = 40;
    
    public ContractInformation(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    
     public double CalculatePay(TimePeriods timePeriod, double hoursOfWork){
        double pay = 0;
        if(hoursOfWork > 160){
          pay = (FULL_TIME_HOURS * 4 * hourlyRate) + (hoursOfWork - 160) * (hourlyRate + hourlyRate * 0.10);
        }
        else{
          pay = hoursOfWork * hourlyRate ;  
        }
      return pay;
   }
}
