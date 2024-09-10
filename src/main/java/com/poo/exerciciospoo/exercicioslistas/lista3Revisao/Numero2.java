package com.poo.exerciciospoo.exercicioslistas.lista3Revisao;

import java.util.Scanner;

/*2) Desenvolva um programa que receba um número do usuário e escreva a
tabuada dele. */

public class Numero2 {
    public static void resolucao(){

        Scanner leia = new Scanner(System.in);

        int numero, tabuada, resultado;

        System.out.print("Por favor, digite um número: ");
        numero = leia.nextInt();

        for (tabuada = 0; tabuada <= 10 ; tabuada++) {
            resultado = numero*tabuada;
            System.out.println(numero+ " x " +tabuada+ " = " +resultado);
            
        }
        leia.close();
    }
}
