package com.poo.exerciciospoo.exercicioslistas.lista3Revisao;

import java.util.Scanner;

/*3) Escreva um código que receba dois números inteiros e escreva todos os
números pares entre eles.*/

public class Numero3 {
    public static void resolucao(){

        Scanner leia = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Por favor, digite um número: ");
        numero1 = leia.nextInt();

        System.out.print("Por favor, digite um número: ");
        numero2 = leia.nextInt();

        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);
        
        System.out.println("Números pares entre " + inicio + " e " + fim + ": ");

        for (int i = inicio; i <= fim; i++) {
            if(i % 2 == 0){

                System.out.print(i+" ");
    
            } 
        }
        
        leia.close();
    }

}
