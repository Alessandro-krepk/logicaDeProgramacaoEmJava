package exerciciosDio;

import java.util.Locale;
import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
//Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
//de acordo com a tabela abaixo:
//Fórmula do IMC = peso / (altura) ²
//Tabela Condições IMC
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);

        if (imc <= 18.5 ) {
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal parabéns");
        } else if(imc >= 25.0  && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if(imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I ");
        } else if(imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }
        scanner.close();
    }
}