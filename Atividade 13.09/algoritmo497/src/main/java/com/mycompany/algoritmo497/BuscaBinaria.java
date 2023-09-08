/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo497;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class BuscaBinaria {
    public static int busca(int[] vet, int tam, int chave) {
        int i,ini, meio, fim;
        
        ini = 0;
        fim = tam - 1;

        while (ini <= fim) {
            meio = (ini + fim) / 2;

            if (chave == vet[meio]) {
                return meio;
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        meio = -1;
        return meio;
    }

    public static void ordena(int[] vet, int tam) {
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
    }
}
