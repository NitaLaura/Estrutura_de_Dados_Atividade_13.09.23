/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo494;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo494 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L, c;
        String[] nome = new String[3];
        String[] prof = new String[3];
        String[] ender = new String[3];

        for (L = 0; L < 3; L++) {
            System.out.print("Digite nome: ");
            nome[L] = scanner.nextLine();
            System.out.print("Digite endereco: ");
            ender[L] = scanner.nextLine();
            System.out.print("Digite profissao: ");
            prof[L] = scanner.nextLine();
        }

        for (L = 0; L < 2; L++) {
            for (c = L + 1; c < 3; c++) {
                if (nome[L].compareTo(nome[c]) > 0) {
                    TrocaStrings.troca(nome, L, c);
                    TrocaStrings.troca(ender, L, c);
                    TrocaStrings.troca(prof, L, c);
                }
            }
        }

        for (L = 0; L < 3; L++) {
            System.out.println(nome[L] + " " + ender[L] + " " + prof[L]);
        }
    }
}
