/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author lechu
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero = 3; // ejemplo
        int contador = 1;

        System.out.println("Los primeros 5 multiplos de " + numero + " son:");
        while (contador <= 5) {
            System.out.println(numero * contador);
            contador++;
        }
    }
}
