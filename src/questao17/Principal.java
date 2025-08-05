package questao17;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, fatorial = 1;

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        System.out.println("Descobrir fatorial de " +num);
        if (num < 0) {
            System.out.println("Não é possível, somente números positivos");
        } else {
            for (int i=1; i<=num; i++) {
                fatorial *= i;
            }
            System.out.printf("Resultado: %d! = %d\n", num, fatorial);
        }

        entrada.close();
    }
}
