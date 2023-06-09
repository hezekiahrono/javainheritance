/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(String first, String last, String ssn){
        
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }
    
    public void setFirstName(String first){
        
        firstName = first;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String last){
        
        lastName = last;
    }
    public String getLastName(){
        
        return lastName;
    }
    
    public void setSocialSecurityNumber(String ssn){
        socialSecurityNumber = ssn;
    }
    
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %s\nsocial security number: %s",
                getFirstName(), getLastName(),getSocialSecurityNumber());
    }
    
    
//    public abstract double earnings();
    
}
