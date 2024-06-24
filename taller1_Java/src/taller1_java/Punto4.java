/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_java;

import java.util.Scanner;

public class Punto4 {
    double percentageCalifications; double percentageExam; double percentageFinalWork;
    double partialCalification; double partialCalificationMean; double finalExam; double finalWork; double totalCalification; double x;
    Scanner input;
    
    Punto4(){
        percentageCalifications = 0.55; percentageExam = 0.3; percentageFinalWork = 0.15;
        partialCalification = 0; partialCalificationMean = 0; finalExam = 0; finalWork = 0; totalCalification = 0; x = 0;
        input = new Scanner(System.in);
    }
    
    void calcualteNotes(){
        for (int i = 1; i < 4; i++){
            System.out.println("Ingresa la nota del trabajo " + i);
            x = input.nextDouble();
            partialCalification += x;
        }
        partialCalificationMean /= 3;
        
        System.out.println("Ingrese la calificacion del exmen final: ");
        finalExam = input.nextDouble();
        
        System.out.println("Ingrese la calificacion del trabajo final: ");
        finalWork = input.nextDouble();
        
        totalCalification = (partialCalificationMean * percentageCalifications) + (finalExam * percentageExam) + (finalWork * percentageFinalWork);
        System.out.println("Tu calificacion final es: " + totalCalification);
    }
}