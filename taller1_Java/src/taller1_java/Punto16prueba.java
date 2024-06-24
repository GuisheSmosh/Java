package taller1_java;

import java.util.Scanner;

public class Punto16prueba {
    double mathAverage,  physicAverage;
    double chemistryAverage,  x, exam, tasks, totalAverage;
    String math, physic, chemistry;
    Scanner input;

    Punto16prueba(){
        mathAverage = 0; physicAverage = 0; chemistryAverage = 0; x = 0; tasks = 0; totalAverage = 0;
        math = "matematicas"; physic = "fisica"; chemistry = "quimica";
        input = new Scanner(System.in);
    }

    void getAverage(){
        mathAverage = (getExam(math)* 0.9) + (getTaskAverage(3, math) * 0.1);

        physicAverage = (getExam(physic) * 0.8) + (getTaskAverage(2, physic) * 0.2);

        chemistryAverage = (getExam(chemistry) * 0.85) + (getTaskAverage(3, chemistry) * 0.15);

        totalAverage = (mathAverage + physicAverage + chemistryAverage) / 3;
        System.out.println("Su promedio general de las 3 materias es: " + totalAverage);
    }

    double getTaskAverage(int taskNumber, String subject){
        tasks = 0;
        for (int i = 1; i < taskNumber+1; i++) {
            System.out.println("Ingrese cuanto obtuvo en la tarea " + i + " de " + subject + ": ");
            x = input.nextDouble();
            tasks += x;
        }
        tasks /= taskNumber;
        return tasks;
    }

    double getExam(String subject){
        exam = 0;
        System.out.println("Ingrese cuanto obutvo en el examen de " + subject + ": ");
        return exam = input.nextDouble();
    }
}
