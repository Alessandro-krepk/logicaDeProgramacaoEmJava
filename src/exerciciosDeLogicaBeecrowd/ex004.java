package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex004 {
    /*
    Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
    A fórmula para calcular o volume é: (4/3) * pi * R³. Considere (atribua) para pi o valor 3.14159.
    Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++),
    assumem que o resultado da divisão entre dois inteiros é outro inteiro.

    Entrada:
    - O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.

    Saída:
    - A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualdade.
      O valor deverá ser apresentado com 3 casas após o ponto.
      Exemplo de saída: VOLUME = 113.097
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o valor do raio
        System.out.print("Digite o valor do raio da esfera: ");
        double r = sc.nextDouble();

        double pi = 3.14159;
        double volume = (4.0/3) * pi * (r * r * r);

        // Exibe o resultado conforme especificado
        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();
    }
}