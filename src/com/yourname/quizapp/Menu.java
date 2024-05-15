package com.yourname.quizapp;

import java.util.Scanner;

public class Menu {
    public void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una asignatura:");
            System.out.println("1. FOL");
            System.out.println("2. Programación A");
            System.out.println("3. Programación B");
            System.out.println("4. Lenguaje de Marcas");
            System.out.println("5. Bases de Datos B");
            System.out.println("6. Entornos de Desarrollo");
            System.out.println("0. Salir");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Quiz folQuiz = new Quiz("FOL");
                    folQuiz.start();
                    break;
                case 2:
                    Quiz programacionAQuiz = new Quiz("Programación A");
                    programacionAQuiz.start();
                    break;
                case 3:
                    Quiz programacionBQuiz = new Quiz("Programación B");
                    programacionBQuiz.start();
                    break;
                case 4:
                    Quiz lenguajeMarcasQuiz = new Quiz("Lenguaje de Marcas");
                    lenguajeMarcasQuiz.start();
                    break;
                case 5:
                    Quiz basesDatosBQuiz = new Quiz("Bases de Datos B");
                    basesDatosBQuiz.start();
                    break;
                case 6:
                    Quiz entornosDesarrolloQuiz = new Quiz("Entornos de Desarrollo");
                    entornosDesarrolloQuiz.start();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
