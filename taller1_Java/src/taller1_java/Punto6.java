/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_java;

import java.util.Scanner;

public class Punto6 {
    int birthYear; int currentYear; int years;
    Scanner input;
    
    Punto6(){
        birthYear = 0; currentYear = 0; years = 0;
        input = new Scanner(System.in);
    }
    
    void getAge(){
        System.out.println("Ingrese el año en que nacio: ");
        birthYear = input.nextInt();
        
        System.out.println("Ingrese el año actual: ");
        currentYear = input.nextInt();
        
        years = currentYear - birthYear;
        System.out.println("Tu edad es: " + years);
    }
}
