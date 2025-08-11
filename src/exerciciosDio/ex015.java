package exerciciosDio;

import java.util.Scanner;
import java.util.Locale;

public class ex015 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Boa prática para aceitar o ponto (.)

        System.out.println("--- Data de Nascimento ---");
        System.out.print("Digite o ano em que nasceu: ");
        int anoNascimento = scanner.nextInt();
        System.out.print("Digite o mês em que nasceu: ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Digite o dia em que nasceu: ");
        int diaNascimento = scanner.nextInt();

        int anoAtual = 2025;
        int mesAtual = 8;
        int diaAtual = 11;

        int totalDiasAtual = (anoAtual * 365) + (mesAtual * 30) + diaAtual;

        int totalDiasNascimento = (anoNascimento * 365) + (mesNascimento * 30) + diaNascimento;

        int totalDiasVividos = totalDiasAtual - totalDiasNascimento;

        int anos = totalDiasVividos / 365;


        int diasRestantes = totalDiasVividos % 365;


        int meses = diasRestantes / 30;


        int dias = diasRestantes % 30;

        System.out.println("\n--- Tempo de Vida Calculado ---");
        System.out.printf("Você já viveu aproximadamente: %d anos, %d meses e %d dias.%n", anos, meses, dias);

        scanner.close();
    }
}