package taller1_java;

import java.util.Scanner;

public class Punto9 {
    double pressure; double volume; double temperature; double mass;
    Scanner input;

    Punto9(){
        pressure = 0; volume = 0; temperature = 0; mass = 0;
        input = new Scanner(System.in);
    }

    void getMass(){
        System.out.println("Ingrese la presion: ");
        pressure = input.nextDouble();

        System.out.println("Ingrese el volumen: ");
        volume = input.nextDouble();

        System.out.println("Ingrese la temperatura: ");
        temperature = input.nextDouble();

        mass = (pressure * volume) / (0.37 * (temperature + 460));

        System.out.println("El valor de la masa es: " + mass);
    }
}
