package exerciciosDio;

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        //22 - Faça um algoritmo que leia dois valores inteiros A e B,
        // imprima na tela o quociente e o resto da divisão inteira entre eles.
        int A;
        int B;
        int quociente;
        int restoDivisao;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de A:");
        A = scanner.nextInt();
        System.out.print("Digite o valor de B:");
        B = scanner.nextInt();
        quociente = A / B;
        restoDivisao = A % B;
        System.out.println("O quociente da divisão é:" + quociente);
        System.out.println("O resto da divisão é:" + restoDivisao);

        scanner.close();
    }
}
