package questao12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtd = 0, pares = 0, soma = 0;
        int num;
        double media;

        System.out.print("Digite um número inteiro ou 0 para sair: ");
        num = entrada.nextInt();

        while (num != 0) {
            soma += num;
            qtd++;

            if (num % 2 == 0) {
                pares++;
            }

            System.out.print("Digite outro número ou 0 para sair: ");
            num = entrada.nextInt();
        }

        if (qtd > 0) {
            media = (double) soma / qtd;

            System.out.println("\nQuantidade de números pares: " +pares);
            System.out.printf("Média números digitados: %.2f\n", media);
        } else {
            System.out.println("Nenhum número foi digitado");
        }

        entrada.close();
    }
}
