package exerciciosDio;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
      //11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
      //calcule a média das nota obtidas, imprima na tela o nome do aluno e
      // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final
      // deve ser maior ou igual a 7.
      double n1,n2,n3,n4;

      // usamos o objeto scanner para receber o imput das notas dadas pelo usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        n3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota:");
        n4 = scanner.nextDouble();
        // agora iremos fazer o calculo de media do aluno para saber se ela passou ou não.
        double media = (n1 + n2 + n3 + n4) / 4;
        if (media >= 7) {
            System.out.println("O aluno passou de ano");
        } else {
            System.out.println("O aluno reprovou!");
        }

        scanner.close();
    }
}
