/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;
/**
 *
 * @author lechu
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int dia = 4; // usa un valor entre 1 y 7

        if (dia >= 1 && dia <= 5) {
            System.out.println("Es un dia laboral");
        } else if (dia == 6 || dia == 7) {
            System.out.println("Es fin de semana");
        } else {
            System.out.println("Numero invalido. Debe ser entre 1 y 7.");
        }
    }
}

    
