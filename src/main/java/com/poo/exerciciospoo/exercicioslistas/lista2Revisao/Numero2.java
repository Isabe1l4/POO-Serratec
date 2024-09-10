package com.poo.exerciciospoo.exercicioslistas.lista2Revisao;

import java.util.Scanner;

/*2) Desenvolva um algoritmo que seja capaz de receber dois números digitados
pelo usuário e diga qual deles é maior.*/

public class Numero2 {
    public static void resolucao2(){

        Scanner leia = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Por favor, digite o primeiro número: ");
        numero1 = leia.nextInt();

        System.out.print("Por favor, digite o próximo número: ");
        numero2 = leia.nextInt();

        if (numero1 > numero2) {
            System.out.print("O primeiro número digitado é maior que o segundo número digitado.");
            
        }else{
            System.out.print("O segundo número digitado é maior que o primeiro número digitado.");
        }

        leia.close();

    }
}
