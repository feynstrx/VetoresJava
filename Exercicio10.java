package VetoresJava;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            int cont = 0;
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                for (int j = 0; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) cont++;
                }
                System.out.println("Número " + vetor[i] + " aparece " + cont + " vezes.");
            }
        }

        sc.close();
    }
}