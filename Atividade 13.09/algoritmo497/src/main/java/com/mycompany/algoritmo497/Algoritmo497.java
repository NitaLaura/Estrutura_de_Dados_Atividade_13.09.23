/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo497;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo497 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int L, c, n;

        for (L = 0; L < 10; L++) {
            System.out.print("Digite número " + (L+1) + ": ");
            num[L] = scanner.nextInt();
        }

        System.out.print("Digite o número de busca: ");
        n = scanner.nextInt();

        BuscaBinaria.ordena(num, 10);
        c = BuscaBinaria.busca(num, 10, n);

        System.out.println("VETOR");
        for (L = 0; L < 10; L++) {
            System.out.println(L + 1 + " - " + num[L]);
        }

        if (c != 0) {
            System.out.println("Posição no vetor: " + (c + 1));
        } else {
            System.out.println("Não encontrado.");
        }
    }
}
