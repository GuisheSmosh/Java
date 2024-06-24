package taller1_java;

import java.util.Scanner;

public class Punto11 {
    int currentSalary; double newSalary;
    Scanner input;

    Punto11(){
        currentSalary = 0; newSalary = 0;
        input = new Scanner(System.in);
    }

    void salary(){
        System.out.println("Ingrese su salario actual: ");
        currentSalary = input.nextInt();

        newSalary = currentSalary + (currentSalary * 0.25);

        System.out.println("Su nuevo salario sera de: " + newSalary);
    }
}
