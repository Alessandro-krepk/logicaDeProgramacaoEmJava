package exerciciosDio;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor boleano: ");
        boolean valor1 = scanner.nextBoolean();
        System.out.println("Digite outro valor boleano: ");
        boolean valor2 = scanner.nextBoolean();
        if (valor1 == false && valor2 == false){
            System.out.println("Ambos são Falso!");
        } else if (valor1 == true && valor2 == true) {
            System.out.println("Ambos são Verdadeiro!");
        } else {
            System.out.println("Eles tem valores booleanos diferentes!");
        }
        scanner.close();
    }
}
