/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public class PolymorphismTest {
    
    public static void main(String[] args){
    
    CommissionEmployee commissionEmployee = new CommissionEmployee(
    "Hezekiah","Rono","111-111-111",500.0,0.6);
    
    BasePlusCommissionEmployee basePlusCommisionEmployee = new BasePlusCommissionEmployee(
    "Bob","Kamau","233-467-984",200.0,0.3,400);
    
    System.out.printf("%s %s:\n\n%s\n\n",
 "Call CommissionEmployee's toString with superclass reference ",
 "to superclass object", commissionEmployee.toString());
    
    System.out.printf("%s %s:\n\n%s\n\n",
 "Call BasePlusCommissionEmployee's toString with subclass",
 "reference to subclass object", basePlusCommisionEmployee.toString());
    
    // invoke toString on subclass object using superclass variable
    CommissionEmployee commissionEmployee2 = basePlusCommisionEmployee;
    
    System.out.printf("%s %s:\n\n%s\n\n",
 "Call BasePlusCommissionEmployee's toString with superclass reference ",
 "to subclass object", commissionEmployee2.toString());
            
            }
    
}
