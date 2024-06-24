/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_java;

import java.util.Scanner;

public class Punto3 {
    double discountPercentage; int purchase; double totalPurchase;
    Scanner input;
    
    Punto3(){
        discountPercentage = 0.15; purchase = 0; totalPurchase = 0;
        input = new Scanner(System.in);
    }
    
    void calculateTotal(){
        System.out.println("Digite cuanto cuesta su compra: ");
        purchase = input.nextInt();
        
        totalPurchase = purchase - (purchase * discountPercentage);
        System.out.println("El total de su compra aplicandole el descuento es de: " + totalPurchase);
    }
}