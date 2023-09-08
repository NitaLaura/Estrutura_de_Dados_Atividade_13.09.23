/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo499;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class VetorUtil {
    public static int[] entrada(int[] vet, int t) {
        Scanner scanner = new Scanner(System.in);
        int L;

        System.out.print("\nEntrada do VETOR\n");
        for (L = 0; L < t; L++) {
            System.out.print("Digite numero " + (L + 1) + ": ");
            vet[L] = scanner.nextInt();
        }

        return vet;
    }

    public static int[] ordena(int[] vet, int tam) {
        int L1, c1, aux;

        for (L1 = 0; L1 < tam - 1; L1++) {
            for (c1 = L1 + 1; c1 < tam; c1++) {
                if (vet[L1] > vet[c1]) {
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
        
        return vet;
    }

    public static int[] imprime(int[] vet, int t) {
        int L;

        System.out.println("\nVETOR\n");
        for (L = 0; L < t; L++) {
            System.out.println(L + 1 + " - " + vet[L]);
        }
        
        return vet;
    }
}
