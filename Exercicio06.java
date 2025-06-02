package VetoresJava;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {2, 4, 6, 8, 10};
        System.out.print("Digite um número para buscar: ");
        int busca = sc.nextInt();
        boolean encontrado = false;

        for (int valor : vetor) {
            if (valor == busca) {
                encontrado = true;
                break;
            }
        }

        System.out.println(encontrado ? "Número encontrado!" : "Número não encontrado.");
        sc.close();
    }
}