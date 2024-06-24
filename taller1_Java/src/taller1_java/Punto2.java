/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_java;

import java.util.Scanner;

public class Punto2 {
    int salary; int sales; static double PERCENTAGE_COMMISSIONS; double totalCommissions; double totalSalary; int x;
    Scanner input;
    
    Punto2(){
        salary = 1300000; sales = 0; PERCENTAGE_COMMISSIONS = 0.1; totalCommissions = 0; totalSalary = 0; x = 0;
        input = new Scanner(System.in);
    }
    
    void calculateSalary(){
        for (int i = 1; i < 4; i++) {
            System.out.println("Ingrese de cuanto es la venta " + i);
            x = input.nextInt();
            sales += x;
        }
        totalCommissions = sales * PERCENTAGE_COMMISSIONS;
        System.out.println("El total de dinero que obtendra por las comisiones sera: " + totalCommissions);
        
        totalSalary = salary + totalCommissions;
        System.out.println("El total de su salario mas las comisiones es: " + totalSalary);
    }
}
