package exerciciosDeLogica;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
    /*
    Enunciado:
    Faça um programa que peça ao usuário para digitar 4 nomes de frutas. Guarde esses nomes em um array de String.
    Em seguida, o programa deve imprimir a lista de frutas na ordem inversa em que foram digitadas.
    */
        Scanner scanner = new Scanner(System.in);
        String[] arrFrutas = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a " + (i + 1) + " fruta");
            arrFrutas[i] = scanner.nextLine();
        }
        for (int j = 3; j >= 0; j--) {
            System.out.println(arrFrutas[j]);
        }
        scanner.close();
    }
}