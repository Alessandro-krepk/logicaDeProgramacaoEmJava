package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex008 {
    /*
     * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
     * p1(x1, y1) e p2(x2, y2) e calcule a distância entre eles, mostrando 4 casas decimais, segundo a fórmula:
     * Distancia = √((x2 - x1)² + (y2 - y1)²)
     *
     * Entrada:
     * - A primeira linha contém dois valores de ponto flutuante: x1 y1
     * - A segunda linha contém dois valores de ponto flutuante: x2 y2
     *
     * Saída:
     * - Imprima o valor da distância conforme a fórmula, considerando 4 casas decimais.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Interação com o usuário
        System.out.println("Bem-vindo ao cálculo de distância entre dois pontos no plano.");
        System.out.print("Digite os valores de x1 e y1 (separados por espaço): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Digite os valores de x2 e y2 (separados por espaço): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Cálculo da distância
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("A distância entre os pontos é: %.4f\n", distancia);

        scanner.close();
    }
}