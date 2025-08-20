package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex006 {
    /*
    Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem "eh o maior".
    Utilize a fórmula:
    Maior entre A e B = (A + B + abs(A - B)) / 2
    Obs.: a fórmula apenas calcula o maior entre os dois primeiros (A e B). Um segundo passo, portanto, é necessário para chegar no resultado esperado.

    Entrada:
    O arquivo de entrada contém três valores inteiros.

    Saída:
    Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
    Exemplo de Saída: 106 eh o maior
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Interação com o usuário
        System.out.println("Bem-vindo ao programa que identifica o maior número!");
        System.out.print("Digite o primeiro valor: ");
        int A = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int B = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int C = scanner.nextInt();

        // Calcula o maior entre A e B utilizando a fórmula
        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorFinal = (maiorAB > C) ? maiorAB : C;

        System.out.println(maiorFinal + " eh o maior");

        scanner.close();
    }
}