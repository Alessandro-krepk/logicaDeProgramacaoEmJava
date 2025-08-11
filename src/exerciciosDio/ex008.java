package exerciciosDio;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int n2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        int n3 = scanner.nextInt();
        // primeiro iremos utilizar a estrutura if else para descobrir o maior numero entre os 3 e depois utilizamos outro if else dentro para saber a ordem dos outros numero
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1);
            if (n2 >= n3) {
                System.out.println(n2);
                System.out.println(n3);
            } else {
                System.out.println(n3);
                System.out.println(n2);
            }
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2);
            if (n1 >= n3) {
                System.out.println(n1);
                System.out.println(n3);
            } else {
                System.out.println(n3);
                System.out.println(n1);
            }
        } else {
            System.out.println(n3);
            if (n2 >= n1) {
                System.out.println(n2);
                System.out.println(n1);
            } else {
                System.out.println(n1);
                System.out.println(n2);
            }
        }

        scanner.close();
    }
}
