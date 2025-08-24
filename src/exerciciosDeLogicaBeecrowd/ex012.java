package exerciciosDeLogicaBeecrowd;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
     /*
    Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato
     horas:minutos:segundos.
     Entrada
    O arquivo de entrada contém um valor inteiro N.
    Saída
    Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
    Exemplo de Entrada: 556 / Exemplo de  Saída: 0:9:16
    */
        Scanner scanner = new Scanner(System.in);
        int totalSegundos = scanner.nextInt();
        int horas = (totalSegundos / 60) / 60;
        int minutos = (totalSegundos / 60) % 60;
        int segundos = totalSegundos % 60;
        System.out.println(horas + ":" + minutos + ":" + segundos);
        scanner.close();
    }
}
