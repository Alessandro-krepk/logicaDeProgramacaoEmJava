package exerciciosDio;

public class ex001 {
//    1 - Faça um algoritmo que leia os valores de A, B, C e
//    em seguida imprima na tela a soma entre A e B é mostre
//    se a soma é menor que C.
public static void main(String[] args) {
    int A = 1;
    int B = 5;
    int C = 3;
    int soma = A + B;
    System.out.println("A soma de A + B é: " + soma);
    if(soma > C) {
        System.out.println("A soma de A e B é maior que C");
    } else {
        System.out.println("A soma de A e B é menor que C");
    }
}
}
