/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo495;

/**
 *
 * @author Nyta
 */
public class OrdenaNomes {
    public static void ordena(String[][] vet, int tam) {
        int L1, c1;
        String aux;
        
        for (L1 = 0; L1 < tam - 1; L1++) {
            for (c1 = L1 + 1; c1 < tam; c1++) {
                if (vet[L1][0].compareTo(vet[c1][0]) > 0) {
                    aux = vet[L1][0];
                    vet[L1][0] = vet[c1][0];
                    vet[c1][0] = aux;
                }
            }
        }
    }
}
