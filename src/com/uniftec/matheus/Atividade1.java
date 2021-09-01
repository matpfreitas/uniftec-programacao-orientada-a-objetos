package com.uniftec.matheus;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num1, num2, multi, divi;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextFloat();
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
        } else {
            multi = num1 * num2;
            divi = num1 / num2;

            System.out.printf("O valor da multiplicação entre %.2f e %.2f é de: %.2f\n", num1, num2, multi);
            System.out.printf("O valor da divisão entre %.2f e %.2f é de: %.2f", num1, num2, divi);
        }

    }

}
