package questao18;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1,num2, qtdPrimos = 0;

        System.out.println("Descobrir quantidade de números primos entre dois números");

        System.out.print("Digite o num1: ");
        num1 = entrada.nextInt();

        System.out.print("Digite o num2: ");
        num2 = entrada.nextInt();

        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for (int i=num1; i<=num2; i++) {
            if (i < 2) continue;

            boolean primo = true;

            for (int j=2; j<=i/2; j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(i+ " ");
                qtdPrimos++;
            }
        }

        System.out.printf("\nExistem %d números primos entre %d e %d\n", qtdPrimos, num1, num2);

        entrada.close();
    }
}
