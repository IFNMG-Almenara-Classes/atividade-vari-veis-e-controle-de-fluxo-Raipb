package questao01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é " + num2);
        } else {
            System.out.println("Os dois números são iguais");
        }

        entrada.close();
    }
}