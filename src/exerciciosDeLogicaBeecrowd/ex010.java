package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        /*
         * Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem,
         * ao utilizar um automóvel que faz 12 KM/L.
         *
         * Para isso, ele gostaria que você o auxiliasse através de um simples programa.
         * Para efetuar o cálculo, deve-se fornecer:
         * - Tempo gasto na viagem (em horas);
         * - Velocidade média da viagem (em km/h).
         * Com essas informações, calcula-se a distância percorrida e, em seguida, o combustível necessário.
         * O resultado deve ser exibido com três dígitos após o ponto decimal.
         */
        double gastoCombustivelPorLitro = 12; // rendimento em Km/L
        int velocidadeMediaNaViagem;
        int tempoGastoNaViagem;
        int distanciaPercorrida;
        double combustivelGastoNaViagem;

        Scanner scanner = new Scanner(System.in);
        // Leitura dos dados de entrada
        System.out.println("Bem-vindo ao cálculo de combustível!");
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        tempoGastoNaViagem = scanner.nextInt();
        System.out.print("Digite a velocidade média da viagem (em km/h): ");
        velocidadeMediaNaViagem = scanner.nextInt();

        // Cálculo da distância percorrida e do combustível gasto na viagem
        distanciaPercorrida = velocidadeMediaNaViagem * tempoGastoNaViagem;
        combustivelGastoNaViagem = distanciaPercorrida / gastoCombustivelPorLitro;
        System.out.printf("Para uma viagem de %d km, você precisará de %.3f litros de combustível.%n", distanciaPercorrida, combustivelGastoNaViagem);

        scanner.close();
    }
}
