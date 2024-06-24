/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_java;

import java.util.Scanner;

public class Punto1 {
    int capital;
    double percentage, total;
    Scanner input;
    
    Punto1(){
        capital = 0; percentage = 0.02; total = 0;
        input = new Scanner(System.in);
    }
    
    void simulador(){
        System.out.println("Ingrese la cantidad de dinero que le gustaria inventir: ");
        capital = input.nextInt();
        
        total = capital + (percentage * capital);
        
        System.out.println("Después de un mes con el 2% su capital será de: " + total);
    }
}