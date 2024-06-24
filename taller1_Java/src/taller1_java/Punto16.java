package taller1_java;

import java.util.Scanner;

public class Punto16 {
    double mathAverage, mathExam, mathTasks, physicAverage, physicExam, physicTasks;
    double chemistryAverage, chemistryExam, chemistryTasks, x, exam;
    double tasks, totalAverage;
    int taskNumber;
    Scanner input;

    Punto16(){
        mathAverage = 0; mathExam = 0; mathTasks = 0; physicAverage = 0; physicExam = 0; physicTasks = 0;
        chemistryAverage = 0; chemistryExam = 0; chemistryTasks = 0; x = 0; taskNumber = 0; tasks = 0; totalAverage = 0;
        input = new Scanner(System.in);
    }

    void getAverage(){
        mathExam = getExam("matematicas");

        System.out.println("Ingresa el numero de tareas que se calificaron en matematicas: ");
        taskNumber = input.nextInt();
        mathTasks = getTaskAverage(taskNumber);

        mathAverage = (mathExam * 0.9) + (mathTasks * 0.1);

        physicExam = getExam("fisica");

        System.out.println("Ingrese el numero de tareas que se calificaron en fisica: ");
        taskNumber = input.nextInt();
        physicTasks = getTaskAverage(taskNumber);

        physicAverage = (physicExam * 0.8) + (physicTasks * 0.2);

        chemistryExam = getExam("quimica");

        System.out.println("Ingrese el numero de tareas que se calificaron en quimica: ");
        taskNumber = input.nextInt();
        chemistryTasks = getTaskAverage(taskNumber);

        chemistryAverage = (chemistryExam * 0.85) + (chemistryTasks * 0.15);

        totalAverage = (mathAverage + physicAverage + chemistryAverage) / 3;
        System.out.println("Su promedio general de las 3 materias es: " + totalAverage);
    }

    double getTaskAverage(int taskNumber){
        tasks = 0;
        for (int i = 1; i < taskNumber+1; i++) {
            System.out.println("Ingrese cuanto obtuvo en la tarea " + i + ": ");
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