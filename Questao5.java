import java.util.Scanner;

public class Questao5 {
    public static boolean accept = false;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Questao5 q = new Questao5();
        while (!accept) {
            System.out.println("Digite uma palavra: ");
            if (scn.hasNextInt()) {
                System.out.println("Digite uma String.");
                scn.next();
            }
            else if (scn.hasNext()) {
                accept = true;
                String palavra = scn.next();
                String plMisturada = q.randomString(palavra);
                System.out.println("Palavra misturada: " + plMisturada);
            }
        }
    }

    public static String randomString(String palavra) {
        StringBuilder reverseStr = new StringBuilder();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            reverseStr.append(palavra.charAt(i));
        }
        return reverseStr.toString();
    }

}
