package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex005 {
    /*
    Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.

    Entrada:
    - Três valores com um dígito após o ponto decimal.

    Saída:
    - 5 linhas de dados apresentando a mensagem correspondente e o valor calculado com 3 casas decimais.
    Exemplo:
    TRIANGULO: 7.800
    CIRCULO: 84.949
    TRAPEZIO: 18.200
    QUADRADO: 16.000
    RETANGULO: 12.000
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Interação com o usuário para coletar os valores
        System.out.println("Bem-vindo ao cálculo de áreas.");
        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();

        double pi = 3.14159;

        // Cálculo das áreas
        double areaDoTrianguloRetangulo = (A * C) / 2;
        double areaDoCirculoDoRaioC = pi * (C * C);
        double areaDoTrapezio = ((A + B) * C) / 2;
        double areaDoQuadrado = B * B;
        double areaDoRetangulo = A * B;

        // Exibição dos resultados formatados
        System.out.printf("TRIANGULO: %.3f\n", areaDoTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaDoCirculoDoRaioC);
        System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaDoRetangulo);

        sc.close();
    }
}