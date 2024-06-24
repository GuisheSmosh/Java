package taller1_java;

import java.util.Scanner;

public class Punto12 {
    double annualBudget; double gynecologyBudget; double pediatricsBudget; double traumatologyBudget;
    Scanner input;

    Punto12(){
        annualBudget = 0; gynecologyBudget = 0; pediatricsBudget = 0; traumatologyBudget = 0;
        input = new Scanner(System.in);
    }

    void setBudget() {
        System.out.println("Ingrese el valo del impuesto anual: ");
        annualBudget = input.nextDouble();

        gynecologyBudget = annualBudget * 0.4;
        pediatricsBudget = annualBudget * 0.3;
        traumatologyBudget = annualBudget * 0.3;

        System.out.println("El presupuesto anual para el area de ginecologia es: " + gynecologyBudget);
        System.out.println("El presupuesto anual para el area de traumatologia es: " + traumatologyBudget);
        System.out.println("El presupuesto anual para el area de pediatria es: " + pediatricsBudget);
    }
}
