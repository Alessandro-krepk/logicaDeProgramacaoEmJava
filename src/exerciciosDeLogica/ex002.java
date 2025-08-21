package exerciciosDeLogica;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        /*
        Enunciado:
        Usando o código que lê 5 números para um array como base, adicione uma nova funcionalidade. Depois de o laço percorrer o array, o programa deve calcular e imprimir:
        A soma de todos os números no array.
        A média de todos os números.
        O maior número digitado.
        O menor número digitado.
        */
        // Etapa 1: iniciar o array e variaveis
        int[] array = new int[5];
        int soma = 0;
        double media;
        // Etapa 2: chamar o scanner para receber o input do usuario.
        Scanner scanner = new Scanner(System.in);

        // Etapa 3: Pedir o input do usuario e receber o input dele.
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            array[i] = scanner.nextInt();
        }
        int numeroMaior = array[0];
        int numeroMenor = array[0];
        // Etapa 4: resolver os problemas de calculo de Soma,Média, Maior que e Menos valor
        for (int j : array) {
            if (numeroMaior < j) {
                numeroMaior = j;
            }
            if (numeroMenor > j) {
                numeroMenor = j;
            }
            soma += j;
        }
        media = soma / 5.0;
        System.out.println("--- Análise dos números ---");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("O maior número digitado: " + numeroMaior);
        System.out.println("O menor número digitado: " + numeroMenor);
        scanner.close();
    }
}
