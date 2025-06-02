package VetoresJava;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int pares = 0, impares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        sc.close();
    }
}