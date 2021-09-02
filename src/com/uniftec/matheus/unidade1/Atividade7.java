package com.uniftec.matheus.unidade1;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro número do intervalo: ");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo número do intervalo: ");
        num2 = scan.nextInt();

        for (int i=num1; i<=num2; i++) {

            System.out.println(i);

        }

    }

}
