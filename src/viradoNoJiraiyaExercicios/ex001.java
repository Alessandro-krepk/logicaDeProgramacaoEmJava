package viradoNoJiraiyaExercicios;

public class ex001 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 a 1000000
        for (int numero = 0; numero <= 1000000; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

}