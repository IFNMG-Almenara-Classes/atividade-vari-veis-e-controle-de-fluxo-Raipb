package questao11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.print("Digite um número inteiro e positivo: ");
        num = entrada.nextInt();

        if (num < 0) {
            System.out.println("Número inválido");
        } else {
            System.out.println("\nNúmeros pares entre 0 e " +num);
            for (int i = 0; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.printf("%d ", i);
                }
            }
        }

        entrada.close();
    }
}
