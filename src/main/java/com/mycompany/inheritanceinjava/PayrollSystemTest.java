/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public class PayrollSystemTest {
    
    public static void main(String[] args){
        
        SalariedEmployee salariedEmployee = new SalariedEmployee("Hezekiah","Rono","222-222-222",
       50000.0 );
        
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Millicent","Omanga","333-333-33",
        8.0,40.0);
        
        CommissionEmployee commissionEmployee = new CommissionEmployee("Alex","Anda","444-444-44",
        1000.0,0.7);
        
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
        "Marcus","Sylvester", "5555-555-55",10000.0,0.7,500);
        
        System.out.println( "Employees processed individually:\n" );
        
        System.out.printf("%s\n%s: $%,.2f\n\n", 
                salariedEmployee,"earned", salariedEmployee.earnings());
         System.out.printf("%s\n%s: $%,.2f\n\n", 
                hourlyEmployee,"earned", hourlyEmployee.earnings());
          System.out.printf("%s\n%s: $%,.2f\n\n", 
                commissionEmployee,"earned", commissionEmployee.earnings());
          System.out.printf("%s\n%s: $%,.2f\n\n", 
                basePlusCommissionEmployee,"earned", basePlusCommissionEmployee.earnings());
          
         Employee[] employees = new Employee[4];
         employees[0] = salariedEmployee;
         employees[1] = hourlyEmployee;
         employees[2] = commissionEmployee;
         employees[3] = basePlusCommissionEmployee;
         System.out.println( "Employees processed polymorphically:\n" );
         
         for(Employee currentEmployee:employees){
             
             System.out.println(currentEmployee);
             
             if(currentEmployee instanceof BasePlusCommissionEmployee){
                 
                 BasePlusCommissionEmployee employee = 
                         (BasePlusCommissionEmployee) currentEmployee;
                 
               employee.setBaseSalary(employee.getBaseSalary() * 1.10);
               System.out.printf("new base salary with 10%% increase is: $%,.2f\n",
                       employee.getBaseSalary());
             }
         }
          
          
          
          
        
    }
    
}
