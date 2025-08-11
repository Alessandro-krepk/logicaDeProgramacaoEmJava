package exerciciosDio;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
//        2 - Faça um algoritmo para receber um número qualquer e
//        imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite um numero para verificação:");
        int numero = scanner.nextInt();
        if (numero % 2 == 0 ) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
        if (numero < 0) {
            System.out.println("e o numero é negativo!");
        } else if (numero == 0){
            System.out.println("Zero é um numero neutro");
        } else {
            System.out.println("e o numero é positivo!");
        }

        scanner.close();
    }
}
