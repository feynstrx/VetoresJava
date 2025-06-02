package VetoresJava;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        ArrayList<Integer> unicos = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int num : vetor) {
            if (!unicos.contains(num)) {
                unicos.add(num);
            }
        }

        System.out.print("Vetor sem duplicatas: ");
        for (int num : unicos) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}