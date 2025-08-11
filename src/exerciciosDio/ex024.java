package exerciciosDio;

import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        //Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
        // As informações fornecidas serão: valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS.
        // Imprima na tela o salário líquido final.
        double horaAula;
        double aulasLecionadas;
        double descontoInssPercentual;
        double valorDescontoINSS;
        double salarioBruto;
        double salarioLiquido;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da sua hora de serviço: ");
        horaAula = scanner.nextDouble();
        System.out.print("Digite o numero de aulas lecionadas: ");
        aulasLecionadas = scanner.nextDouble();
        System.out.print("Digite o desconto de INSS aplicavél em %: ");
        descontoInssPercentual = scanner.nextDouble();
        salarioBruto = horaAula * aulasLecionadas;
        valorDescontoINSS = salarioBruto * (descontoInssPercentual / 100);
        salarioLiquido = salarioBruto - valorDescontoINSS;
        System.out.println("\n--- Holerite ---");
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS (%.1f%%): R$ %.2f%n", descontoInssPercentual, valorDescontoINSS);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
        scanner.close();
    }
}
