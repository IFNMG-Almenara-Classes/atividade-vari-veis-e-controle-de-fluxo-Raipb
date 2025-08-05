package questao06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1,n2,n3,menor;

        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        n3 = entrada.nextInt();

        menor = n1;

        if (n2 < menor) {
            menor = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }

        System.out.println("\nO menor número é: " +menor);

        entrada.close();
    }
}
