/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo481;

/**
 *
 * @author Nyta
 */
public class ConversorBase {
    public static int converteParaBase(int num, int base) {
        int resultado = 0;
        int b = 0;

        while (num >= base) {
            int r = num % base;
            resultado += Math.pow(10, b) * r;
            num /= base;
            b++;
        }

        resultado += Math.pow(10, b) * num;
        return resultado;
    }
}