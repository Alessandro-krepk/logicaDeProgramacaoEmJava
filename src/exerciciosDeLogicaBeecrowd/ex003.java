package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex003 {
    /*
     * Peça ao usuário para digitar dois números inteiros: um número inicial e um número final.
     * Percorra todos os números nesse intervalo (do inicial até o final, inclusive) e, ao final,
     * imprima duas somas separadas: a soma de todos os números pares e a soma de todos os números ímpares.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita os números inicial e final do intervalo
        System.out.print("Digite o número inicial: ");
        int numeroInicial = sc.nextInt();
        System.out.print("Digite o número final: ");
        int numeroFinal = sc.nextInt();

        int somaNumeroPar = 0;
        int somaNumeroImpar = 0;

        // Percorre o intervalo e acumula as somas dos pares e ímpares
        for (int i = numeroInicial; i <= numeroFinal; i++) {
            if (i % 2 == 0) {
                somaNumeroPar += i;
            } else {
                somaNumeroImpar += i;
            }
        }

        // Exibe os resultados
        System.out.println("Soma dos números pares: " + somaNumeroPar);
        System.out.println("Soma dos números ímpares: " + somaNumeroImpar);

        sc.close();
    }
}