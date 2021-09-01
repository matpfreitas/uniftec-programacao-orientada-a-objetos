package com.uniftec.matheus;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numero;
        boolean excecao = true;

        while (excecao == true) {
            try {

                System.out.println("Digite um número em formato double: ");
                numero = scan.nextDouble();
                System.out.println("O número digitado foi: " + numero);
                excecao = false;

            } catch (Exception e) {

                System.out.println("Número digitado deve estar no formato 'double'");
                scan.next().charAt(0);
            }
        }
    }
}
