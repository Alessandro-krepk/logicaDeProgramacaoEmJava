package exerciciosDio;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
//Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        double valorReajuste = numero * 0.05;
        double valorAjustado = numero + valorReajuste;
        System.out.printf("Seu numero com reajuste de 5%% é: %.2f%n", valorAjustado);



        scanner.close();
    }
}
