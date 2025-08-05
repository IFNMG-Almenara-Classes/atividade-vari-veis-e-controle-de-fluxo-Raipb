package questao20;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        System.out.println("Descobrir se o número é divisível por 3 ou 5, mas não simultaneamente pelos dois");

        System.out.print("Digite o número: ");
        num = entrada.nextInt();

        if (num % 3 ==0 && num % 5 == 0) {
            System.out.println("Divisível por 3 e 5: inválido");
        } else if (num % 3 ==0 || num % 5 == 0) {
            System.out.println("Divisível por 3 ou 5: válido");
        } else {
            System.out.println("Não divisível por 3 nem por 5");
        }

        entrada.close();
    }
}
