/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public class CommissionEmployee extends Object {
    
//    protected String firstName;
//    protected String lastName;
//    protected String socialSecurityNumber;
//    protected double grossSale;
//    protected double comissionRate;
    
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSale;
    private double comissionRate;
    
    
    public CommissionEmployee(String first, String last, String ssn, double sales, double rate){
        
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSale(sales);
        setComissionRate(rate);
       
        
    }
    
    public void setFirstName(String first){
        firstName = first; 
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setLasttName(String last){
        lastName = last;
    }
    
    public String getLastName(){
        return lastName;
    }
     public void setSecurityNumber(String ssn){
        socialSecurityNumber = ssn;
    }
    
    public String getSecurityNumber(){
        return socialSecurityNumber;
    }
    public void setGrossSale(double sales ){
        
        if(sales>=0.0)
         grossSale = sales;
        else
            throw new IllegalArgumentException("Gross sale must be above 0");
        
    }
    
    public double getGrossSale(){
        return grossSale;
    }
    
    public void setComissionRate(double rate ){
        
        if(rate>0.0 && rate<1.0)
          comissionRate = rate;
        else
            throw new IllegalArgumentException("rate must be above 0 and not less than 1");
        
    }
    
    public double getComissionRate(){
        return comissionRate;
    }
    public double earnings(){
        //return grossSale * comissionRate;
        return getGrossSale() *getComissionRate();
    }
    
    @Override
    public String toString(){
        
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                //"Commision Employee",firstName,lastName,
                "Commision Employee",getFirstName(),getLastName(),
               // "Social Security Number", socialSecurityNumber,
                 "Social Security Number", getSecurityNumber(),
               // "Gross Sale",grossSale,
                 "Gross Sale",getGrossSale(),
               // "Commision Rate", comissionRate);
         "Commision Rate", getComissionRate());
    }
    
}
