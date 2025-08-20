package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo do valor a pagar:");

        System.out.println("\nDigite os dados da peça 1:");
        System.out.print("Código da peça 1: ");
        double codigoPeca1 = scanner.nextDouble();
        System.out.print("Número de peças 1: ");
        double numeroPeca1 = scanner.nextDouble();
        System.out.print("Valor unitário da peça 1: ");
        double valorUnitarioPeca1 = scanner.nextDouble();

        System.out.println("\nDigite os dados da peça 2:");
        System.out.print("Código da peça 2: ");
        double codigoPeca2 = scanner.nextDouble();
        System.out.print("Número de peças 2: ");
        double numeroPeca2 = scanner.nextDouble();
        System.out.print("Valor unitário da peça 2: ");
        double valorUnitarioPeca2 = scanner.nextDouble();

        double total = (numeroPeca1 * valorUnitarioPeca1) + (numeroPeca2 * valorUnitarioPeca2);

        System.out.printf("\nVALOR A PAGAR: R$ %.2f\n", total);

        scanner.close();
    }
}