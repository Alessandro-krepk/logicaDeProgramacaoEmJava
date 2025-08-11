package exerciciosDio;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        //3 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
        String name;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite o seu nome:");
        name = scanner.nextLine();
        System.out.println("Por favor digite sua idade:");
        age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Seu nome é: " + name + " e você tem " + age + " anos e é maior de idade");
        } else {
            System.out.println("Seu nome é: " + name + " e você tem " + age + " anos e é menor de idade.");
        }

        scanner.close();

    }
}
