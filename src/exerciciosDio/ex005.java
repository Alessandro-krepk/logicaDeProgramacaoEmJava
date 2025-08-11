package exerciciosDio;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
// calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

     // pedir ao usuario o valor do salario para comparativo
        double salarioMinimo = 1293.20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salario atual:");
        double salarioUsuario = scanner.nextDouble();
        double salarioXminimo = salarioUsuario / salarioMinimo;
        System.out.printf("Seu salario é equivalente a %.2f salarios minimos!%n", salarioXminimo);
        scanner.close();
    }
}
