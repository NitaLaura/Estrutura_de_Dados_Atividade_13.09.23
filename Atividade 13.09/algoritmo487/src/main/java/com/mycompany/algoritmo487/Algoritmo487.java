/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo487;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo487 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int L;

        for (L = 0; L < 10; L++) {
            System.out.print("Digite o número " + (L + 1) + ": ");
            num[L] = scanner.nextInt();
        }

        InverteVetor.inverte(num, 10);

        System.out.println("\nVETOR");
        for (L = 0; L < 10; L++) {
            System.out.println((L + 1) + " - " + num[L]);
        }
    }
}
