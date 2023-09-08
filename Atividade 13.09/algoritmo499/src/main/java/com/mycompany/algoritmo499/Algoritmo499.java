/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo499;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo499 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int L, flag, op;

        flag = 0;

        for (L = 0; L < 5; L++) {
            num[L] = 0;
        }

        do {
            System.out.println("\n\n");
            System.out.println("MENU VETOR - FUNCAO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    VetorUtil.entrada(num, 5);
                    flag = 1;
                    break;

                case 2:
                    if (flag == 1) {
                        VetorUtil.ordena(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;

                case 3:
                    if (flag == 1) {
                        VetorUtil.imprime(num, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcao 1");
                    }
                    break;

                case 4:
                    System.out.println("\nSaindo do Algoritmo");
                    break;

                default:
                    System.out.println("\nOpcao invalida");
            }
        } while (op != 4);
    }
}
