package exerciciosDeLogica;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
    /*
    Enunciado:
    Crie um programa que tenha um array de int com valores pré-definidos.
    Em seguida, peça ao usuário para digitar um número inteiro para ser pesquisado.
    O programa deve percorrer o array para verificar se o número digitado existe. No final, ele deve imprimir uma das seguintes mensagens:
    "O número X foi encontrado!" ou "O número X não foi encontrado.".
    */
        // Etapa 1: inserir as variaveis e informações ja estabelecidas no enunciado
        int[] numeros = {2, 5, 8, 12, 16, 23};
        int numeroEscolhido;
        boolean foiEncontrado = false;
        // Etapa 2: chamar o input do usuario para ele escolher um numero.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para pesquisar: ");
        numeroEscolhido = scanner.nextInt();
        System.out.println("Procurando...");
        // Etapa 3: realizar a verificação do numero do usuario para saber se ele esta dentro do array ou não
        for (int numero : numeros) {
            if (numero == numeroEscolhido) {
                foiEncontrado = true;
                break;
            }
        }
        // Etapa 4: saida para o usuario de acordo com a sua escolha feita anteriormente
        if (foiEncontrado) {
            System.out.println("O número " + numeroEscolhido + " foi encontrado!");
        } else {
            System.out.println("O número " + numeroEscolhido + " não foi encontrado!");
        }
    }
}
