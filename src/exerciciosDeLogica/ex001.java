package exerciciosDeLogica;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
     /*
    Enunciado:
    Faça um programa que peça ao usuário para digitar 5 números inteiros. Guarde esses 5 números em um array.
    Depois que o usuário digitar todos os números, use um laço de repetição para imprimir na tela cada um dos números que foram guardados.
     */
        // Etapa 1: iniciar o array
        int[] array = new int[5];
        // Etapa 2: chamar o scanner para receber o input do usuario.
        Scanner scanner = new Scanner(System.in);

        // Etapa3: Pedir o input do usuario e receber o input dele.
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Os números guardados foram: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // segunda forma de fazer:
        /*
        for (int i : array) {
            System.out.println(i);
        }
        */
        scanner.close();
    }
}
