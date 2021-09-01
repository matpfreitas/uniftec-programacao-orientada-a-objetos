package com.uniftec.matheus;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float num;

        System.out.println("Digite um número: ");
        num = scan.nextFloat();

        if (num >= 1500) {
            System.out.println("O número digitado é maior ou igual a 1500.");
        } else {
            System.out.println("O número digitado é menor do que 1500.");
        }

    }

}
