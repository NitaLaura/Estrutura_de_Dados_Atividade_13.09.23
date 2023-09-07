/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo483;
import java.util.Scanner;
        
/**
 *
 * @author Nyta
 */
public class Algoritmo483 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[4];
        int[] num1 = new int[4];
        int L, c;

        for (L = 0; L < 4; L++) {
            System.out.print("\nDigite o " + (L + 1) + "º número do vetor A: ");
            num[L] = scanner.nextInt();
        }

        for (L = 0; L < 4; L++) {
            System.out.print("\nDigite o " + (L + 1) + "º número do vetor B: ");
            num1[L] = scanner.nextInt();
        }

        c = ProdutoInterno.produtointerno(num, num1, 4);

        System.out.println("\nVETOR A\tVETOR B");
        for (L = 0; L < 4; L++) {
            System.out.println(num[L] + "\t" + num1[L]);
        }

        System.out.println("\nProduto interno: " + c);
    }
}
