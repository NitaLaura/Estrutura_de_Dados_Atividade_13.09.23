/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmo483;

/**
 *
 * @author Nyta
 */
public class ProdutoInterno {
    public static int produtointerno(int[] vet1, int[] vet2, int quant) {
        int produto, i;
        
        produto = 0;
        
        for (i = 0; i < quant; i++) {
            produto += (vet1[i] * vet2[i]);
        }
        
        return produto;
    }
}