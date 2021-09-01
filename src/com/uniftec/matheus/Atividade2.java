package com.uniftec.matheus;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num1, num2, num3, num4, result;

        System.out.println("Digite o primeiro número: ");
        num1 = scan.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = scan.nextFloat();

        System.out.println("Digite o terceiro número: ");
        num3 = scan.nextFloat();

        if (num3 == 0) {
            System.out.println("Não existe divisão por 0!");
        } else {

            System.out.println("Digite o quarto número: ");
            num4 = scan.nextFloat();

            result = ((num1 + num2) / num3) - num4;
            System.out.printf("O resultado de ((%.2f+%.2f)/%.2f)-%.2f = %.2f", num1, num2, num3, num4, result);

        }

    }

}
