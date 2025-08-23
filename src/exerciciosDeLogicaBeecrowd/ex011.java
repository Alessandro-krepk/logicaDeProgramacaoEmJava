package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex011 {
    /*
    Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
    As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
    Entrada
    O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
    Saída
    Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
    Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
     */
    public static void main(String[] args) {
            // Entrada: leia o valor inteiro inserido pelo usuário.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um valor inteiro de saldo:");
            int n = scanner.nextInt();
            // Processamento: cálculo da quantidade de cada nota necessária.
            int valor = n;

            int qtd100 = valor / 100;
            valor = valor % 100;

            int qtd50 = valor / 50;
            valor = valor % 50;

            int qtd20 = valor / 20;
            valor = valor % 20;

            int qtd10 = valor / 10;
            valor = valor % 10;

            int qtd5 = valor / 5;
            valor = valor % 5;

            int qtd2 = valor / 2;
            valor = valor % 2;

            int qtd1 = valor;
            // Saída: mostra o valor e as notas necessárias para sua composição.
            System.out.println(n);
            System.out.println(qtd100 + " nota(s) de R$ 100,00");
            System.out.println(qtd50 + " nota(s) de R$ 50,00");
            System.out.println(qtd20 + " nota(s) de R$ 20,00");
            System.out.println(qtd10 + " nota(s) de R$ 10,00");
            System.out.println(qtd5 + " nota(s) de R$ 5,00");
            System.out.println(qtd2 + " nota(s) de R$ 2,00");
            System.out.println(qtd1 + " nota(s) de R$ 1,00");
            scanner.close();
        }
    }
