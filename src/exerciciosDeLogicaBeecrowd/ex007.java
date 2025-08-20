package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex007 {
    /*
     * Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km)
     * e o total de combustível gasto (em litros).
     * Entrada:
     * - Um valor inteiro X representando a distância total percorrida (em Km)
     * - Um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.
     *
     * Saída:
     * - Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Interação com o usuário
        System.out.println("Bem-vindo ao cálculo do consumo médio de combustível!");
        System.out.print("Digite a distância total percorrida (em Km): ");
        double distanciaTotalPercorrida = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double totalDeCombustivelGasto = scanner.nextDouble();

        // Cálculo do consumo médio
        double consumoMedioDoCombustivel = distanciaTotalPercorrida / totalDeCombustivelGasto;

        System.out.printf("O consumo médio é: %.3f km/l\n", consumoMedioDoCombustivel);

        scanner.close();
    }
}