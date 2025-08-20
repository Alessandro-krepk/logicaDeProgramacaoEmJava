package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        int numeroMagico = 42;
        int n1, n2, n3, n4, n5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        n3 = scanner.nextInt();
        System.out.println("Digite o quarto número:");
        n4 = scanner.nextInt();
        System.out.println("Digite o quinto número:");
        n5 = scanner.nextInt();

        if (n1 == numeroMagico || n2 == numeroMagico || n3 == numeroMagico || n4 == numeroMagico || n5 == numeroMagico) {
            System.out.println("Parabens você acertou o numero que era: " + numeroMagico);
        } else {
            System.out.println("Infelizmente você não acertou o numero que era: " + numeroMagico);
        }
        scanner.close();
    }
}