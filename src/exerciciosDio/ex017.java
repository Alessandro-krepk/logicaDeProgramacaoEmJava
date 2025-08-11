package exerciciosDio;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        /*
         17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
         Imprima na tela as duas temperaturas.
         Fórmula: C = (5 * ( F-32) / 9)
         */
        double fahrenheit;
        double celsius;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit:");
        fahrenheit = scanner.nextDouble();
        celsius = (5 * (fahrenheit - 32) / 9);
        System.out.printf("A temperatura em Celsius é : %.1f%n", celsius);
        System.out.printf("A temperatura em Fahrenheit é : %.1f%n", fahrenheit);
        scanner.close();
    }
}