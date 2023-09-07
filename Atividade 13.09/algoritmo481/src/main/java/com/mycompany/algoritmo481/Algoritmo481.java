/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo481;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo481 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número maior ou igual a 0: ");
        int num = scanner.nextInt();

        while (num < 0) {
            System.out.print("Número negativo. Digite um número maior ou igual a 0: ");
            num = scanner.nextInt();
        }

        System.out.print("Digite a base em que deseja representá-lo (2-10): ");
        int base = scanner.nextInt();

        while (base < 2 || base > 10) {
            System.out.print("Não sei converter. Digite a base em que deseja representá-lo (2-10): ");
            base = scanner.nextInt();
        }

        int resultado = ConversorBase.converteParaBase(num, base);

        System.out.println("Número em decimal: " + num);
        System.out.println("Número na base " + base + ": " + resultado);
    }
}