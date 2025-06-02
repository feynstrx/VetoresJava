package VetoresJava;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }

        System.out.println("Soma dos elementos: " + soma);
        sc.close();
    }
}