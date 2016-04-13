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
public abstract class Subordinate extends Person implements ISubordinate {
   
   private IManager manager;
   protected boolean salariedPerson;
   
   public Subordinate(IManager manager){
       this.manager = manager;
   }
   
   public void setManager(IManager manager){
       this.manager = manager;
   }
   
   @Override public IManager getManager(){
       return manager;
   }
   
}
