package VetoresJava;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int maior, menor;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        maior = menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) maior = vetor[i];
            if (vetor[i] < menor) menor = vetor[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}