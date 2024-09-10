package com.poo.exerciciospoo.exercicioslistas.lista1Revisao;

import java.util.Scanner;

/*1) Escreva um programa que faça a soma entre 2 números. */

    public class Numero1 {
        public static void resolucao(){

            Scanner leia = new Scanner(System.in);

            int numero1, numero2;

            System.out.print("Digite um número ");
            numero1 = leia.nextInt();
            System.out.print("Digite outro número ");
            numero2 = leia.nextInt();

            System.out.print("A soma entre os números é de: "+(numero1+numero2)+".");

            leia.close();
        }


}
