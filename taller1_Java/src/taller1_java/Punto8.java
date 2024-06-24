/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_java;

import java.util.Scanner;

public class Punto8 {
    int number; int result; int condition;
    Scanner input;
    
    Punto8(){
        number = 0; result = 0; condition = 0;
        input = new Scanner(System.in);
    }
    
    void multiplicate(){
        System.out.println("Ingrese un numero: ");
        number = input.nextInt();
        
        for (int i = 1; i < 11; i++) {
            result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
