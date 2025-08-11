package exerciciosDio;

public class ex018 {
    public static void main(String[] args) {
        /*
        18 - Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
        Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Sara  seja maior que Francisco.
         */
        double francisco = 1.50;
        double sara = 1.10;

        double contador = 0;
        while (francisco > sara) {
            francisco = francisco + 0.02; // Francisco cresce 2 cm
            sara = sara + 0.03;      // Sara cresce 3 cm
            contador = contador + 1;     // Passa um ano
        }
        System.out.println("Sara ultrapassará Francisco em " + contador + " anos.");
    }
}
