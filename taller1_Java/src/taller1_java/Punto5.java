/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_java;

import java.util.Scanner;

public class Punto5 {
    double womenPercentage; double menPercentage; int menNumber; int womenNumber; int totalPeople;
    Scanner input;
    
    Punto5(){
        womenPercentage = 0; menPercentage = 0; menNumber = 0; womenNumber = 0; totalPeople = 0;
        input = new Scanner(System.in);
    }
    
    void calculatePercentage(){
        System.out.println("Ingrese el numero de hombres en el grupo: ");
        menNumber = input.nextInt();
        
        System.out.println("Ingrese el numero de mujeres en el grupo: ");
        womenNumber = input.nextInt();
        
        totalPeople = womenNumber + menNumber;
        
        menPercentage = menNumber * 100 / totalPeople;
        womenPercentage = womenNumber * 100 / totalPeople;
        
        System.out.println("El porcentaje de hmbres en el grupo es: " + menPercentage);
        System.out.println("El porcentaje de mujeres en el grupo es: " + womenPercentage);
    }
}
