package taller1_java;

import java.util.Scanner;

public class Punto15 {
    int person1; int person2; int person3; int total;
    Scanner input;

    Punto15(){
        person1 = 0; person2 = 0; person3 = 0; total = 0;
        input = new Scanner(System.in);
    }

    void setPercentage(){
        System.out.println("Ingrese el dinero invertido por la primera persona: ");
        person1 = input.nextInt();

        System.out.println("Ingrese el dinero invertido por la segundo persona: ");
        person2 = input.nextInt();

        System.out.println("Ingrese el dinero invertido por la tercera persona: ");
        person3 = input.nextInt();

        total = person1 + person2 + person3;

        System.out.println("El porcentaje invertido por primera persona es: " + (person1 * 100)/total);
        System.out.println("El porcentaje invertido por segunda persona es: " + (person2 * 100)/total);
        System.out.println("El porcentaje invertido por tercera persona es: " + (person3 * 100)/total);
    }
}
