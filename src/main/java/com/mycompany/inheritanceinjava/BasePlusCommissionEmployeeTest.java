/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public class BasePlusCommissionEmployeeTest {
    
    public static void main(String[] args){
    
    BasePlusCommissionEmployee employee =
new BasePlusCommissionEmployee(
"Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
    
    System.out.println("Employee information obtained by get methods: \n");
    System.out.printf("%s %s\n", "First name is: ",
            employee.getFirstName());
    System.out.printf("%s %s\n", "Lat name is: ", employee.getFirstName());
//    System.out.printf("%s %s\n", "Social security number is: ",
//            employee.getSecurityNumber());
//    System.out.printf("%s %.2f\n", "Commision rate: ", employee.getComissionRate());
//    System.out.printf("%s %.2f\n","Gross sales: ", employee.getGrossSale());
    System.out.printf("%s %.2f\n", "Base salary: ", employee.getBaseSalary());
    
    
    employee.setBaseSalary(1000.00);
     System.out.printf("\n%s:\n\n%s\n", "Updated information by toString: ",
             employee.toString());
     
     
      
    
    
}
    
}
