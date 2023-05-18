/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public class SalariedEmployee extends Employee{
    
    private double weeklySalary;
    
    public SalariedEmployee(String first, String last, String ssn,double salary){
        
        super(first, last,ssn);
        
        setWeeklySalary(salary);
    }
    
    public void setWeeklySalary(double salary){
        
        if(salary>0.0)
        weeklySalary = salary;
        else
            throw new IllegalArgumentException("Salary must be more than 0");
    }
    
    public double getWeeklySalary(){
        return weeklySalary;
    }
    
   
    //public double earnings(){
     @Override
    public double getPaymentAmount(){
        
        return getWeeklySalary();
    }
    
    @Override
    public String toString(){
        
        return String.format("salaried employee: %s\n%s: $%,.2f", 
                super.toString(), "weekly salary",getWeeklySalary());
    }
    
    
    
}
