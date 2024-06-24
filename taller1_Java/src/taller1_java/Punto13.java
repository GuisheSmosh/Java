package taller1_java;

import java.util.Scanner;

public class Punto13 {
    double price; double recommendedPrice;
    Scanner input;

    Punto13(){
        price = 0; recommendedPrice = 0;
        input = new Scanner(System.in);
    }

    void setPrice(){
        System.out.println("Ingrese el valor del producto que compra: ");
        price = input.nextDouble();

        recommendedPrice = price / (1-0.3);

        System.out.println("Para obtener un beneficio del 30% debes vender el producto en: " + recommendedPrice);
    }
}
