package questao16;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        System.out.print("Digite o número: ");
        num = entrada.nextInt();

        System.out.println("\nTabuada da multiplicação:");
        for (int i=1; i<=10; i++) {
            System.out.println(num+ " x " +i+ " = " + (num * i));
        }

        System.out.println("\nTabuada da divisão:");
        for (int i=1; i<=10; i++) {
            double resultado = (double) num / i;
            System.out.printf("%d / %d = %.2f\n", num, i, resultado);
        }

        entrada.close();
    }
}
