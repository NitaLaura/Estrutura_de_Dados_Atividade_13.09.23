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
    public static int[] entrada(int[] vet, int t, String c) {
        Scanner scanner = new Scanner(System.in);
        int L;
        
        System.out.println("Entrada do VETOR " + c);
        for (L = 0; L < t; L++) {
            System.out.print("Digite número " + (L + 1) + ": ");
            vet[L] = scanner.nextInt();
        }
        return vet;
    }

    public static void imprime(int[] vet, int t, String c) {
        int L;    
        System.out.println("VETOR " + c);
        for (L = 0; L < t; L++) {
            System.out.println((L + 1) + " - " + vet[L]);
        }
    }

    public static void soma(int[] vet, int[] vet1, int t) {
        int L, s;
        
        System.out.println("SOMA");
        for (L = 0; L < t; L++) {
        s = vet[L] + vet1[L];
        System.out.println(s);
        }
    }
    
    public static void subtrai(int[] vet, int[] vet1, int t) {
        int L, d;
        
        System.out.println("DIFERENCA");
        for (L = 0; L < t; L++) {
        d = vet[L] - vet1[L];
        System.out.println(d);
        }
    }
}
