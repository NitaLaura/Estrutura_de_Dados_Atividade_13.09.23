/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo499;
import java.util.Scanner;

/**
 *
 * @author Nyta
 */
public class Algoritmo500 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int[] num1 = new int[5];
        int L, flag, flag1, op;
        
        flag = 0;
        flag1 = 0;
        
        for(L = 0; L < 5; L++){
            num[L] = 0;
            num1[L] = 0;
        }
        do {
            System.out.println("\n\n\n");
            System.out.println("VETORES");
            System.out.println("1 Dados do VETOR A");
            System.out.println("2 Dados do VETOR B");
            System.out.println("3 Imprime VETORES");
            System.out.println("4 Soma VETORES");
            System.out.println("5 Subtrai VETORES");
            System.out.println("6 Sai do programa");
            System.out.println("OPCAO: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    VetorUtil.entrada(num, 5, "A");
                    flag = 1;
                    break;
                    
                case 2:
                    VetorUtil.entrada(num1, 5, "B");
                    flag1 = 1;
                    break;
                    
                case 3:
                    if (flag != 0 && flag1 != 0) {
                        VetorUtil.imprime(num, 5, "A");
                        VetorUtil.imprime(num1, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                    
                case 4:
                    if (flag != 0 && flag1 != 0) {
                        VetorUtil.soma(num, num1, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                    
                case 5:
                    if (flag != 0 && flag1 != 0) {
                        VetorUtil.subtrai(num, num1, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                    
                case 6:
                    System.out.println("Saindo do Algoritmo");
                    break;
                
                default:
                    System.out.println("\nOpcao invalida");
            }
        } while (op != 6);
        
        System.out.print("\n");
    }
}
