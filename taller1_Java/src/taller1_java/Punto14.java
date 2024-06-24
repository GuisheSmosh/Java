package taller1_java;

import java.util.Scanner;

public class Punto14 {
    int totalTime; int time; int average; String[] days;
    Scanner input;

    Punto14(){
        totalTime = 0; time = 0; average = 0;
        days = new String[]{"Lunes", "Miercoles", "Viernes"};
        input = new Scanner(System.in);
    }

    void getAverage(){
        for (String i : days){
            System.out.println("Ingresa el tiempo que hiciste el " + i + " (en minutos)");
            time = input.nextInt();
            totalTime += time;
        }

        average = totalTime / 3;

        System.out.println("El promedio del tiempo que tarda en recorrer la ruta es: " + average);
    }
}
