package com.uniftec.matheus.unidade1;

import java.util.Scanner;

public class Atividade9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float[] vetor = new float[3];

        boolean excecao;

        for (int i = 0; i <= 2; i++) {

            excecao = true;
            while (excecao == true) {

                try {
                    System.out.println("Digite o valor da posição " + (i + 1) + " do vetor:");
                    vetor[i] = scan.nextFloat();
                    excecao = false;
                } catch (Exception e) {
                    System.out.println("Digite um valor válido!");
                    scan.next().charAt(0);
                }
            }
        }

        System.out.printf("Vetor = [ ");

        for (int i = 0; i <= 2; i++) {

            System.out.printf("%.2f ", vetor[i]);
            if (i==2) {
                System.out.printf("]");
            }
        }

    }

}
