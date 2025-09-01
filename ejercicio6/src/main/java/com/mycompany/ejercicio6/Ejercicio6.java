/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio6;

/**
 *
 * @author lechu
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        double[][] notas = {
            {3.5, 4.0, 2.8}, // estudiante 1
            {4.5, 3.2, 3.8}, // 2
            {2.9, 3.5, 4.1}  // 3
        };

        // Promedio para cada estudiante
        for (int i = 0; i < 3; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notas[i][j];
            }
            System.out.println("Promedio del estudiante " + (i+1) + ": " + (suma/3));
        }

        // Promedio por asignatura
        for (int j = 0; j < 3; j++) {
            double suma = 0;
            for (int i = 0; i < 3; i++) {
                suma += notas[i][j];
            }
            System.out.println("Promedio de la asignatura " + (j+1) + ": " + (suma/3));
        }
    }
}
