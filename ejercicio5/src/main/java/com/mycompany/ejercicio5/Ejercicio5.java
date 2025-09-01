/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author lechu
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int base = 10;   // ejemplo
        int altura = 5;  // ejemplo

        int area = calcular_area_rectangulo(base, altura);
        System.out.println("El area del rectangulo es: " + area);
    }

    public static int calcular_area_rectangulo(int base, int altura) {
        return base * altura;
    }
}
