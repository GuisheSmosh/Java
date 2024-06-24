/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_java;

import java.util.Scanner;

public class Punto7 {
    int dollars; int dollarsInPesos; int pesos;
    Scanner input;
    
    Punto7(){
        dollars = 0; dollarsInPesos = 1500; pesos = 0;
        input = new Scanner(System.in);
    }
    
    void convert(){
        System.out.println("Ingresa la cantidad de dolares que deseas convertir: ");
        dollars = input.nextInt();
        
        pesos = dollars * dollarsInPesos;
        System.out.println(dollars + " dolares convertidos a pesos son: " + pesos);
    }
}
