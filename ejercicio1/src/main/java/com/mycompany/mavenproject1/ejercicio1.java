/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author lechu
 */
public class ejercicio1 {
    public static void main(String[] args) {
        String nombre = "Edward";
        int edad = 20;
        long salarioMensual = 2500000;

        long salarioAnual = salarioMensual * 12;
        int dobleEdad = edad * 2;

        System.out.println("Hola " + nombre + ", tu salario anual es: " + salarioAnual);
        System.out.println("El doble de tu edad es: " + dobleEdad);
    }
}
