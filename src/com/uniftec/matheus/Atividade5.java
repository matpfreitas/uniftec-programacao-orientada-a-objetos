package com.uniftec.matheus;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        try {
            int num;

            System.out.println("Informe um número correspondente aos meses do ano: ");

            num = scan.nextInt();

            switch (num) {
                case 1:
                    System.out.println("1ª parte");
                    break;
                case 2:
                    System.out.println("1ª parte");
                    break;
                case 3:
                    System.out.println("2ª parte");
                    break;
                case 4:
                    System.out.println("2ª parte");
                    break;
                case 5:
                    System.out.println("3ª parte");
                    break;
                case 6:
                    System.out.println("3ª parte");
                    break;
                case 7:
                    System.out.println("4ª parte");
                    break;
                case 8:
                    System.out.println("4ª parte");
                    break;
                case 9:
                    System.out.println("5ª parte");
                    break;
                case 10:
                    System.out.println("5ª parte");
                    break;
                case 11:
                    System.out.println("6ª parte");
                    break;
                case 12:
                    System.out.println("6ª parte");
                    break;
                default:
                    System.out.println("Número não correspondente aos meses do ano.");
            }

        } catch (Exception NumberFormatException) {

            System.out.println("Número deve ser inteiro.");

        }

    }
}
