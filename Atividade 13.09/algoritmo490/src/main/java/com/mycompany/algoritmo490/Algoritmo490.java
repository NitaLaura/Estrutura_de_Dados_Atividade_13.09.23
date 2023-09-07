/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo490;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo490 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10];
        int L, removidos;

        for (L = 0; L < 10; L++) {
            System.out.print("Digite a palavra em letras minúsculas " + (L + 1) + ": ");
            nome[L] = scanner.next();
        }
        
        for (L = 0; L < 10; L++) {
            removidos = ManipulaCaracteres.restantes(nome, nome.length, "c");
            System.out.println(+ (L + 1) + " - " +nome[L]);
        }
    }
}
