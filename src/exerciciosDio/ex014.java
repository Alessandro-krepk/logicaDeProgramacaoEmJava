package exerciciosDio;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        //14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
        int A;
        int B;
        int temporario = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        A = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        B = scanner.nextInt();
        temporario = A;
        A = B;
        System.out.println(A);
        B = temporario;
        System.out.println(B);
        scanner.close();

        // a logica deste exercicio se basea no seguinte raciocinio,
        //eu não consigo colocar o valor de b em a e depois recuperar esse valor de b para colocar em a
        // é como colocar suco (a) dentro da agua (b) e depois querer usar o a que não tera o mesmo estado anterior
        // então é necessario criar um terceira variavel de caracter temporario para armazenar o valor de a para
        // poder ser usado posteriormente para atribuir esse valor a variavel b

    }
}
