/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo493;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo493 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int L, c;

        for (L = 0; L < 10; L++) {
            System.out.print("Digite o número " + (L + 1) + ": ");
            num[L] = scanner.nextInt();
        }

        c = VerificaOrdem.verificaordem(num, 10);

        if (c == 1) {
            System.out.println("\nORDENACAO CRESCENTE");
        } else if (c == 2) {
            System.out.println("\nORDENACAO DECRESCENTE");
        } else {
            System.out.println("\nNAO ESTA ORDENADO");
        }
    }
}
