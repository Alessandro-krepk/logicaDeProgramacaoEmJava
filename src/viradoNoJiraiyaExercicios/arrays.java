package viradoNoJiraiyaExercicios;

public class arrays {
    public static void main(String[] args) {
        String[] numeros = new String[3];
        numeros[0] = "Naruto";
        numeros[1] = "Sasuke";
        numeros[2] = "Hinata";
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }
        for(String i : numeros) {
            System.out.println(i);
        }
    }
}
