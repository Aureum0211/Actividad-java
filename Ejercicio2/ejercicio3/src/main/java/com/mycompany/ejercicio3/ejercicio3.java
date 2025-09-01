/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author lechu
 */
public class ejercicio3 {
    public static void main(String[] args) {
        int numero = 28; // ejemplo
        int contador = 0;

        System.out.println("Los divisores de " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
                contador++;
            }
        }
        System.out.println("Cantidad de divisores: " + contador);
    }
}
