/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public class CommissionEmployeeTest {
    
    public static void main(String[] args){
        
        CommissionEmployee employee = new CommissionEmployee(
                "Brenda","Jones","222-222",1000.0,0.06);
        
        System.out.println("Employee information obtained by get methods: \n" );
        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee.getLastName());
        System.out.printf("%s %s\n", "Security number is", employee.getSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getGrossSale());
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getComissionRate());
        
        employee.setComissionRate(0.2);
        employee.setGrossSale(500.0);
        
        System.out.printf("\n%s:\n\n%s\n",
"Updated employee information obtained by toString", employee);
        
        
        
    }
    
}
