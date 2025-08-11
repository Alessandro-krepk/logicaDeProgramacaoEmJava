package exerciciosDio;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
//10 - Faça um algoritmo que leia três notas obtidas por um aluno,
// e imprima na tela a média das notas.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        double notaMedia = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua nota media é: %.2f%n", notaMedia);
        scanner.close();
    }
}
