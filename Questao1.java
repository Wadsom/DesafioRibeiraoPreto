public class Questao1 {


    public int indice = 13;
    public int soma = 0;
    public int k = 0;

    public Integer calcu() {
        while (k < indice) {
            k +=1;
            soma +=k;
        }
        return soma;
    }


    public static void main(String[] args) {
        Questao1 q = new Questao1();
        int result = q.calcu();
        System.out.println("    ______");
        System.out.println(" O resultado da Soma foi de " + result);
    }


}
