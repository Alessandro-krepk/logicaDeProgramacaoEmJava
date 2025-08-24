package exerciciosDeLogicaBeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
    /*
    Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
    A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
    As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
    A seguir mostre a relação de notas necessárias.
    Entrada: O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
    Saída:Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
    Obs: Utilize ponto (.) para separar a parte decimal.
    */
        int nota100, nota50, nota20, nota10, nota5, nota2, resto;
        double valorDoUsuario;
        int valorUsuarioTransformado, moeda1, moeda050, moeda025, moeda010, moeda005, moeda001;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        valorDoUsuario = scanner.nextDouble();
        valorUsuarioTransformado = (int) (valorDoUsuario * 100);
        nota100 = valorUsuarioTransformado / 10000;
        resto = valorUsuarioTransformado % 10000;
        nota50 = resto / 5000;
        resto = resto % 5000;
        nota20 = resto / 2000;
        resto = resto % 2000;
        nota10 = resto / 1000;
        resto = resto % 1000;
        nota5 = resto / 500;
        resto = resto % 500;
        nota2 = resto / 200;
        resto = resto % 200;
        moeda1 = resto / 100;
        resto = resto % 100;
        moeda050 = resto / 50;
        resto = resto % 50;
        moeda025 = resto / 25;
        resto = resto % 25;
        moeda010 = resto / 10;
        resto = resto % 10;
        moeda005 = resto / 5;
        resto = resto % 5;
        moeda001 = resto / 1;
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50.00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20.00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10.00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5.00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2.00\n", nota2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moeda050);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moeda025);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moeda010);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moeda005);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moeda001);

        scanner.close();
    }
}
