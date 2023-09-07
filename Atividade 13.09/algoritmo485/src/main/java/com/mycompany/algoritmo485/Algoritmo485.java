/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo485;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo485 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[6];
        char[] num1 = new char[6];
        int L;

        for (L = 0; L < 6; L++) {
            System.out.print("Digite o número " + (L + 1) + ": ");
            num[L] = scanner.nextInt();
        }

        for (L = 0; L < 6; L++) {
            System.out.print("Digite o caractere " + (L + 1) + ": ");
            num1[L] = scanner.next().charAt(0);
        }

        Multivetor.multivetor(num, num1, 6);
    }
}
