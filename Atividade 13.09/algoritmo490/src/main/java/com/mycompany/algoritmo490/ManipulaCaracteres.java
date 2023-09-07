/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo490;

/**
 *
 * @author Nyta
 */
public class ManipulaCaracteres {
    public static int restantes(String[] vet, int tam, String x) {
        int i, cont;        
        cont = 0;
        
        for (i = 0; i < tam; i++) {
            if (vet[i].contains(x)) {
                vet[i] = vet[i].replace(x, "*");
                cont++;
            }
        }

        return cont;
    }
}
