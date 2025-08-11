package exerciciosDio;

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        /*
        22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
        sabendo que o carro faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
        distância percorrida e a quantidade de litros utilizados para fazer a viagem.
        Fórmula: distância = tempo x velocidade.
        litros usados = distância / 12.
        * */
        double tempo;
        double velocidade;
        double distancia;
        double litrosUsados;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo estimado para a viagem:");
        tempo = scanner.nextDouble();
        System.out.print("Digite a velocidade de Km por hora estimada para a viagem:");
        velocidade = scanner.nextDouble();
        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;

        System.out.println("\n--- Resumo da Viagem ---");
        System.out.printf("Tempo gasto: %.1f horas%n", tempo);
        System.out.printf("Velocidade média: %.1f Km/h%n", velocidade);
        System.out.printf("Distância percorrida: %.2f Km%n", distancia);
        System.out.printf("Litros de combustível utilizados: %.2f litros%n", litrosUsados);
        scanner.close();
    }
}
