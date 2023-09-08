/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo495;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo495 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int L;
        String[][] nome = new String[5][20];

        for (L = 0; L < 5; L++) {
            System.out.print("Digite nome: ");
            nome[L][0] = scanner.nextLine();
        }

        OrdenaNomes.ordena(nome, 5);

        System.out.println("\nNOMES ORDENADOS");

        for (L = 0; L < 5; L++) {
            System.out.println((L + 1) + " - " + nome[L][0]);
        }
    }
}
