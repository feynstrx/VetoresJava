package VetoresJava;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] soma = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Vetor A [" + i + "]: ");
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Vetor B [" + i + "]: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            soma[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("Soma dos vetores: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(soma[i] + " ");
        }

        sc.close();
    }
}