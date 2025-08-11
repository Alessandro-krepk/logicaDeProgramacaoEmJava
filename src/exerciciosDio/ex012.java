package exerciciosDio;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
// 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
// Tabela de Código de Condições de Pagamento
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

        // ETAPA 1: ADICIONAR AS VARIAVEIS QUE SERÃO USADAS NO CODIGO
        double valorProduto;
        int metodoDePagamento;
//        double dinheiroOuPix;
//        double cartao;
//        double cartao2Vezes;
//        double cartao3VezesOuMais;

        // ETAPA 2: UTILIZAR O SCANNER PARA PEGAR A ENTRADA DO VALOR DO PRODUTO DO USUARIO
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do seu produto:");
        valorProduto = scanner.nextDouble();

        //ETAPA 3: MENU DE OPÇÕES
        // Mostramos ao usuário os códigos e as condições de pagamento.
        System.out.println("\n===== CÓDIGO | CONDIÇÃO DE PAGAMENTO =====");
        System.out.println("[1] | À vista em Dinheiro ou Pix (15% de desconto)");
        System.out.println("[2] | À vista no Cartão de Crédito (10% de desconto)");
        System.out.println("[3] | Em 2x no Cartão de Crédito (preço normal)");
        System.out.println("[4] | Em 3x ou mais no Cartão de Crédito (10% de juros)");

        do {
            // ETAPA 4: perguntar o metodo de pagamento do produto
            System.out.print("Escolha o código da opção desejada: ");
            metodoDePagamento = scanner.nextInt();

            switch (metodoDePagamento) {
                case 1:
                    valorProduto = valorProduto - (0.15 * valorProduto);
                    break;
                case 2:
                    valorProduto = valorProduto - (0.10 * valorProduto);
                    break;
                case 3:
                    // Nenhuma alteração no valor, preço normal.
                    break;
                case 4:
                    valorProduto = valorProduto + (0.10 * valorProduto);
                    break;
                default:
                    System.out.println("Opção incorreta, favor escolher uma opção correta!");
            }
        } while (metodoDePagamento < 1 || metodoDePagamento > 4);

        System.out.printf("O valor final do produto será: R$ %.2f%n", valorProduto);


        scanner.close();
    }
}
