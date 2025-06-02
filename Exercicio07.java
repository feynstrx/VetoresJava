package VetoresJava;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        boolean crescente = true;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < vetor[i - 1]) {
                crescente = false;
                break;
            }
        }

        System.out.println(crescente ? "Vetor está em ordem crescente." : "Vetor não está em ordem crescente.");
        sc.close();
    }
}