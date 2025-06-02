package VetoresJava;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[5];
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número real: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }

        System.out.println("Média: " + (soma / vetor.length));
        sc.close();
    }
}