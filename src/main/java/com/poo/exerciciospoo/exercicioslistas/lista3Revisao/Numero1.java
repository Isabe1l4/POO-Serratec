package com.poo.exerciciospoo.exercicioslistas.lista3Revisao;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/*1) Escreva um programa que sirva como um cronômetro. O usuário deve
    digitar um numero em segundos e o programa deve contabilizar os segundos
    digitados. O programa deve receber somente números entre 1 e 59, do
    contrário ele retornar um erro e solicitar que o usuário digite um número válido.*/

public class Numero1 {
    public static void resolucao3() throws InterruptedException{

        Scanner leia = new Scanner(System.in);

        int numeroSegundos;

        System.out.print("Por favor, digite um número: ");
        numeroSegundos = leia.nextInt();

       while (numeroSegundos < 1 || numeroSegundos > 59) {
        System.out.print("Por favor, digite um número válido.");
        numeroSegundos = leia.nextInt();
        }
            for (int i = 0; i <= numeroSegundos; i++) {
            System.out.println("00:"+i);
            TimeUnit.SECONDS.sleep(1);
        
       }
    
       leia.close();
       
    }


}
