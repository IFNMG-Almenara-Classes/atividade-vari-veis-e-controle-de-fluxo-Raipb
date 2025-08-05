package questao05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int comprado;

        System.out.print("Informe quantas laranjas você comprou: ");
        comprado = entrada.nextInt();

        double preco;
        if (comprado < 12) {
            preco = 0.50;
        } else {
            preco = 0.30;
        }

        double total;
        total = comprado * preco;

        System.out.printf("\nQuantidade comprada: %d laranjas\n", comprado);
        System.out.printf("Preço por unidade: R$%.2f\n", preco);
        System.out.printf("Valor final: R$%.2f\n", total);

        entrada.close();
    }
}
