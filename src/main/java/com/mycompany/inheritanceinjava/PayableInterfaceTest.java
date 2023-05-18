/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public class PayableInterfaceTest {
    public static void main(String[] args){
        
        Payable[] payableObjects = new Payable[4];
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new 
            SalariedEmployee("Hezekiah", "Rono","222-222-22",800.0);
        
         payableObjects[2] = new 
            SalariedEmployee("Alex", "Anda","333-333-333",800.0);
         
         System.out.println(
"Invoices and Employees processed polymorphically:\n" );
         for(Payable currentObject:payableObjects ){
             
             System.out.printf("%s \n%s: $%,.2f\n\n",
                     currentObject.toString(),
                     "payment due",currentObject.getPaymentAmount());
         }
        
        
        
    }
    
}
