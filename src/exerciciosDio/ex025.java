package exerciciosDio;

import java.util.Random;

public class ex025 {
    public static void main(String[] args) {
        //21 - Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
        Random randon = new Random();
        int numero = randon.nextInt(100);
        System.out.println("Número aleatório: " + numero);

    }
}
