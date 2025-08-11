package exerciciosDio;

import java.util.Scanner;


public class ex016 {
    public static void main(String[] args) {
          /*
          16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo
          e verifique se são válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
          regra para validade de um triangulo:
          "A soma de dois lados quaisquer de um triângulo deve ser sempre maior que o terceiro lado."
          Triângulo Equilátero: Todos os três lados têm o mesmo comprimento.
          Triângulo Isósceles: Possui exatamente dois lados com o mesmo comprimento.
          Triângulo Escaleno: Todos os três lados têm comprimentos diferentes.
            */

        double valorA;
        double valorB;
        double valorC;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro valor do triângulo:");
        valorA = scanner.nextDouble();
        System.out.print("Digite o segundo valor do triângulo:");
        valorB = scanner.nextDouble();
        System.out.print("Digite o terceiro valor do triângulo:");
        valorC = scanner.nextDouble();

        if ((valorA + valorB) > valorC && (valorC + valorA) > valorB && (valorC + valorB) > valorA) {
            if (valorA == valorB && valorB == valorC) {
                System.out.println("O seu triângulo é do tipo Equilátero ");
            } else if (valorA != valorB && valorB != valorC && valorA != valorC) {
                System.out.println("O seu triângulo é do tipo Escaleno");
            } else {
                System.out.println("O seu triângulo é do tipo Isósceles");
            }
        } else {
            System.out.println("Os numeros não correspondem a um triângulo valido!");
        }
        scanner.close();
    }
}
