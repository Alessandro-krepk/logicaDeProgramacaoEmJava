package exerciciosDio;

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
        int numeroParaTabuada;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero para o calculo da tabuada:");
        numeroParaTabuada = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroParaTabuada + " X " + i + " = " + (numeroParaTabuada * i));
        }
        scanner.close();
    }
}
