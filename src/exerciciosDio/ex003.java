package exerciciosDio;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
//        3 - Faça um algoritmo que leia dois valores inteiros A e B,
//        se os valores de A e B forem iguais, deverá somar os dois valores
//        caso contrário devera multiplicar A por B.
//        Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//        imprimir seu valor na tela.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int valorA = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        int valorB = scanner.nextInt();
        if (valorA == valorB) {
            int valorTotal = valorA + valorB;
            System.out.println("Os dois numero são iguais e o resultado da soma é : " + valorTotal);
        } else {
            int C = valorA * valorB;
            System.out.println("Os valores não são iguais! e o resultado da multiplicação é: " + C);
        }
        scanner.close();
    }
}
