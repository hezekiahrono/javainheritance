/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceinjava;

/**
 *
 * @author HP
 */
public class Invoice implements Payable {

private String partNumber;
private String partDescription;
private int quantity;
private double pricePerItem;

public Invoice(String part, String description, int count, double price ){
    
    partNumber = part;
    partDescription = description;
    setQuantity(count);
    setPricePerItem(price);
}

public void setQuantity(int count){
    
    if(count>=0)
        quantity = count;
    else throw new IllegalArgumentException("Quantitiy must be more than 0");
}

public int getQuantity(){
    return quantity;
}

public void setPricePerItem(double price){
    if(price>=0)
        pricePerItem = price;
    else throw new IllegalArgumentException("Price must be more than zero");
}
public double getPricePerItem(){
    return pricePerItem;
}

public void setPartNumber(String part){
    partNumber = part;
    
}
public String getPartNumber(){
    
    return partNumber;
}
public void setDescription(String description){
    partDescription = description;
}

public String getDescription(){
    return partDescription;
}

@Override
public double getPaymentAmount(){
    return getQuantity() * getPricePerItem();
}
@Override
public String toString(){
    return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
            "Invoice","Part Number", getPartNumber(),getDescription(),
            "Quantity", getQuantity(), "Price per item", getPricePerItem());
}

}
