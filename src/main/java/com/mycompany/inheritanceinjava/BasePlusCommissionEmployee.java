/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    
 private double baseSalary;


 // six-argument constructor
 public BasePlusCommissionEmployee( String first, String last,
 String ssn, double sales, double rate, double salary ){
     super(first,last,ssn,sales,rate);
     setBaseSalary(salary);
 }

 public void setBaseSalary( double salary )
 {
 if ( salary >= 0.0 )
 baseSalary = salary;
 else
throw new IllegalArgumentException(
 "Base salary must be >= 0.0" );
 } // end m
 
 public double getBaseSalary()
{
return baseSalary;
} //
 
 // calculate earnings
 @Override
 public double earnings()
 {
// return baseSalary + ( grossSale * comissionRate );
    return getBaseSalary() + super.earnings();
 } 
 
 @Override // indicates that this method overrides a superclass method
 public String toString()
 {
 return String.format(
 "%s %s; %s: $%,.2f",
//         //"base-salaried commission employee", firstName, lastName,
//         "base-salaried commission employee", getFirstName(), getLastName(),
//         //"social security number", socialSecurityNumber,
//         "social security number", getSecurityNumber(),
//         //"gross sales", grossSale, "commission rate", comissionRate,
//         "gross sales", getGrossSale(), "commission rate", getComissionRate(),
         "base-salaried",super.toString(),"base salary", getBaseSalary());
 } //
}
