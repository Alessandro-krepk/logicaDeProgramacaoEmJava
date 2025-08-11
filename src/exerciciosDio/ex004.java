package exerciciosDio;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
//  4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int ant = numero - 1;
        int suc = numero + 1;
        System.out.println("O antecessor do seu numero é: " + ant + " e o sucessor dele é: " + suc);
        scanner.close();
    }
}
