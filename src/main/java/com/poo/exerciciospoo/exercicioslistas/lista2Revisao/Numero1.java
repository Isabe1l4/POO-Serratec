package com.poo.exerciciospoo.exercicioslistas.lista2Revisao;

import java.util.Scanner;

/*1) Escreva um programa que recebe um número digitado pelo usuário e responda
    se o número inserido é par ou ímpar ou 0.*/

    public class Numero1 {
        public static void resolucao(){

            Scanner leia = new Scanner(System.in);

            int numeroDigitado;

            System.out.print("Por favor, digite um número: ");
            numeroDigitado = leia.nextInt();

             if(numeroDigitado == 0){
                System.out.print("Esse número é 0!");

             } else if (numeroDigitado % 2 == 0) {
                System.out.print("O número que você digitou é par!");

            } else{
                System.out.print("O número que você digitou é ímpar!");

            }

            leia.close();
    }

}
