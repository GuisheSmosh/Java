package taller1_java;

import java.util.Scanner;

public class Punto10 {
    double years; double numberPulsations;
    Scanner input;

    Punto10(){
        years = 0; numberPulsations = 0;
        input = new Scanner(System.in);
    }

    void calculatePulsations(){
        System.out.println("Ingrese su edad: ");
        years = input.nextDouble();

        numberPulsations = (220 - years)/10;

        System.out.println("El numero de pulsaciones que deberia de tener es: " + numberPulsations);
    }
}
