import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
    public int num = 1;
    public int numAnterior = 0;
    public List<Integer> list = new ArrayList<>();
    public static boolean accept = false;

    public Integer calcu() {
        list.add(num);
        list.add(numAnterior);
        for (int i = 0; i < 12; i++) {
            num += numAnterior;
            numAnterior = num - numAnterior;
            list.add(num);
        }
        return num;
    }

    public String checkNumber(int number) {
        calcu();
        for (int i = 0; i < list.toArray().length; i++) {
            if (list.get(i) == number) {
                return "Está presente na posição " + i + " da lista";
            }

        }
        return "Este número não existe na lista.";
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (!accept) {
            System.out.println("Digite um número: ");
            if (scn.hasNextInt()) {
                accept = true;
                Integer n = scn.nextInt();
                Questao2 q = new Questao2();
                String result = q.checkNumber(n);
                System.out.println(result);
                System.out.println(q.list);
            } else {
                System.out.println("Digite um número valido!");
                scn.next();
            }
        }
    }
}
