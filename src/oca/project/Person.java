/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Raja
 */
public class Person {
    
    private String firstName ;
    private String lastName;
    private String position;
    private Date dateOfBirth;
    private Date dateStarted;
    

    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
     public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public void setPosition(String position){
        this.position = position;
    }
    
    public String getPosition(){
        return this.position;
    }
    
    public void setDateOfBirth(String dateOfBirth){
       SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
       try{
           this.dateOfBirth = df.parse(dateOfBirth);
       }
       catch(ParseException pe){
        System.out.println("Check the date string passed in");
       }
    }
    
    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }
    
    public void setDateStarted(String dateStarted){
        
      SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
       try{
           this.dateStarted = df.parse(dateStarted);
       }
       catch(ParseException pe){
        System.out.println("Check the date string passed in");
       }
    }
    
    public Date getDateStarted(){
        return this.dateStarted;
    }
    
    @Override public String toString(){
        
        return this.firstName + " " + this.lastName;
                
    }
    
}
