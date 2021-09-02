package com.uniftec.matheus.unidade1;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num1, num2, result;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextFloat();

        if (num2 == 0) {
            System.out.println("Não existe divisão por 0!");
        } else {

            result = num1/num2;

            System.out.printf("O resultado da divisão entre %.2f e %.2f é: %.2f\n", num1, num2, result);

            if (result>=10) {

                System.out.println("O resultado é maior ou igual a 10!");

            } else {

                System.out.println("O resultado é menor do que 10!");

            }
        }
    }
}
